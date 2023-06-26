package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ruan.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaAdiciona implements ActionListener {
	
	private JFrame janela;
	private String[] dadosAtuais;
	private int pos;
	
	//caracteristicas do patrimonio
	private JLabel lvalor;
	private JTextField valor;
	private JLabel lnumPatrimonio;
    private JTextField numPatrimonio;
    private JLabel ldataAquisicao;
    private JTextField dataAquisicao;
    String[] itens = {"Automovel","Imovel","Investimento"};
	private JComboBox<String> categoria;
	private JLabel lcategoria;
	
	//caracteristicas das classes
	
	private JLabel lmarca;
	private JTextField marca;
	private JLabel lmodelo;
    private JTextField modelo;
    private JLabel lano;
    private JTextField ano;
    private JLabel lquilometragem;
    private JTextField quilometragem;
    private JLabel lcidade;
	private JTextField cidade;
	private JLabel lestado;
    private JTextField estado;
    private JLabel lendereco;
    private JTextField endereco;
    private JLabel lcep;
    private JTextField cep;
    private JLabel ltipoImvl;
    private JTextField tipoImvl;
    private JLabel ltipoInvest;
	private JTextField tipoInvest;
	private JLabel linstituicao;
    private JTextField instituicao;
    private JLabel lvalorInicial;
    private JTextField valorInicial;
    private JLabel lrentabilidade;
    private JTextField rentabilidade;
	
	
	public TelaAdiciona() {
		
		this.pos = pos;
		
		janela = new JFrame("Adicionar");
		janela.setSize(500, 500);
		
		// Coordenadas.
		int p_y = 0; // Y inicial dos Labels.
		int p_x = 30; // X inicial dos Labels.
		int tp_y = 22; // Y inicial dos JTextFields.
		
		//Labels
		
		lvalor = new JLabel("Valor: ");
		lnumPatrimonio = new JLabel("Número: ");
		ldataAquisicao = new JLabel("Aquisição: ");
		lcategoria = new JLabel("Categoria: ");
		lmarca = new JLabel("Marca: ");
		lmodelo = new JLabel();
		lano = new JLabel();
		lquilometragem = new JLabel();
		lcidade = new JLabel();
		lestado = new JLabel();
		lendereco = new JLabel();
		lcep = new JLabel();
		ltipoImvl = new JLabel();
		ltipoInvest = new JLabel();
		linstituicao = new JLabel();
		lvalorInicial = new JLabel();
		lrentabilidade = new JLabel();
		
		lvalor.setBounds(p_x, p_y, 60, 60);
		lnumPatrimonio.setBounds(p_x, p_y+30, 60, 60);
		ldataAquisicao.setBounds(p_x, p_y+30*2, 80, 60);
		lcategoria.setBounds(p_x, p_y+30*3, 60, 60);
		marca.setBounds(p_x, p_y+30*4, 60, 60);
		lmodelo.setBounds(p_x, p_y+30*5, 60, 60);
		lano.setBounds(p_x, p_y+30*6, 60, 60);
		lquilometragem.setBounds(p_x, p_y+30*7, 90, 60);
		lcidade.setBounds(p_x, p_y+30*8, 90, 60);
		lestado.setBounds(p_x, p_y+30*9, 90, 60);
		lendereco.setBounds(p_x, p_y+30*10, 90, 60);
		lcep.setBounds(p_x, p_y+30*11, 90, 60);
		ltipoImvl.setBounds(p_x, p_y+30*12, 90, 60);
		ltipoInvest.setBounds(p_x, p_y+30*13, 90, 60);
		linstituicao.setBounds(p_x, p_y+30*14, 90, 60);
		lvalorInicial.setBounds(p_x, p_y+30*15, 90, 60);
		lrentabilidade.setBounds(p_x, p_y+30*16, 90, 60);
		
		//JTextFields
		
		valor = new JTextField();
		numPatrimonio = new JTextField();
		dataAquisicao = new JTextField();
		marca = new JTextField();
		modelo = new JTextField();
		ano = new JTextField();
		quilometragem = new JTextField();
		cidade = new JTextField();
		estado = new JTextField();
		endereco = new JTextField();
		cep = new JTextField();
		tipoImvl = new JTextField();
		tipoInvest = new JTextField();
		instituicao = new JTextField();
		valorInicial = new JTextField();
		rentabilidade = new JTextField();
		
		valor.setBounds(p_x+100, tp_y+30, 200, 20);
		numPatrimonio.setBounds(p_x+100, tp_y+30*2, 200, 20);
		dataAquisicao.setBounds(p_x+100, tp_y+30*3, 200, 20);
		marca.setBounds(p_x+100, tp_y+30*5, 200, 20);
		modelo.setBounds(p_x+100, tp_y+30*6, 200, 20);
		ano.setBounds(p_x+100, tp_y+30*7, 200, 20);
		quilometragem.setBounds(p_x+100, tp_y+30*8, 200, 20);
		cidade.setBounds(p_x+100, tp_y+30*5, 200, 20);
		estado.setBounds(p_x+100, tp_y+30*6, 200, 20);
		endereco.setBounds(p_x+100, tp_y+30*7, 200, 20);
		cep.setBounds(p_x+100, tp_y+30*8, 200, 20);
		tipoImvl.setBounds(p_x+100, tp_y+30*9, 200, 20);
		tipoInvest.setBounds(p_x+100, tp_y+30*5, 200, 20);
		instituicao.setBounds(p_x+100, tp_y+30*6, 200, 20);
		valorInicial.setBounds(p_x+100, tp_y+30*7, 200, 20);
		rentabilidade.setBounds(p_x+100, tp_y+30*8, 200, 20);
		
		
		//ComboBox
		categoria = new JComboBox<>(itens);
		categoria.setBounds(p_x+100, tp_y+30*4, 200, 20);
		
		categoria.addActionListener(this);
		
		//adicionar
		
		janela.add(lvalor);
		janela.add(lnumPatrimonio);
		janela.add(ldataAquisicao);
		janela.add(lcategoria);
		janela.add(lmarca);
		janela.add(lmodelo);
		janela.add(lano);
		janela.add(lquilometragem);
		janela.add(lcidade);
		janela.add(lestado);
		janela.add(lendereco);
		janela.add(lcep);
		janela.add(ltipoImvl);
		janela.add(ltipoInvest);
		janela.add(linstituicao);
		janela.add(lvalorInicial);
		janela.add(lrentabilidade);
		
		janela.add(valor);
		janela.add(numPatrimonio);
		janela.add(dataAquisicao);
		janela.add(categoria);
		janela.add(marca);
		janela.add(modelo);
		janela.add(ano);
		janela.add(quilometragem);
		janela.add(cidade);
		janela.add(estado);
		janela.add(endereco);
		janela.add(cep);
		janela.add(tipoImvl);
		janela.add(tipoInvest);
		janela.add(instituicao);
		janela.add(valorInicial);
		janela.add(rentabilidade);
		
		janela.setLayout(null);
		janela.setVisible(true);
	}


	public void actionPerformed(ActionEvent e) {
		String categ = (String) categoria.getSelectedItem();
		
		if (categ.equals(itens[0])) {
			opcaoAutomovel();
		}
		
		if (categ.equals(itens[1])) {
			opcaoImovel();
		} 
		
		if (categ.equals(itens[2])) {
			opcaoInvestimento();
		}

	}

	public void opcaoAutomovel(){
		marca.setVisible(true);
		modelo.setVisible(true);
		ano.setVisible(true);
		quilometragem.setVisible(true);
		cidade.setVisible(false);
		estado.setVisible(false);
		endereco.setVisible(false);
		cep.setVisible(false);
		tipoImvl.setVisible(false);
		tipoInvest.setVisible(false);
		instituicao.setVisible(false);
		valorInicial.setVisible(false);
		rentabilidade.setVisible(false);
		
		lmarca.setVisible(true);
		lmodelo.setVisible(true);
		lano.setVisible(true);
		lquilometragem.setVisible(true);
		lcidade.setVisible(false);
		lestado.setVisible(false);
		lendereco.setVisible(false);
		lcep.setVisible(false);
		ltipoImvl.setVisible(false);
		ltipoInvest.setVisible(false);
		linstituicao.setVisible(false);
		lvalorInicial.setVisible(false);
		lrentabilidade.setVisible(false);
		}
	
	public void opcaoImovel(){
		marca.setVisible(false);
		modelo.setVisible(false);
		ano.setVisible(false);
		quilometragem.setVisible(false);
		cidade.setVisible(true);
		estado.setVisible(true);
		endereco.setVisible(true);
		cep.setVisible(true);
		tipoImvl.setVisible(true);
		tipoInvest.setVisible(false);
		instituicao.setVisible(false);
		valorInicial.setVisible(false);
		rentabilidade.setVisible(false);
		
		lmarca.setVisible(false);
		lmodelo.setVisible(false);
		lano.setVisible(false);
		lquilometragem.setVisible(false);
		lcidade.setVisible(true);
		lestado.setVisible(true);
		lendereco.setVisible(true);
		lcep.setVisible(true);
		ltipoImvl.setVisible(true);
		ltipoInvest.setVisible(false);
		linstituicao.setVisible(false);
		lvalorInicial.setVisible(false);
		lrentabilidade.setVisible(false);
		}
	
	public void opcaoInvestimento(){
		marca.setVisible(false);
		modelo.setVisible(false);
		ano.setVisible(false);
		quilometragem.setVisible(false);
		cidade.setVisible(false);
		estado.setVisible(false);
		endereco.setVisible(false);
		cep.setVisible(false);
		tipoImvl.setVisible(false);
		tipoInvest.setVisible(true);
		instituicao.setVisible(true);
		valorInicial.setVisible(true);
		rentabilidade.setVisible(true);
		
		lmarca.setVisible(false);
		lmodelo.setVisible(false);
		lano.setVisible(false);
		lquilometragem.setVisible(false);
		lcidade.setVisible(false);
		lestado.setVisible(false);
		lendereco.setVisible(false);
		lcep.setVisible(false);
		ltipoImvl.setVisible(false);
		ltipoInvest.setVisible(true);
		linstituicao.setVisible(true);
		lvalorInicial.setVisible(true);
		lrentabilidade.setVisible(true);
	}
}