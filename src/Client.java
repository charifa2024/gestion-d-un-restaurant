public class Client {
    static int count =0;
    private int id;
    private String nom;
    private String contact;


    public Client (String n,String c){
        count++;
        this.id=count;
        this.nom=n;
        this.contact=c;
    }
    public void afficherDetails(){
        System.out.println("id : "+id+" // nom : "+nom+" contact : "+contact);
        System.out.println();
    }

    public int getId(){
        return this.id;
    }
    public String getNom(){
        return this.nom;
    }
    public String getContact(){
        return this.contact;
    }



}
