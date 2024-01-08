package School;

public class Teacher extends Person {
    String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void describeRole() {
        System.out.println(getName() + " Teachs " + getSubject());
    }
}
