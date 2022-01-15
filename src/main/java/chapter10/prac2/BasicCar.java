package chapter10.prac2;

public class BasicCar implements CarComponent{

    private int price;

    public BasicCar(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getCarInfo() {
        return "this car is car";
    }
}
