package srp.src;

import java.util.Scanner;

public class DocumentManager {
    public static void traiterDocument(Scanner scanner, FacturationService service, boolean facture) {
        double montantHT = ValueReader.lireDoublePositif(scanner, "Montant HT : ");

        if (facture) {
            System.out.print("Nom du client : ");
            String client = scanner.nextLine().trim();
            service.creerFacture(montantHT, client);
        } else {
            service.creerDevis(montantHT);
        }
    }
}
