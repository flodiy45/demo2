
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class Matrice {
		int m[][] = new int[10][10];
		
		public static void afisMat ( int m[][], String mat) {
			int i, j;
			System.out.println("Matricea "+mat);
			for ( i=0; i<m.length; i++) {
				for ( j=0 ; j<m[i].length; j++)
					System.out.print(m[i][j]+" ");
				System.out.println("");
			}
		}

		public static void genereazaElMat( int m[][] )  throws IOException  {
			int i, j;
			String linie;
			BufferedReader fluxIntrare = new BufferedReader (new InputStreamReader (System.in));
			for ( i=0; i<m.length; i++)
				for ( j=0 ; j<m[i].length; j++)
					{System.out.println( "m[i][j]= ");
			         linie = fluxIntrare.readLine();
			         m[i][j]= Integer.parseInt(linie);}
		}
		public static int sumaM( int m[][] ) {
			int i,j;
			int s=0;
			for ( i=0; i<m.length; i++)
				for ( j=0 ; j<m[i].length; j++)
					{ if  (i%2!=0 && j%2==0 )  s= s+m[i][j];}
			return s;
		}
		public static void main(String[] args) throws IOException   {
			int m[][] = new int[5][5]; 
			int s=0;
			genereazaElMat(m);
			afisMat(m, "M");
			s= sumaM(m);
			System.out.println("suma elementelor din cerinta: "+ s);
		}

	}