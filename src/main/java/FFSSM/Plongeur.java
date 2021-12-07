package FFSSM;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.TreeSet;

public class Plongeur extends Personne {
       
    public int niveau;
    public GroupeSanguin groupe;
    public TreeSet<Licence> listeLicence= new TreeSet<>();

    public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.niveau= niveau;
        this.groupe = groupe;
    }

 public Licence derniereLicence(){
     return listeLicence.last();
 }
public void ajouteLicence (String numero, LocalDate delivrance, Club c){
    Licence l= new Licence(this,numero, delivrance,c);
    listeLicence.add(l);
    


    }
public int getNiveau(){
    return niveau;
    }
public GroupeSanguin getGroupe(){
    return groupe;
}

public TreeSet<Licence> getLicences(){
    return listeLicence;
}
}
         
