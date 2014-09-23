
public class DataContratacao {
	
	private int dia;
	private int mes;
	private int ano;
	
	public DataContratacao(){
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String toString(){
		return "Dia: " + dia + " M�s: " + mes + " Ano: " + ano;
	}
	
}
