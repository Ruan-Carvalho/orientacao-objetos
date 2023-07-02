package ruan;

import java.text.ParseException;
import java.util.ArrayList;

	/**
	 * Classe Proprietário responsavel por armazenar os dados dos patrimônios.
	 * @author Ruan Sobreira Carvalho
	 * @since 2023
	 * @version 1.0
	 */

public class Proprietario{
		private static Proprietario usuario;
        private String nome;
        private int idade;
        private String cpf;
        private String email;
        private ArrayList<Patrimonio> listaPatrimonio;
    
     /**
   	  * Construtor da classe Proprietario.
   	  *
   	  * @param nome      			 O nome do Proprietário.
   	  * @param idade     			 A idade do Proprietário.
   	  * @param cpf       			 O CPF do Proprietário.
   	  * @param email                 O E-mail do Proprietário.
   	  * @param ListaPatrimonio       A lista de patrimõnios do Proprietário.
   	  */
        
    public Proprietario(String nome, int idade, String cpf, String email){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        listaPatrimonio = new ArrayList<Patrimonio>();
    }
    
    
    
    public static Proprietario getInstance() {
        if (usuario == null) {
            usuario = new Proprietario("Ruan Carvalho",20,"123.231.321-12","ruansobreira11@gmail.com" );
        }
        return usuario;
    }

	//Gets Proprietario
    public String getNome(){
        return nome;
    }
    
    public double getIdade(){
        return idade;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public String getEmail(){
        return email;
    }
   
    //Sets proprietario
    public void setNome(String nome){
        this.nome = nome;
    }
   
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    
 // Métodos.
    
    
    /**
     * Void para adicionar patrimonios ao inicializar o programa.
     * @throws ParseException
     */
    
    public void preencherDados() throws ParseException {

    	Patrimonio patrimonio_01 = new Automovel("Lancer EVO",155000.00f,"001.00.01","21/04/2024","Mitsubishi",2011,79000);
		Patrimonio patrimonio_02 = new Imovel("Apartamento",1250000.00f,"002.00.01","08/05/2024","Asa Sul","DF","123 conj 01 02","12345-123");
		Patrimonio patrimonio_03 = new Investimento("Fundos imobiliários",350000.00f,"003.00.01","10/05/2024","Banco do Brasil",320000,1.1f);
    	
		addPatrimonio(patrimonio_01);
		addPatrimonio(patrimonio_02);
		addPatrimonio(patrimonio_03);
    }
    
    public ArrayList<Patrimonio> getlistaPatrimonio() {
		return listaPatrimonio;
	}
    
    public void setlistaPatrimonio(int index, Patrimonio novopatrimonio){
		this.listaPatrimonio.set(index, novopatrimonio);
	}
    
    /**
	 * Metodo responsavel por adicionar os dados
	 * no ArrayList ListaPatimonio.
	 * Retorna booleano de acordo com o resultado
	 * dessa acao.
	 * @return boolean
	 */
    
    public boolean addPatrimonio(Patrimonio novopatrimonio) {
 		return this.listaPatrimonio.add(novopatrimonio);
 	}
    
    /**
	 * Metodo responsavel por deletar os dados
	 * no ArrayList ListaPatrimonio.
	 * Retorna booleano de acordo com o resultado
	 * dessa acao.
	 */
    
 	public boolean deletarPatrimonio(Patrimonio patrimonio) {
 		return listaPatrimonio.remove(patrimonio);
 	}
 	
 	/**
	 * Metodo responsavel por remover os dados
	 * no ArrayList ListaPatrimonioww.
	 * Retorna booleano de acordo com o resultado
	 * dessa acao.
	 * @return boolean
	 */
 	
 	public int buscaPatrimonio(String pesquisa) {
		for (int i = 0; i < listaPatrimonio.size(); i++) {
	        if (listaPatrimonio.get(i).getNome().equals(pesquisa)) {
	            return i;
	        }
	    }
	    return -1;
	}
}