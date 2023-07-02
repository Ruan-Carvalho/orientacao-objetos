package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ruan.*;
import controle.*;

import javax.swing.*;

/**
 * Tela de adição do programa.
 * Realiza a adição e edição de patrimônios na lista.
 * @author Ruan Sobreira Carvalho
 * @since 2023
 * @version 1.0
 */

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
	
	private JButton salvar = new JButton("salvar");
	
	private String[] itens = {"Selecione","Automovel","Imovel","Investimento"};
	
	private JComboBox<String> categoria = new JComboBox<>(itens);
	
	private String dados[] = new String[10];
	private int edicao = -1; 
	
	private static Proprietario usuario; 
	private static controllah controle = controllah.getInstance();
	
	public TelaAdiciona() {
		//coordenadas
		int p_y = 0; // Y inicial dos JLabels.
		int p_x = 40; // X inicial dos JLabels e JTextFields.
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
		
		salvar.setBounds(p_x+100, tp_y*14, 200, 20);
		
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
		janela.add(salvar);
		
		
		
		janela.setSize(500, 500);
		janela.setLayout(null);
		janela.setVisible(true);
		
		salvar.addActionListener(this);
	}

	public TelaAdiciona(JList<String> listaPatrimonio) {
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		boolean retorno = false;
		
		String opcaoSelecionada = (String) categoria.getSelectedItem();{
			
			/**
			 * alterna as opções da comboBox para mostrar
			 * os textFields e Frames de cada classe especifica.
			 */
			 
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
		
		/**
		 * Função de salvar os dados inseridos nos textFields.
		 * Verifica se os dados foram inseridos corretamente e
		 * os salva atravez do metododo
		 * @see controllah#adicionarEditarPatrimonio
		 * exibe uma mensgem de acordo com o exito ou fracasso do metodo
		 */
		
		if(src == salvar) {
      	  boolean dados_incorretos = false;

      	  if (nome.getText().isBlank() ||
      	      valor.getText().isBlank() ||
      	      numPatrimonio.getText().isBlank() ||
      	      dataAquisicao.getText().isBlank() ||
      	      opcaoSelecionada.equals("Selecione")) {
      	      dados_incorretos = true;
      	  }

      	  try {
      		    Float.parseFloat(valor.getText());
      		} catch (NumberFormatException e2) {
      			dados_incorretos = true;
      		}
      	  
      	  if (opcaoSelecionada.equals("Automovel") && 
      		(marca.getText().isBlank() || ano.getText().isBlank() || quilometragem.getText().isBlank())) {
      	      dados_incorretos = true;
      	      
      	    try {
    		    Integer.parseInt(ano.getText());
    		} catch (NumberFormatException e2) {
    			dados_incorretos = true;
    		}
      	    
      	    try {
    		    Float.parseFloat(quilometragem.getText());
    		} catch (NumberFormatException e2) {
    			dados_incorretos = true;
    		}
      	      
      	  }

      	  if (opcaoSelecionada.equals("Imovel") &&
      		(cidade.getText().isBlank() || estado.getText().isBlank() || endereco.getText().isBlank()
      		|| cep.getText().isBlank())) {
      	      dados_incorretos = true;
      	  }

      	  if (opcaoSelecionada.equals("Investimento") &&
      		(instituicao.getText().isBlank() || valorInicial.getText().isBlank()
      		|| rentabilidade.getText().isBlank())) {
      	      dados_incorretos = true;
      	      
      	    try {
    		    Float.parseFloat(valorInicial.getText());
    		} catch (NumberFormatException e2) {
    			dados_incorretos = true;
    		}
      	    
      	  try {
  		    Float.parseFloat(rentabilidade.getText());
  		} catch (NumberFormatException e2) {
  			dados_incorretos = true;
  		}
      	      
      	  }

      	  if (!dados_incorretos) {
      		  char categoria = 'N';
      		  
  			  dados[0] = nome.getText();
  			  dados[1] = valor.getText();
  			  dados[2] = numPatrimonio.getText();
  			  dados[3] = dataAquisicao.getText();
  			  if(opcaoSelecionada.equals("Automovel")) {
  	  			  dados[4] = marca.getText();
      			  dados[5] = ano.getText();
      			  dados[6] = quilometragem.getText();
      			  categoria = 'a'; 
  			  }
  			  if(opcaoSelecionada.equals("Imovel")) {
  	  			  dados[4] = cidade.getText();
      			  dados[5] = estado.getText();
      			  dados[6] = endereco.getText();
      			  dados[7] = cep.getText();
      			  categoria = 'b';
  			  }
  			  if(opcaoSelecionada.equals("Investimento")) {
  	  			  dados[4] = instituicao.getText();
      			  dados[5] = valorInicial.getText();
      			  dados[6] = rentabilidade.getText();
      			  categoria = 'c';
  			  }
  			  usuario = Proprietario.getInstance();
  			  retorno = controle.adicionarEditarPatrimonio(edicao, dados, usuario, categoria);
      		  
      	      if (retorno == true) {
      	    	  JOptionPane.showMessageDialog(null, "Dados salvos!",
      	    		 "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
      	      		janela.dispose();
      	      }else {
      	    	  JOptionPane.showMessageDialog(null, "Verifique se "
  	    			  + "preencheu todos os campos corretamente.\n\n"
  	    			  + "Obs: Os campos 'valor','ano', 'valor inicial' e 'rentabilidade'\n"
	        	      + "só aceitam números como valores!", "ERRO", 
	        	      JOptionPane.ERROR_MESSAGE);
      	      }
      	  } else {
      	      JOptionPane.showMessageDialog(null, "Verifique se preencheu "
      	      + "todos os campos corretamente.\n\nObs: Os campos 'Preço' "
      	      + "Obs: Os campos 'valor','ano', 'valor inicial' e 'rentabilidade'\n"
    	      + "só aceitam números como valores!", "ERRO", 
      	      JOptionPane.ERROR_MESSAGE);
      	  }

        }
	}
		
	/**
	 * Função utilizada na edição de um patrimonio para
	 * mostrar seus atributos salvos anteriormente.
	 * @param edicao
	 * @param patrimonio
	 */
		 
	public void mostraDados(int edicao, Patrimonio patrimonio) {
		this.edicao = edicao;
		
		nome.setText(patrimonio.getNome());
		valor.setText(Float.toString(patrimonio.getValor()));
		numPatrimonio.setText(patrimonio.getNumPatrimonio());
		dataAquisicao.setText(patrimonio.getDataAquisicao());		
		
		if(patrimonio instanceof Automovel) {
			Automovel automovel = (Automovel) patrimonio;
			categoria.setSelectedItem("Automovel");
			categoria.setEnabled(false);
			marca.setText(automovel.getMarca());
			ano.setText(Integer.toString(automovel.getAno()));
			quilometragem.setText(Float.toString(automovel.getQuilometragem()));
			
		}else if(patrimonio instanceof Imovel) {
			Imovel imovel = (Imovel) patrimonio;
			categoria.setSelectedItem("Imovel");
			categoria.setEnabled(false);
			cidade.setText(imovel.getCidade());
			estado.setText(imovel.getEstado());
			endereco.setText(imovel.getEndereco());
			cep.setText(imovel.getCep());
			
		}else if(patrimonio instanceof Investimento) {
			Investimento investimento = (Investimento) patrimonio;
			categoria.setSelectedItem("Investimento");
			categoria.setEnabled(false);
			instituicao.setText(investimento.getInstituicao());
			valorInicial.setText(Float.toString(investimento.getValorInicial()));
			rentabilidade.setText(Float.toString(investimento.getRentabilidade()));
		}
	}
}