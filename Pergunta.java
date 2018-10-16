
public abstract class Pergunta {
	//atributos
	private String descricao;
	
	//metodos especiais

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Pergunta() {
		this.getDescricao();
		
	}
   
	// metodo abstrato
	
	public abstract String getResposta();
	
}
