package com.techvalley.android.project_rh_tv.model.tool;

import com.google.gson.reflect.TypeToken;
import com.techvalley.android.project_rh_tv.controller.MyApplication;
import com.techvalley.android.project_rh_tv.model.bean_server.ConsultantReduce;

import java.util.ArrayList;

public class WebServiceUtils {

    private static final String URL_SERVER = "http://192.168.42.31:8000/api/";
    private static final String GET_ALL_CONSULTANT_REDUCE = URL_SERVER + "consultants/";

    // recupere sur le serveur le compte utilisateur et le stock dans les sharedPreferences
    public static void getUserRHAccount(String email){

    }

    // login de l'utilisateur
    public static Boolean login(String email, String password){

        return true;
    }

    // on recupere les consultants du serveur en lui passant l'id de la ville souhaite
    public static ArrayList<ConsultantReduce> getAllConsultantReduce(int cityID) throws Exception {
        String param = "?city=" + cityID;
        String json = OkHttpUtils.sendGetOkHttpRequest(GET_ALL_CONSULTANT_REDUCE + param);
        return MyApplication.gson.fromJson(json, new TypeToken<ArrayList<ConsultantReduce>>(){}.getType());
    }
}
