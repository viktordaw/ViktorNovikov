package Calculadora;

/*
 * Un clase para una noda de pila.
 */

class NodoPila {
	public NodoPila abajo;
	public double dato;
	
	public NodoPila(double dato, NodoPila abajo)
	{
		this.dato = dato;
		this.abajo = abajo;
	}
}
