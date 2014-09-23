import java.util.ArrayList;


public class Cadastro {
	
	private ArrayList<Pessoa> cad;
	
	
	public Cadastro(){
		
		cad = new ArrayList<Pessoa>();	
	}
	
	public void addAdvogado(int id, String nome, String cpf, String email, String ramal,
			DataContratacao dtCont, String agenda, String idioma, Secretaria sec, int oab){
		
		Advogado adv = new Advogado(id, nome, cpf, email, ramal, dtCont, agenda, idioma, sec, oab);	
		cad.add(adv);
	}
	
	public void addSecretaria(int id, String nome, String cpf, String email, String ramal,
			DataContratacao dtCont, String agenda, String idioma){
		
		Secretaria scr = new Secretaria(id, nome, cpf, email, ramal, dtCont, agenda, idioma);
		cad.add(scr);
	}
	
	public Pessoa removeAdvogado(int id){
		Pessoa aux = null;
		for(int i = 0; i < cad.size(); i++) {
			aux = cad.get(i);
			if(aux.getId() == id){
				cad.remove(i);
				return aux;
			}
		}return null;
	}
	
	public Pessoa removeSecretaria(int id){
		Pessoa aux = null;
		for(int i = 0; i < cad.size(); i++) {
			aux = cad.get(i);
			if(aux.getId() == id){
				cad.remove(i);
				return aux;
			}
		}return null;
	}
	
	public Pessoa getAdvogado(int id){
		Pessoa aux = null;
		for(int i = 0; i < cad.size(); i++) {
			aux = cad.get(i);
			if(aux.getId() == id){
				return aux;
			}
		}return null;
	}
	
	public Pessoa getSecretaria(int id){
		Pessoa aux = null;
		for(int i = 0; i < cad.size(); i++) {
			aux = cad.get(i);
			if(aux.getId() == id){
				return aux;
			}
		}return null;
	}
	
	public String listaPessoa(){
		String aux = "";
		for(int i = 0; i < cad.size(); i++){
			aux += i;
		}return aux;
	}
}
