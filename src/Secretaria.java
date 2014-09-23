
public class Secretaria extends Funcionario {
	
	private String agenda;
	private String idioma;
	public Secretaria(int id, String nome, String cpf, String email, String ramal,
			DataContratacao dtCont, String agenda, String idioma) {
		super(id, nome, cpf, email, ramal, dtCont);
		setAgenda(agenda);
		setIdioma(idioma);
	}
	public String getAgenda() {
		return agenda;
	}
	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String toString(){
		return super.toString() + " Agenda: " + agenda + " Idioma: " + idioma;
	}
}
