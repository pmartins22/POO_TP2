package srp.src;

import java.util.Scanner;

public class MainSRP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FacturationService service = new FacturationService();

        boolean quitter = false;

        while (!quitter) {
            afficherMenu();

            int choix = ValueReader.lireEntier(scanner, "Choix : "); // <-- Using ValueReader

            switch (choix) {
                case 1:
                    DocumentManager.traiterDocument(scanner, service, true); // <-- Using DocumentManager
                    break;
                case 2:
                    DocumentManager.traiterDocument(scanner, service, false); // <-- Using DocumentManager
                    break;
                case 0:
                    quitter = true;
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }

        scanner.close();
    }

    private static void afficherMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Créer une facture");
        System.out.println("2. Créer un devis");
        System.out.println("0. Quitter");
    }
}
