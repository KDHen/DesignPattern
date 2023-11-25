package hf.dp.FactoryMethodPattern.ConcreteFactory;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza(){
		name = "Chicago Style Veggie Pizza"; 
		dough = "Thick Crust Dough";
		sauce = "Tomato Sauce"; 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Diced Onion");
		toppings.add("Sliced Mushrooms");
		toppings.add("Sliced Red Pepper");
		toppings.add("Sliced Black Olives");
	}
	public String getName() {
		return "ChicagoStyleVeggiePizza";
	}
}