package org.example.compteBancaire;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nom;
    private String prenom;
    private String identifiant;
    private List<CompteBancaire> comptes;
    private String numeroTelephone;

    public Client(String nom, String prenom, String identifiant, String numeroTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.numeroTelephone = numeroTelephone;
        this.comptes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public List<CompteBancaire> getComptes() {
        return comptes;
    }

    public void ajouterCompte(CompteBancaire compte) {
        this.comptes.add(compte);
    }

    public void supprimerCompte(CompteBancaire compte) {
        this.comptes.remove(compte);
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", identifiant='" + identifiant + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                ", comptes=" + comptes +
                '}';
    }
}
