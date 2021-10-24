package chapter2;

public class NonDiscountMode implements DiscountMode{
    @Override
    public double getDiscountRate() {
        return 0.0;
    }
}
