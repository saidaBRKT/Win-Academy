package com.example;
import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;
// import java.util.Stream;
 
// Class
public class gestion {
 
    // Creating an empty LinkedList
    LinkedList<etudiant> studentsList;
    LinkedList<enseignant> listRR;
    LinkedList<Salle> list_Salle;
    LinkedList<Class_ens> list_ClassEns;
    LinkedList<Class> list_Class;
 
    // Default Constructor
    public gestion()
    {
        listRR = new LinkedList<>();
        studentsList = new LinkedList<>();
        list_ClassEns = new LinkedList<>();
        list_Salle = new LinkedList<>();
        list_Class = new LinkedList<>();
    }
 
    // Method 1
    // Ajouter étudiant
    public void add_etd(etudiant etd)
    {

        if (!find_etd(etd.getId())) {
            studentsList.add(etd);
        }
        else {
            System.out.println("l'étudiant exist déja");
        }
    }
 
    // Method 2
    // chercher un étudiant
    public boolean find_etd(int idNumber)
    {
        for (etudiant e : studentsList) {
 
            if (e.getId() == idNumber) {
 
                System.out.println(e);
                return true;
            }
        }
        return false;
    }
 
    // Method 3
    // Delete Record
    public void delete(int etd_IdNumber)
    {
        etudiant etd_Del = null;
        for (etudiant ll : studentsList) {
            if (ll.getId() == etd_IdNumber) {
                etd_Del = ll;
            }
        }
        if (etd_Del == null) {
            System.out.println("L'identifiant non valide");
        }
        else {
            studentsList.remove(etd_Del);
            System.out.println("Supprission avec succes");
        }
    }
 
