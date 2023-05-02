package ruan;


public class Fornecedor{
        private String nome;
        private int idade;
        private String cpf;
        private String email;
    
    
    //Construtor Fornecedor
    public Fornecedor(String nome, int idade, String cpf, String email){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
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
    
    //Sets Fornecedor
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
    
    // toString Fornecedor
	public String toString() {
		return "Nome: " + nome + ", Idade: " + idade + " CPF: " + cpf + " E-mail: " + email;
	}
}