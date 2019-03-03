package patterns.observer;

/**
 * 회원정보
 */
public class MemberBean {
    
    private String name;
    private String email;
    private String phone;
    private int age;

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " : (" + this.age + ", " + this.phone + ", " + this.email + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }

        if(obj == this) {
            return true;
        }

        if( obj instanceof MemberBean ) {
            MemberBean tmp = (MemberBean)obj;

            return ((this.name.equals(tmp.getName())) && (this.age == tmp.getAge()) && (this.phone.equals(tmp.getPhone())) && (this.email.equals(tmp.getEmail())));
        } else {
            return false;
        }
    }

    /**
     * hashCode 구현
     * 참조형일 경우, 해당 참조형의 hashCode 재귀호출
     * int 형이니 그냥 그 값을 더하여 hashCode 표현(Effective Java 참조)
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.email.hashCode();
        result = 31 * result + this.phone.hashCode();
        result = 31 * result + this.age;

        return result;
    }
}