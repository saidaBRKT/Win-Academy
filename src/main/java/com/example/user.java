package com.example;

public class User {
    protected int id;
    protected int id_college;
    protected String nom;
    protected String prenom;
    protected String tel;
    protected String mail;
   
    public User(){}

    public User(int id_user,String nm,String pren,String t,String m,int id_college){
        id=id_user;
        nom=nm;
        prenom=pren;
        tel=t;
        mail=m;
        this.id_college=id_college;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public int getId_college() {
        return id_college;
    }
    public void setId_college(int id_college) {
        this.id_college = id_college;
    }
}
