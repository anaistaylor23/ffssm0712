/**
 * @(#) Moniteur.java
 */
package FFSSM;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Moniteur extends Plongeur {

    public int numeroDiplome;

    public Moniteur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance, int numeroDiplome) {
        super(nom, prenom, adresse, telephone, naissance);
        this.numeroDiplome = numeroDiplome;
    }

    /**
     * Si ce moniteur n'a pas d'embauche, ou si sa dernière embauche est
     * terminée, ce moniteur n'a pas d'employeur.
     *
     * @return l'employeur actuel de ce moniteur sous la forme d'un Optional
     */
    public Optional<Club> employeurActuel() {
        Optional<Club> isNull = Optional;
    }

    public void nouvelleEmbauche(Club employeur, LocalDate debutNouvelle) {
        this.club = club;
        this.debutNouvelle = debut;
    }

    public List<Embauche> emplois() {
        List<Embauche> maListeEmbauche = new List<>();
        return maListeEmbauche;
    }

    
    public LocalDate getFin();
        return fin;
