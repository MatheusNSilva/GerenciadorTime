package Interfaces;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;

public class TelaMenuJogador extends JFrame{

	public TelaMenuJogador() {
		super("Menu Jogador");
		
		JFrame frame = new JFrame();
		Container c = getContentPane();
		Container c2 = new JPanel();
		c.setLayout(new BorderLayout());
		
		c2.setLayout(new GridLayout(4,1));
		c.setLayout(new BorderLayout(15,5));
		c2.add(new JButton("ok"));
		c2.add(new JButton("Delete"));
		
		c.add(BorderLayout.CENTER, new JButton("CENTER"));
		c.add(BorderLayout.EAST, c2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,900);
		setVisible(true);
	
	}

}
