package com.example;
// import java.util.Date;

public class etudiant extends user{
    
    private String annee_entree;
    // private int id_etd;
    private Role role = Role.etudiant;
    private int id_class;
    public String getAnnee_entree() {
        return annee_entree;
    }
    public void setAnnee_entree(String annee_entree) {
        this.annee_entree = annee_entree;
    } 
    public int getId_class() {
        return id_class;
    }
    public void setId_class(int id_class) {
        this.id_class = id_class;
    }
    public etudiant(){}

    public etudiant(int id,String nom,String prenom,String tel,String mail,int id_college,int id_class,String annee_entree) {
        super(id,nom,prenom,tel,mail,id_college);
        this.annee_entree = annee_entree;
        this.id_class=id_class;
    }
    public int getId() { return id; }

    public String toString()
    {
 
        return "Etudiants{"
            + "Nom : " + nom + ", Prénom : " + prenom
            + ", Téléphone : " + tel +", Email : " + mail + '}';
    }
    

}
