package patterns.observer;

import java.util.*;

public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
    public ArrayList<MemberBean> pullMember();
    public boolean isContainsObserver(Observer observer);
    public int countObserver();
    public void addMember(MemberBean member);
}