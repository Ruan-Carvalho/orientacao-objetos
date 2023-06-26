package ruan;


import java.text.SimpleDateFormat;
import java.util.Date;

    public class Imovel extends Patrimonio{
	    private String cidade;
	    private String estado;
	    private String endereco;
	    private String cep;
	    private String tipoImvl;
	
	
	//Construtor Imóvel
	public Imovel(float valor, String numPatrimonio, Date dataAquisicao, String cidade, String estado,String endereco, String cep, String tipoImvl){
	    super(valor, numPatrimonio, dataAquisicao);
	    this.cidade = cidade;
	    this.estado = estado;
	    this.endereco = endereco;
	    this.cep = cep;
	    this.tipoImvl = tipoImvl;
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
	
	public String getTipoImvl(){
	    return tipoImvl;
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
	
	public void setTipoImvl(String tipoImvl){
	    this.tipoImvl = tipoImvl;
	}
	
	//ToString Imóvel
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
		
		return "Valor: " + valor + ", Número de Patrimônio: " + numPatrimonio + " Data de aquisição: " + formato.format(dataAquisicao)
		+ " Cidade: " + cidade + " Estado: " + estado + " Endereço: " + endereco + " CEP: " + cep + " Tipo de Imóvel: " + tipoImvl;
	}
}