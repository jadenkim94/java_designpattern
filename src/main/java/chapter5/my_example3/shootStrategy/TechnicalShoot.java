package chapter5.my_example3.shootStrategy;

public class TechnicalShoot implements ShootStrategy{

    @Override
    public void shoot() {
        System.out.println("기술적 슈팅");
    }
}
