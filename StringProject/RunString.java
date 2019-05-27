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
		metoda.duzinaStringa(string);
		metoda.parniKarakteri(string);
		metoda.neparniKarakteri(string);
		metoda.brojUpperKaraktera(string);
		metoda.brojLowerKaraktera(string);
		metoda.ostaliKarakteri(string);
		
		unos.close();

	}

}
