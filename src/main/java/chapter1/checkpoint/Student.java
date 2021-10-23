package chapter1.checkpoint;

public class Student {
    public Professor advisor;

    public void setAdvisor(Professor advisor){
        this.advisor = advisor;
    }

    public void advice(String msg){
        System.out.println(msg);
    }
}
