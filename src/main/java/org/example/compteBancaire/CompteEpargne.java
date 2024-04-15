package org.example.compteBancaire;

public class CompteEpargne extends CompteBancaire {
    private static final double TAUX_INTERET = 0.03;

    public CompteEpargne(Client client) {
        super(client);
    }

    @Override
    public void deposer(String montant) {
        double montantDouble = Double.parseDouble(montant);
        this.solde += montantDouble;
        this.operations.add(new Operation("D" + System.currentTimeMillis(), montantDouble, Operation.Statut.DEPOT));
    }

    @Override
    public void retirer(String montant) {
        double montantDouble = Double.parseDouble(montant);
        if (montantDouble > 0 && this.solde >= montantDouble) {
            this.solde -= montantDouble;
            this.operations.add(new Operation("R" + System.currentTimeMillis(), montantDouble, Operation.Statut.RETRAIT));
        } else {
            System.out.println("Solde insuffisant ou montant invalide");
        }
    }

    @Override
    public String getSolde() {
        return this.solde + "€";
    }

    @Override
    public List<Operation> getOperations() {
        return this.operations;
    }
}
