package ruan;


import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
 
    public static void main(String[] args) throws Exception {
        
        //Instanciar fornecedor do patrimonio
        Proprietario proprietario_01 = new Proprietario("Ruan Carvalho", 20 ,"123.321.234-12","ruansobreira11@gmail.com");
       
        //Instanciar as datas
        SimpleDateFormat data_formato = new SimpleDateFormat("dd/MM/yyyy");
		String dateString_1 = "21/04/2024";
		String dateString_2 = "08/05/2024";
		String dateString_3 = "10/05/2024";
		
		Date dataAq_01 = data_formato.parse(dateString_1);
		Date dataAq_02 = data_formato.parse(dateString_2);
		Date dataAq_03 = data_formato.parse(dateString_3);
		
		//Instanciar os patrimônios
		Patrimonio patrimonio_01 = new Automovel(155000.00f,"001.00.01",dataAq_01,"Mitsubishi","Lancer EVO",2011,79000);
		Patrimonio patrimonio_02 = new Imovel(1250000.00f,"002.00.01",dataAq_02,"Asa Sul","DF","123 conj 01 02","12345-123","Apartamento");
		Patrimonio patrimonio_03 = new Investimento(350000.00f,"003.00.01",dataAq_03,"Fundos imobiliários","Banco do Brasil",320000,1.1f);
		
		System.out.println(proprietario_01);
		System.out.println(patrimonio_01);
		System.out.println(patrimonio_02);
		System.out.println(patrimonio_03);
		
    }
}