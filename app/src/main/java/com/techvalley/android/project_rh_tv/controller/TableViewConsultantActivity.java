package com.techvalley.android.project_rh_tv.controller;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.evrencoskun.tableview.TableView;
import com.evrencoskun.tableview.adapter.AbstractTableAdapter;
import com.techvalley.android.project_rh_tv.R;
import com.techvalley.android.project_rh_tv.model.bean_server.ConsultantReduce;
import com.techvalley.android.project_rh_tv.model.tool.WebServiceUtils;
import com.techvalley.android.project_rh_tv.tableview.TableViewAdapter;
import com.techvalley.android.project_rh_tv.tableview.TableViewListener;
import com.techvalley.android.project_rh_tv.tableview.model.Cell;
import com.techvalley.android.project_rh_tv.tableview.model.ColumnHeader;
import com.techvalley.android.project_rh_tv.tableview.model.RowHeader;

import java.util.ArrayList;
import java.util.List;

public class TableViewConsultantActivity extends AppCompatActivity {


    //======================================
    //          ATTRIBUTS
    //======================================
    public static int CITY_ID = 1; // on prend la taille de la liste des consultants

    private List<RowHeader> m_jRowHeaderList;
    private List<ColumnHeader> m_jColumnHeaderList;
    private List<List<Cell>> m_jCellList;

    private List<ConsultantReduce> consultantReduces;

    private AbstractTableAdapter m_iTableViewAdapter;
    private TableView m_iTableView;

    //======================================
    //              OVERRIDE
    //======================================
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_view_consultant);

        consultantReduces = new ArrayList<>();

        AT at = new AT();
        at.execute();

        RelativeLayout relativeLayout = findViewById(R.id.fragment_container);
        m_iTableView = createTableView();
        relativeLayout.addView(m_iTableView);
    }

    //======================================
    //              METHODS
    //======================================
    private TableView createTableView() {
        TableView tableView = new TableView(this);

        // Set adapter
        m_iTableViewAdapter = new TableViewAdapter(this);
        tableView.setAdapter(m_iTableViewAdapter);

        // Set layout params
        FrameLayout.LayoutParams tlp = new FrameLayout.LayoutParams(FrameLayout.LayoutParams
                .MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
        tableView.setLayoutParams(tlp);

        // Set TableView listener
        tableView.setTableViewListener(new TableViewListener(tableView));
        return tableView;
    }

    // initialisation
    private void initData(){
        m_jCellList = new ArrayList<>();
        m_jColumnHeaderList = new ArrayList<>();
        m_jRowHeaderList = new ArrayList<>();

        // on recupere les donnees des cells
        if(consultantReduces != null){
            m_jCellList.addAll(getConsultantCellList(consultantReduces));
        }
        // on recupere les columnHeader
        m_jColumnHeaderList.addAll(getConsultantColumnHeader());
        // on recupere les rowHeader
        m_jRowHeaderList.addAll(getRowHeaderList(consultantReduces));

        m_iTableViewAdapter.setAllItems(m_jColumnHeaderList, m_jRowHeaderList, m_jCellList);
    }

    // retourne les donnees des consultants dans les cellules
    private List<List<Cell>> getConsultantCellList(List<ConsultantReduce> consultants){
        List<List<Cell>> list = new ArrayList<>();
        for (ConsultantReduce consultant:consultants) {
            List<Cell> cellList = new ArrayList<>();

            cellList.add(new Cell("cvStatus", consultant.getCvTvStatus()));
            cellList.add(new Cell("name", consultant.getNom()));
            cellList.add(new Cell("qualifState", consultant.getEtatQualification()));
            cellList.add(new Cell("attachCity", consultant.getVilleRattachement()));
            cellList.add(new Cell("availability", consultant.getEtatDisponibilite()));
            cellList.add(new Cell("profileTitle", consultant.getCommentaireProfil()));
            cellList.add(new Cell("dailyRate", consultant.getTjvStandard()));

            list.add(cellList);
        }
        return list;
    }

    // retourne les columnHeaders
    private List<ColumnHeader> getConsultantColumnHeader(){
        List<ColumnHeader> list = new ArrayList<>();
        ColumnHeader cvStatus = new ColumnHeader("cvStatus", getString(R.string.cv_status));
        ColumnHeader name = new ColumnHeader("name", getString(R.string.name));
        ColumnHeader qualifState = new ColumnHeader("qualifState", getString(R.string.qualif_state));
        ColumnHeader attachCity = new ColumnHeader("attachCity", getString(R.string.attachment_city));
        ColumnHeader availability = new ColumnHeader("availability", getString(R.string.availability));
        ColumnHeader profileTitle = new ColumnHeader("profileTitle", getString(R.string.profile));
        ColumnHeader dailyRate = new ColumnHeader("dailyRate", getString(R.string.daily_rate));

        list.add(cvStatus);
        list.add(name);
        list.add(qualifState);
        list.add(attachCity);
        list.add(availability);
        list.add(profileTitle);
        list.add(dailyRate);
        return list;
    }

    // retourne les rowHeaders
    private List<RowHeader> getRowHeaderList(List<ConsultantReduce> consultants) {
        List<RowHeader> list = new ArrayList<>();
        for (int i = 1; i <= consultants.size(); i++) {
            RowHeader header = new RowHeader(String.valueOf(i), "" + i);
            list.add(header);
        }
        return list;
    }

    //======================================
    //          ASYNC_TASK
    //======================================
    protected class AT extends AsyncTask {

        private ArrayList<ConsultantReduce> temp;

        @Override
        protected Object doInBackground(Object[] params) {
            try {
                // on lance la requete au serveur
                temp = WebServiceUtils.getAllConsultantReduce(CITY_ID);
                Log.w("tag", "temp size : " + temp.size() );
            } catch (Exception e) {
                e.printStackTrace();
            }
            return temp;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            if (temp != null){
                consultantReduces.clear();
                // on rentre les donnees recuperer a notre liste
                consultantReduces.addAll(temp);
                // et on initialise
                initData();
                Log.w("tag", "consultantList size : " + temp.size() );
            } else{
                Toast.makeText(TableViewConsultantActivity.this, "Not data download", Toast.LENGTH_SHORT).show();
                Log.w("tag", "la liste recu est null");
            }

        }
    }
}
