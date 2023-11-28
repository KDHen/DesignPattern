package hf.dp.CompositePattern;

import java.util.Stack;
import java.util.Iterator;

public class CompositeIterator implements Iterator {
    Stack<Iterator> stack = new Stack<Iterator>();
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator)stack.peek();
            MenuComponent component = (MenuComponent)iterator.next();
            if (component instanceof Menu)
                stack.push(component.createIterator());
            return component;
        }
        else return null;
    }
    public boolean hasNext() {
        if (stack.empty()) return false;
        Iterator iterator = (Iterator)stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        } else return true;
    }
}
