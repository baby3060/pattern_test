package patterns.observer;

public class CompanyA extends Observer {
    public CompanyA() {
        super();
        setSubject(null);
    }

    public CompanyA(Subject subject) {
    	super();
    	setSubject(subject);
    }
    
    @Override
    public void readData(MemberBean member) {
    	// TODO Auto-generated method stub
    	System.out.println("회원 : " + member + ", 넘겨 받음(CompanyA)");
    }
}