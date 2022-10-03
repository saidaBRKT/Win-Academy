package com.example;

public class Class_ens {
    
    private int id_class;
    private int id_ens;
    
    public int getId_class() {
        return id_class;
    }
    public void setId_class(int id_class) {
        this.id_class = id_class;
    }
    public int getId_ens() {
        return id_ens;
    }
    public void setId_ens(int id_ens) {
        this.id_ens = id_ens;
    }   
    public Class_ens(int id_class, int id_ens) {
        this.id_class = id_class;
        this.id_ens = id_ens;
    }
    @Override
    public String toString() {
        return "Class_ens [id_class=" + id_class + ", id_ens=" + id_ens + "]";
    }
}
