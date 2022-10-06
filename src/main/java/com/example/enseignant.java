package com.example;

public class Enseignant extends User{
    
    private String date_prise_fct;
    private int index;
    private int id_mat;


    public String getDate_prise_fct() {
        return date_prise_fct;
    }
    public void setDate_prise_fct(String date_prise_fct) {
        this.date_prise_fct = date_prise_fct;
    }
    public int getIndex(){
    return index;
    }

    public void setIndex(int index){
        this.index = index;
    }
    public int getId_mat(){
        return id_mat;
    }

    public void setId_mat(int id_mat){
        this.id_mat = id_mat;
    }

    public Enseignant(){}
    public Enseignant(int id,String nom,String prenom,String tel,String mail,String date_prise_fct, int index,int id_college,int id_mat) {
        super(id,nom,prenom,tel,mail,id_college);
        this.date_prise_fct = date_prise_fct;
        this.index = index;
        this.id_mat=id_mat;
    }

    public int getId() { return id; }

    public String toString()
    {
 
        return "Enseignant {"
            + "Nom : " + nom + ", Prénom : " + prenom
            + ", Téléphone : " + tel +", Email : " + mail + '}';
    }
    


}
