package Calculadora;

public class Pila {
	private	NodoPila arriba;
	
	public Pila(NodoPila dato)
	{
		arriba = dato;
	}
	
	public void pushPila(double nuevo_dato)
	{
		NodoPila nuevo_nodo = new NodoPila(nuevo_dato, arriba);
		arriba = nuevo_nodo;
	}
	
	public double popPila()
	{
		if (pilaIsEmpty()) throw new NullPointerException();
		double dato_arriba = arriba.dato;
		arriba = arriba.abajo;
		return dato_arriba;
	}
	
	public boolean pilaIsEmpty()
	{
		if(arriba != null) {
			return false;
		}
		
		return true;
	}
}
