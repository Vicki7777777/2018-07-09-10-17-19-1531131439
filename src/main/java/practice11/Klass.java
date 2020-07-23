package practice11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Klass {
    protected int number;
    protected Student leader;
    protected Set<Student> members;
    private final List<JoinLitener> joinListener;

    public Klass(int number) {
        this.number = number;
        joinListener = new ArrayList<>();
        this.members = new HashSet<>();
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %s", this.number);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public void assignLeader(Student student) {
        if (this.isIn(student)) {
            this.leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
        this.joinListener.forEach(listener -> {
            String msg = " I know "+student.getName()+" become Leader of Class "+student.getKlass().getNumber()+".\n";
            listener.update(msg);
        });
    }

    public Student getLeader(){
        return this.leader;
    }

    public void appendMember(Student student) {
        if (this.members.add(student)) {
            student.setKlass(this);
            this.joinListener.forEach(listener -> {
                String msg = " I know " + student.getName() + " has joined Class " + student.getKlass().getNumber() + ".\n";
                listener.update(msg);
            });
        }
    }
//todo
    public boolean isIn(Student student) {
        return student.getKlass().getNumber() == this.getNumber();
    }

    public void registerListener(JoinLitener joinListener) {
        this.joinListener.add(joinListener);
    }
}