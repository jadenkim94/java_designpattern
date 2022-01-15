package chapter10.prac2;

public class ESCDecorator extends CarOptionDecorator{

    private int escPrice;

    public ESCDecorator(CarComponent carComponent, int escPrice) {
        super(carComponent);
        this.escPrice = escPrice;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + getESCPrice();
    }

    private int getESCPrice() {
        return this.escPrice;
    }

    @Override
    public String getCarInfo() {
        return super.getCarInfo() + "\n this car has ESC";
    }
}
