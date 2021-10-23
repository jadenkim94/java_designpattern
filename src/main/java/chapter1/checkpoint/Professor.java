package chapter1.checkpoint;

public class Professor {
    private Student student;

    public void setStudent(Student student){
        this.student = student;
        student.setAdvisor(this);
    }

    public void advice(){
        student.advice("상담");
    }


}
