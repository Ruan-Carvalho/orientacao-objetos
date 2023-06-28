package ruan;

import java.text.ParseException;
import java.util.ArrayList;

public class Proprietario{
		private static Proprietario usuario;
        private String nome;
        private int idade;
        private String cpf;
        private String email;
        private ArrayList<Patrimonio> listaPatrimonio;
    
    
    //Construtor proprietario
    public Proprietario(String nome, int idade, String cpf, String email){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        listaPatrimonio = new ArrayList<Patrimonio>();
    }
    
    public static Proprietario getInstance() {
        if (usuario == null) {
            usuario = new Proprietario("Ruan Carvalho", 20 ,"123.321.234-12","ruansobreira11@gmail.com");
        }
        return usuario;
    }

	//Gets Fornecedor
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
    
 	public boolean addPatrimonio(Patrimonio novopatrimonio) {
 		return this.listaPatrimonio.add(novopatrimonio);
 	}
    
    public void setlistaPatrimonio(int index, Patrimonio novopatrimonio){
		this.listaPatrimonio.set(index, novopatrimonio);
	}
    
 	public boolean deletarPatrimonio(Patrimonio patrimonio) {
 		return listaPatrimonio.remove(patrimonio);
 	}
 	
 	public int buscaproduto(String pesquisa) {
		for (int i = 0; i < listaPatrimonio.size(); i++) {
	        if (listaPatrimonio.get(i).getNome().equals(pesquisa)) {
	            return i;
	        }
	    }
	    return -1;
	}
}