package Calculadora;

/**
 * La clase de implementación de la pila.
 * @version 1.0 21/02/2018
 * @author Viktor Novikov
 *
 */
public class Pila {
	private	NodoPila arriba;
	
	/**
	 * Constructor
	 * @param dato
	 */
	public Pila(NodoPila dato)
	{
		arriba = dato;
	}
	
	/**
	 *Añade un nodo a pila
	 * @param nuevo_dato
	 */
	public void pushPila(double nuevo_dato)
	{
		NodoPila nuevo_nodo = new NodoPila(nuevo_dato, arriba);
		arriba = nuevo_nodo;
	}
	
	/**
	 * Recoge un nodo desde pila
	 * @return
	 */
	public double popPila()
	{
		if (pilaIsEmpty()) throw new NullPointerException();
		double dato_arriba = arriba.dato;
		arriba = arriba.abajo;
		return dato_arriba;
	}
	
	/**
	 * Verifica si pila bacia
	 * @return
	 */
	public boolean pilaIsEmpty()
	{
		if(arriba != null) {
			return false;
		}
		
		return true;
	}
}
