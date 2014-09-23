
public class Funcionario extends Pessoa {
	
	private String email;
	private String ramal;
	private DataContratacao dtCont;
	
	public Funcionario(int id, String nome, String cpf, String email, String ramal, DataContratacao dtCont ) {
		super(id, nome, cpf);
		setEmail(email);
		setRamal(ramal);
		dtCont = new DataContratacao();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public DataContratacao getDtCont() {
		return dtCont;
	}

	public void setDtCont(DataContratacao dtCont) {
		this.dtCont = dtCont;
	}
	
	public String toString(){
		return super.toString() + " Email: " + " Ramal: " + ramal + " Data de contratação: " + dtCont;
	}
}
