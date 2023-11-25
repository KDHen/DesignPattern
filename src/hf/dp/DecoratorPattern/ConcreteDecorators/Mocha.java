package hf.dp.DecoratorPattern.ConcreteDecorators;

import hf.dp.DecoratorPattern.Beverage;
import hf.dp.DecoratorPattern.Decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator{ 
	public Mocha(Beverage beverage){
		this.beverage=beverage;
	}
	public String getDescription(){
		return beverage.getDescription()+",Mocha";
	}
	public double cost(){
		return .20+beverage.cost();
	}
}