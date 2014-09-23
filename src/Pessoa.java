
public class Pessoa {
	
	private int id;
	private String nome;
	private String cpf;
	
	public Pessoa(int id, String nome, String cpf){
		setId(id);
		setNome(nome);
		setCpf(cpf);
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
	
	
	
	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String toString(){
		return "Id: " + id + " Nome: " + nome + " Cpf: " + cpf;
	}
	
	

}
