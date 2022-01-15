package chapter10.prac2;

public class SCCDecorator extends CarOptionDecorator{

    private int sccPrice;

    public SCCDecorator(CarComponent carComponent, int sccPrice) {
        super(carComponent);
        this.sccPrice = sccPrice;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + getSccPrice();
    }

    private int getSccPrice() {
        return this.sccPrice;
    }

    @Override
    public String getCarInfo() {
        return super.getCarInfo() + "\n this car has SCC";
    }
}
