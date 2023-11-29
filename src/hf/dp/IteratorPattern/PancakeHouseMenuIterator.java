package hf.dp.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    ArrayList<MenuItem> items;
    int position = 0;
    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }
    public MenuItem next() {
        MenuItem item = items.get(position);
        position = position + 1;
        return item;
    }
    public boolean hasNext() {
        return position < items.size();
    }
}
