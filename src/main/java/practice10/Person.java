package practice10;


import java.util.Objects;

public class Person {
    protected String name;
    protected int age;
    protected int id;
    public Person(int id,String personName,int personAge){
        this.name = personName;
        this.age = personAge;
        this.id = id;
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

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String introduce(){
        return String.format("My name is %s. I am %s years old.",this.getName(),this.getAge());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId() == person.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

