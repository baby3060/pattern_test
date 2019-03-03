package patterns.observer;

public class CompanyC extends Observer {
    public CompanyC() {
        super();
        setSubject(null);
    }

    public CompanyC(Subject subject) {
    	super();
    	setSubject(subject);
    }
    
    @Override
    public void readData(MemberBean member) {
    	// TODO Auto-generated method stub
    	System.out.println("회원 : " + member + ", 넘겨 받음(CompanyC)");
    }
}