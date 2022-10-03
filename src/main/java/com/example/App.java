package com.example;
import java.util.Scanner;
// import java.util.Date;

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
        System.out.println("|     1: Ajouter une salle :                             |");
        System.out.println("|     2: Modifier une salle :                            |");
        System.out.println("|     3: Ajouter une département :                       |");
        System.out.println("|     4: Modifier une département :                      |");
        System.out.println("|     5: Afficher la liste des responsables :            |");
        System.out.println("|     6: Afficher le liste des enseignant (salle) :      |");
        System.out.println("|     0: exit                                            |");
        System.out.println(" ========================================================");

        System.out.print("Entrer votre choix : ");
    }
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            int c=0;
            do{
               menu_Role();
               c=input.nextInt();
               int choix1 = 0;
               switch(c){
                case 1:
                
               
               do {
                menu();
                choix1 = input.nextInt();
 
                switch (choix1) {
                case 1:
                 try (Scanner input1 = new Scanner(System.in)) {
                    gestion gst = new gestion();
                    etudiant etd = new etudiant();

                    etd.setId(1);
                    etd.setNom("barakat");
                    etd.setPrenom("saida");
                    etd.setTel("7347637");
                    etd.setMail("saida@gmail.com");
                    etd.setId_college(1);
                    etd.setId_class(1);
                    gst.add_etd(etd);
                    etd= new etudiant(2, "eeeen", "rrrr", "rrrr", "null", 1, 1, "hhh");
                    gst.add_etd(etd);
                    etd= new etudiant(3, "eeeen", "rrrr", "rrrr", "null", 1, 2, "hhh");
                    gst.add_etd(etd);
                    int choix2 = 0;
                    do {
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

                            etd = new etudiant(id,nom,pren,tel,mail,id_college,id_class,annee);
                            gst.add_etd(etd);
                            System.out.println(etd.toString());

                        break;
                        
                        case 2:
                            System.out.print("id ??????? ");
                            int rIdNo = input.nextInt();
                            gst.update_etd(rIdNo, input);
                        break;

                        case 3:
                            System.out.print("Entrez l'identifiant d'étudiant qui vou voulez supprimé : ");
                            int id_del = input.nextInt();
                            gst.delete(id_del);
    
                        break;
                        case 4:
                           System.out.print("Entrez l'identifiant pour chercher : ");
                           int id_search = input.nextInt();
                           if (!gst.find_etd(id_search)) {
                            System.out.println( "Etudiant n exist pas\n");
                           }
                           
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
                            // gst.display_etd();
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
                            gst.display_etd_class_ens(2);
                        break;
        
         
                        default:
                            System.out.println("\nchoix incorrect\n");
                            break;
                        }
                }
                while (choix2 != 9);
        } 
        break;
                    
                case 2:
                try (Scanner input1 = new Scanner(System.in)) {
                   gestion gst = new gestion();
                   enseignant ens1 = new enseignant();
                   enseignant ens2 = new enseignant(2, "rrrrr", "ttttttt", "7658675", "HJBLJHBJHB", "b,bkbkjbj", 111, 1, 1);

                   ens1.setId(1);
                   ens1.setNom("barakat");
                   ens1.setPrenom("saida");
                   ens1.setTel("7347637");
                   ens1.setMail("saida@gmail.com");
                   ens1.setDate_prise_fct("2022-01-01");
                   ens1.setIndex(111);
                   ens1.setId_college(1);
                   ens1.setId_mat(1);

                   gst.add_ens(ens1);
                   gst.add_ens(ens2);

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
                           if (!gst.find_ens(id_search)) {
                            System.out.println( "Ens n exist pas\n");
                        }
                       break;
                       case 5:
                            gst.display_ens();
                        break;
                       case 6:
                            System.out.print("Entrer l'identifiant du collège : ");
                            int id_c = input.nextInt();
                            gst.display_ens_coll(id_c);
                       break;
                       case 7:
            //         gestion g=new gestion();
            //         Salle s1=new Salle(1,"sall1" , 20, 1);
            //         Salle s2=new Salle(2,"sall2" , 20, 1);
            //         Salle s3=new Salle(3,"sall3" , 20, 2);
            //         Salle s4=new Salle(4,"sall4" , 20, 3);
            //         Salle s5=new Salle(5,"sall5" , 20, 3);
            //         g.add_salle(s1);
            //         g.add_salle(s2);
            //         g.add_salle(s3);
            //         g.add_salle(s4);
            //         g.add_salle(s5);
            //         System.out.print("Entrer l'identifiant du département : ");
            //         int id_d = input.nextInt();
            //         g.display_salle_dep(id_d);
                    break;
       
        
                       default:
                           System.out.println("\nchoix incorrect\n");
                           break;
                       }
                   }
               while (choix != 4);
               } 
               break;
            //    case 5:
            //         gestion g=new gestion();
            //         Salle s1=new Salle(1,"sall1" , 20, 1);
            //         Salle s2=new Salle(2,"sall2" , 20, 1);
            //         Salle s3=new Salle(3,"sall3" , 20, 2);
            //         Salle s4=new Salle(4,"sall4" , 20, 3);
            //         Salle s5=new Salle(5,"sall5" , 20, 3);
            //         g.add_salle(s1);
            //         g.add_salle(s2);
            //         g.add_salle(s3);
            //         g.add_salle(s4);
            //         g.add_salle(s5);
            //         System.out.print("Entrer l'identifiant du département : ");
            //         int id_d = input.nextInt();
            //         g.display_salle_dep(id_d);
            //    break;
                    
        
                    default:
                    System.out.println("\nchoix incorrect\n");
                    break;
                }
            }while (choix1 != 4);
            break;
            case 2:
            System.out.println("################ Enseignant");
            break;
            case 3:
            System.out.println("################ Responsable");
            break;
            case 0:
                System.out.println("\n*******************************************\n");
                System.out.println("\n    Merci pour l'utilisation. A bientot!\n");
                System.out.println("\n*******************************************\n");
                System.exit(0);
 
                break;
            }
            }while(c!=0);
            


    //  ============ here       
        }
    
    }
}
