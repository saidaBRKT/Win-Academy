package com.example;
import java.util.Scanner;

public final class App {

    public static void menu_Role()
    {
        System.out.println(" ================= Roles ================");
        System.out.println("|     1: Admin :                         |");                       
        System.out.println("|     2: Enseignant :                    |");
        System.out.println("|     3: Responsable du département :    |");
        System.out.println("|     0: exit                            |");
        System.out.println(" ========================================");

        System.out.print("Entrez votre choix : ");
    }
    public static void menu()
    {
        System.out.println(" ========================= MENU =========================");
        System.out.println("|     1: Gérer les étudiants :                           |");
        System.out.println("|     2: Gérer les enseignant :                          |");
        System.out.println("|     3: Gérer la collèges :                             |");
        System.out.println("|     5: Afficher les salles d'une département :         |"); 
        System.out.println("|     0: exit                                            |");
        System.out.println(" ========================================================");

        System.out.print("entrer votre choix : ");
    }
    public static void Smenu1()
    {
        System.out.println(" ========================= MENU =========================");
        System.out.println("|     1: Ajouter un étudiant :                           |");
        System.out.println("|     2: Modifier un étudiant :                          |");
        System.out.println("|     3: Supprimer un étudiant :                         |");
        System.out.println("|     4: Afficher les information d'un élève :           |");
        System.out.println("|     5: Afficher la liste des étudiants :               |");
        System.out.println("|     6: Afficher les étudiants d'un collège :           |");
        System.out.println("|     7: Afficher les étudiants (enseignant) :           |");
        System.out.println("|     0: exit                                            |");
        System.out.println(" ========================================================");

        System.out.print("Entrer votre choix : ");
    }

