package practice08;

public class Teacher extends Person {
    protected Klass klass;

    public Teacher(int id,String personName,int personAge, Klass teacherClass) {
        super(id, personName,personAge);
        this.klass = teacherClass;
    }
    public Teacher(int id,String personName,int personAge) {
        super(id, personName,personAge);
    }
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }


    @Override
    public String introduce(){
        if(this.klass == null){
            return super.introduce()+String.format(" I am a Teacher. I teach No Class.");
        }else{
            return super.introduce()+String.format(" I am a Teacher. I teach Class %s.",this.getKlass().getNumber());
        }

    }
    public String introduceWith(Student student){
        if(student.getKlass().getNumber() == this.klass.getNumber()){
            return super.introduce()+String.format(" I am a Teacher. I teach %s.",student.getName());
        }else {
            return super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.getName());
        }
    }
}