    // Method 4
    // Finding etd
    public etudiant find_etudiant(int id)
    {
        for (etudiant e : studentsList) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
 
    // Method 5
    // Update Record
    public void update_etd(int id, Scanner input)
    {
 
        if (find_etd(id)) {
            etudiant etd = find_etudiant(id);
            
            System.out.print("Entrer l'identifiant de l'étudiant : ");
            int id_etd = input.nextInt();

            System.out.print("Entrer le nom de l'étudiant : ");
            String nom = input.next();
            
            System.out.print(  "Entrer le prénom de l'étudiant : ");
            String pren = input.next();
            
            System.out.print(  "Entrer le Numéro de téléphone : ");
            String tel = input.next();

            System.out.print(  "Entrer l'email' de l'étudiant : ");
            String mail = input.next();

            System.out.print(  "Entrer l'année d'entré : ");
            String annee = input.next();

             
            etd.setId(id_etd);
            etd.setNom(nom);
            etd.setPrenom(pren);
            etd.setTel(tel);
            etd.setMail(mail);
            etd.setAnnee_entree(annee);
            
            System.out.println("modifier avec success");
        }
        else {
 
            // Print statement
            System.out.println(
                "Record Not Found in the Student list");
        }
    }
 
    // Method 6
    // Afficher les étudiants
    public void display_etd()
    {
        if (studentsList.isEmpty()) {
            System.out.println("la liste est vide\n");
        }
        for (etudiant etd : studentsList) {
            System.out.println(etd.toString());
        }
    }
    
     // Method 7
    // Afficher les étudiants d'un collège / classe
    public void display_etd_coll_class(int id_coll,int id_class)
    {
        if (studentsList.isEmpty()) {
            System.out.println("la liste est vide\n");
        }
        for (etudiant etd : studentsList) {
            if(etd.id_college==id_coll && etd.getId_class()==id_class)
            System.out.println(etd.toString());
        }
    }
    //Methode 8 
    // Afficher les Etudiants (classe/enseignant)
    public void display_etd_class_ens(int id_ens)
    {
        list_ClassEns.stream().filter(ce->ce.getId_ens()==id_ens).map(ce->ce.getId_class()).map(
        classId->
        studentsList.stream().filter(s->s.getId_class()==classId).collect(Collectors.toList())
        ).flatMap(Collection::stream).distinct().forEach(System.out::println);   
    }







    // /================    Enseignant    ================
    // Method 1
    // Ajouter étudiant
    public void add_ens(enseignant ens)
    {

        if (!find_ens(ens.getId())) {
            listRR.add(ens);
        }
        else {
            System.out.println("l'étudiant exist déja");
        }
    }
    
    // Method 2
    // chercher un étudiant
    public boolean find_ens(int idNimber)
    {
        for (enseignant e : listRR) {
 
            if (e.getId() == idNimber) {
 
                System.out.println(e);
                return true;
            }
        }
        return false;
    }
    // Method 3
    // Delete Record
    public void delete_ens(int ens_IdNumber)
    {
        enseignant ens_Del = null;
        for (enseignant ll : listRR) {
            if (ll.getId() == ens_IdNumber) {
                ens_Del = ll;
            }
        }
        if (ens_Del == null) {
            System.out.println("L'identifiant non valide");
        }
        else {
            listRR.remove(ens_Del);
            System.out.println("Supprission avec succes");
        }
    }

    // Method 4
    // Finding Record
    public enseignant find_enseignant(int id)
    {
        for (enseignant e : listRR) {
 
            if (e.getId() == id) {
                return e;
            }
        }
 
        return null;
    }

     // Method 5
     // Update 
    public void update_ens(int id, Scanner input)
    {
 
        if (find_ens(id)) {
            enseignant ens = find_enseignant(id);
            System.out.print("Entrer l'identifiant de l'enseignant : ");
            int id_nv = input.nextInt();

            System.out.print("Entrer le nom de l'enseignant : ");
            String nom = input.next();
            
            System.out.print(  "Entrer le prénom de l'enseignant : ");
            String pren = input.next();
            
            System.out.print(  "Entrer le Numéro de téléphone : ");
            String tel = input.next();

            System.out.print(  "Entrer l'email' de l'enseignant : ");
            String mail = input.next();

            System.out.print(  "Entrer l'année d'entré : ");
            String annee = input.next();

            System.out.print("Entrer l'index de l'enseignant : ");
            int index = input.nextInt();
 
            ens.setId(id_nv);
            ens.setNom(nom);
            ens.setPrenom(pren);
            ens.setTel(tel);
            ens.setMail(mail);
            ens.setDate_prise_fct(annee);
            ens.setIndex(index);

            System.out.println("Update avec success");
        }
        else {
 
            // Print statement
            System.out.println(
                "Record Not Found in the Student list");
        }
    }

    // Method 6
    // Afficher les enseignants
    public void display_ens()
    {
        if (listRR.isEmpty()) {
            System.out.println("la liste est vide\n");
        }
        for (enseignant ens : listRR) {
            System.out.println(ens.toString());
        }
    }

    // Method 7
    // Afficher les enseignants d'un collège 
    public void display_ens_coll(int id_c)
    {
        if (listRR.isEmpty()) {
            System.out.println("la liste est vide\n");
        }
        for (enseignant ens : listRR) {
            if(ens.id_college==id_c)
            System.out.println(ens.toString());
        }
    }

    // ====================== salles ===========================

    // Method 1
    // Ajouter salle
    public void add_salle(Salle s)
    {

        if (!find_etd(s.getId())) {
            list_Salle.add(s);
        }
        else {
            System.out.println("l'étudiant exist déja");
        }
    }
 
    // Method 2
    // chercher une salle
    public boolean find_salle(int idNimber)
    {
        for (Salle s : list_Salle) {
 
            if (s.getId() == idNimber) {
 
                System.out.println(s);
                return true;
            }
        }
        return false;
    }
    // Method 3
    // Afficher les salles d'une département 
    public void display_salle_dep(int id_d)
    {
        if (list_Salle.isEmpty()) {
            System.out.println("la liste est vide\n");
        }
        for (Salle s : list_Salle) {
            if(s.getId_dep()==id_d)
            System.out.println(s.toString());
        }
    }

    // ====================== Classes ===========================

    // Method 1
    // Ajouter salle
    public void add_Class(Class c)
    {

        if (!find_cls(c.getId())) {
            list_Class.add(c);
        }
        else {
            System.out.println("n'exist déja");
        }
    }
    // Method 2
    // chercher une salle
    public boolean find_cls(int idNumber)
    {
        for (Class c : list_Class) {
 
            if (c.getId() == idNumber) {
 
                System.out.println(c);
                return true;
            }
        }
        return false;
    }
    
    // ====================== Classes_Enseignant ===========================

    // Method 1
    // Ajouter salle
    public void add_ClassEns(Class_ens ce)
    {

        if (!find_ce(ce.getId_class())) {
            list_ClassEns.add(ce);
        }
        else {
            System.out.println("n'exist déja");
        }
    }
    // Method 2
    // chercher une salle
    public boolean find_ce(int idNumber)
    {
        for (Class_ens c : list_ClassEns) {
 
            if (c.getId_class() == idNumber) {
 
                System.out.println(c);
                return true;
            }
        }
        return false;
    }

}
