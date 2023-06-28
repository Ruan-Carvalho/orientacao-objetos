package ruan;

    public abstract class Patrimonio{
    	protected String nome;
	    protected float valor;
	    protected String numPatrimonio;
	    protected String dataAquisicao;
	
	
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
