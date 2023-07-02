package ruan;

	/**
	 * A classe Investimento representa uma categoria de patrimônio que herda características
	 * da classe Ppatrimônio. Ela adiciona informações específicas para investimentos,
	 * como instituição, valor inicial, e rentabilidade. 
	 * @author Ruan Sobreira Carvalho
	 * @since 2023
	 * @version 1.0
	*/

    public class Investimento extends Patrimonio{
	    private String instituicao;
	    private float valorInicial;
	    private float rentabilidade;
	
	 /**
	  * Construtor da classe Investimento.
	  *
	  * @param nome              O nome do Investimento.
	  * @param valor             O valor do Investimento.
	  * @param numpatrimonio     O número do Investimento.
	  * @param dataAquisicao     A data de aquisição do Investimento.
	  * @param instituicao       A instituição do Investimento.
	  * @param valorInicial		 O valor inicial do Investimento.
	  * @param rentabilidade     A rebtabilidade do Investimento.
	  */
	
	public Investimento(String nome, float valor, String numPatrimonio, String dataAquisicao, String instituicao, float valorInicial, float rentabilidade){
	    super(nome, valor, numPatrimonio, dataAquisicao);
	    this.instituicao = instituicao;
	    this.valorInicial = valorInicial;
	    this.rentabilidade = rentabilidade;
	}
	
	//Gets Investimento
	
	public String getInstituicao(){
	    return instituicao;
	}
	
	public float getValorInicial(){
	    return valorInicial;
	}
	
	public float getRentabilidade(){
	    return rentabilidade;
	}

    //Sets Investimento
	
	public void setInstituicao(String instituicao){
	    this.instituicao = instituicao;
	}
	
	public void setValorInicial(float valorInicial){
	    this.valorInicial = valorInicial;
	}
	
	public void setRentabilidade(float rentabilidade){
	    this.rentabilidade = rentabilidade;
	}
}