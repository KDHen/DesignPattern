package hf.dp.DecoratorPattern.Decorator;

import hf.dp.DecoratorPattern.Beverage;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;
	public abstract String getDescription();
}
