package com.example;
// import java.util.Date;

public class Note {
  
    private int id_etd;
    private int id_matiere;
    private double note;
    private String date;
    private int semestre;

    public int getId_etd() {
        return id_etd;
    }
    public void setId_etd(int id_etd) {
        this.id_etd = id_etd;
    }
    public int getId_matiere() {
        return id_matiere;
    }
    public void setId_matiere(int id_matiere) {
        this.id_matiere = id_matiere;
    }
    public Double getNote() {
        return note;
    }
    public void setNote(int note) {
        this.note = note;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Note(){}
    public Note(int id_etd, int id_matiere, double note, String date,int s) {
        this.id_etd = id_etd;
        this.id_matiere = id_matiere;
        this.note = note;
        this.date = date;
        this.semestre=s;
    }
    public void setNote(double note) {
        this.note = note;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    @Override
    public String toString() {
        return "Note [id_etd=" + id_etd + ", id_matiere=" + id_matiere + ", note=" + note + ", date=" + date
                + ", semestre=" + semestre + "]";
    }
}
