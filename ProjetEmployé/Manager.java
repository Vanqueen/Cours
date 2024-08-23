package mypack;

import package.EmployeeOperations.*;
import package.Gestion.*;

class Manager extend Employee {
    public int numDeveloper;

     public Manager() {
        this.ID = ID;
        this.nom = nom;
        this.poste = employeType();
        this.salaire = salaire;
        this.numDeveloper = numDeveloper();
    }

    public int getPoste() {
        return this.poste;
    }
     public void setPoste(String poste) {
        this.poste = poste;
    } 
    public int getNumDeveloper() {
        return this.numDeveloper;
    }
     public void setNumDeveloper(String numDeveloper) {
        this.numDeveloper = numDeveloper;
    }
    public void employeType() {
        String poste = this.poste;
        return("Manager");
    }
    public void numDeveloper() {
        System.out.println("Tu es responsable de combien de personne ?");
        String numDeveloper = scanner.nextInt();
        return(numDeveloper);
    }
}
