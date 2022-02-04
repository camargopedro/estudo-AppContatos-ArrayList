package contatos;

public class Contato {

	public String nome;
	public String email;
	public String celular;
	public String aniversario;
	
	public Contato(String nome, String email, String celular, String aniversario) {
		super();
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.aniversario = aniversario;
	}

	@Override
	public String toString() {
		return "Contato [nome: " + nome + ", email: " + email + ", celular: " + celular + ", aniversario: " + aniversario + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	
	
	
}
