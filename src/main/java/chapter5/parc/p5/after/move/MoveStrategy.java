package chapter5.parc.p5.after.move;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public interface MoveStrategy {

    void move(JLabel lbl);

   /* default void drawImages(JLabel lbl){
        String [] path = getImageNames();
        lbl.setIcon(getImageIcon(path[0]));
        while (true){
            for(int i = 0 ; i < path.length; i++){
                lbl.setIcon(getImageIcon(path[i]));
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e){}
        }
    }

    Icon getImageIcon(String name);

    String [] getImageNames();*/

}
