package StringProject;
import java.util.Scanner; 

public class RunString 
{

	public static void main(String[] args) 
	{
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		String string = unos.nextLine(); 
		
		string = string.replaceAll("\\s", "");
		
		StringManagement metoda = new StringManagement(); 
		System.out.println("Duzina stringa iznosi " + metoda.duzinaStringa(string));
		metoda.parniKarakteri(string);
		metoda.neparniKarakteri(string);
		System.out.println("\nU stringu ima " + metoda.brojUpperKaraktera(string) + " velikih slova. ");
		System.out.println("\nU stringu ima " + metoda.brojLowerKaraktera(string) + " malih slova ");
		metoda.ostaliKarakteri(string);
		
		unos.close();

	}

}
