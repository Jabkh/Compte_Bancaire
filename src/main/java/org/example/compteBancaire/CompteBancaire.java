package org.example.compteBancaire;

import java.util.ArrayList;
import java.util.List;

public abstract class CompteBancaire {
    protected double solde;
    protected Client client;
    public List<Operation> operations;

    public CompteBancaire(Client client) {
        this.client = client;
        this.solde = 0.0;
        this.operations = new ArrayList<>();
    }

    // Méthodes abstraites à implémenter dans les sous-classes
    public abstract void deposer(String montant);
    public abstract void retirer(String montant);
    public abstract String getSolde();
    public abstract List<Operation> getOperations();
}