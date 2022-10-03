package com.example;
import java.util.Date;

public class Note {
  
    private int id_etd;
    private int id_matiere;
    private double note;
    private Date date;

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
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Note(int id_etd, int id_matiere, double note, Date date) {
        this.id_etd = id_etd;
        this.id_matiere = id_matiere;
        this.note = note;
        this.date = date;
    }
}
