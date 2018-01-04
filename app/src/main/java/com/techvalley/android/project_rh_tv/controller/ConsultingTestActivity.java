package com.techvalley.android.project_rh_tv.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.evrencoskun.tableview.TableView;
import com.evrencoskun.tableview.adapter.AbstractTableAdapter;
import com.techvalley.android.project_rh_tv.R;
import com.techvalley.android.project_rh_tv.model.Consultant;
import com.techvalley.android.project_rh_tv.model.manager.ConsultantManager;
import com.techvalley.android.project_rh_tv.tableview.TableViewAdapter;
import com.techvalley.android.project_rh_tv.tableview.TableViewListener;
import com.techvalley.android.project_rh_tv.tableview.model.Cell;
import com.techvalley.android.project_rh_tv.tableview.model.ColumnHeader;
import com.techvalley.android.project_rh_tv.tableview.model.RowHeader;

import java.util.ArrayList;
import java.util.List;

public class ConsultingTestActivity extends AppCompatActivity {

    public static int COLUMN_SIZE = 100; // on prend la taille de la liste des headers
    public static int ROW_SIZE = ConsultantManager.getAllConsultant().size(); // on prend la taille de la liste des consultants

    private List<RowHeader> m_jRowHeaderList;
    private List<ColumnHeader> m_jColumnHeaderList;
    private List<List<Cell>> m_jCellList;

    private AbstractTableAdapter m_iTableViewAdapter;
    private TableView m_iTableView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulting_test);

        RelativeLayout relativeLayout = findViewById(R.id.fragment_container);
        m_iTableView = createTableView();
        initData();
        relativeLayout.addView(m_iTableView);
    }


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

    private void initData(){
        List<Consultant> consultants = ConsultantManager.getAllConsultant();
        m_jCellList = new ArrayList<>();
        m_jColumnHeaderList = new ArrayList<>();
        m_jRowHeaderList = new ArrayList<>();
        if(consultants != null){
            m_jCellList.addAll(getConsultantCellList(consultants));
        }
        m_jColumnHeaderList.addAll(getConsultantColumnHeader());
        m_jRowHeaderList.addAll(getRowHeaderList(consultants));

        m_iTableViewAdapter.setAllItems(m_jColumnHeaderList, m_jRowHeaderList, m_jCellList);
    }

    private List<List<Cell>> getConsultantCellList(List<Consultant> consultants){
        List<List<Cell>> list = new ArrayList<>();
        for (Consultant consultant:consultants) {
            List<Cell> cellList = new ArrayList<>();

            cellList.add(new Cell("cvStatus", consultant.getCvTv()));
            cellList.add(new Cell("name", consultant.getNom()));
            cellList.add(new Cell("qualifState", consultant.getEtatQualification().getLibelle()));
            cellList.add(new Cell("attachCity", consultant.getVilleRattachement().getSite()));
            cellList.add(new Cell("availability", consultant.getEtatDisponibilite().getLibelle()));
            cellList.add(new Cell("profileTitle", consultant.getCommentaireProfil()));
            cellList.add(new Cell("dailyRate", consultant.getTjvStandard()));

            list.add(cellList);
        }
        return list;
    }

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
    private List<RowHeader> getRowHeaderList(List<Consultant> consultants) {
        List<RowHeader> list = new ArrayList<>();
        for (int i = 1; i <= consultants.size(); i++) {
            RowHeader header = new RowHeader(String.valueOf(i), "" + i);
            list.add(header);
        }

        return list;
    }
}
