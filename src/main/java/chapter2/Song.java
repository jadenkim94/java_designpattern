package chapter2;

public class Song {
    private DiscountMode discountMode;

    public void setMode(DiscountMode mode){
        this.discountMode = mode;
    }
    
    public double getPrice(){
        return 10.0 - (10.0 * discountMode.getDiscountRate());
    }
}
