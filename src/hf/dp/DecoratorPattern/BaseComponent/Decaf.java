package hf.dp.DecoratorPattern.BaseComponent;

import hf.dp.DecoratorPattern.Beverage;

public class Decaf extends Beverage{ 
	
	public Decaf(){
		description="Decaf";
	}
	
	public double cost(){ 
		return 2.99;
	}
}
