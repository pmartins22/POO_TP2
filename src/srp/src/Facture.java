// 2. Model classes (data)
package srp.src;

import java.time.LocalDate;

public class Facture {
    private LocalDate date;
    private String clientName;
    private double montantHT;
    private double tva;
    private double totalTTC;

    public Facture(String clientName, double montantHT, double tva, double totalTTC) {
        this.date = LocalDate.now();
        this.clientName = clientName;
        this.montantHT = montantHT;
        this.tva = tva;
        this.totalTTC = totalTTC;
    }

    // getters
    public LocalDate getDate() { return date; }
    public String getClientName() { return clientName; }
    public double getMontantHT() { return montantHT; }
    public double getTva() { return tva; }
    public double getTotalTTC() { return totalTTC; }
}