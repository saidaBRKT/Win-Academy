package com.example;

public class Matiere {
 
    private int id;
    private String nom;
    private int id_salle;
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
    public int getId_salle() {
        return id_salle;
    }
    public void setId_salle(int id_salle) {
        this.id_salle = id_salle;
    }
    
    public Matiere(int id, String nom, int id_salle) {
        this.id = id;
        this.nom = nom;
        this.id_salle = id_salle;
    }
}
