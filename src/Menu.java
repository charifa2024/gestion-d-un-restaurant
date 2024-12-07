import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Plat> plats=new ArrayList<>();
    public void ajouterPlat(Plat plat){
        plats.add(plat);
        System.out.println("Plat ajoute avec succes");
    }
    public void supprimerPlat(int id){
        List<Plat> aSupprimerList = new ArrayList<>();
        for (Plat plat : plats) {
            if(plat.getId()==id){
                aSupprimerList.add(plat);
            }
        }
        plats.removeAll(aSupprimerList);
    }

    public Plat rechercherPlat(String nom){
        for (Plat plat : plats) {
            if(plat.getNom().equalsIgnoreCase(nom)){
                return plat;
            }
            
        }
        return null;
    }

    public void afficherMenu(){
        System.out.println("Le Menu du restaurant :");
        for (Plat plat : plats) {
            plat.afficherDetails();
        }
        System.out.println();
    }
}
