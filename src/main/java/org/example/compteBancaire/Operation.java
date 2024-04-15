package org.example.compteBancaire;

public class Operation {
    private String numero;
    private double montant;
    private Statut statut;

    public enum Statut {
        DEPOT,
        RETRAIT
    }

    public Operation(String numero, double montant, Statut statut) {
        this.numero = numero;
        this.montant = montant;
        this.statut = statut;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "numero='" + numero + '\'' +
                ", montant=" + montant +
                ", statut=" + statut +
                '}';
    }
}
