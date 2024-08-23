package mypack;
import package.EmployeeOperations.*;
import package.Gestion.*;

class Developer extend Employee {
    public String specificitee;
    
      public Developer() {
        this.ID = ID;
        this.nom = nom;
        this.poste = employeType();
        this.salaire = salaire;
        this.specificitee = specificitee();
    }

    public int getPoste() {
        return this.poste;
    }
     public void setPoste(String poste) {
        this.poste = poste;
    } 
    public int getSpecifitee() {
        return this.specificitee;
    }
     public void setSpecifitee(String specificitee) {
        this.specificitee = specificitee;
    } 
    public void employeType() {
        String poste = this.poste;
        return("Developer");
    }
    public void specificitee() {
       System.out.println("Tu es responsable de combien de personne ?");
        String specificitee = scanner.nextLine();
        return(specificitee);
    }
}
