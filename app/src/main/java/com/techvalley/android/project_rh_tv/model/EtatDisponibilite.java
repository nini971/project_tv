package com.techvalley.android.project_rh_tv.model;

public class EtatDisponibilite {
    private Integer id;
    private String libelle;

    public EtatDisponibilite(String libele) {
        this.libelle = libele;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
