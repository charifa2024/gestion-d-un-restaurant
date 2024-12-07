import java.util.ArrayList;
import java.util.List;
public class Restaurant {
    Menu menu=new Menu();
    List<Client> clients=new ArrayList<>();
    List<Commande> commandes=new ArrayList<>();

    public void ajouterClient(Client client){
        clients.add(client);
        System.out.println("Client ajoute avec succes !");
    }

    public Client rechercherClient(String nom){
        for (Client client : clients) {
            if(client.getNom().equalsIgnoreCase(nom)){
                return client;
            }
        }
        return null;
    }

    public void ajouterCommande(Commande commande){
        commandes.add(commande);
        System.out.println("Commande passee avec succes !");
    }
    public Commande rechercherCommande(int id){
        for (Commande commande : commandes) {
            if(commande.getId()==id){
                return commande;
            }            
        }
        return null;
    }

    public void afficherCommandesNonPyees(){
        System.out.println("les commandes non payees :");
        for (Commande commande : commandes) {
            if(commande.getPayeState()==false){
                commande.afficherDetails();
            }
            
        }
        System.out.println();
    }

}
