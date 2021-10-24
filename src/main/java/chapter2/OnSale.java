package chapter2;

public class OnSale implements DiscountMode{
    @Override
    public double getDiscountRate() {
        return 0.1;
    }
}
