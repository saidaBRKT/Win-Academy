package com.example;

public class departement {
    private int id;
    private String nom;
    
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
    public departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    
    @Override
    public String toString() {
        return "departement [id=" + id + ", nom=" + nom + "]";
    }
}
