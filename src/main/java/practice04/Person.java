package practice04;

public class Person {
    protected String name;
    protected int age;
    public Person(String personName,int personAge){
        this.name = personName;
        this.age = personAge;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String introduce(){
       return basicIntroduce();
    }
    public String basicIntroduce(){
        return  "My name is "+ this.name+". I am "+ this.age+" years old.";
    }

}
