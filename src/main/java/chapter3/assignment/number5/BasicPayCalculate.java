package chapter3.assignment.number5;

public class BasicPayCalculate implements PayCalculate{
    public static final int SALARY = 20_000;

    @Override
    public int calculatePay(Employee employee) {
        return employee.getWorkHours()*SALARY + employee.getOverTimeHours()*SALARY*2;
    }
}
