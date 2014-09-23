
public class Advogado extends Funcionario {
	
	private Secretaria sec;
	private int oab;
	
	public Advogado(int id, String nome, String cpf, String email, String ramal,
			DataContratacao dtCont, String agenda, String idioma, Secretaria sec, int oab) {
		super(id, nome, cpf, email, ramal, dtCont);
		setOab(oab);
		sec = new Secretaria(id, nome, cpf, email, ramal, dtCont, agenda, idioma);
	}

	public Secretaria getSec() {
		return sec;
		
	}

	public void setSec(Secretaria sec) {
		this.sec = sec;
	}

	public int getOab() {
		return oab;
	}

	public void setOab(int oab) {
		this.oab = oab;
	}
	
	public String toString(){
		return super.toString() + " OAB: " + oab + " Secretaria: " + sec;
	}
}
