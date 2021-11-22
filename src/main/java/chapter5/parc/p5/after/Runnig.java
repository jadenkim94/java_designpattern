package chapter5.parc.p5.after;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Runnig extends JFrame {
    private Field field;

    public Runnig(Field field){
        super("Running");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        this.field = field;
        add(this.field, BorderLayout.CENTER);
    }

}
