package ruan;

	/**
	 * A classe Automóvel representa uma categoria de patrimônio que herda características
	 * da classe Ppatrimônio. Ela adiciona informações específicas para automóveis,
	 * como marca, ano e quilometragem. 
	 * @author Ruan Sobreira Carvalho
	 * @since 2023
	 * @version 1.0
	 */

    public class Automovel extends Patrimonio{
	    private String marca;
	    private int ano;
	    private float quilometragem;
	    
	  /**
	   * Construtor da classe Automóvel.
	   *
	   * @param nome              O nome do Automóvel.
	   * @param valor             O valor do Automóvel.
	   * @param numpatrimonio     O número do Automóvel.
	   * @param dataAquisicao     A data de aquisição do Automóvel.
	   * @param marca   		  A marca do Automóvel.
	   * @param ano				  O ano do modelo de Automóvel.
	   * @param quilometragem     A quilometragem do Automóvel.
	   */
	
	public Automovel(String nome, float valor, String numPatrimonio, String dataAquisicao, String marca, int ano, float quilometragem){
	    super(nome, valor, numPatrimonio, dataAquisicao);
	    this.marca = marca;
	    this.ano = ano;
	    this.quilometragem = quilometragem;
	}
	
	//Gets Automóvel
	public String getMarca(){
	    return marca;
	}
	
	public int getAno(){
	    return ano;
	}
	
	public float getQuilometragem(){
	    return quilometragem;
	}
	
	//Sets Automóvel
	public void setMarca(String marca){
	    this.marca = marca;
	}
	
	public void setAno(int ano){
	    this.ano = ano;
	}
	
	public void setQuilometragem(float quilometragem){
	    this.quilometragem = quilometragem;
	}
}