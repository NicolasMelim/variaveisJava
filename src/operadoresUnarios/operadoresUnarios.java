package operadoresUnarios;

public class operadoresUnarios {
public static void main(String[] args) {
	int numero = 5;
	
	numero = - numero; /* dessa maneira eu deixei o valor negativo */

	/* para reverter essa situação, deixar o valor positivo precisamos multiplicar ele por -1*/
	
	numero = numero * -1;
	System.out.print(numero);
	
	/* O operador unario (!) nega o valor de uma expressao booleana, exemplo abaixo */
	
	boolean variavel = true;
	
	variavel = !variavel;
	System.out.print(variavel);
	
	/* Aqui eu vou incrementar ou seja, acrescentar um valor a mais do 5 tornando ele 6 */
	int number = 5;
	number++;
	System.out.print(number);
	/* Ou podemos diminuir esse valor, de 6 ele passa a ser 5 novamente! */
	System.out.print(numero --);
}
}
