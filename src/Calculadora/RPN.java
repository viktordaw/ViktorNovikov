package Calculadora;

/**
 * Clase RPN es un clase que calcula de notación inversa polaca que 
 * utiliza una pila.
 * @version 1.0 21/02/2018
 * @author Viktor Novikov
 */
public class RPN {
	private String commando;
	private Pila pila;
	
	/**
	 * Constructor
	 * @param commando
	 */
	public RPN(String commando)
	{
		pila = new Pila(null);
		this.commando = commando;
	}
	
	/**
	 * Resultado de la operación
	 * @return
	 */
	public double resultado()
	{
		double a, b;
		int j;
		Character operation = ' ';
		
		for(int i = 0; i < commando.length(); i++) {
			if(Character.isDigit(commando.charAt(i))) {
				double numero;
				
				String temp = "";
				
				for(j = 0; (j < 100) && (Character.isDigit(commando.charAt(i)) || (commando.charAt(i) == '.')); j++, i++) {
					temp = temp + String.valueOf(commando.charAt(i));
				}
				numero = Double.parseDouble(temp);
				pila.pushPila(numero);
			} else if(commando.charAt(i) == '+') {
				operation = '+';
			} else if(commando.charAt(i) == '-') {
				operation = '-';
			} else if(commando.charAt(i) == '*') {
				operation = '*';
			} else if(commando.charAt(i) == '/') {
				operation = '/';
			} else if(commando.charAt(i) == '^') {
				operation = '^';
			} else if(commando.charAt(i) == '%') {
				operation = '%';
			} else if(commando.charAt(i) != ' '){
				throw new IllegalArgumentException();
			}
		}
		
		switch(operation) {
			case '+':
				b = pila.popPila();
				a = pila.popPila();
				pila.pushPila(a + b);
				break;
			case '-': 
				b = pila.popPila();
				a = pila.popPila();
				pila.pushPila(a - b);
				break;
			case '*': 
				b = pila.popPila();
				a = pila.popPila();
				pila.pushPila(a * b);
				break;
			case '/': 
				b = pila.popPila();
				a = pila.popPila();
				pila.pushPila(a / b);
				break;
			case '^': 
				b = pila.popPila();
				a = pila.popPila();
				pila.pushPila(Math.pow(a, b));
				break;
			case '%': 
				b = pila.popPila();
				a = pila.popPila();
				pila.pushPila(a % b);
				break;
			default: throw new IllegalArgumentException();
		}
		
		double val = pila.popPila();
		
		return val;
	}
}