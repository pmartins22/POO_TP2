package ocp.src;

import java.util.HashMap;
import java.util.Map;

public class DiscountFactory {
    private static final Map<Integer, DiscountStrategy> strategies = new HashMap<>();

    static {
        strategies.put(1, new StandardDiscount());
        strategies.put(2, new StudentDiscount());
        strategies.put(3, new VIPDiscount());
    }

    public static DiscountStrategy getStrategy(int typeClient) {
        DiscountStrategy strategy = strategies.get(typeClient);
        if (strategy == null) {
            throw new IllegalArgumentException("Type de client inconnu : " + typeClient);
        }
        return strategy;
    }
}