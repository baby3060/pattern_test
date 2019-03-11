package patterns.composite;

import java.util.*;

import java.text.SimpleDateFormat;

public class Directory extends Entry {

    private Entry parent;

    private String name;
    private String description;
    private String makedate;
    private ArrayList<Entry> entryList;

    public Directory(String name, String description) {
        this.entryList = new ArrayList<Entry>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        this.makedate = formatter.format(new Date());
        this.name = name;
        this.description = description;
    }

    @Override
    public void setParent( Entry parent ) {
        if( parent.isFile() ) {
            throw new UnsupportedOperationException("파일일 경우 상위 디렉토리로 등록할 수 없습니다.");
        } else {
            this.parent = parent;
        }
    }

    @Override
    public ArrayList<Entry> getEntryList() {
        return this.entryList;
    }

    @Override
    public void add(Entry entry) {
        entry.setParent(this);
        this.entryList.add(entry);
    }

    @Override
    public boolean isFile() {
        return false;
    }

    @Override
    public Entry getParent() {
        return this.parent;
    }

    @Override
    public void remove(Entry entry) {
        this.entryList.remove(entry);
    }

    public String getName() {
		return this.name;
    }

	public String getDescription() {
		return this.description;
    }
    
    public String getMakedate() {
        return this.makedate;
    }

    public Iterator<Entry> createIterator() {
    	return new DirectoryIterator(this.entryList.iterator());
    }

    public void print() {
        System.out.println(this);
        Iterator<Entry> iterator = createIterator();
		while (iterator.hasNext()) {
			Entry component = iterator.next();
			System.out.println(component);
		}
	}

}