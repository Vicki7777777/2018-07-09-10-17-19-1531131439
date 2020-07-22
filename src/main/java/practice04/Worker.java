package practice04;

public class Worker extends  Person{

    public Worker(String workerName, int workerAge) {
        super(workerName, workerAge);
    }
    public String introduce(){
        return super.basicIntroduce()+" I am a Worker. I have a job.";
    }
}
