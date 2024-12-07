import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Restaurant restaurant=new Restaurant();
        System.out.println("Bienvenue au systeme de gestion de commandes du restaurant !");
        System.out.println("1.Ajouter un plat au menu");
        System.out.println("2.Ajouter un Cliet");
        System.out.println("3.Passer une commande");
        System.out.println("4.Payer une commande");
        System.out.println("5.Afficher le menu");
        System.out.println("6.Afficher les clients");
        System.out.println("7.Afficher les commandes non payees");
        System.out.println("8.Afficher les details d\'une commande");
        System.out.println("9.Quittez");
        System.out.println("ENTREZ VOTRE CHOIX !!");
        Scanner fetch = new Scanner(System.in);
        int choix =fetch.nextInt();
        fetch.nextLine();
        do{
        switch (choix) {
            case 1:{
                System.out.println("Entrez le nom du plat :");
                String name=fetch.nextLine();
                fetch.nextLine();
                System.out.println("Entrez le prix du plat :");
                double price=fetch.nextDouble();
                fetch.nextLine();
                Plat nouveauPlat=new Plat(name, price);
                restaurant.menu.ajouterPlat(nouveauPlat);
            }break;
                
            
            case 2:{
                System.out.println("Entrez le nom du client :");
                String name =fetch.nextLine();
                fetch.nextLine();
                System.out.println("Entrez le contact du client :");
                String contact =fetch.nextLine();
                Client nouveauClient=new Client(name, contact);
                restaurant.ajouterClient(nouveauClient);
            }break;

            
            case 3:{
                System.out.println("Entrez le nom du client :");
                String  name = fetch.nextLine();
                fetch.nextLine();
                System.out.println("Entrez le nom du plat a ajouter a la commande :");
                String nameP=fetch.nextLine();
                Client client=restaurant.rechercherClient(name);
                Plat plat=restaurant.menu.rechercherPlat(nameP);
                if(client==null || plat==null){
                    System.out.println("Error : client indisponible ou plat indisponible !");
                    break;
                }
                else{
                    Commande nouveauCommande=new Commande(client);
                    nouveauCommande.ajouterPlat(plat);
                    restaurant.ajouterCommande(nouveauCommande);
                }

                break;
            }

            case 4:{
                System.out.println("Entrez l\'ID de la commande a payer :");
                int idC=fetch.nextInt();
                Commande commande=restaurant.rechercherCommande(idC);
                if(commande==null){
                    System.out.println("Error : commande indisponible !");
                }else{
                    commande.payerCommande();
                }
            }break;
            case 5:{
                restaurant.menu.afficherMenu();
            }break;
            case 6:{
                System.out.println("les clients du restaurant :");
                for (Client client : restaurant.clients) {
                    client.afficherDetails();
                }
            }break;
            case 7:{
                restaurant.afficherCommandesNonPyees();
            }break;
            case 8:{
                System.out.println("Entrez l\'ID de la commande :");
                int idC=fetch.nextInt();
                Commande commande=restaurant.rechercherCommande(idC);
                if(commande!=null){
                    commande.afficherDetails();
                }else{
                    System.out.println("commande indisponible !");
                }
            }break;
            case 9:{
                System.out.println("vous avez quitter la restaurant !!!!!");
            }
            default:{
                System.out.println("choix inconnu !");
            }break;

        }
        System.out.println("ENTREZ VOTRE CHOIX !!");
        choix =fetch.nextInt();
        fetch.nextLine();
    }while (choix!=9) ;








        fetch.close();
    }
}
