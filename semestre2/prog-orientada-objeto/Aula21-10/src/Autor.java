
public class Autor {
	private String nome;
	private String cpf;
	private String email;
	
	public Autor(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public void mostrarDetalhes() {
		System.out.println("Detalhes do autor:");
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("E-mail: " + email);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
