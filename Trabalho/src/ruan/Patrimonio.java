package ruan;

	/**
	 * A classe abstrata Patrimônio representa um item de um usuário do sistema.
	 * Ela contém informações de nome, valor, número de patrimônio e data de aquisição.
	 * Essa classe é a classe pai de Automóvel, Imóvel e Investimento.
	 * @author Ruan Sobreira Carvalho
	 * @since 2023
	 * @version 1.0
	 */


    public abstract class Patrimonio{
    	protected String nome;
	    protected float valor;
	    protected String numPatrimonio;
	    protected String dataAquisicao;
	    
	    /**
	     * Construtor da classe Patrimônio.
	     *
	     * @param nome              O nome do patrimônio.
	     * @param valor             O valor do Patrimônio.
	     * @param numpatrimonio     O número do Patrimônio.
	     * @param dataAquisicao     A data de aquisição do Patrimônio.
	     */

	//Construtor Patrimonio
	public Patrimonio(String nome, float valor, String numPatrimonio, String dataAquisicao){
	    this.nome = nome;
		this.valor = valor;
	    this.numPatrimonio = numPatrimonio;
		this.dataAquisicao = dataAquisicao;
	}
	
	//Gets Patrimonio
	public String getNome(){
	    return nome;
	}
	
	public float getValor(){
	    return valor;
	}
	
	public String getNumPatrimonio(){
	    return numPatrimonio;
	}
	
	public String getDataAquisicao(){
	    return dataAquisicao;
	}
	
	//Sets Patrimonio
	
	public void setNome(String nome){
	    this.nome = nome;
	}
	
	public void setValor(float valor){
	    this.valor = valor;
	}
	
	public void setNumPatrimonio(String numPatrimonio){
	    this.numPatrimonio = numPatrimonio;
	}
	
	public void setDataAquisicao(String dataAq){
	    dataAquisicao = dataAq;
	}
}
