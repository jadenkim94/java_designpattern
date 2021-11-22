package chapter5.parc.p5.after;

import chapter5.parc.p5.after.move.MoveStrategy;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Field extends JPanel implements Runnable {
    private JLabel lbl;
    private MoveStrategy moveStrategy;

    public Field() {
        setLayout(new BorderLayout());
        lbl = new JLabel();
        add(lbl, BorderLayout.CENTER);
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void run() {
       moveStrategy.move(lbl);
    }
}
