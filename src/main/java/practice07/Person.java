package practice07;

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
        return String.format("My name is %s. I am %s years old.",this.getName(),this.getAge());
    }
}