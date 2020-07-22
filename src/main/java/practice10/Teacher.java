package practice10;

import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    protected List<Klass> classes;
    public Teacher(int id,String personName,int personAge, List<Klass> teacherClass) {
        super(id, personName,personAge);
        this.classes = teacherClass;
    }
    public Teacher(int id,String personName,int personAge) {
        super(id, personName,personAge);
    }
    public List<Klass> getClasses() {
        return classes;
    }

    public void setClasses(List<Klass> classes) {
        this.classes = classes;
    }

    @Override
    public String introduce(){
        if(this.classes == null){
            return super.introduce()+String.format(" I am a Teacher. I teach No Class.");
        }else{
            return super.introduce()+String.format(" I am a Teacher. I teach Class %s.",classes.stream().map(Klass::getNumber).map(String::valueOf).collect(Collectors.joining(", ")));
        }

    }
    public boolean isTeaching(Student student) {
        return classes.stream().map(Klass::getNumber).collect(Collectors.toList()).contains(student.getKlass().getNumber());
    }

    public String introduceWith(Student student) {
        if(isTeaching(student)){
            return "My name is " + super.getName() + ". I am 21 years old. I am a Teacher. I teach "+student.getName()+".";
        }else{
            return "My name is " + super.getName() + ". I am 21 years old. I am a Teacher. I don't teach "+student.getName()+".";
        }
    }
}
