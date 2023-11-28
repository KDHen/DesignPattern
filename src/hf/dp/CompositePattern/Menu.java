package hf.dp.CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    Iterator iterator = null;
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    public String name;
    public String description;

    Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
    }

    public String getName() { return name; }

    public String getDescription () { return description; }

    public void print() {
        Iterator iterator = (Iterator) menuComponents.iterator();
        if (iterator.hasNext()) {
            do {
                MenuComponent menuComponent = (MenuComponent) iterator.next();
                menuComponent.print();
            } while (iterator.hasNext());
        }
    }

    public Iterator createIterator() {
        if (iterator == null)
            iterator = new CompositeIterator(menuComponents.iterator());
        return iterator;
    }
}
