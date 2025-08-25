package br.com.mariojp.solid.ocp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DiscountCalculatorTest {
    @Test
    void partner_gets_12_percent() {
		DependencyContainer container = new  DependencyContainer();
        
        var calc = container.getDiscountCalculator();
        assertEquals(88.0, calc.apply(100.0, CustomerType.PARTNER), 0.0001,
            "PARTNER deveria ter 12% de desconto");
    }
}
