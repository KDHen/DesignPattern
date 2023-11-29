package hf.dp.IteratorPattern;

import hf.dp.IteratorPattern.MyHWInfo;

public class MenuTestDrive {
    public static void main(String[] args) {
        MyHWInfo.printInfo();

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        // With iterators
        waitress.printMenu();
    }
}
