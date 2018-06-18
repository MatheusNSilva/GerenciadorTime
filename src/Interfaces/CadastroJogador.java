package Interfaces;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Entidades.Jogador;
import Controles.ControladorJogador;

public class CadastroJogador extends JFrame implements ActionListener{
	
	
	private JLabel lbCadastro;
    private JLabel lbNome;
    private JLabel lbAltura;
    private JLabel lbPeso;
    private JLabel lbPontos;
    private JLabel lbAssistencias;
    private JLabel lbRebotes;
    private JLabel lbBloqueios;
    private JLabel lbRoubosBola;
    private JLabel lbTime;
    private JLabel lbTempoQuadra;
    private JButton btCadastro;
    private JButton btCancel;
    private JTextField tfNome;
    private JTextField tfAltura;   
    private JTextField tfPeso;
    private JTextField tfPontos;
    private JTextField tfAssistencias;
    private JTextField tfRebotes;
    private JTextField tfBloqueios;
    private JTextField tfRoubosBola;
    private JTextField tfTime;
    private JTextField tfTempoQuadra;
    
    private Container container; 

    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    
    
	public CadastroJogador(){
		super("TelaCadastroJogador");
        container = getContentPane();
        container.setLayout(new GridBagLayout());
        
        this.iniciaComponentes();
        
		btCadastro.addActionListener(this);
        btCancel.addActionListener(this);
        
        setSize(350, 150);     
        //setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
   
    }
	
	 private void iniciaComponentes(){
	        
	        GridBagConstraints constraints = new GridBagConstraints();       
	        
	        lbCadastro = new JLabel();
	        lbCadastro.setText("Cadastro de Jogador");
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 0;
	        constraints.gridy = 0;
	        container.add(lbCadastro, constraints);
	        
	        lbNome = new JLabel();
	        lbNome.setText("Nome");
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 0;
	        constraints.gridy = 1;
	        container.add(lbNome, constraints);
	        
	        tfNome = new JTextField();      
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 1;
	        constraints.gridy = 1;
	        tfNome.setSize(100, 20);
	        tfNome.setPreferredSize(new Dimension(100,20));
	        container.add(tfNome, constraints);
	        
	        lbAltura = new JLabel();
	        lbAltura.setText("Altura");
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 0;
	        constraints.gridy = 2;
	        lbAltura.setSize(100, 20);
	        lbAltura.setPreferredSize(new Dimension(100,20));
	        container.add(lbAltura, constraints);
	        
	        tfAltura = new JTextField();      
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 1;
	        constraints.gridy = 2;
	        container.add(tfAltura, constraints);
	        
	        lbPeso = new JLabel();
	        lbPeso.setText("Peso");
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 0;
	        constraints.gridy = 3;
	        lbPeso.setSize(100, 20);
	        lbPeso.setPreferredSize(new Dimension(100,20));
	        container.add(lbPeso, constraints);
	        
	        tfPeso = new JTextField();      
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 1;
	        constraints.gridy = 3;
	        container.add(tfPeso, constraints);
	             
	        lbPontos = new JLabel();
	        lbPontos.setText("Pontos");
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 0;
	        constraints.gridy = 4;
	        lbPontos.setSize(100, 20);
	        lbPontos.setPreferredSize(new Dimension(100,20));
	        container.add(lbPontos, constraints);
	        
	        tfPontos = new JTextField();      
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 1;
	        constraints.gridy = 4;
	        container.add(tfPontos, constraints);
	        
	        lbAssistencias = new JLabel();
	        lbAssistencias.setText("Assistencias");
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 3;
	        constraints.gridy = 3;
	        lbAssistencias.setSize(100, 20);
	        lbAssistencias.setPreferredSize(new Dimension(100,20));
	        container.add(lbAssistencias, constraints);
	        
	        tfAssistencias = new JTextField();      
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 3;
	        constraints.gridy = 4;
	        container.add(tfAssistencias, constraints);
	        
	        lbRebotes = new JLabel();
	        lbRebotes.setText("Rebotes");
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 3;
	        constraints.gridy = 0;
	        lbRebotes.setSize(100, 20);
	        lbRebotes.setPreferredSize(new Dimension(100,20));
	        container.add(lbRebotes, constraints);
	        
	        tfRebotes = new JTextField();      
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 3;
	        constraints.gridy = 1;
	        container.add(tfRebotes, constraints);
	        
	        lbBloqueios = new JLabel();
	        lbBloqueios.setText("Bloqueios");
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 3;
	        constraints.gridy = 2;
	        lbBloqueios.setSize(100, 20);
	        lbBloqueios.setPreferredSize(new Dimension(100,20));
	        container.add(lbBloqueios, constraints);
	        
	        tfBloqueios = new JTextField();      
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 4;
	        constraints.gridy = 4;
	        container.add(tfBloqueios, constraints);
	        
	        lbRoubosBola = new JLabel();
	        lbRoubosBola.setText("RoubosBola");
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 4;
	        constraints.gridy = 1;
	        lbRoubosBola.setSize(100, 20);
	        lbRoubosBola.setPreferredSize(new Dimension(100,20));
	        container.add(lbRoubosBola, constraints);
	        
	        tfRoubosBola = new JTextField();      
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 4;
	        constraints.gridy = 2;
	        container.add(tfRoubosBola, constraints);
	        
	        lbTime = new JLabel();
	        lbPontos.setText("Time");
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 4;
	        constraints.gridy = 3;
	        lbTime.setSize(100, 20);
	        lbTime.setPreferredSize(new Dimension(100,20));
	        container.add(lbTime, constraints);
	        
	        tfTime = new JTextField();      
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 4;
	        constraints.gridy = 5;
	        container.add(tfTime, constraints);
	        
	        lbTempoQuadra = new JLabel();
	        lbTempoQuadra.setText("Tempo em Quadra");
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 2;
	        constraints.gridy = 5;
	        lbTempoQuadra.setSize(100, 20);
	        lbTempoQuadra.setPreferredSize(new Dimension(100,20));
	        container.add(lbTempoQuadra, constraints);
	        
	        tfTempoQuadra = new JTextField();      
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 3;
	        constraints.gridy = 5;
	        container.add(tfTempoQuadra, constraints);
	        container.add(tfPontos, constraints);
	        
	        btCadastro = new JButton();
	        btCadastro.setText("Cadastrar");
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 1;
	        constraints.gridy = 7;
	        container.add(btCadastro, constraints);
	                
	        btCancel = new JButton();
	        btCancel.setText("C");
	        constraints.fill = GridBagConstraints.HORIZONTAL;
	        constraints.gridx = 0;
	        constraints.gridy = 7;
	        container.add(btCancel, constraints);
	    }
	 
	       
        @Override
        public void actionPerformed(ActionEvent e) {
        	/*
        	if(e.getSource() == btCadastro){
		    	ControladorJogador( tfNome.getText(), tfAltura.getText(), lbPeso.getText(), tfPontos.getText(), 
		    			tfAssistencias.getText(), tfRebotes.getText(), tfBloqueios.getText(), tfRoubosBola.getText(), tfTime.getText(), tfTempoQuadra.getText());
		        JOptionPane.showMessageDialog(null, "Novo Candidato Cadastrado:\n"
		        + "\nNome: " + tfNome.getText()  
		        + "\nAltura: " +  tfAltura.getText()
		        + "\nPeso: " + lbPeso.getText()
		        + "\nTime: "+ tfTime.getText());
        	}*/         
        }    
}
