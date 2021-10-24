package chapter2;

public class TodayEvent implements DiscountMode{
    @Override
    public double getDiscountRate() {
        return 0.3;
    }
}
