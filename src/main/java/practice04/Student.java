package practice04;

public class Student extends Person {
    protected int klass;
    public Student(String studentName, int studentAge,int studentClass) {
        super(studentName,studentAge);
        this.name = studentName;
        this.age = studentAge;
        this.klass = studentClass;
    }

    public int getKlass() {

        return klass;
    }

    public void setKlass(int klass) {

        this.klass = klass;
    }

    public String introduce(){
        return super.basicIntroduce()+" I am a Student. I am at Class "+ this.klass+".";
    }
}