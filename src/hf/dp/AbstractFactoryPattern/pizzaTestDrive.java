package hf.dp.AbstractFactoryPattern;

import hf.dp.AbstractFactoryPattern.AbstractFactory.PizzaStore;
import hf.dp.AbstractFactoryPattern.AbstractFactory.Concrete.ChicagoPizzaStore;
import hf.dp.AbstractFactoryPattern.AbstractFactory.Concrete.NYPizzaStore;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Pizza;
import hf.dp.StrategyPattern.MyHWInfo;

public class pizzaTestDrive {
	public static void main(String[] args) {
		MyHWInfo.printInfo();
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese"); 
		System.out.println("Ethan ordered a "+pizza.getName() + "\n"); 
		
		Pizza pizza1 = chicagoStore.orderPizza("cheese"); 
		System.out.println("Joelo rdered a "+pizza1.getName());
	}
}