// 1. Class for calculations
package srp.src;

public class TaxCalculator {
    private double vatRate;

    public TaxCalculator(double vatRate) {
        this.vatRate = vatRate;
    }

    public double calculateTVA(double montantHT) {
        return montantHT * this.vatRate;
    }

    public double calculateTotal(double montantHT) {
        return montantHT + calculateTVA(montantHT);
    }
}