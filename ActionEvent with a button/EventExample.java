import java.awt.*;
import java.awt.event.*;

public class EventExample {
    public static void main(String[] args) {
        Frame f = new Frame("Event Example");
        Button b = new Button("Click Me");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // e is the event object
                System.out.println("Event source: " + e.getSource());
                System.out.println("Action command: " + e.getActionCommand());
            }
        });

        f.add(b);
        f.setSize(200, 200);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
