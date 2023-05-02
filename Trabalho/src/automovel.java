package ruan;

import java.text.SimpleDateFormat;
import java.util.Date;

    public class Automovel extends Patrimonio{
	    private String marca;
	    private String modelo;
	    private double ano;
	    private float quilometragem;
	
	
	//Construtor Automóvel
	public Automovel(float valor, float numPatrimonio, Date dataAquisicao, String marca, String modelo, double ano, float quilometragem){
	    super(valor, numPatrimonio, dataAquisicao);
	    this.marca = marca;
	    this.modelo = modelo;
	    this.ano = ano;
	    this.quilometragem = quilometragem;
	}
	
	//Gets Automóvel
	public String getMarca(){
	    return marca;
	}
	
	public String getModelo(){
	    return modelo;
	}
	
	public double getAno(){
	    return ano;
	}
	
	public float getQuilometragem(){
	    return quilometragem;
	}
	
	//Sets Automóvel
	public void setMarca(String marca){
	    this.marca = marca;
	}
	
	public void setModelo(String modelo){
	    this.modelo = modelo;
	}
	
	public void setAno(double ano){
	    this.ano = ano;
	}
	
	public void setQuilometragem(float quilometragem){
	    this.quilometragem = quilometragem;
	}
	
	//ToString Automóvel
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
		
		return "Valor: " + valor + ", Número de Patrimônio: " + numPatrimonio + " Data de aquisição: " + formato.format(dataAquisicao)
		+ " Marca: " + marca + " Modelo: " + modelo + " Ano: " + ano + " Quilometragem: " + quilometragem;
	}
}