package hf.dp.AbstractFactoryPattern.AbstractFactory.Concrete;

import hf.dp.AbstractFactoryPattern.AbstractFactory.PizzaStore;
import hf.dp.AbstractFactoryPattern.AbstractProduct.*;
import hf.dp.AbstractFactoryPattern.IngredientFactory.*;
import hf.dp.AbstractFactoryPattern.IngredientFactory.Concrete.*;

public class ChicagoPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item){
		Pizza pizza=null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory(); 
		
		if(item.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory); 
			pizza.setName("ChicagoStyleCheesePizza");
		}else if(item.equals("veggie")){
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("ChicagoStyleVeggiePizza");
		}else if(item.equals("clam")){
			pizza = new ClamPizza(ingredientFactory); 
			pizza.setName("ChicagoStyleClamPizza");
		}else if(item.equals("pepperoni")){
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("ChicagoStylePepperoniPizza");
		}
		return pizza;
	}
}