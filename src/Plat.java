public class Plat {
    static int count =0;
    private int id;
    private String nom;
    private double prix;

    public Plat(String n,double p){
        count++;
        setId(count);
        this.nom=n;
        setPrix(p);
    }

    public void afficherDetails(){
        System.out.println("id :"+id+" //plat : "+this.getNom()+" //  prix : "+prix);
        System.out.println();
    }

    public int getId(){
        return this.id;
    }
    public String getNom(){
        return this.nom;
    }
    public double getPrix(){
        return this.prix;
    }

    public void setId(int i){
        this.id=i;
    }
    public void setPrix(double p){
        if(p>0){
            this.prix=p;
        }else{
            System.out.println("ERROR : le prix doit etre positif !!");
        }
    }



}
