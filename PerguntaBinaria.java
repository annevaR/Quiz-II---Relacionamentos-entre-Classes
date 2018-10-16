
public class PerguntaBinaria extends Pergunta {
	
	//atributos
	private boolean resposta;
	
	// metodos
	
	@Override
	public String getResposta(){
		if (this.resposta) {
			return "C";
		} else {
			return "E";
		}
	}

	public void setResposta(boolean resposta) {
		this.resposta = resposta;
	}
}
