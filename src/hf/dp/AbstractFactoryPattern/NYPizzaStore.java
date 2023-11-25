package hf.dp.AbstractFactoryPattern;

import hf.dp.AbstractFactoryPattern.ConcreteFactory.*;
import hf.dp.AbstractFactoryPattern.AbstractFactory.*;
import hf.dp.AbstractFactoryPattern.Pizza;

public class NYPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item){
		Pizza pizza=null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory(); 
		
		if(item.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory); 
			pizza.setName("NewYorkStyleCheesePizza");
		}
//		}else if(item.equals("veggie")){
//			pizza = new VeggiePizza(ingredientFactory);
//			pizza.setName("NewYorkStyleVeggiePizza");
//		}else if(item.equals("clam")){
//			pizza = new ClamPizza(ingredientFactory); p
//			izza.setName("NewYorkStyleClamPizza");
//		}else if(item.equals("pepperoni")){
//			pizza = new PepperoniPizza(ingredientFactory);
//			pizza.setName("NewYorkStylePepperoniPizza");
		return pizza;
	}
}