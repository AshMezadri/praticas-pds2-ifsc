package modelo;

public class Filme {

	private Integer id_filme;
	private String nome_filme;
	private String diretor;
	private String genero;

	public Integer getId_filme() {
		return id_filme;
	}

	public void setId_filme(Integer id_filme) {
		this.id_filme = id_filme;
	}

	public String getNome_filme() {
		return nome_filme;
	}

	public void setNome_filme(String nome_filme) {
		this.nome_filme = nome_filme;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
