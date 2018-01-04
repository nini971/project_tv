package com.techvalley.android.project_rh_tv.model.manager;

import com.techvalley.android.project_rh_tv.model.Consultant;
import com.techvalley.android.project_rh_tv.model.EtatDisponibilite;
import com.techvalley.android.project_rh_tv.model.EtatQualification;
import com.techvalley.android.project_rh_tv.model.VilleRattachement;

import java.util.ArrayList;
import java.util.List;

public class ConsultantManager {
    public static List<Consultant> getAllConsultant(){
        List<Consultant> list = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            Consultant consultant = new Consultant();
            if ( i != 0 && i%3 == 0){
                consultant.setCvTv(null);
                consultant.setNom("Bob" + i);
                consultant.setEtatQualification(new EtatQualification("Début"));
                consultant.setVilleRattachement(new VilleRattachement("Toulouse"));
                consultant.setEtatDisponibilite(new EtatDisponibilite("ASAP"));
                consultant.setCommentaireProfil("Dev Java");
                consultant.setTjvStandard(350);

            } else {
                consultant.setCvTv("etour/etouoer/et.pdf");
                consultant.setNom("Toto" + i);
                consultant.setEtatQualification(new EtatQualification("Début"));
                consultant.setVilleRattachement(new VilleRattachement("Toulouse"));
                consultant.setEtatDisponibilite(new EtatDisponibilite("ONE_MONTH"));
                consultant.setCommentaireProfil("Dev PHP");
                consultant.setTjvStandard(400);
            }
            list.add(consultant);
        }
        return list;
    }
}
