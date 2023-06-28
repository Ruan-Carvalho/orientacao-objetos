package ruan;


import java.text.SimpleDateFormat;
import java.util.Date;

    public class Imovel extends Patrimonio{
	    private String cidade;
	    private String estado;
	    private String endereco;
	    private String cep;
	
	//Construtor Imóvel
	public Imovel(String nome ,float valor, String numPatrimonio, String dataAquisicao, String cidade, String estado,String endereco, String cep){
	    super(nome, valor, numPatrimonio, dataAquisicao);
	    this.cidade = cidade;
	    this.estado = estado;
	    this.endereco = endereco;
	    this.cep = cep;
	}
	
	//Gets Imóvel
	public String getCidade(){
	    return cidade;
	}
	
	public String getEstado(){
	    return estado;
	}
	
	public String getEndereco(){
	    return endereco;
	}
	
	public String getCep(){
	    return cep;
	}
	
	//Sets Imóvel
	public void setCidade(String cidade){
	    this.cidade = cidade;
	}
	
	public void setEstado(String estado){
	    this.estado = estado;
	}
	
	public void setEndereco(String endereco){
	    this.endereco = endereco;
	}
	
	public void setCep(String cep){
	    this.cep = cep;
	}
	
	//ToString Imóvel
	public String toString() {
		
		return "Valor: " + valor + ", Número de Patrimônio: " + numPatrimonio + " Data de aquisição: " + dataAquisicao
		+ " Cidade: " + cidade + " Estado: " + estado + " Endereço: " + endereco + " CEP: " + cep + " Tipo de Imóvel: " + nome;
	}
}