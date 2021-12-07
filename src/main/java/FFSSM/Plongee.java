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
        private Set<Plongeur> palanquee;

	public int duree;
  
	public Plongee(Site lieu, Moniteur chefDePalanquee, LocalDate date, int profondeur, int duree) {
		this.lieu = lieu;
		this.chefDePalanquee = chefDePalanquee;
		this.date = date;
		this.profondeur = profondeur;
		this.duree = duree;
                palanquee= new HashSet<>();
	}

	public void ajouteParticipant(Plongeur participant) {
                palanquee.add(participant);
	}

	public LocalDate getDate() {
		return date;
	}

	
	public boolean estConforme() {
            for(Plongeur p : palanquee){
                if(!p.derniereLicence().estValide(date)){
          
                return false;
            } 
        return true;
        }
	


