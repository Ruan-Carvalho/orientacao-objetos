package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.*;
import ruan.*;
import controle.*;

	/**
	 * Tela de consulta do programa.
	 * Responsavel pela exibição da lista de patrimonio,
	 * pesquisa, exclusão e edição.
	 * @author Ruan Sobreira Carvalho
	 * @since 2023
	 * @version 1.0
	 */


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
    
    private static Proprietario usuario = Proprietario.getInstance(); 
	private static controllah controle = controllah.getInstance();
     
	public TelaConsulta(){	
		
		editar.setBounds(175, 370, 90, 30);
		excluir.setBounds(315, 370, 90, 30);
		atualizar.setBounds(440, 370, 90, 30);
		pesquisar.setBounds(95,320,90,30);
		pesquisa.setBounds(175,320,90,30);
		filtrar.setBounds(315,320,90,30);
		filtro.setBounds(440,320,90,30);
		
		listaNomes = controle.getnomePatrimonio();
		if (listaNomes != null && listaNomes.length > 0) {
		    listaPatrimonio = new JList<String>(listaNomes);
		    scrollPatrimonio.setViewportView(listaPatrimonio);
		    scrollPatrimonio.setBounds(95,30,440,240);
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
	
		 atualizar.addActionListener(this);
		 excluir.addActionListener(this);
		 editar.addActionListener(this);
		 pesquisa.addActionListener(this);
	}

public void actionPerformed(ActionEvent e) {
	Object src = e.getSource();
	String opcaoSelecionada = (String) filtro.getSelectedItem();

	char selecionado;
	boolean retorno = false;
	
	/**
	 * Função de exclusão de um patrimonio.
	 * Recebe o nome de um item e o deleta atravez
	 * da função @see controllah#excluirPatrimonio.
	 */
	
	if(src == excluir) {
		if (listaPatrimonio.getSelectedIndex() > -1) {
	        String nomeSelecionado = listaPatrimonio.getSelectedValue();
	        int indexOriginal = usuario.buscaPatrimonio(nomeSelecionado);
	        retorno = controle.excluirPatrimonio(indexOriginal, usuario);
	    }
		if(retorno == true) {
			JOptionPane.showMessageDialog(null, "Item excluído com "
					+ "sucesso!",
					"EXCLUÍDO", JOptionPane.INFORMATION_MESSAGE);
		}else { 
			JOptionPane.showMessageDialog(null, "Erro ao excluir Item!"
					+ "\nCertifique-se de que um item foi selecionado",	
				"ERRO", JOptionPane.ERROR_MESSAGE);
			System.out.println(listaPatrimonio.getSelectedIndex());
		}
	}
	
	/**
	 * Função de edição de um patrimonio.
	 * Recebe o nome de um item e chama a o metodo
	 * @see Proprietario#buscaPatrimonio e recebe o indice do item desejado.
	 * O indice sera passado para o metodo 
	 * @see controllah#castPatrimonio
	 * para transformar o patrimonio em sua classe adequada.
	 * Passa para o metodo
	 * @see TelaAdiciona#mostardados o indice e o retorno de castPatrimonio
	 * para a edição do item desejado.
	 */
	
	if(src == editar){
		if (listaPatrimonio.getSelectedIndex() > -1) {
			TelaAdiciona telaAdiciona = new TelaAdiciona();
	        String nomeSelecionado = listaPatrimonio.getSelectedValue();
	        int indexOriginal = usuario.buscaPatrimonio(nomeSelecionado);
	        Patrimonio patrimonio = controle.castPatrimonio(indexOriginal);
	        telaAdiciona.mostraDados(indexOriginal, patrimonio);
	    }else { 
			JOptionPane.showMessageDialog(null, "Não foi possível editar "
					+ "o item.\nCertifique-se de que um item foi "
					+ "selecionado",	
				"ERRO", JOptionPane.ERROR_MESSAGE);
	}
 }
	
	/**
	 * Atualiza a lista de patrimonios de acordo com o filtro,
	 * edição ou adição de novo item.
	 */
	
	if(src == atualizar){
		listaPatrimonio.setListData(controle.getnomePatrimonio());
		listaPatrimonio.updateUI();
}
	
	if (opcaoSelecionada.equals("Automovel")){
		selecionado = 'a';
		listaPatrimonio.setListData(controle.filtrarPatrimonio(selecionado));
		listaPatrimonio.updateUI();
	}else if (opcaoSelecionada.equals("Imovel")){
		selecionado = 'b';
		listaPatrimonio.setListData(controle.filtrarPatrimonio(selecionado));
		listaPatrimonio.updateUI();
	}else if (opcaoSelecionada.equals("Investimento")){
		selecionado = 'c';
		listaPatrimonio.setListData(controle.filtrarPatrimonio(selecionado));
		listaPatrimonio.updateUI();
	}else {
		listaPatrimonio.setListData(controle.getnomePatrimonio());
		listaPatrimonio.updateUI();
	}
	
	/**
	 * Recebe o nome de um item que se deseja pesquisar
	 * e retorna todos os patrimônios com esse nome.
	 */

	if(src == pesquisa) {
		nomePesquisado = pesquisa.getText();
	if(nomePesquisado.isBlank()) {
		listaPatrimonio.setListData(controle.getnomePatrimonio());
		listaPatrimonio.updateUI();
	}else {
		if ((controle.getPesquisa(nomePesquisado)) == null){
			JOptionPane.showMessageDialog(null, "Item "
				+ "não encontrado!",
				"NÃO ENCONTRADO", JOptionPane.INFORMATION_MESSAGE);
		}else {
			listaPatrimonio.setListData
			(controle.getPesquisa(nomePesquisado));
			listaPatrimonio.updateUI();
		}
	}
}
}
}