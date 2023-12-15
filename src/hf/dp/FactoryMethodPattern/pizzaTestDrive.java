package hf.dp.FactoryMethodPattern;

import hf.dp.FactoryMethodPattern.ConcreteFactory.Pizza;
import hf.dp.StrategyPattern.MyHWInfo;

public class pizzaTestDrive {
	public static void main(String[] args) {
		MyHWInfo.printInfo();
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}