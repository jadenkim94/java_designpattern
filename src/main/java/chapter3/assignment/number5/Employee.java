package chapter3.assignment.number5;

public class Employee {

    private String id;
    private String name;
    private int workHours;
    private int overTimeHours;
    private PayCalculate payCalculate;

    public Employee(PayCalculate payCalculate) {
        this.id = "jh";
        this.name = "jaden";
        this.workHours = 10;
        this.overTimeHours = 5;
        this.payCalculate = payCalculate;
    }

    public int calculatePay(){
        return payCalculate.calculatePay(this);
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }
}
