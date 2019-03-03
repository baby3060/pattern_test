package patterns.observer;

public class CompanyB extends Observer {
    public CompanyB() {
        super();
        setSubject(null);
    }

    public CompanyB(Subject subject) {
    	super();
    	setSubject(subject);
    }
    
    @Override
    public void readData(MemberBean member) {
    	// TODO Auto-generated method stub
    	System.out.println("회원 : " + member + ", 넘겨 받음(CompanyB)");
    }
}