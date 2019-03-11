package patterns.iterator;

import java.util.*;

public interface Shelf {
    public Iterator<Product> createIterator();
    public void addItem(Product product);
    public void removeItem(Product product);
}