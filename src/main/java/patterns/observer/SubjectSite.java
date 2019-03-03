package patterns.observer;

import java.util.*;

public class SubjectSite implements Subject {

    // 회원 정보 저장해 놓는 List
    // DB와 연동 시 딱히 관리할 필요는 없으나, 여기서는 DB와 연동하지 않으므로, 관리한다(PULL 대비).
    private ArrayList<MemberBean> memberList = null;
    private ArrayList<Observer> observerList = null;

    public SubjectSite() {
        memberList = new ArrayList<MemberBean>();
        observerList = new ArrayList<Observer>();
    }
    
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * Member의 가장 마지막 데이터를 옵저버에 전달해줌
     */
    public void notifyObserver() {
        // 멤버나 옵저버가 비어있다면, 전달하지 않음.
        if( memberList.isEmpty() || observerList.isEmpty() ) {

        } else {
            Observer observer = null;

            MemberBean lastMember = memberList.get(memberList.size() - 1);
            
            if(lastMember != null) {
                for( int i = 0; i < observerList.size(); i++ ) {
                    observer = observerList.get(i);
                    observer.readData(lastMember);
                }
            }
        }
    }

    @Override
    public void addMember(MemberBean member) {
        boolean isAdd = false;

        if(memberList.isEmpty()) {
            isAdd = true;
        } else {
            Iterator<MemberBean> it = memberList.iterator();
            MemberBean temp  = new MemberBean();
            while(it.hasNext()) {
                temp = it.next();
                if(temp.equals(member)) {
                    isAdd = false;
                    break;
                } else {
                    isAdd = true;
                }
            }
        }

        if( isAdd ) {
            System.out.println("Member 등록 성공");
            memberList.add(member);
            notifyObserver();
        } else {
            System.out.println("Member 중복으로 인한 실패");
        }
    }

    @Override
    public ArrayList<MemberBean> pullMember() {
        return memberList;
    }

    @Override
    public boolean isContainsObserver(Observer observer) {
        return observerList.contains(observer);
    }

    @Override
    public int countObserver() {
        return this.observerList.size();
    }


}