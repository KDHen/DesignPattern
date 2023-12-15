package hf.dp.DecoratorPattern.ConcreteDecorators;

import hf.dp.DecoratorPattern.Beverage;
import hf.dp.DecoratorPattern.Decorator.CondimentDecorator;

public class Soy extends CondimentDecorator{ 
	public Soy(Beverage beverage){
		this.beverage=beverage;
	}
	public String getDescription(){
		return beverage.getDescription()+",Soy";
	}
	public double cost(){
		return .30+beverage.cost();
	}
}