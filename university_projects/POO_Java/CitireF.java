package lab7;
import java.io.*;
class CitireF {

	public static void main(String[] args) throws IOException {

		String cuv,linie;

		System.out.println("Da-ti nume fisierului de intrare: ");
		BufferedReader flux_intrare_1 = new BufferedReader(new InputStreamReader(System.in));
		cuv = flux_intrare_1.readLine();
		PrintWriter fis_i = new PrintWriter(new FileWriter(cuv));

		System.out.println("Da-ti nume fisierului de iesire: ");
		BufferedReader flux_intrare_2 = new BufferedReader(new InputStreamReader(System.in));
		String nume_fisier_iesire =flux_intrare_2.readLine(); // citim o linie de la tastatura si o stocam intr-o variabila "nume_fisier_iesire"
		PrintWriter fis = new PrintWriter(new FileWriter(nume_fisier_iesire));

		linie = flux_intrare_1.readLine();
		fis.println(linie); // variabila linie o scriem in fisierul text de iesire 
		System.out.println("Succes!");
		fis.close();
		fis_i.close();
		flux_intrare_1.close();
		flux_intrare_2.close();


	}

}
