package testpractic;
import java.io.*;
public class Varsta{
    public static void main(String[] argv){
        int varsta = 0;
        int ore = 0;
        try{

        System.out.println("Ce varsta ai?(in ani)");
        BufferedReader fisier = new BufferedReader(new InputStreamReader(System.in));
        String linie = fisier.readLine();
        varsta = Integer.parseInt(linie);
        System.out.println("Cate ore vrei sa folosim pt calcul?");
        linie = fisier.readLine();
        ore = Integer.parseInt(linie);

        }catch( IOException e ) 
          { System.out.println("Nu a-ti introdus un nr valid!!"); }
          
        varsta += (int) ore/8760;
        System.out.println( "Peste " + ore + " ore vei avea " + varsta + " de ani" );
        
    }
}
