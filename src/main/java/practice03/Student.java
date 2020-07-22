package practice03;

public class Student extends Person {
    protected int klass;
    public Student(String personName, int personAge,int studentClass) {
        super(personName,studentClass);
        this.name = personName;
        this.age = personAge;
        this.klass = studentClass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce(){
        String str = "I am a Student. I am at Class 2.";
        return str;
    }
}