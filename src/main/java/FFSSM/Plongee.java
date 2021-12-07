/**
 * @(#) Plongee.java
 */
package FFSSM;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Plongee {

	public Site lieu;

	public Moniteur chefDePalanquee;

	public LocalDate date;

	public int profondeur;

	public int duree;
        public ArrayList<Plongeur> ListePlongeur = new ArrayList<Plongeur>();
	public Plongee(Site lieu, Moniteur chefDePalanquee, LocalDate date, int profondeur, int duree) {
		this.lieu = lieu;
		this.chefDePalanquee = chefDePalanquee;
		this.date = date;
		this.profondeur = profondeur;
		this.duree = duree;
	}

	public void ajouteParticipant(Plongeur participant) {
                ListePlongeur.add(participant);
	}

	public LocalDate getDate() {
		return date;
	}

	
	public boolean estConforme() {
            if (ListePlongeur.size()==maListeLicence);
                return true;
        } 
        else {
            return false;
        }
	}


