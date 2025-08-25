import br.com.mariojp.solid.ocp.CustomerType;
import br.com.mariojp.solid.ocp.DependencyContainer;
import br.com.mariojp.solid.ocp.DiscountCalculator;

public class Main {
	public static void main(String[] args) {
		DependencyContainer container = new  DependencyContainer();

		DiscountCalculator calc = container.getDiscountCalculator();
		System.out.println("REGULAR 100 -> " + calc.apply(100, CustomerType.REGULAR));
		System.out.println("PREMIUM 100 -> " + calc.apply(100, CustomerType.PREMIUM));
		// PARTNER deveria ter 12%
		System.out.println("PARTNER 100 -> " + calc.apply(100, CustomerType.PARTNER));
	}
}
