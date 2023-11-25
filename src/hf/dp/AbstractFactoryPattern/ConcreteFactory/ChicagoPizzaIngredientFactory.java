package hf.dp.AbstractFactoryPattern.ConcreteFactory;

import hf.dp.AbstractFactoryPattern.AbstractFactory.PizzaIngredientFactory;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Cheese;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Clams;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Dough;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Sauce;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Concrete.FrozenClams;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Concrete.MozzarellaCheese;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Concrete.PlumTomatoSauce;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Concrete.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
	public Dough createDough(){
		return new ThickCrustDough();
	}
	
	public Sauce createSauce(){
		return new PlumTomatoSauce();
	}
	
	public Cheese createCheese(){ 
		return new MozzarellaCheese();
	}
	
//	public Veggies[] createVeggies(){
//		Veggies veggies[] = {new Garlic(), new Onion(),new Mushroom(), new RedPepper()}; 
//		return veggies;
//	}
//	
//	public Pepperoni createPepperoni(){ 
//		return new SlicedPepperoni();
//	}
	
	public Clams createClam(){ 
		return new FrozenClams();
	}
}