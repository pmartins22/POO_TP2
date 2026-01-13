package ocp.src;

public class VIPDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double montant) {
        return montant * 0.8;
    }
}