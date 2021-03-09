package drawCow;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author WIN10
 */
public class MyFrame extends JFrame{
    
    MyFrame() {
        MyPanel panel = new MyPanel();
        
        this.setTitle("Gambar Sapi - Hafidh Ahmad Fauzan 027");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.YELLOW);
        
        this.add(panel);
        this.pack();
    }
}
