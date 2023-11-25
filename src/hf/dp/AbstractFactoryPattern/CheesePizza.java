package hf.dp.AbstractFactoryPattern;

import hf.dp.AbstractFactoryPattern.AbstractFactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory){ 
		this.ingredientFactory = ingredientFactory;
	}
	
	public void prepare(){
		System.out.println("Preparing" + name);
		dough = ingredientFactory.createDough(); 
		sauce = ingredientFactory.createSauce(); 
		cheese = ingredientFactory.createCheese();
	}
}
