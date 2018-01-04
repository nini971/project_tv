package com.techvalley.android.project_rh_tv.model;

public class VilleRattachement {
    private Integer id;
    private String site;

    public VilleRattachement(String site) {
        this.site = site;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
