package chapter3.assignment.number5;

public class Main {

    public static void main(String[] args) {
        PayCalculate basic = new BasicPayCalculate();
        Employee employee = new Employee(basic);
        System.out.println(employee.calculatePay());
    }

}
