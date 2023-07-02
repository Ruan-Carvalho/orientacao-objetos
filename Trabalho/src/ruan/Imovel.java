package ruan;

	/**
 	* A classe Imóvel representa uma categoria de patrimônio que herda características
 	* da classe Ppatrimônio. Ela adiciona informações específicas para imóveis,
 	* como cidade, estado, endereco, e CEP. 
 	* @author Ruan Sobreira Carvalho
 	* @since 2023
 	* @version 1.0
 	*/
	
    public class Imovel extends Patrimonio{
	    private String cidade;
	    private String estado;
	    private String endereco;
	    private String cep;
	
	    /**
		 * Construtor da classe imóvel.
		 *
		 * @param nome              O nome do Imóvel.
		 * @param valor             O valor do Imóvel.
		 * @param numpatrimonio     O número do Imóvel.
		 * @param dataAquisicao     A data de aquisição do Imóvel.
		 * @param cidade   		    A cidade do Imóvel.
		 * @param estado			O estado do Imóvel.
		 * @param endereco         	O endereço do Imóvel.
		 * @param cep				O CEP do imóvel.
		 */
	    
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
	
}