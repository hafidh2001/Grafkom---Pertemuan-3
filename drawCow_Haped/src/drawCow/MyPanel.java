package drawCow;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author WIN10
 */
public class MyPanel extends JPanel {

    MyPanel() {
        this.setPreferredSize(new Dimension(700, 700));
    }
    
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
    
    // Deklarasi variabel Graphics
        Graphics2D g2D = (Graphics2D) g;
    
    // Menggambar sumbu x y
        g2D.setPaint(Color.BLACK);
        g2D.setStroke(new BasicStroke(2));
        g2D.drawLine(0, 16, 700, 16); // sumbu x
        g2D.drawLine(25, 0, 25, 700); // sumbu y

        
        // sumbu x
        g2D.drawString("50", 50, 12); // Untuk mengatur ("text", x, y) dalam membuat text
        g2D.drawString("100", 100, 12);
        g2D.drawString("150", 150, 12);
        g2D.drawString("200", 200, 12);
        g2D.drawString("250", 250, 12);
        g2D.drawString("300", 300, 12);
        g2D.drawString("350", 350, 12);
        g2D.drawString("400", 400, 12);
        g2D.drawString("450", 450, 12);
        g2D.drawString("500", 500, 12);
        g2D.drawString("550", 550, 12);
        g2D.drawString("600", 600, 12);
        g2D.drawString("650", 650, 12);
        
        // sumbu y
        g2D.drawString("0", 16, 12); // Untuk mengatur ("text", x, y) dalam membuat text
        g2D.drawString("50", 8, 50); 
        g2D.drawString("100", 2, 100);
        g2D.drawString("150", 2, 150);
        g2D.drawString("200", 2, 200);
        g2D.drawString("250", 2, 250);
        g2D.drawString("300", 2, 300);
        g2D.drawString("350", 2, 350);
        g2D.drawString("400", 2, 400);
        g2D.drawString("450", 2, 450);
        g2D.drawString("500", 2, 500);
        g2D.drawString("550", 2, 550);
        g2D.drawString("600", 2, 600);
        g2D.drawString("650", 2, 650);

    // badan 
        g2D.setPaint(new Color(3,107,183)); // mengatur warna
        g2D.fillOval(200, 200, 300, 300); // (x, y, width, height)
    
    // kepala
        g2D.setPaint(Color.WHITE); // mengatur warna
        g2D.setStroke(new BasicStroke(8)); // mengatur 
        g2D.drawOval(275, 100, 150, 280);
        
        g2D.setPaint(new Color(3,107,183)); // mengatur warna
        g2D.fillOval(277, 102, 146, 276);
        
    // mata bagian luar
        g2D.setPaint(Color.WHITE); // mengatur warna
        g2D.fillOval(305, 170, 40, 70); //kiri
        g2D.fillOval(355, 170, 40, 70); //kanan
        
    // mata bagian dalam
        g2D.setPaint(new Color(102, 34, 0)); // mengatur warna
        g2D.fillOval(317, 217, 20, 20); //kiri
        g2D.fillOval(363, 217, 20, 20); //kanan
        
    // hidung
        g2D.setPaint(new Color(250, 0, 0)); // mengatur warna
        g2D.fillOval(337, 265, 10, 10); //kiri
        g2D.fillOval(353, 265, 10, 10); //kanan
   
    // mulut
        g2D.fillArc(335, 300, 30, 25, 0, 180); // Untuk mengatur (x, y, width, height, startAngle, arcAngle) dalam membuat garis lingkaran
                                               // startAngle = awal mula sudut lingkaran
                                               // arcAngle = range lingkaran (0 - 360) derajat
        g2D.fillArc(335, 300, 30, 25, 180, 180); 
    
    // kaki
        g2D.setPaint(new Color(3,107,183)); // mengatur warna
        g2D.fillRect(250, 450, 30, 150); // Untuk mengatur (x, y, width, height) dalam membuat persegi
        g2D.fillRect(420, 450, 30, 150); // Untuk mengatur (x, y, width, height) dalam membuat persegi
    
    // telinga kiri
        g2D.rotate(45, 70, 58); // untuk merotasi (radian, y, x)
	g2D.fillOval(260, -60, 35, 105); 
    
    // telinga kanan
        g2D.rotate(45, 516, 2); // untuk merotasi (radian, y, x)
	g2D.fillOval(260, -60, 35, 105); 
        
    //  Tanduk kiri black
	g2D.setPaint(new Color(26,24,24));
	g2D.rotate(140, 0, 165);
	g2D.fillOval(-130, -55, 10, 30);
        	
    // Tanduk kiri  
	g2D.rotate(140, -46, -39);
	g2D.fillOval(-130, -55, 10, 30);
    }
   
        
    
        
}
