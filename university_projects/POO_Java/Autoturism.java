package l8;
import java.util.*;
public class Autoturism {
	int viteza;
	String model;
	public Autoturism(int v, String m) {
		model=m;
		viteza=v;
	}
	public String toString() { return " Masina este un " + model + " cu viteza de "+ viteza; }
	public static void afiseaza(List lista) {
		Iterator iteratorMasini = lista.iterator();
		System.out.println("Lista masini : ");
		while( iteratorMasini.hasNext()) {
			System.out.println("-> " + iteratorMasini.next() );
		}

	}
	public static void main(String args[]) { 
		Autoturism a1= new Autoturism( 130, "ford");
		Autoturism a2= new Autoturism( 135, "vw");
		Autoturism a3= new Autoturism( 110, "fiat");
		List lista = new ArrayList();
		lista.add(a1); lista.add(a2); lista.add(a3);
		afiseaza(lista);
	}


}
