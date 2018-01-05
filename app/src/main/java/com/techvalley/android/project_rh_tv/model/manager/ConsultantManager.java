package com.techvalley.android.project_rh_tv.model.manager;

import com.techvalley.android.project_rh_tv.model.bean_server.ConsultantReduce;
import com.techvalley.android.project_rh_tv.model.tool.WebServiceUtils;

import java.util.ArrayList;
import java.util.List;

public class ConsultantManager {
    public static List<ConsultantReduce> getAllConsultant(int city) throws Exception {
        List<ConsultantReduce> list = new ArrayList<>();
        list.addAll(WebServiceUtils.getAllConsultantReduce(city));
//        for(int i = 0; i < 100; i++){
//            Consultant consultant = new Consultant();
//            if ( i != 0 && i%3 == 0){
//                consultant.setCvTv(null);
//                consultant.setNom("Bob" + i);
//                consultant.setEtatQualification(new EtatQualification("Début"));
//                consultant.setVilleRattachement(new VilleRattachement("Toulouse"));
//                consultant.setEtatDisponibilite(new EtatDisponibilite("ASAP"));
//                consultant.setCommentaireProfil("Dev Java");
//                consultant.setTjvStandard(350);
//
//            } else {
//                consultant.setCvTv("etour/etouoer/et.pdf");
//                consultant.setNom("Toto" + i);
//                consultant.setEtatQualification(new EtatQualification("Début"));
//                consultant.setVilleRattachement(new VilleRattachement("Toulouse"));
//                consultant.setEtatDisponibilite(new EtatDisponibilite("ONE_MONTH"));
//                consultant.setCommentaireProfil("Dev PHP");
//                consultant.setTjvStandard(400);
//            }
//            list.add(consultant);
//        }
        return list;
    }
}
