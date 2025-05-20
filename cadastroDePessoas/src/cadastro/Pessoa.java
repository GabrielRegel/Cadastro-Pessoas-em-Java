package cadastro;

public class Pessoa {

	private String nome;
	private int idade;
	private String email;
	
	
	public Pessoa(String nome, int idade, String email) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}
	
	public void exibirDados() {
		System.out.println("----- Dados da Pessoa -----");
		System.out.println("Nome: " +  nome);
		System.out.println("Idade: " + idade);
		System.out.println("Email: " + email);

	}
	
}
