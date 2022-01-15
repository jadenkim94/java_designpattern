package chapter10.prac2;

public class CarOptionDecorator implements CarComponent {

    private CarComponent carComponent;

    public CarOptionDecorator(CarComponent carComponent) {
        this.carComponent = carComponent;
    }

    @Override
    public int getPrice() {
        return carComponent.getPrice();
    }

    @Override
    public String getCarInfo() {
        return carComponent.getCarInfo();
    }
}
