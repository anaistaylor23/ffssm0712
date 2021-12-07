package FFSSM;

import java.time.LocalDate;
import java.util.HashSet;

public class Plongeur extends Personne {

    public HashSet<Licence> listeLicence= new HashSet<>();

    public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
    }

 public void derniereLicence()
         
