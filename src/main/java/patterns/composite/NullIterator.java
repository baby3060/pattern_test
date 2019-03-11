package patterns.composite;

import java.util.Iterator;

/**
 * File에서 사용할 Iterator(하위 데이터 없음)
 */
public class NullIterator implements Iterator<Entry> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Entry next() {
        return null;
    }
}