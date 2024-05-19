
public class Cliente {

	private String nome;
    private String cadastro;
    private String tipo;

    

	public Cliente(String nome, String cadastro, String tipo) {
        this.nome = nome;
        this.cadastro = cadastro;
        this.tipo = tipo;
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
