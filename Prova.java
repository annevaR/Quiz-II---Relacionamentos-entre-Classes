import java.util.ArrayList;

public class Prova {
	// atributos
	private ArrayList<Pergunta> questoes;
	
	//metodos especiais
	
	public ArrayList<Pergunta> getQuestoes(){
		return this.questoes;
	}
	
	public Prova(){
		this.getQuestoes();
		this.questoes = new ArrayList<Pergunta>();
	}
	
	// metodos
	 
	public void addQuestoes(Pergunta P){
		this.questoes.add(P);
	}
	
	public void imprimirQuestoes(){
		int nmr = 1;
		for (Pergunta i : questoes){
			System.out.println("== QUESTOES==" + "\n" + nmr +  "-" + i.getDescricao());
			
		}
	}
	
		public void imprimirGabarito(){
			int nmr = 1;
			for (Pergunta o : questoes){
				System.out.println("== GABARITO ==" + "\n" +nmr + "-" + o.getResposta());
			}	
	}
}

