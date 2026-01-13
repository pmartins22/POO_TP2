// 4. Class for persistence (single responsibility: saving)
package srp.src;

import java.io.FileWriter;
import java.io.IOException;

public class DocumentRepository {

    public void saveFacture(Facture facture) {
        try (FileWriter writer = new FileWriter("factures.txt", true)) {
            writer.write("FACTURE | " + facture.getDate()
                    + " | Client=" + facture.getClientName()
                    + " | HT=" + facture.getMontantHT()
                    + " | TVA=" + facture.getTva()
                    + " | TTC=" + facture.getTotalTTC() + "\n");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde de la facture : " + e.getMessage());
        }
    }

    public void saveDevis(Devis devis) {
        try (FileWriter writer = new FileWriter("devis.txt", true)) {
            writer.write("DEVIS | " + devis.getDate()
                    + " | HT=" + devis.getMontantHT()
                    + " | TVA=" + devis.getTva()
                    + " | TTC=" + devis.getTotalTTC()
                    + " | validite=" + devis.getValidityDays() + "j\n");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde du devis : " + e.getMessage());
        }
    }
}