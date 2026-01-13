package srp.src;

import java.time.LocalDate;

public class Devis {
    private LocalDate date;
    private double montantHT;
    private double tva;
    private double totalTTC;
    private int validityDays;

    public Devis(double montantHT, double tva, double totalTTC) {
        this.date = LocalDate.now();
        this.montantHT = montantHT;
        this.tva = tva;
        this.totalTTC = totalTTC;
        this.validityDays = 30;
    }

    public LocalDate getDate() { return date; }
    public double getMontantHT() { return montantHT; }
    public double getTva() { return tva; }
    public double getTotalTTC() { return totalTTC; }
    public int getValidityDays() { return validityDays; }
}