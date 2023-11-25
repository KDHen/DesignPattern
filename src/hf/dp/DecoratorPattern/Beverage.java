package hf.dp.DecoratorPattern;


public abstract class Beverage{
	protected String description = "UnknownBeverage";
	
	public String getDescription(){ 
		return description;
	}
	
	public abstract double cost();
}