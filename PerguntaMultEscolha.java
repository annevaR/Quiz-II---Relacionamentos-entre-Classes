
public class PerguntaMultEscolha extends Pergunta {
	
	// atributos
	
	private char alternativaCorreta;
	
	// metodos
	
	@Override
	public String getResposta(){
		return ("LETRA" + this.alternativaCorreta);
		
	}

	public void setAlternativaCorreta(char alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}
	
	

}
