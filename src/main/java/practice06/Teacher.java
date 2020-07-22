package practice06;

public class Teacher extends Person{
    protected Integer klass = 0;

    public Teacher(String personName, int personAge,int teacherClass) {
        super(personName, personAge);
        this.klass = teacherClass;
    }

    public Teacher(String personName, int personAge) {
        super(personName, personAge);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
    @Override
    public String introduce(){
        if(this.klass == 0){
            return super.introduce()+String.format(" I am a Teacher. I teach No Class.");
        }else{
            return super.introduce()+String.format(" I am a Teacher. I teach Class %s.",this.getKlass());
        }

    }
}
