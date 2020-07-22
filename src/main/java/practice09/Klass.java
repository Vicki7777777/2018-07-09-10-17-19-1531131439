package practice09;

public class Klass {
    protected int number;
    protected Student leader;
    protected boolean member = false;
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
        if(this.member){
            this.leader = student;
        }
        else {
            System.out.print("It is not one of us.\n");
        }
        return leader;
    }
    public void appendMember(Student student){
        this.member= true;
    }
}
