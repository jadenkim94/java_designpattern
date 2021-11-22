package chapter5.parc.p5.before;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Runnig extends JFrame {
    private Field field;

    public Runnig(){
        super("Running");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        field = new Field();

        add(field, BorderLayout.CENTER);
    }

}
