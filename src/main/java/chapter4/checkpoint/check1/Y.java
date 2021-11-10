package chapter4.checkpoint.check1;

public class Y {

    private boolean guard = true;

    public void m1(){
        System.out.println("receive 'm1' message from X");
        Z o = new Z();

        if(guard){
            System.out.println("guard passed, send 'm2' message to W");
            o.m2();
        }
    }


}
