// 3. Class for display (single responsibility: formatting)
package srp.src;

public class DocumentPrinter {

    public void printFacture(Facture facture) {
        System.out.println("\n--- FACTURE ---");
        System.out.println("Date : " + facture.getDate());
        System.out.println("Client : " + facture.getClientName());
        System.out.println("Montant HT : " + facture.getMontantHT());
        System.out.println("TVA : " + facture.getTva());
        System.out.println("Total TTC : " + facture.getTotalTTC());
    }

    public void printDevis(Devis devis) {
        System.out.println("\n--- DEVIS ---");
        System.out.println("Date : " + devis.getDate());
        System.out.println("Montant HT : " + devis.getMontantHT());
        System.out.println("TVA : " + devis.getTva());
        System.out.println("Total TTC : " + devis.getTotalTTC());
        System.out.println("Valable " + devis.getValidityDays() + " jours");
    }
}