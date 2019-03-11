package patterns.composite;

import java.util.Stack;
import java.util.Iterator;

public class DirectoryIterator implements Iterator<Entry> {
	Stack stack = new Stack();
   
	public DirectoryIterator(Iterator<Entry> iterator) {
		stack.push(iterator);
	}
    
	public Entry next() {
		if (hasNext()) {
			Iterator<Entry> iterator = (Iterator<Entry>) stack.peek();
            Entry component = iterator.next();
            // 디렉토리일 경우 스택에 다시 넣는다.
			if (component instanceof Directory) {
				stack.push(component.createIterator());
            } 
			return component;
		} else {
			return null;
		}
	}
  
	public boolean hasNext() {
        // 하위 Iterator가 없는 경우
		if (stack.empty()) {
			return false;
		} else {
            Iterator<Entry> iterator = (Iterator<Entry>) stack.peek();
            // 저장한 Iterator를 stack에서 불러온다.
			if (!iterator.hasNext()) {
				stack.pop();
				return false;
			} else {
                return true;
                
			}
		}
	}
   
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
