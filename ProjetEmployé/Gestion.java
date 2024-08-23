package mypack;

public class Gestion extend Employee {
    Employee gestion = new Employee();
    // public Manager() {
    //     this.ID = ID;
    //     this.nom = nom;
    //     this.poste = employeType();
    //     this.salaire = salaire;
    // }

    public int getID() {
        return gestion.ID;
    }
     public void setID(int id) {
        gestion.ID = id;
    }    

    public String getNom() {
        return gestion.nom;
    }
     public void setNom(String nom) {
        gestion.nom = nom;
    }

    public String getPoste() {
        return gestion.poste;
    }
     public void setPoste(String poste) {
        gestion.poste = poste;
    }

    public int getSalaire() {
        return gestion.salaire;
    }
    public void setSalaire(int salaire) {
        gestion.salaire = salaire;
    }

}
