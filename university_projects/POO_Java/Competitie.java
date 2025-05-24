import java.io.BufferedReader;
import java.io.InputStreamReader;

abstract class Sportiv {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected double inaltimea;
	public abstract int setVarsta();
	public  void afisareDate ( String numePers, String prenumePers, int varstaPers, double inaltimeaP ) {
		nume= numePers;
		prenume= prenumePers;
		varsta= varstaPers;
		inaltimea= inaltimeaP;		
	}}
class JucatorTenis extends Sportiv {
	public int setVarsta() { return varsta;}
	public JucatorTenis( String numePers, String prenumePers, int varstaPers,double inaltimeaP) {
		nume= numePers;
		prenume= prenumePers;
		varsta= varstaPers;
		inaltimea= inaltimeaP;
	}
	public JucatorTenis( String numePers, String prenumePers) {
		nume= numePers;
		prenume= prenumePers;
	}
}
class PilotRaliu extends Sportiv {
	public int setVarsta() { return varsta;}
}
class JucatorTenisCamp extends JucatorTenis {
	protected int nr_asuri;
	int nr;
	public int setVarsta() { return varsta;
	}


	public JucatorTenisCamp ( String numePers, String prenumePers) {
		super(numePers, prenumePers);
		nr_asuri=1;
	}
	public JucatorTenisCamp ( String numePers, String prenumePers, int varstaPers,double inaltimeaP, int nr_asuri) {
		super(numePers,prenumePers,varstaPers,inaltimeaP); 
		nr=nr_asuri;
	}
	public  void afisareDate ( String numePers, String prenumePers, int varstaPers, double inaltimeaP, int nr_asuri ) {
		nume= numePers;
		prenume= prenumePers;
		varsta= varstaPers;
		inaltimea= inaltimeaP;	
		nr= nr_asuri;
	}

	class JucatorTenisMasa extends JucatorTenis {

	}

	public class Competitie {
		public static void main(String arg[]) {
			JucatorTenisCamp c1= new JucatorTenisCamp("Olaru", "Andrei");
			JucatorTenisCamp c2= new JucatorTenisCamp("Oli", "Alex", 22, 1.8, 4);
			JucatorTenisCamp c3= new JucatorTenisCamp("Palcu", "Adi");
			JucatorTenisCamp c4= new JucatorTenisCamp("Olaru", "Doru", 21,2, 3);
			int varsta;
			String linie;
			BufferedReader fluxIntrare = new BufferedReader(new InputStreamReader(System.in)); 
			System.out.println("Varsta: ");
			linie = fluxIntrare.readLine(); 
			varsta = Integer.parseInt(linie); 
			fluxIntrare.close();
			c1.setVarsta();
			c1.afisareDate();
		}}
