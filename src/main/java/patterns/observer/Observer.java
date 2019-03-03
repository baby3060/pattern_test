package patterns.observer;

import java.util.*;

public abstract class Observer {
    private Subject subject;

    public void setSubject(Subject subject) {
    	this.subject = subject;
    }
    
    // User Data 읽어들임.
    public abstract void readData(MemberBean member);
    // 자신은 Observer에서 해제하겠다고 알림
    public void removeRequest() {
        if(this.subject == null ) {
            System.out.println("연결된 주제가 없습니다.");
        } else {
            if(this.subject.isContainsObserver(this)) {
                this.subject.removeObserver(this);
                System.out.println("Observer에서 탈퇴");
            } else {
                System.out.println("이 주제에 연결된 옵저버가 아닙니다.");
            }
            
        }
    }

    public void reRequestPull() {
        
        if(this.subject == null ) {
            System.out.println("연결된 주제가 없습니다.");
        } else {
            ArrayList<MemberBean> memberList = subject.pullMember();

            if(this.subject.isContainsObserver(this)) {
                System.out.println("주제에서 부터 모든 데이터 다시 넘겨받음.");
                if(memberList.isEmpty()) {
                    System.out.println("데이터가 없습니다.");
                } else {
                    for (MemberBean member : memberList) {
                        this.readData(member);
                    }
                }
            } else {
                System.out.println("이 주제에 연결된 옵저버가 아닙니다.");
            }   
        }
    }

}