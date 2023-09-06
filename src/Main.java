import ar.edu.unlu.cola.Cola;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola miCola = new Cola();
		System.out.println(miCola.tieneDatos());
		miCola.meter("azul");
		miCola.meter("verde");
		miCola.meter("rojo");
		System.out.println(miCola.tieneDatos());
		System.out.println(miCola.sacar());
		System.out.println(miCola.sacar());
		miCola.meter("celeste");
		miCola.meter("naranja");
		System.out.println(miCola.sacar());
		System.out.println(miCola.sacar());
	}

}
