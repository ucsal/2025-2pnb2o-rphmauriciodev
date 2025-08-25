package br.com.mariojp.solid.ocp;

import java.util.EnumMap;
import java.util.Map;

public class DependencyContainer {
    private final Map<CustomerType, DiscountPolicy> policies;

    public DependencyContainer() {
        policies = new EnumMap<>(CustomerType.class);
        policies.put(CustomerType.REGULAR, new RegularPolicy());
        policies.put(CustomerType.PREMIUM, new PremiumPolicy());
        policies.put(CustomerType.PARTNER, new PartnerPolicy());
    }

    public DiscountCalculator getDiscountCalculator() {
        return new DiscountCalculator(policies);
    }
}
