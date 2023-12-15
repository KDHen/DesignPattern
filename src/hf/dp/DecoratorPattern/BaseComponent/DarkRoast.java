package hf.dp.DecoratorPattern.BaseComponent;

import hf.dp.DecoratorPattern.Beverage;

public class DarkRoast extends Beverage{ 
	
	public DarkRoast(){
		description="DarkRoast";
	}
	
	public double cost(){ 
		return 3.99;
	}
}
