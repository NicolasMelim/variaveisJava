package operadoresLogicos;

public class operadoresLogicos {
public static void main(String[] args) {
	/* Os operadores logicos sao && que significa "E", || que significa "OU" */
	
	boolean condicao1 = true;
	boolean condicao2 = false;
	if(condicao1 && condicao2) {
		System.out.print("As duas condições sao verdadeiras");
	}else if(condicao1 || condicao2){
		System.out.print("Uma das duas condições sao verdadeiras"); /* || ele verificou se alguma das condições é verdadeira */
		
	}
}
}
