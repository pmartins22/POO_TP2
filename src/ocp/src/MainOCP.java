package ocp.src;

import java.util.Scanner;

public class MainOCP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculateurRemise calculateur = new CalculateurRemise();

        boolean quitter = false;

        while (!quitter) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Client standard");
            System.out.println("2. Client étudiant");
            System.out.println("3. Client VIP");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            int choix = lireEntier(scanner);

            if (choix == 0) {
                quitter = true;
                System.out.println("Au revoir !");
                continue;
            }

            System.out.print("Montant HT : ");
            double montant = lireDouble(scanner);

            try {
                DiscountStrategy strategy = DiscountFactory.getStrategy(choix);
                double total = calculateur.calculerTotal(strategy, montant);
                System.out.println("Montant après remise : " + total);
            } catch (IllegalArgumentException e) {
                System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }

        scanner.close();
    }

    private static int lireEntier(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide. Recommencez : ");
            }
        }
    }

    private static double lireDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide. Recommencez : ");
            }
        }
    }
}