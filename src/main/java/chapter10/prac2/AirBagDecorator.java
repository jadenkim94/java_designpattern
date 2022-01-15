package chapter10.prac2;

public class AirBagDecorator extends CarOptionDecorator{

    private int airBagPrice;

    public AirBagDecorator(CarComponent carComponent, int airBagPrice) {
        super(carComponent);
        this.airBagPrice = airBagPrice;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + getAirBagPrice();

    }

    private int getAirBagPrice() {
        return this.airBagPrice;
    }

    @Override
    public String getCarInfo() {
        return super.getCarInfo() + "\n this car has AirBag";
    }
}
