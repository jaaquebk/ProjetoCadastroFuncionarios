public class Principal {

	public static void main(String[] args) {
		String opcoes[] = { "1.Inserir", "2.Consultar", "3.Remover",
				"4.Listar", "5.Sair" };
		int op = 0;
		int op2 = 0;
		switch (op) {
		case 1: {
			String opcoes2[] = {"1.Advogado", "2.Secetária"};
			switch (op2) {
			case 1: {
				if(op2 == 1){
					menuInserirAdvogado();
				}else menuInserirSecretaria();
			}
			break;
			}
		}
		break;
		}

	}

	private static void menuInserirSecretaria() {
		
		
	}

	private static void menuInserirAdvogado() {
		
	}

}
