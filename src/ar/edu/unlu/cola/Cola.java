package ar.edu.unlu.cola;

public class Cola {
	private Nodo primero = null;
	private Nodo ultimo = null;

	public void meter(Object dato) {
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.setDato(dato);
		if (primero == null) {
			primero = nuevoNodo;
			ultimo = nuevoNodo;
		} else {
			Nodo nodoAux = primero;
			while (nodoAux.getProximo() != null) {
				nodoAux = nodoAux.getProximo();
			}
			nodoAux.setProximo(nuevoNodo);
			ultimo = nuevoNodo;

		}
	}

	public Object sacar() {
		Object dato = "";
		if (!estaVacia()) {
			dato = primero.getDato();
			primero = primero.getProximo();
		}
		return dato;
	}

	public String tieneDatos() {
		if (estaVacia()) {
			return "esta vacia";
		} else {
			return "tiene datos";
		}
	}

	public Boolean estaVacia() {
		if (primero == null) {
			return true;
		} else {
			return false;
		}
	}
}
