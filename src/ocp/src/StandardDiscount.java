package ocp.src;

public class StandardDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double montant) {
        return montant * 1.0;
    }
}