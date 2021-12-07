/**
 * @(#) LicencePlongeur.java
 */
package FFSSM;

import java.time.LocalDate;
import java.text.SimpleDateFormat;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.HashSet;
import java.util.Set;

public class Licence {

    public Personne possesseur;

    public String numero;

    public LocalDate delivrance;

    public Club club;
    Set<Licence> maListeLicence = new HashSet<>();

    public Licence(Personne possesseur, String numero, LocalDate delivrance, Club club) {
        this.possesseur = possesseur;
        this.numero = numero;
        this.delivrance = delivrance;
        this.club = club;
    }

    public Personne getPossesseur() {
        return possesseur;
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getDelivrance() {
        return delivrance;
    }

    public Club getClub() {
        return club;
    }

    public boolean estValide(LocalDate d) {
        return DAYS.between(delivrance, d) < 365;
    }
    
}
