/**
 * @(#) Moniteur.java
 */
package FFSSM;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Moniteur extends Plongeur {

    public int numeroDiplome;
    private List <Embauche> embauches;
    public Moniteur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance, int numeroDiplome) {
        super(nom, prenom, adresse, telephone, naissance,niveau, groupe );
        this.numeroDiplome = numeroDiplome;
        embauches= new ArrayList<>();
    }

    /**
     * Si ce moniteur n'a pas d'embauche, ou si sa dernière embauche est
     * terminée, ce moniteur n'a pas d'employeur.
     *
     * @return l'employeur actuel de ce moniteur sous la forme d'un Optional
     */
    public void employeurActuel() {
        Club c = null;
        for (Embauche e : embauches){
            if (e.estTerminee()){
                c=e.getEmployeur();
            }
        }
           return Optional.ofNullable(c);
        
       
    }   
    

    public void nouvelleEmbauche(Club employeur, LocalDate debutNouvelle) {
        Embauche e = new Embauche (debutNouvelle,this,employeur);
        embauches.add(e);
    }

    public List<Embauche> emplois() {
        return embauches;
    }

    
}