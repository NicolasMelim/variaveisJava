package operadores;

public class Operadores {
	public static void main(String[] args) {
		/* Operador de atribuição é o igual (=) */
		String nome = "Nicolas";
		int idade = 19;
		double peso = 68.5;
		char sexo = 'M'; /* char serve para utilizar uma caracter */
		boolean doadorDeOrgao = false; 
		System.out.print(sexo);
		
		
		/* Operadores aritmetico é utilizado para matematicas */
		int subtracao = 10 - 15;
		double soma = 10.5 + 15.2;
		int dividao = 10 / 5;
		int multiplicacao = 5 * 5;
		int modulo = 18 % 3; /* o modulo sempre retorna o resultado da conta, se  3 vezes 6 é 18 ent o módulo  0 */
		double resultado = (10 * 5) + (6 / 2);
		System.out.print(resultado);
		
		
		
		/* Como concatenar em Java */
		String concatenacao = "Nciolas" + "Melim";
		System.out.print(concatenacao);
		
		concatenacao = "1" +1 + 1+ 1;  /* Aqui ele identificou que seria uma string ent concatenou de primeira */
		System.out.print(concatenacao); 
		
		concatenacao = 1 + 1 + 1 + "1"; /* como aqui ele identificou uma soma no começo, ele somou e depois concatenou */
		System.out.print(concatenacao);  
		
		concatenacao = "1" + (1 + 1 + 1); /* aqui ele somou primero os parenteses para depois concatenar */
		System.out.print(concatenacao);
		
		
		concatenacao = 1 + "1" + 1 + 1; /* aqui ele ja identificou que é um texto ai ele concatenou todos os valores */
		System.out.print(concatenacao);
	}
		
}
