package chapter10.prac2;

public class NavDecorator extends CarOptionDecorator{

    private int navPrice;

    public NavDecorator(CarComponent carComponent, int navPrice) {
        super(carComponent);
        this.navPrice = navPrice;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + getNavPrice();
    }

    private int getNavPrice() {
        return this.navPrice;
    }

    @Override
    public String getCarInfo() {
        return super.getCarInfo() + "\n this car has NAV";
    }
}
