package controle;

import java.text.ParseException;
import java.util.ArrayList;
import ruan.*;

public class controllah {

	private static controllah instancia;
	private ArrayList<Patrimonio> p;
	private static Proprietario usuario;
	
	private controllah() throws ParseException{
		usuario = Proprietario.getInstance();
		p = usuario.getlistaPatrimonio();
		usuario.preencherDados();
	}
	
	public static controllah getInstance() throws ParseException{
        if (instancia == null) {
            instancia = new controllah();
        }
        return instancia;
    }
	
	//Lista Patrimonios por nome
	public String[] getnomePatrimonio() {
		int i = 0;
		String[] Patrimonionome = new String[p.size()];
		for(Patrimonio patrimonio : p) {
			Patrimonionome[i] = patrimonio.getNome();
			i++;
		}
		return Patrimonionome;
	}
}
