package Calculadora;

/**
 * Un clase para una noda de pila.
 * @version 1.0 21/02/2018
 * @author Viktor Novikov
 */

class NodoPila {
	public NodoPila abajo;
	public double dato;
	
	/**
	 * Constructor
	 * @param dato
	 * @param abajo
	 */
	public NodoPila(double dato, NodoPila abajo)
	{
		this.dato = dato;
		this.abajo = abajo;
	}
}
