package patterns.composite;

import java.util.*;
import java.text.*;

public class File extends Entry {
    private Entry parent;
    private String name;
    private String description;
    private String makedate;
    private int size;
    
    public File(String name, String description, int size) {
        this.name = name;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        this.makedate = formatter.format(new Date());
        this.description = description;
        this.size = size;
    }

    @Override
    public Entry getParent() {
        return parent;
    }

    @Override
    public void setParent( Entry parent ) {
        this.parent = parent;
    }

    @Override
    public boolean isFile() {
        return true;
    }

    @Override
    public String getName() {
		return this.name;
    }
    
    @Override
	public String getDescription() {
		return this.description;
    }

    @Override
    public String getMakedate() {
        return this.makedate;
    }

    @Override
    public Iterator<Entry> createIterator() {
        return new NullIterator();
    }
    
    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public int getSize() {
        return size;
    }

}