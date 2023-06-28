package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import ruan.*;
import controle.*;

public class TelaConsulta implements ActionListener{
	
	private static JFrame janela = new JFrame("PatriManny");
	private static JButton atualizar = new JButton("Atualizar");
	private static JButton excluir = new JButton("Excluir");
	private static JButton editar = new JButton("Editar");
	
	private static String[] listaNomes = new String[80];
	private static String nomePesquisado = new String();
	private static JScrollPane scrollPatrimonio = new JScrollPane();
	private static JList<String> listaPatrimonio;
	
	private static JLabel pesquisar = new JLabel("Pesquisar: ");
	private static JTextField pesquisa = new JTextField(100);
	
	private static JLabel filtrar = new JLabel("Filtrar: ");
	private static String[] opcoes={"Todos", "Automovel", "Imovel", "Investimento"};
    private static JComboBox<String> filtro = new JComboBox<>(opcoes);
    
    
	public TelaConsulta(){	
		
		editar.setBounds(175, 370, 90, 30);
		excluir.setBounds(315, 370, 90, 30);
		atualizar.setBounds(440, 370, 90, 30);
		pesquisar.setBounds(95,320,90,30);
		pesquisa.setBounds(175,320,90,30);
		filtrar.setBounds(315,320,90,30);
		filtro.setBounds(440,320,90,30);
		
		//listaNomes = controllah.getnomePatrimonio();
		if (listaNomes != null && listaNomes.length > 0) {
		    listaPatrimonio = new JList<String>(listaNomes);
		    scrollPatrimonio.setBounds(95,30,420,240);
			janela.add(scrollPatrimonio);
		} else {
			JOptionPane.showMessageDialog(null,"Não foi "
					+ "possível adicionar patrimônios a lista!", null, 
					JOptionPane.ERROR_MESSAGE);
		}
		
		janela.add(excluir);
		janela.add(editar);
		janela.add(atualizar);
		janela.add(pesquisa);
		janela.add(pesquisar);
		janela.add(filtro);
		janela.add(filtrar);

		janela.setSize(600, 480);
		janela.setLayout(null);
		janela.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		 TelaConsulta tela = new TelaConsulta();

		 atualizar.addActionListener(tela);
		 excluir.addActionListener(tela);
		 editar.addActionListener(tela);
		 pesquisa.addActionListener(tela);
	}
}