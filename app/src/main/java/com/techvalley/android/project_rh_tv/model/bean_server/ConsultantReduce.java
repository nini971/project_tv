package com.techvalley.android.project_rh_tv.model.bean_server;

public class ConsultantReduce {
    private Integer id;
    private String nom;
    private String etatQualification;
    private String villeRattachement;
    private String etatDisponibilite;
    private String commentaireProfil;
    private int tjvStandard;
    private String cvTvStatus;
    //======================================
    //          GETTER / SETTER
    //======================================

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEtatQualification() {
        return etatQualification;
    }

    public void setEtatQualification(String etatQualification) {
        this.etatQualification = etatQualification;
    }

    public String getVilleRattachement() {
        return villeRattachement;
    }

    public void setVilleRattachement(String villeRattachement) {
        this.villeRattachement = villeRattachement;
    }

    public String getEtatDisponibilite() {
        return etatDisponibilite;
    }

    public void setEtatDisponibilite(String etatDisponibilite) {
        this.etatDisponibilite = etatDisponibilite;
    }

    public String getCommentaireProfil() {
        return commentaireProfil;
    }

    public void setCommentaireProfil(String commentaireProfil) {
        this.commentaireProfil = commentaireProfil;
    }

    public int getTjvStandard() {
        return tjvStandard;
    }

    public void setTjvStandard(int tjvStandard) {
        this.tjvStandard = tjvStandard;
    }

    public String getCvTvStatus() {
        return cvTvStatus;
    }

    public void setCvTvStatus(String cvTvStatus) {
        this.cvTvStatus = cvTvStatus;
    }
}
