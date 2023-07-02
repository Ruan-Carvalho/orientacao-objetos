package controle;

import java.text.ParseException;
import java.util.ArrayList;
import ruan.*;

	/**
	 * Classe controllah responsavel pelo 
	 * controle dos dados que sao exibidos na view.
	 * e sua conexão com a modelo(ruan).
	 * @author Ruan Sobreira carvalho
	 * @since 2023
	 * @version 1.0
	 */

public class controllah {

	private static controllah instancia;
	private ArrayList<Patrimonio> p;
	private static Proprietario usuario;
	
	private controllah() throws ParseException{
		usuario = Proprietario.getInstance();
		p = usuario.getlistaPatrimonio();
		usuario.preencherDados();
	}
	
	/**
	 * Metodo responsavel por instanciar a classe
	 * e garantir que exista apenas uma instancia dela,
	 * evitando multiplicidade e perda de dados.
	 * @return controllah
	 */
	
	public static controllah getInstance(){
        if (instancia == null) {
            try {
				instancia = new controllah();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        return instancia;
    }
	
	/**
     * Metodo resposavel por criar um vetor de String com os nomes
     * dos patrimônios adicionados no arrayList da classe
     * @see Propretario
     * @return String[]
     */
	
	public String[] getnomePatrimonio() {
		int i = 0;
		String[] Patrimonionome = new String[p.size()];
		for(Patrimonio patrimonio : p) {
			Patrimonionome[i] = patrimonio.getNome();
			i++;
		}
		return Patrimonionome;
	}
	
	/**
	 * Metodo responsavel pela pesquisa de um patrimônio.
	 * Chama o metodo @see Proprietario#buscaPatrimonio com o argumento
	 * recebido pela funcao, se retornar um indice valido adiciona
	 * o nomeEncontrado no arraylist, se nao, retorna uma String[] 
	 * com valor nulo. No retorno padrao o arrayList é transformado em String[].
	 * @return String[]
	 */ 
	
	public String[] getPesquisa(String pesquisa) {
	    ArrayList<String> nomeEncontrado = new ArrayList<>();
	    int indice = -1;
	    String[] nulo = null;
	    
	    indice = usuario.buscaPatrimonio(pesquisa);
	    
	    if (indice != -1) {
	    	nomeEncontrado.add(p.get(indice).getNome());
	    }else return nulo;
	    
	    return nomeEncontrado.toArray(new String[0]);
	}
	
	/**
	 * Metodo responsavel por alterar o patrimônio
	 * para sua devida classe.
	 */
	
	public Patrimonio castPatrimonio(int index_selecionado) {
		
		   if (index_selecionado >= 0 && index_selecionado < p.size()) {
		        Patrimonio patrimonio = p.get(index_selecionado);
		
		        if(patrimonio instanceof Automovel) {
					Automovel automovel = (Automovel) patrimonio;
					return automovel;
				}else if(patrimonio instanceof Imovel) {
					Imovel imovel = (Imovel) patrimonio;
					return imovel;
				}else if (patrimonio instanceof Investimento) {
					Investimento investimento = (Investimento) patrimonio;
					return investimento;
				}
		   }
		   return null;		
		}
	
	/**
	 * Metodo responsavel pela adição e remoção de um patrimônio.
	 * O atributo "index_selecionado" vai definir se este metodo
	 * ira adicionar um patrimônio, ou edita-lo.
	 * Para editar um patriônio o metodo @see controllah#castPatrimonio
	 * de acordo com o retorno, sera atualizado o patrimonio daquela classe com
	 * o metodo @see proprietario#setPatrimonio 
	 * Para adicionar um novo patrimnio a sua classe devida, o atributo
	 * "categoria" para definir de qual classe filha sera o @see Patrimonio
	 * o metodo @see Proprietario#addPatrimonio 
	 * eh chamado para adicionar um no patrimônio.
	 * Retorna valor booleano correspondente ao sucesso ou fracasso do metodo.
	 * @return boolean
	 */
	
	public boolean adicionarEditarPatrimonio(int index_selecionado, String[] 
			novoPatrimonio, Proprietario usuario, char categoria) {
		boolean retorno = false;
		
		if(index_selecionado != -1) {
			Patrimonio patrimonio = castPatrimonio(index_selecionado);
			retorno = true;
		
			if(patrimonio instanceof Automovel) {
				Automovel automovel = new Automovel(novoPatrimonio[0], 
				Float.parseFloat(novoPatrimonio[1]), novoPatrimonio[2], 
				novoPatrimonio[3],novoPatrimonio[4], 
				Integer.parseInt(novoPatrimonio[5]),Float.parseFloat(novoPatrimonio[6]));
				
				usuario.setlistaPatrimonio(index_selecionado, automovel);
			}
			if(patrimonio instanceof Imovel) {
				Imovel imovel = new Imovel(novoPatrimonio[0], 
				Float.parseFloat(novoPatrimonio[1]), novoPatrimonio[2], 
				novoPatrimonio[3], novoPatrimonio[4], novoPatrimonio[5],
				novoPatrimonio[6], novoPatrimonio[7]);
				
				usuario.setlistaPatrimonio(index_selecionado, imovel);
			}
			if(patrimonio instanceof Investimento) {
				Investimento investimento = new Investimento(novoPatrimonio[0], 
				Float.parseFloat(novoPatrimonio[1]), novoPatrimonio[2], 
				novoPatrimonio[3], novoPatrimonio[4], Float.parseFloat(novoPatrimonio[5]),
				Float.parseFloat(novoPatrimonio[6]));
				
				usuario.setlistaPatrimonio(index_selecionado, investimento);
			}
		}else if(categoria == 'a'){
			Automovel automovel = new Automovel(novoPatrimonio[0], 
			Float.parseFloat(novoPatrimonio[1]), novoPatrimonio[2], 
			novoPatrimonio[3],novoPatrimonio[4], 
			Integer.parseInt(novoPatrimonio[5]),Float.parseFloat(novoPatrimonio[6]));
			
				retorno = usuario.addPatrimonio(automovel);
				
		}else if(categoria == 'b'){
			Imovel imovel = new Imovel(novoPatrimonio[0], 
				Float.parseFloat(novoPatrimonio[1]), novoPatrimonio[2], 
				novoPatrimonio[3], novoPatrimonio[4], novoPatrimonio[5],
				novoPatrimonio[6], novoPatrimonio[7]);
			
				retorno = usuario.addPatrimonio(imovel);
				
		}else if(categoria == 'c'){
			Investimento investimento = new Investimento(novoPatrimonio[0], 
			Float.parseFloat(novoPatrimonio[1]), novoPatrimonio[2], 
			novoPatrimonio[3], novoPatrimonio[4], Float.parseFloat(novoPatrimonio[5]),
			Float.parseFloat(novoPatrimonio[6]));
			
				retorno = usuario.addPatrimonio(investimento);
		}
		return retorno;
	}
	
	/**
	 * Metodo responsavel pelo filtro de um patrimnio, dado sua
	 * classe. De acordo com o char passado como argumento
	 * adiciona o nome do produto referente aquela classe no arrayList e
	 * trata o retorno transformando o arrayList em String[].
	 * @return String[]
	 */
	
	public String[] filtrarPatrimonio(char selecionado) {
	    ArrayList<String> nomes = new ArrayList<>();

	    if(selecionado == 'a') {
	    	for (Patrimonio patrimonio : p) {
    			if (patrimonio instanceof Automovel)
    				nomes.add(patrimonio.getNome());
    		}
	    }else if (selecionado == 'b') {
	    	for (Patrimonio patrimonio : p) {
    			if (patrimonio instanceof Imovel)
    				nomes.add(patrimonio.getNome());
    		}
	    }else if (selecionado == 'c') {
	    	for (Patrimonio patrimonio : p) {
    			if (patrimonio instanceof Investimento)
    				nomes.add(patrimonio.getNome());
    		}
	    }
	    
	    return nomes.toArray(new String[0]);
	}
	
	/**
	 * Metodo responsavel por excluir um patrimônio dado seu indice.
	 * Chama o metodo @see Patrimonio#deletarPatrimonio
	 * para excluir o patrimonio selecionado. 
	 * Retorna um boolean do metodo deletarPatrimonio.
	 * @return boolean
	 */
	
	public boolean excluirPatrimonio(int index_selecionado, Proprietario usuario) {
		boolean retorno = false;
		retorno = usuario.deletarPatrimonio(p.get(index_selecionado));
		return retorno;
	}
}
