package chapter5.parc.p5.after.move;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class WalkingStrategy implements MoveStrategy{

    private String [] walkImg = {"첫 화면", "두 번째 화면"};

    @Override
    public void move(JLabel lbl) {
        lbl.setIcon(new ImageIcon(walkImg[0]));
        while (true){
            for(int i = 0 ; i < walkImg.length; i++){
                lbl.setIcon(new ImageIcon(walkImg[i]));
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e){}
        }
    }


   /* @Override
    public Icon getImageIcon(String name) {
        return new ImageIcon("./src/"+name);
    }

    @Override
    public String[] getImageNames() {
        return walkImg;
    }*/


}
