package org.example.compteBancaire;

import java.util.Scanner;

public class IHM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client("Dupont", "Jean", "1234", "0601020304");
        CompteCourant compteCourant = new CompteCourant(client);
        client.ajouterCompte(compteCourant);

        boolean continuer = true;
        while (continuer) {
            System.out.println("1. Déposer");
            System.out.println("2. Retirer");
            System.out.println("3. Afficher solde");
            System.out.println("4. Quitter");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Montant à déposer : ");
                    String montantDepot = scanner.next();
                    compteCourant.deposer(montantDepot);
                    break;
                case 2:
                    System.out.println("Montant à retirer : ");
                    String montantRetrait = scanner.next();
                    compteCourant.retirer(montantRetrait);
                    break;
                case 3:
                    System.out.println("Solde : " + compteCourant.getSolde());
                    break;
                case 4:
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide");
            }
        }
    }
}
