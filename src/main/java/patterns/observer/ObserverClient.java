package patterns.observer;

public class ObserverClient {
    public void run() {
        Subject subject = new SubjectSite();

        Observer comA = new CompanyA(subject);
        Observer comB = new CompanyB(subject);
        Observer comC = new CompanyC(subject);

        System.out.println("Observer 카운트 : " + subject.countObserver()); 

        subject.addObserver(comA);
        subject.addObserver(comB);
        subject.addObserver(comC);

        System.out.println("Observer 카운트 : " + subject.countObserver()); 

        MemberBean member = new MemberBean();
        member.setName("a");
        member.setEmail("a");
        member.setPhone("a");
        member.setAge(0);

        subject.addMember(member);

        member = new MemberBean();
        member.setName("b");
        member.setEmail("b");
        member.setPhone("b");
        member.setAge(1);

        subject.addMember(member);

        member = new MemberBean();
        member.setName("c");
        member.setEmail("c");
        member.setPhone("c");
        member.setAge(2);

        subject.addMember(member);

        comB.removeRequest();

        System.out.println("Observer 카운트 : " + subject.countObserver()); 

        member = new MemberBean();
        member.setName("d");
        member.setEmail("d");
        member.setPhone("d");
        member.setAge(3);

        subject.addMember(member);

        comB.reRequestPull();
        
        subject.addObserver(comB);
        comB.reRequestPull();
    }
}