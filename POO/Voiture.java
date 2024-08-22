public class Voiture {
    String couleur;

    private String nom = "Audi";
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Voiture(String color) {
        this.couleur = color;
        // System.out.println("color: "+ color);
        System.out.println("Ma classe est instenciée");
  }

    static void accelerer() {
        System.out.println("j'accélère...");
    }
    static void ralentir() {
        System.out.println("je ralentir...");
    }
    static void tourner() {
        System.out.println("je tourne à droite...");
    }
    static void freiner() {
        System.out.println("je freine...");
    }

}
