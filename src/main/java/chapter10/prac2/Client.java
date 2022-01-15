package chapter10.prac2;

public class Client {

    public static void main(String[] args) {
        CarComponent basic = new BasicCar(1000);
        System.out.println(basic.getPrice());
        System.out.println(basic.getCarInfo());
        System.out.println("=====");
        CarComponent airBag = new AirBagDecorator(basic, 500);
        System.out.println(airBag.getPrice());
        System.out.println(airBag.getCarInfo());
        System.out.println("=====");
        CarComponent airBagAndScc = new SCCDecorator(airBag, 400);
        System.out.println(airBagAndScc.getPrice());
        System.out.println(airBagAndScc.getCarInfo());
        System.out.println("=====");
        CarComponent sccAndNaviANdEsc = new SCCDecorator(new NavDecorator(new ESCDecorator(basic, 500), 300), 400);
        System.out.println(sccAndNaviANdEsc.getPrice());
        System.out.println(sccAndNaviANdEsc.getCarInfo());
    }

}
