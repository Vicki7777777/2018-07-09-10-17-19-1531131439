package practice07;


public class Student extends Person {
    protected Klass klass;
    public Student(String studentName, int studentAge,Klass studentClass) {
        super(studentName,studentAge);
        this.name = studentName;
        this.age = studentAge;
        this.klass = studentClass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        return super.introduce()+String.format(" I am a Student. I am at Class %s.",this.klass.getNumber());
    }
}