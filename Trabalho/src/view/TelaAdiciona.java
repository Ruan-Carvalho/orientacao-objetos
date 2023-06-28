package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ruan.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaAdiciona implements ActionListener {
	
	private static JFrame janela = new JFrame("PatriManny");
	private JLabel lnome = new JLabel("Nome: ");
	private JLabel lvalor = new JLabel("Valor: ");
	private JLabel lnumPatrimonio = new JLabel("Número: ");
	private JLabel ldataAquisicao = new JLabel("Aquisição: ");
	private JLabel lcategoria = new JLabel("tipo: ");
	private JLabel lmarca = new JLabel("Marca: ");
	private JLabel lano = new JLabel("Ano: ");
	private JLabel lquilometragem = new JLabel("Quilometragem: ");
	private JLabel lcidade = new JLabel("Cidade: ");
	private JLabel lestado = new JLabel("Estado: ");
	private JLabel lendereco = new JLabel("Endereco: ");
	private JLabel lcep = new JLabel("CEP: ");
	private JLabel linstituicao = new JLabel("Instituição: ");
	private JLabel lvalorInicial = new JLabel("Valor Inicial: ");
	private JLabel lrentabilidade = new JLabel("Rentabilidade: ");
	
	private JTextField nome = new JTextField();
	private JTextField valor = new JTextField();
	private JTextField numPatrimonio = new JTextField();
	private JTextField dataAquisicao = new JTextField();
	private JTextField marca = new JTextField();
	private JTextField ano = new JTextField();
	private JTextField quilometragem = new JTextField();
	private JTextField cidade = new JTextField();
	private JTextField estado = new JTextField();
	private JTextField endereco = new JTextField();
	private JTextField cep = new JTextField();
	private JTextField instituicao = new JTextField();
	private JTextField valorInicial = new JTextField();
	private JTextField rentabilidade = new JTextField();
	
	private String[] itens = {"Selecione","Automovel","Imovel","Investimento"};
	
	private JComboBox<String> categoria = new JComboBox<>(itens);
	
	public TelaAdiciona() {
		//coordenadas
		int p_y = 0; // Y inicial dos Labels.
		int p_x = 40; // X inicial dos Labels.
		int tp_y = 22; // Y inicial dos JTextFields.
		
		lnome.setBounds(p_x, p_y, 60, 60);
		lvalor.setBounds(p_x, p_y+30, 60, 60);
		lnumPatrimonio.setBounds(p_x, p_y+30*2, 60, 60);
		ldataAquisicao.setBounds(p_x, p_y+30*3, 80, 60);
		lcategoria.setBounds(p_x, p_y+30*4, 60, 60);
		lmarca.setBounds(p_x, p_y+30*5, 60, 60);
		lano.setBounds(p_x, p_y+30*6, 60, 60);
		lquilometragem.setBounds(p_x, p_y+30*7, 100, 60);
		lcidade.setBounds(p_x, p_y+30*5, 90, 60);
		lestado.setBounds(p_x, p_y+30*6, 90, 60);
		lendereco.setBounds(p_x, p_y+30*7, 90, 60);
		lcep.setBounds(p_x, p_y+30*8, 90, 60);
		linstituicao.setBounds(p_x, p_y+30*5, 90, 60);
		lvalorInicial.setBounds(p_x, p_y+30*6, 90, 60);
		lrentabilidade.setBounds(p_x, p_y+30*7, 90, 60);
		
		nome.setBounds(p_x+100, tp_y, 200, 20);
		valor.setBounds(p_x+100, tp_y+30, 200, 20);
		numPatrimonio.setBounds(p_x+100, tp_y+30*2, 200, 20);
		dataAquisicao.setBounds(p_x+100, tp_y+30*3, 200, 20);
		marca.setBounds(p_x+100, tp_y+30*5, 200, 20);
		ano.setBounds(p_x+100, tp_y+30*6, 200, 20);
		quilometragem.setBounds(p_x+100, tp_y+30*7, 200, 20);
		cidade.setBounds(p_x+100, tp_y+30*5, 200, 20);
		estado.setBounds(p_x+100, tp_y+30*6, 200, 20);
		endereco.setBounds(p_x+100, tp_y+30*7, 200, 20);
		cep.setBounds(p_x+100, tp_y+30*8, 200, 20);
		instituicao.setBounds(p_x+100, tp_y+30*5, 200, 20);
		valorInicial.setBounds(p_x+100, tp_y+30*6, 200, 20);
		rentabilidade.setBounds(p_x+100, tp_y+30*7, 200, 20);
		
		categoria.setBounds(p_x+100, tp_y+30*4, 200, 20);
		categoria.addActionListener(this);
		
		janela.add(lnome);
		janela.add(lvalor);
		janela.add(lnumPatrimonio);
		janela.add(ldataAquisicao);
		janela.add(lcategoria);
		janela.add(lmarca);
		janela.add(lano);
		janela.add(lquilometragem);
		janela.add(lcidade);
		janela.add(lestado);
		janela.add(lendereco);
		janela.add(lcep);
		janela.add(linstituicao);
		janela.add(lvalorInicial);
		janela.add(lrentabilidade);
		
		janela.add(nome);
		janela.add(valor);
		janela.add(numPatrimonio);
		janela.add(dataAquisicao);
		janela.add(categoria);
		janela.add(marca);
		janela.add(ano);
		janela.add(quilometragem);
		janela.add(cidade);
		janela.add(estado);
		janela.add(endereco);
		janela.add(cep);
		janela.add(instituicao);
		janela.add(valorInicial);
		janela.add(rentabilidade);
		
		marca.setVisible(false);
		ano.setVisible(false);
		quilometragem.setVisible(false);
		cidade.setVisible(false);
		estado.setVisible(false);
		endereco.setVisible(false);
		cep.setVisible(false);
		instituicao.setVisible(false);
		valorInicial.setVisible(false);
		rentabilidade.setVisible(false);
		
		lmarca.setVisible(false);
		lano.setVisible(false);
		lquilometragem.setVisible(false);
		lcidade.setVisible(false);
		lestado.setVisible(false);
		lendereco.setVisible(false);
		lcep.setVisible(false);
		linstituicao.setVisible(false);
		lvalorInicial.setVisible(false);
		lrentabilidade.setVisible(false);
		
		janela.setSize(500, 500);
		janela.setLayout(null);
		janela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 String opcaoSelecionada = (String) categoria.getSelectedItem();
		  if (opcaoSelecionada.equals("Selecione")){
		  }
	      if (opcaoSelecionada.equals("Automovel")){
	    	marca.setVisible(true);
	  		ano.setVisible(true);
	  		quilometragem.setVisible(true);
	  		lmarca.setVisible(true);
			lano.setVisible(true);
			lquilometragem.setVisible(true);
	      }else {
	    	marca.setVisible(false);
	  		ano.setVisible(false);
	  		quilometragem.setVisible(false);
	  		lmarca.setVisible(false);
			lano.setVisible(false);
			lquilometragem.setVisible(false);
	      }

	      if (opcaoSelecionada.equals("Imovel")) {
	    	cidade.setVisible(true);
	  		estado.setVisible(true);
	  		endereco.setVisible(true);
	  		cep.setVisible(true);
	    	lcidade.setVisible(true);
	  		lestado.setVisible(true);
	  		lendereco.setVisible(true);
	  		lcep.setVisible(true);
         } else {
        	cidade.setVisible(false);
 	  		estado.setVisible(false);
 	  		endereco.setVisible(false);
 	  		cep.setVisible(false);
 	    	lcidade.setVisible(false);
 	  		lestado.setVisible(false);
 	  		lendereco.setVisible(false);
 	  		lcep.setVisible(false);
         }
         
         if (opcaoSelecionada.equals("Investimento")){
     		instituicao.setVisible(true);
     		valorInicial.setVisible(true);
     		rentabilidade.setVisible(true);
     		linstituicao.setVisible(true);
     		lvalorInicial.setVisible(true);
     		lrentabilidade.setVisible(true);
         }else {
      		instituicao.setVisible(false);
      		valorInicial.setVisible(false);
      		rentabilidade.setVisible(false);
      		linstituicao.setVisible(false);
      		lvalorInicial.setVisible(false);
      		lrentabilidade.setVisible(false);
         }
		
	}
	
}