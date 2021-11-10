package chapter4.exmaple.ex6;

public class A1 {
    public void doA1(){
        A2 a2 = new A2();
        a2.doA2(this);
        A3 a3 = new A3();
        a3.doA3(a2);
    }


    public void doIt() {

    }
}
