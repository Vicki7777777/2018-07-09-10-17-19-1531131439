package practice08;

public class Klass {
    protected int number;
    protected Student leader;
    public Klass(int number){
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public String getDisplayName(){
        return String.format("Class %s",this.number);
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Student getLeader() {
        return leader;
    }

    public Student assignLeader(Student student){
        this.leader = student;
        return leader;
    }
}