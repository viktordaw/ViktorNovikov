package Calculadora;

/*
Objetivo: Obtener código refactorizado a partir de otro que no lo está.

Tarea: Para esta tarea, se refactorizará un programa mal escrito, sin 
cambiar la forma en que funciona el programa. Este programa, RPN.java 
es una calculadora de notación inversa polaca que utiliza una pila.

Se debe reorganizar este código usando al menos tres de las reglas vistas 
en clase.
*/

class NodoPila {
	public NodoPila(double dato, NodoPila abajo)
	{
		this.dato = dato;
		this.abajo = abajo;
	}
	
	public NodoPila abajo;
	public double dato;
}

public class RPN {
	public void pushPila(double nuevo_dato)
	{
		NodoPila nuevo_nodo = new NodoPila(nuevo_dato, arriba);
		arriba = nuevo_nodo;
	}
	
	public double popPila()
	{
		double dato_arriba = arriba.dato;
		arriba = arriba.abajo;
		return dato_arriba;
	}
	
	public RPN(String commando)
	{
		arriba = null;
		this.commando = commando;
	}
	
	public double resultado()
	{
		double a, b;
		int j;
		
		for(int i = 0; i < commando.length( ); i++) {
			//si es un digito
			if(Character.isDigit(commando.charAt(i))) {
				double numero;
				
				//obtener un string a partir del numero
				String temp = "";
				
				for(j = 0; (j < 100) && (Character.isDigit(commando.charAt(i)) || (commando.charAt(i) == '.')); j++, i++) {
					temp = temp + String.valueOf(commando.charAt(i));
				}
				//convertir a double y añadir a la pila
				numero = Double.parseDouble(temp);
				pushPila(numero);
			} else if(commando.charAt(i) == '+') {
				b = popPila();
				a = popPila();
				pushPila(a + b);
			} else if(commando.charAt(i) == '-') {
				b = popPila();
				a = popPila();
				pushPila(a - b);
			} else if(commando.charAt(i) == '*') {
				b = popPila();
				a = popPila();
				pushPila(a * b);
			} else if(commando.charAt(i) == '/') {
				b = popPila();
				a = popPila();
				pushPila(a / b);
			} else if(commando.charAt(i) == '^') {
				b = popPila();
				a = popPila();
				pushPila(Math.pow(a, b));
			} else if(commando.charAt(i) == '%') {
				b = popPila();
				a = popPila();
				pushPila(a % b);
			} else if(commando.charAt(i) != ' '){
				throw new IllegalArgumentException();
			}
		}
		
		double val = popPila();
		if(arriba != null) {
			throw new IllegalArgumentException();
		}
		
		return val;
	}
	
	private String commando;
	private	NodoPila arriba;
}
