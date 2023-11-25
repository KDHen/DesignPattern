package hf.dp.AbstractFactoryPattern;

public class pizzaTestDrive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nyStore = new NYPizzaStore();
//		PizzaStore chicagoStore = new ChicagoPizzaStore();
//		
		Pizza pizza = nyStore.orderPizza("cheese"); 
		System.out.println("Ethanordereda"+pizza.getName()); 
//		Pizza pizza = chicagoStore.orderPizza("cheese"); 
//		System.out.println("Joelordereda"+pizza.getName());
	}
}