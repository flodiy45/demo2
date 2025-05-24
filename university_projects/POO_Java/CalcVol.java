import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcVol {
	public static void citirelat( int l1, int l2, int i ) throws IOException {
		String linie;
		BufferedReader fluxIntrare = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Introduceti latura 1: ");
		linie = fluxIntrare.readLine();
		l1 = Integer.parseInt(linie);
		System.out.println("Introduceti latura 2: ");
		linie = fluxIntrare.readLine();
		l2 = Integer.parseInt(linie);
		System.out.println("Introduceti inaltimea: ");
		linie = fluxIntrare.readLine();
		i = Integer.parseInt(linie);
		fluxIntrare.close();
	}
	public static int volPar( int  l1, int l2, int i  ) {
		int v=0;
		v= l1 * l2 * i;
		return v;
	}
	public static void main(String[] args) {
		int i, l1, l2,v;
		citirelat(l1,l2,i);
		v= volPar(l1,l2,i);
		System.out.println("Volumul paralelipipedului este: "+ v);

	}

}