    public static void Smenu2()
    {
        System.out.println(" ========================= MENU =========================");
        System.out.println("|     1: Ajouter un enseignant :                         |");
        System.out.println("|     2: Modifier un enseignant :                        |");
        System.out.println("|     3: Supprimer un enseignant :                       |");
        System.out.println("|     4: Afficher les information d'un enseignant :      |");
        System.out.println("|     5: Afficher la liste des enseignants :             |");
        System.out.println("|     6: Afficher les enseignants d'un collège:          |");
        System.out.println("|     0: exit                                            |");
        System.out.println(" ========================================================");

        System.out.print("Entrer votre choix : ");
    }
    public static void Smenu3()
    {
        System.out.println(" ========================= MENU =========================");
        System.out.println("|     1: Ajouter un collège :                            |");
        System.out.println("|     2: Ajouter une département :                       |");
        System.out.println("|     3: Ajouter une salle :                             |");
        System.out.println("|     4: Afficher les salles d'una département :         |");
        System.out.println("|     0: exit                                            |");
        System.out.println(" ========================================================");

        System.out.print("Entrer votre choix : ");
    }
    public static void Smenu4()
    {
        System.out.println(" ========================= MENU =========================");
        System.out.println("|     1: Ajouter une note :                              |");
        System.out.println("|     2: Afficher les note :                             |");
        System.out.println("|     3: Calculer la moyenne générale d'un étudiant :    |");
        System.out.println("|     0: exit                                            |");
        System.out.println(" ========================================================");

        System.out.print("Entrer votre choix : ");
    }
    public static void Smenu_responsable()
    {
        System.out.println(" ========================== MENU ==========================");
        System.out.println("|     1: Calculer la moyenne générale par matière:         |");
        System.out.println("|     2: Calculer la moyenne générale par départemant:     |");
        System.out.println("|     3: La fiche signalétique d’un enseignant:            |");
        System.out.println("|     4: La fiche signalétique d’un élève:                 |");
        System.out.println("|     0: exit                                              |");
        System.out.println(" ==========================================================");

        System.out.print("Entrer votre choix : ");
    }
    public static void main(String[] args) {
    gestion gst = new gestion();

    // ========================== Etudiant ==========================
    etudiant e1= new etudiant(1, "BARAKAT", "SAIDA", "06-12-43-54-78", "saida@gmail.com", 1, 1, "2022-10-10");
    etudiant e2= new etudiant(2, "LAQRAA", "HAMZA", "06-12-43-00-01", "hamza@gmail.com", 1, 2, "2022-10-10");
    etudiant e3= new etudiant(3, "BASSOU", "ABDELHAMID", "06-22-43-54-33", "abdelhamid@gmail.com", 1, 1, "2022-10-10");
    etudiant e4= new etudiant(4, "SALIM", "AHMED", "06-01-45-12-78", "ahmed@gmail.com", 1, 1, "2022-10-10");
    etudiant e5= new etudiant(5, "HASNAOUI", "SAID", "06-12-43-33-31", "said@gmail.com", 1, 1, "2022-10-10");
    gst.add_etd(e1);
    gst.add_etd(e2);
    gst.add_etd(e3);
    gst.add_etd(e4);
    gst.add_etd(e5);
    // ========================== Classes    ==========================
    Class cl1=new Class(1, "class1");
    Class cl2=new Class(2, "class2");
    Class cl3=new Class(3, "class3");
    Class_ens ce1=new Class_ens(1, 1);
    Class_ens ce2=new Class_ens(2, 2);
    gst.add_Class(cl1);
    gst.add_Class(cl2);
    gst.add_Class(cl3);
    gst.add_ClassEns(ce1);
    gst.add_ClassEns(ce2);
    // ====================== Enseignant ===========
    enseignant ens1 = new enseignant(1, "ELYAAGOUBI", "RAOUIA", "06-22-43-33-15", "raouia@gmail.com", "2022-10-10", 111, 1, 1);
    enseignant ens2 = new enseignant(2, "MAANI", "SAFIA", "06-02-43-33-00", "safia@gmail.com", "2022-10-10", 67, 1, 2);
    enseignant ens3 = new enseignant(3, "KAZOUM", "OMAR", "06-19-43-02-31", "omar@gmail.com", "2022-10-10", 87908, 1, 1);
    gst.add_ens(ens1);
    gst.add_ens(ens2);
    gst.add_ens(ens3);
    // =================== Notes =================
    Note n1=new Note(1,1,12,"2022-10-10",1);
    Note n2=new Note(1,2,13,"2022-10-10",1);
    Note n3=new Note(2,1,14,"2022-10-10",1);
    Note n4=new Note(3,1,15,"2022-10-10",2);
    Note nn1=new Note(1,1,12,"2022-10-10",1);
    Note nn2=new Note(1,2,13,"2022-10-10",1);
    Note nn3=new Note(2,4,14,"2022-10-10",1);
    Note nn4=new Note(3,3,15,"2022-10-10",2);
    gst.add_note(n1);
    gst.add_note(n2);
    gst.add_note(n3);
    gst.add_note(n4);
    gst.add_note(nn1);
    gst.add_note(nn2);
    gst.add_note(nn3);
    gst.add_note(nn4);
    // =======================  salles ==================
    Salle s1=new Salle(1,"sall1" , 20, 1);
    Salle s2=new Salle(2,"sall2" , 29, 1);
    Salle s3=new Salle(3,"sall3" , 25, 2);
    Salle s4=new Salle(4,"sall4" , 30, 3);
    gst.add_salle(s1);
    gst.add_salle(s2);
    gst.add_salle(s3);
    gst.add_salle(s4);
    // =======================  Matieres ==================
    Matiere m1=new Matiere(1, "mat1", 1);
    Matiere m2=new Matiere(2, "mat2", 2);
    Matiere m3=new Matiere(3, "mat3", 3);
    Matiere m4=new Matiere(4, "mat3", 4);
    gst.add_mat(m1);
    gst.add_mat(m2);
    gst.add_mat(m3);
    gst.add_mat(m4);
    // =======================  Départements ==================
    departement d1=new departement(1, "dep1");
    departement d2=new departement(2, "dep2");
    departement d3=new departement(3, "dep3");
    departement d4=new departement(4, "dep4");
    gst.add_dep(d1);
    gst.add_dep(d2);
    gst.add_dep(d3);
    gst.add_dep(d4);
    // =======================  Collèges ==================
    college c1=new college(1, "college1", "aaaaaaaaaaaaaaaaaaaaaaa");
    college c2=new college(2, "college2", "bbbbbbbbbbbbbbbbbbbbbbb");
    college c3=new college(3, "college3", "ccccccccccccccccccccccc");
    college c4=new college(4, "college4", "ddddddddddddddddddddddd");
    gst.add_College(c1);
    gst.add_College(c2);
    gst.add_College(c3);
    gst.add_College(c4);
    // ====================================================
        
    try (Scanner input = new Scanner(System.in)) {
        int choix1=0;
        do{
        menu_Role();
        choix1=input.nextInt();
        switch(choix1){
        case 1:
        //  ######### Partie admin ############
            do{
            menu();
            choix1 = input.nextInt();
            switch (choix1) {
            case 1:
            //  ######### Etudiant ############
                try (Scanner input1 = new Scanner(System.in)) {
                int choix2 = 0;
                do{
                Smenu1();
                choix2 = input.nextInt();
                switch (choix2) {
                    case 1:
                        System.out.print("Entrer l'identifiant de l'étudiant : ");
                        int id = input.nextInt();

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

                        System.out.print("Entrer l'identifiant de la collège : ");
                        int id_college = input.nextInt();

                        System.out.print("Entrer l'identifiant de la classe : ");
                        int id_class = input.nextInt();

                        etudiant etd = new etudiant(id,nom,pren,tel,mail,id_college,id_class,annee);
                        gst.add_etd(etd);
                        System.out.println(etd.toString());
                    break;                      
                    case 2:
                        System.out.print("Entrez l'identfiant d'étudiant :");
                        int idEtd = input.nextInt();
                        gst.update_etd(idEtd, input);
                    break;
                    case 3:
                        System.out.print("Entrez l'identifiant d'étudiant qui vous voulez supprimé : ");
                        int id_del = input.nextInt();
                        gst.delete(id_del); 
                    break;
                    case 4:
                        System.out.print("Entrez l'identifiant pour chercher : ");
                        int id_search = input.nextInt();
                        if (!gst.find_etd(id_search))
                        System.out.println( "Etudiant n exist pas\n");                          
                    break;
                    case 5:
                        gst.display_etd();
                    break;
                    case 6:
                        System.out.print("Entrer l'identifiant de la collège : ");
                        int id_coll = input.nextInt();
                        System.out.print("Entrer l'identifiant de la classe : ");
                        int id_c = input.nextInt();
                        gst.display_etd_coll_class(id_coll, id_c);
                    break;
                    case 7:
                        System.out.print("Entrer l'identifiant de l'enseignant : ");
                        int id_ens = input.nextInt();
                        gst.display_etd_class_ens(id_ens);
                    break;
                    case 0:
                        System.out.println("\n*******************************************\n");
                        System.out.println("\n    Merci pour l'utilisation. A bientot!\n");
                        System.out.println("\n*******************************************\n");
                        System.exit(0);
                    break;
                    default:
                                System.out.println("\nchoix incorrect\n");
                            break;
                }
                }while (choix2 != 9);
                }
            break;                     
            case 2:
            //  ######### Enseignant ############
                try (Scanner input1 = new Scanner(System.in)) {
                int choix = 0;
                do {
                Smenu2();
                choix = input.nextInt();    
                switch (choix) {
                    case 1:
                        System.out.print("Entrer l'identifiant de l'enseignant : ");
                        int id = input.nextInt();

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

                        System.out.print("Entrer l'identifiant du collège : ");
                        int id_college = input.nextInt();

                        System.out.print("Entrer l'identifiant du matière : ");
                        int id_mat = input.nextInt();

                        ens1 = new enseignant(id,nom,pren,tel,mail,annee,index,id_college,id_mat);
                        gst.add_ens(ens1);
                        System.out.println(ens1.toString());
                    break;                
                    case 2:
                        System.out.print("id ??????? ");
                        int rIdNo = input.nextInt();
                        gst.update_ens(rIdNo, input);
                    break;
                    case 3:
                        System.out.print("Entrez l'identifiant d'enseignant qui vous voulez supprimé : ");
                        int id_del = input.nextInt();
                        gst.delete_ens(id_del);

                    break;
                    case 4:
                        System.out.print("Entrez l'identifiant pour chercher : ");
                        int id_search = input.nextInt();
                        if (!gst.find_ens(id_search))
                        System.out.println( "Enseignant n'exist pas\n");
                    break;
                    case 5:
                        gst.display_ens();
                    break;
                    case 6:
                        System.out.print("Entrer l'identifiant du collège : ");
                        int id_c = input.nextInt();
                        gst.display_ens_coll(id_c);
                    break;
                    case 0:
                        System.out.println("\n*******************************************\n");
                        System.out.println("\n    Merci pour l'utilisation. A bientot!\n");
                        System.out.println("\n*******************************************\n");
                        System.exit(0);
                    break;        
                    default:
                        System.out.println("\nchoix incorrect\n");
                    break;
                }
                }while (choix != 0);
                } 
            break;
            case 3:
            //  ######### Collège ############
                System.out.println("\ngestion college\n");
                try(Scanner inp = new Scanner(System.in)){
                int choix = 0;
                do {
                Smenu3();
                choix = input.nextInt();
                switch(choix){
                    case 1:
                        System.out.print("Entrer l'identifiant du collège : ");
                        int id_coll = input.nextInt();
                        System.out.print("Entrer le nom du collège : ");
                        String nom_coll = input.next();
                        System.out.print("Entrer l'address du collège : ");
                        String address_coll = input.next();
                        college c = new college(id_coll,nom_coll,address_coll);
                        gst.add_College(c);
                        System.out.println(c.toString());
                    break;
                    case 2:
                        System.out.print("Entrer l'identifiant du département : ");
                        int id_dep = input.nextInt();
                        System.out.print("Entrer le nom du département : ");
                        String nom_dep = input.next();
                        departement d = new departement(id_dep,nom_dep);
                        gst.add_dep(d);
                        System.out.println(d.toString());
                    break;
                    case 3:
                        System.out.print("Entrer l'identifiant du salle : ");
                        int id_salle = input.nextInt();
                        System.out.print("Entrer le nom du salle : ");
                        String nom_salle = input.next();
                        System.out.print("Entrer le nombre de positions : ");
                        int nbr_pos = input.nextInt();
                        System.out.print("Entrer l'identifiant du département : ");
                        int id_d = input.nextInt();
                        Salle s = new Salle(id_salle,nom_salle,nbr_pos,id_d);
                        gst.add_salle(s);
                        System.out.println(s.toString());
                    break;
                    case 4:  
                        System.out.print("Entrer l'identifiant du département : ");
                        int id_dp = input.nextInt();
                        gst.display_salle_dep(id_dp);
                    break;                 
                    case 0:
                        System.out.println("\n*******************************************\n");
                        System.out.println("\n    Merci pour l'utilisation. A bientot!\n");
                        System.out.println("\n*******************************************\n");
                        System.exit(0);
                    break;
                    default:
                                    System.out.println("\nChoix invalide\n");
                                break;

                }
                }while(choix!=0);
                }
            break;
            default:
                System.out.println("\nchoix incorrect\n");
            break;
            }
            }while (choix1 != 0);
        break;
        //  ######### Fin partie admin ############

        //  ######### partie Enseignant ############
        case 2:
            try(Scanner inp = new Scanner(System.in)){
            int choix = 0;
            Note n=new Note();
            do {
            Smenu4();
            choix = input.nextInt();
            switch(choix){
                case 1:
                    System.out.print("Entrer l'identifiant de l'étudiant : ");
                    int id_n = inp.nextInt();

                    System.out.print("Entrer l'identifiant du matière : ");
                    int id_mat = inp.nextInt();
                    
                    System.out.print(  "Entrer la note : ");
                    Double note = inp.nextDouble();
                    
                    System.out.print(  "Entrer la date : ");
                    String date = inp.next();

                    System.out.print("Entrer la semetsre ( 1 ou 2 ) : ");
                    int semestre = inp.nextInt();
                    
                    n=new Note(id_n, id_mat, note, date,semestre);
                    gst.add_note(n);
                break;
                case 2:
                gst.display_notes();
                break;
                case 3:
                    System.out.print("Entrer l'identifiant de l'étudiant : ");
                    int id_e = inp.nextInt();
                    System.out.print("Entrer la semetsre ( 1 ou 2 ) : ");
                    int s = inp.nextInt();
                    gst.moyenne_etd(id_e, s);
                break;
                case 0:
                    System.out.println("\n*******************************************\n");
                    System.out.println("\n    Merci pour l'utilisation. A bientot!\n");
                    System.out.println("\n*******************************************\n");
                    System.exit(0);
                break;
                default:
                                    System.out.println("\nChoix invalide\n");
                                break;
            }
            }while(choix!=0);
            }
        break;
        //  ######### Fin partie Enseignant ############

        //  ######### Partie Responsable ############
        case 3:
            int choix = 0;
            do{
            Smenu_responsable();
            choix = input.nextInt();
            switch(choix){
                case 1:
                    System.out.print("Entrer l'identifiant du matière : ");
                    int id_mat = input.nextInt();
                    System.out.print("Choisir une semestre (1 ou 2 ) : ");
                    int s = input.nextInt();
                    gst.moyenne_matiere(id_mat, s);
                break;
                case 2:
                    gestion g=new gestion();
                    Salle Ts1=new Salle(1,"sall1" , 20, 1);
                    Salle Ts2=new Salle(2,"sall2" , 20, 1);
                    Salle Ts3=new Salle(3,"sall3" , 20, 2);
                    Salle Ts4=new Salle(4,"sall4" , 20, 3);
                    g.add_salle(Ts1);
                    g.add_salle(Ts2);
                    g.add_salle(Ts3);
                    g.add_salle(Ts4);
                    Matiere Tm1=new Matiere(1, "mat1", 1);
                    Matiere Tm2=new Matiere(2, "mat2", 2);
                    Matiere Tm3=new Matiere(3, "mat3", 3);
                    Matiere Tm4=new Matiere(4, "mat3", 4);
                    g.add_mat(Tm1);
                    g.add_mat(Tm2);
                    g.add_mat(Tm3);
                    g.add_mat(Tm4);
                    Note Tnn1=new Note(1,1,12,"jhff",1);
                    Note Tnn2=new Note(1,2,13,"jhff",1);
                    Note Tnn3=new Note(2,4,14,"jhff",1);
                    Note Tnn4=new Note(3,3,15,"jhff",2);
                    g.add_note(Tnn1);
                    g.add_note(Tnn2);
                    g.add_note(Tnn3);
                    g.add_note(Tnn4);
                    System.out.print("Entrer l'identifiant du département : ");
                    int id_dep = input.nextInt();
                    g.moyenne_dep(id_dep);
                break;
                case 3:
                    System.out.print("Entrez l'identifiant de l'enseignant : ");
                    int id_search1 = input.nextInt();
                    if (!gst.find_ens(id_search1)) 
                    System.out.println( "Enseignant n'exist pas\n");
                break;
                case 4:
                                    System.out.print("Entrer l'identifiant de l'étudiant : ");
                                    int id_search = input.nextInt();
                                    if (!gst.find_etd(id_search)) 
                                    System.out.println( "Etudiant n exist pas\n");
                                break;                       
            }
            }while(choix!=0);
        break;
        //  ######### Fin Partie Responsable ############




        case 0:
                            System.out.println("\n*******************************************\n");
                            System.out.println("\n    Merci pour l'utilisation. A bientot!\n");
                            System.out.println("\n*******************************************\n");
                            System.exit(0);
                    break;
        default:
                            System.out.println("\nChoix invalide\n");
                            break;
        }
        }while(choix1!=0);                 
        }   
    }
}
