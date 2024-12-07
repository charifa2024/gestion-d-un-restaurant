import java.util.ArrayList;
import java.util.List;

public class Commande {
    static int count=0;
    private int id;
    private Client client;
    private List<Plat> platsCommandes=new ArrayList<>();
    private boolean estPayee = false;

    public boolean getPayeState(){
        return estPayee;
    }
    public Commande(Client c){
        count++;
        this.id=count;
        this.client=c;
    }

    public void ajouterPlat(Plat plat){
        platsCommandes.add(plat);
        System.out.println("Plat ajoute a la commande !");
    }

    public void supprimerPlat(int id){
        List<Plat> aSupprimList=new ArrayList<>();
        for (Plat plat : platsCommandes) {
            if(plat.getId()==id){
                aSupprimList.add(plat);
            }
        }
        platsCommandes.removeAll(aSupprimList);
    }

    public double calculerTotal(){
        double montant=0.0;
        for (Plat plat : platsCommandes) {
            montant+=plat.getPrix();
        }
        return montant;
    }
    public void payerCommande(){
        if(this.estPayee==false){
        this.estPayee=true;
        System.out.println("commande est payee avec succes !");
        }
        else {
            System.out.println("Commande est deja payee !");
        }
    }
    public void afficherDetails(){
        System.out.println("les details de la commande :");
        System.out.println("id : "+id);
        client.afficherDetails();
        for (Plat plat : platsCommandes) {
            plat.afficherDetails();
        }
        System.out.println("le montant de la commande : "+this.calculerTotal());
        System.out.println("la commande est payee ?"+estPayee);
        System.out.println();
    }

    public int getId(){
        return this.id;
    }
}
