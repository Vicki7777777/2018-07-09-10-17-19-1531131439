package practice02;

public class Student extends Person{
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
        return "I am a Student. I am at Class "+this.klass+".";
    }
}
