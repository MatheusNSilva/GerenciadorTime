package Interfaces;



	import java.awt.*;
	import javax.swing.*;

	public class LinesRectsOvalsJPanel extends JPanel {

	    public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        this.setBackground(Color.WHITE);

	        g.setColor(Color.red);
	        g.drawLine(5, 30, 380, 30);

	        g.setColor(Color.blue);
	        g.drawRect(5, 40, 90, 55);

	        g.fillRect(105, 40, 90, 55);

	        g.setColor(Color.BLACK);
	        g.fillRoundRect(205, 40, 90, 55, 20, 20);

	        g.drawRoundRect(305, 40, 90, 55, 20, 20);

	        g.setColor(Color.GREEN);
	        g.draw3DRect(5, 100, 90, 55, true);
	        g.fill3DRect(105, 100, 90, 55, true);

	        g.setColor(Color.MAGENTA);
	        g.drawOval(205, 100, 90, 55);
	        g.fillOval(305, 100, 90, 55);
	    }

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Drawing lines, rectangles and ovals");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        LinesRectsOvalsJPanel linesRectsOvalsJPanel = new LinesRectsOvalsJPanel();
	        frame.add(linesRectsOvalsJPanel);
	        frame.setSize(420, 210);
}
}