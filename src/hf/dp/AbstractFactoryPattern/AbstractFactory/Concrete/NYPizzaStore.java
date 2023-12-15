package hf.dp.AbstractFactoryPattern.AbstractFactory.Concrete;

import hf.dp.AbstractFactoryPattern.AbstractFactory.PizzaStore;
import hf.dp.AbstractFactoryPattern.AbstractProduct.*;
import hf.dp.AbstractFactoryPattern.IngredientFactory.*;
import hf.dp.AbstractFactoryPattern.IngredientFactory.Concrete.*;

public class NYPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item){
		Pizza pizza=null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory(); 
		
		if(item.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory); 
			pizza.setName("NewYorkStyleCheesePizza");
		}else if(item.equals("veggie")){
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("NewYorkStyleVeggiePizza");
		}else if(item.equals("clam")){
			pizza = new ClamPizza(ingredientFactory); 
			pizza.setName("NewYorkStyleClamPizza");
		}else if(item.equals("pepperoni")){
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("NewYorkStylePepperoniPizza");
		}
		return pizza;
	}
}