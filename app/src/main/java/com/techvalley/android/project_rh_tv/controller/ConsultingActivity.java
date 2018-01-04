package com.techvalley.android.project_rh_tv.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.techvalley.android.project_rh_tv.R;

public class ConsultingActivity extends AppCompatActivity {

    private ImageView ivCvStatus;
    private TextView tvConsultantName;
    private TextView tvQualifState;
    private TextView tvCity;
    private TextView tvDispo;
    private TextView tvProfilTitle;
    private TextView tvStandardTJ;

    private void findViews() {
        ivCvStatus = (ImageView)findViewById( R.id.iv_cv_status );
        tvConsultantName = (TextView)findViewById( R.id.tv_consultant_name );
        tvQualifState = (TextView)findViewById( R.id.tv_qualif_state );
        tvCity = (TextView)findViewById( R.id.tv_city );
        tvDispo = (TextView)findViewById( R.id.tv_dispo );
        tvProfilTitle = (TextView)findViewById( R.id.tv_profil_title );
        tvStandardTJ = (TextView)findViewById( R.id.tv_standard_TJ );
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulting);
    }
}
