package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import ruan.*;

public class Menu_inicial implements ActionListener {
	
	private static JFrame janela = new JFrame("PatriManny");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton adicionar = new JButton("Adicionar");
	private static JButton consultar = new JButton("Consultar");
	
	public Menu_inicial() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		adicionar.setBounds(140, 50, 100, 30);
		consultar.setBounds(140, 100, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(adicionar);
		janela.add(consultar);
		
		janela.setSize(400, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		Menu_inicial menu = new Menu_inicial();
		
		adicionar.addActionListener(menu);
		consultar.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == adicionar)
			new TelaAdiciona();
		
		if(src == consultar)
			new TelaConsulta();	
	}
}