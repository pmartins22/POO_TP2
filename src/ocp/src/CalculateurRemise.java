package ocp.src;

public class CalculateurRemise {

    public double calculerTotal(DiscountStrategy strategy, double montant) {
        return strategy.applyDiscount(montant);
    }
}