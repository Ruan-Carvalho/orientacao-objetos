package ruan;

import java.util.ArrayList;

public class Proprietario{
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
    
    public ArrayList<Patrimonio> getlistaPatrimonio() {
		return listaPatrimonio;
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
    
    public void setlistaPatrimonio(ArrayList<Patrimonio> lista){
		listaPatrimonio = lista;
	}
    
 // Métodos.
 	public boolean addPatrimonio(Patrimonio patrimonio) {
 		return listaPatrimonio.add(patrimonio);
 	}
 	
 	public boolean deletarPatrimonio(Patrimonio patrimonio) {
 		return listaPatrimonio.remove(patrimonio);
 	}
    
 	
    
    // toString proprietario
	public String toString() {
		return "Nome: " + nome + ", Idade: " + idade + " CPF: " + cpf + " E-mail: " + email;
	}
}

