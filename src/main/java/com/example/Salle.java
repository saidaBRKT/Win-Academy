package com.example;

public class Salle {
    
    private int id;
    private String nom;
    private int nbr_positions;
    private int id_dep;
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
    public int getNbr_positions() {
        return nbr_positions;
    }
    public void setNbr_positions(int nbr_positions) {
        this.nbr_positions = nbr_positions;
    }
    public int getId_dep() {
        return id_dep;
    }
    public void setId_dep(int id_dep) {
        this.id_dep = id_dep;
    }

    public Salle(int id, String nom, int nbr_positions, int id_dep) {
        this.id = id;
        this.nom = nom;
        this.nbr_positions = nbr_positions;
        this.id_dep = id_dep;
    }
    public String toString()
    {
 
        return "Salles{"
            + "Id : " + id + ", Nom : " + nom
            + ", Nombre de positions : " + nbr_positions 
            +", Identifiant de département : " + id_dep + '}';
    }
}
