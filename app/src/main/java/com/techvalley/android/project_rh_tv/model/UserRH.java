package com.techvalley.android.project_rh_tv.model;

public class UserRH {
    //======================================
    //          ATTRIBUTS
    //======================================
    private boolean activated;
    private String[] authorities;
    private String email;
    private boolean envoyerMail;
    private String firstName;
    private String langKey;
    private String lastName;
    private String login;
    private String password;

    //======================================
    //          CONSTRUCTOR
    //======================================
    public UserRH() {

    }

    //======================================
    //          GETTER / SETTER
    //======================================
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public String[] getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String[] authorities) {
        this.authorities = authorities;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnvoyerMail() {
        return envoyerMail;
    }

    public void setEnvoyerMail(boolean envoyerMail) {
        this.envoyerMail = envoyerMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
