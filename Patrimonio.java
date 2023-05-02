package ruan;


import java.text.SimpleDateFormat;
import java.util.Date;

    public abstract class Patrimonio{
	    protected float valor;
	    protected float numPatrimonio;
	    protected Date dataAquisicao;
	
	
	//Construtor Patrimonio
	public Patrimonio(float valor, float numPatrimonio, Date dataAquisicao){
	    this.valor = valor;
	    this.numPatrimonio = numPatrimonio;
		this.dataAquisicao = dataAquisicao;
	}
	
	//Gets Patrimonio
	
	public float getValor(){
	    return valor;
	}
	
	public float getNumPatrimonio(){
	    return numPatrimonio;
	}
	
	public Date getDataAquisicao(){
	    return dataAquisicao;
	}
	
	//Sets Patrimonio
	
	public void setValor(float valor){
	    this.valor = valor;
	}
	
	public void setNumPatrimonio(float numPatrimonio){
	    this.numPatrimonio = numPatrimonio;
	}
	
	public void setDataAquisicao(Date dataAq){
	    dataAquisicao = dataAq;
	}
	
	
	// toString Patrimônio
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
		
		return "Valor: " + valor + ", Número de Patrimônio: " + numPatrimonio + " Data de aquisição: " + formato.format(dataAquisicao);
	}
}