package testpractic;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Scrisoare {
	public static void main(String[ ] args) throws IOException {
		String linie, doc, num;
		int i=0;

		System.out.println("Scrie-ti numele: ");
		BufferedReader fluxIntrare1 = new BufferedReader (new InputStreamReader (System.in));
		num= fluxIntrare1.readLine();
		System.out.println("Scrie in consola:");
		BufferedReader fluxIntrare = new BufferedReader (new InputStreamReader (System.in)); 
		
		do { 
			linie = fluxIntrare.readLine(); 
		    if(i==0) {doc = fluxIntrare.readLine();}
		    i=i+1;
		}while (linie!= num );
        String numef = doc+".txt";
		
        PrintWriter fis = new PrintWriter(new FileWriter(numef));
		while ((linie = fluxIntrare.readLine()) != null)
		           fis.println(linie);

	    fis.close();
		fluxIntrare1.close();
		fluxIntrare.close();
		System.out.println("Scrisoarea a fost scrisa!");
		

	}}
