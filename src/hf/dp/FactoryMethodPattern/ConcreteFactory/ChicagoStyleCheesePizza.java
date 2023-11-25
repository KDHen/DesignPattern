package hf.dp.FactoryMethodPattern.ConcreteFactory;


public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza(){
		name = "Chicago Style Sauce and Cheese Pizza"; 
		dough = "Thick Crust Dough";
		sauce = "Tomato Sauce"; 
		toppings.add("Shredded Mozzarella Cheese");
	}
	public String getName() {
		return "ChicagoStyleCheesePizza";
	}
}