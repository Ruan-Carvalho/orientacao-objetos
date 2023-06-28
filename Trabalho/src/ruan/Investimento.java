package ruan;

    public class Investimento extends Patrimonio{
	    private String instituicao;
	    private float valorInicial;
	    private float rentabilidade;
	
	
	//Construtor Investimento
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