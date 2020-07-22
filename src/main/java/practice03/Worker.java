package practice03;

public class Worker extends Person {

    public Worker(String personName, int personAge) {
        super(personName, personAge);
    }

    public String introduce(){
        String str = "I am a Worker. I have a job.";
        return str;
    }
}
