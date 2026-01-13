package ocp.src;

public class StudentDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double montant) {
        return montant * 0.9;
    }
}