import java.io.*;

public class Citiri {

	public static void cautare(int nr, int numere[]) {
		int i,n=0;
		for(i=0;i<100;i++)
			if(nr==numere[i]) n=1;

		if(n==1) System.out.println("numar gasit ");
		else System.out.println("numar nu exista ");
	}

	public static void main(String args[]) throws IOException  {
		int numere[] = new int[100];
		String linie;
		BufferedReader fluxIntrare = new BufferedReader(new InputStreamReader(System.in)); 
		int i=0;
		do {
			System.out.println("Introdu numar: ");
			linie = fluxIntrare.readLine(); 
			numere[i] = Integer.parseInt(linie);
			i++;
		} while (numere[i-1] != 0);

		System.out.println( "numarul cautat: ");
		linie = fluxIntrare.readLine(); 
		int nr = Integer.parseInt(linie);
		cautare(nr, numere);
	}
}