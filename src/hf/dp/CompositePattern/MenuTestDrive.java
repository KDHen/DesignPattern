package hf.dp.CompositePattern;

public class MenuTestDrive {
    public static void main(String[] args) {
        // mid-level Menu
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        // adding mid-level Menus to root-level Menu
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // adding bottom-level Menu to mid-level Menu
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        dinerMenu.add(dessertMenu);
        // adding MenuItems to Menus
        pancakeHouseMenu.add(new MenuItem( "K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem( "Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage", false, 2.99));

        Waitress waitress = new Waitress(allMenus);
        waitress.printVegetarianMenu();
    }
}
