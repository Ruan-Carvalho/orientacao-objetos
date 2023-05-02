package ruan;


import java.text.SimpleDateFormat;
import java.util.Date;

    public class Investimento extends Patrimonio{
	    private String tipoInvst;
	    private String instituicao;
	    private float valorInicial;
	    private float rentabilidade;
	
	
	//Construtor Investimento
	public Investimento(float valor, float numPatrimonio, Date dataAquisicao, String tipoInvst, String instituicao, float valorInicial, float rentabilidade){
	    super(valor, numPatrimonio, dataAquisicao);
	    this.tipoInvst = tipoInvst;
	    this.instituicao = instituicao;
	    this.valorInicial = valorInicial;
	    this.rentabilidade = rentabilidade;
	}
	
	//Gets Investimento
	public String getTipoInvst(){
	    return tipoInvst;
	}
	
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
    public void setTipoInvst(String tipoInvst){
	    this.tipoInvst = tipoInvst;
	}
	
	public void setInstituicao(String instituicao){
	    this.instituicao = instituicao;
	}
	
	public void setValorInicial(float valorInicial){
	    this.valorInicial = valorInicial;
	}
	
	public void setRentabilidade(float rentabilidade){
	    this.rentabilidade = rentabilidade;
	}
	
	//ToString Investimento
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
		
		return "Valor: " + valor + ", Número de Patrimônio: " + numPatrimonio + "Data de aquisição: " + formato.format(dataAquisicao)
		+ "Modalidade da aplicação: " + tipoInvst + " Instituição: " + instituicao + " Valor inicial investido: " + valorInicial + " Rentabilidade: " + rentabilidade;
	}
}