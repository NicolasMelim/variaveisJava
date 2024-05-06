package OperadorTernario;

public class operadorTernario {
public static void main(String[] args) {
	/* O operador Ternario é uma forma rewsumida para definir uma condicao e escolher por um dentre dois valores;
	 * Voce deve penser numa condicao ternaria como se fosse uma condicao IF normal, porem, de uma forma em que toda a
	 *sua estrutura estará escrita numa única linha!
	 *O operador ternari é representado pelo simbolo "?:" utilizado na seguinte estrutura de sintaxe abaixo:
	 */
	
	/* EXEMPLO COM IF E ESLSE */
	int a, b;
	a = 6;
	b = 5;
	String resultado = " ";
	
	if(a==b)
		resultado = "true";
	else
		resultado = "false";
	
	System.out.print(resultado);
	
	/*EXEMPLO COM OPERADOR TERNARIO */
	int c , d;
	c = 6;
	d = 5;
	String resulta = a==b ? "verdadeiro" : "falso"; /* o ponto de interrogação é o SE (if) e os dois ponto é o SE NAO (ESLE) */
	
	System.out.print(resulta);
}
}
