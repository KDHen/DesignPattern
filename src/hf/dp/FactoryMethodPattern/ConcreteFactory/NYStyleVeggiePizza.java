package hf.dp.FactoryMethodPattern.ConcreteFactory;

public class NYStyleVeggiePizza extends Pizza {
	public NYStyleVeggiePizza(){
		name = "NY Style Pizza"; 
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce"; 
		toppings.add("Grated Reggiano Cheese");
	}
	public String getName() {
		return "NYStyleVeggiePizza";
	}
}