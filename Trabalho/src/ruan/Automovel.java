package ruan;

    public class Automovel extends Patrimonio{
	    private String marca;
	    private int ano;
	    private float quilometragem;
	
	//Construtor Automóvel
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