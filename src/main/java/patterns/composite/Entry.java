package patterns.composite;

import java.util.*;

public abstract class Entry {
    
    public Entry getParent() {
        throw new UnsupportedOperationException();
    }

    /**
     * 파일을 이동할 경우도 있으니까 Parent를 설정 가능하게
     */
    public void setParent(Entry parent) {
        throw new UnsupportedOperationException();
    }

    public ArrayList<Entry> getEntryList() {
        throw new UnsupportedOperationException();
    }

    public void add(Entry entry) {
        throw new UnsupportedOperationException("파일일 경우 상위 디렉토리로 등록할 수 없습니다.");
    }

    /**
     * 디렉토리 일 경우 하위 Entry 삭제
     */
    public void remove(Entry entry) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
    }

    public boolean isFile() {
        throw new UnsupportedOperationException();
    }

    public int getSize() {
        throw new UnsupportedOperationException();
    }

    public String getMakedate() {
        throw new UnsupportedOperationException();
    }

    public void print() {
		throw new UnsupportedOperationException();
    }

    public abstract Iterator createIterator();
    
    @Override
    public String toString() {
        String result = "";
        String fileGubun = (isFile())?"파일":"디렉토리";
        String sizeName = (isFile())?"(size : " + getSize() + ")":"";
        String parentNm = "";

        Entry parent = getParent();

        if( parent == null ) {
            if( isFile() ) {
                result = "상위 폴더가 지정되어 있지 않습니다.";
            } else {
                result = "(" + fileGubun + ") 이름 : " + getName() + ", 설명 : " + getDescription() + ", 생성일자(시분초) : " + getMakedate();    
            }
        } else {
            result = "(" + fileGubun + ", " + parent.getName() + ") 이름 : " + getName() + sizeName + ", 설명 : " + getDescription() + ", 생성일자(시분초) : " + getMakedate();
        }
        
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj == null ) {
            return false;
        }

        if(this == obj) {
            return true;
        }

        if( obj instanceof Entry ) {
            Entry temp = (Entry)obj;

            // parent가 같고, 이름이 같다면 동일하다.
            if(temp.getParent() == getParent() && temp.getName().equals(getName())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 31;

        if( getParent() == null ) {
        } else {
            result = result + getParent().getName().hashCode();
        }

        result = result + getName().hashCode();
        
        return result;
    }

}