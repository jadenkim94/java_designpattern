package chapter13.prac1;

public class SDScreen extends Screen{

    @Override
    public void drawMap(Map map) {
        System.out.println("Draw Map : " + map.getClass().getName() + " on SD Screen");
    }
}
