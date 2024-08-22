public class App {

    
    public static void main(String[]args) {
        App test = new App();
        Voiture myCars = new Voiture("vert");
        myCars.ralentir();
        myCars.accelerer();
        myCars.tourner();
        myCars.freiner();
        netoyage();
        test.netoyage1();
        Voiture.tourner();
        System.out.println("La couleur est: " + myCars.couleur );

        myCars.setNom("merco");
        System.out.println(myCars.getNom());
    }
    static void netoyage() {
        System.out.println("static methode");
    }
    public void netoyage1() {
        System.out.println("public methode");
    }

}
