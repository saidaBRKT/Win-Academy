package com.example;

public class College {
    private int id;
    private String nom;
    private String address;
    
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public College(int id, String nom, String address) {
        this.id = id;
        this.nom = nom;
        this.address = address;
    }
    @Override
    public String toString() {
        return "college [id=" + id + ", nom=" + nom + ", address=" + address + "]";
    }
}
