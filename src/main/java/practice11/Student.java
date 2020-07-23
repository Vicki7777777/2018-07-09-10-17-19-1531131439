package practice11;

public class Student extends Person {
    protected Klass klass;
    public Student(int id, String studentName, int studentAge, Klass studentClass) {
        super(id,studentName,studentAge);
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
        if(klass.leader == this){
            return super.introduce()+String.format(" I am a Student. I am Leader of Class %s.",this.klass.getNumber());
        }else{
            return super.introduce()+String.format(" I am a Student. I am at Class %s.",this.klass.getNumber());
        }
    }
}
