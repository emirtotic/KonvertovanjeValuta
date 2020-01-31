import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcija;
		
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("* Opcija 1: Konvertovanje EUR u DIN                       *");
		System.out.println("* Opcija 2: Konvertovanje DIN u EUR                       *");
		System.out.println("* Opcija 3: Konvertovanje USD u DIN                       *");
		System.out.println("* Opcija 4: Konvertovanje DIN u USD                       *");
		System.out.println("* Opcija 5: Konvertovanje CHF (Svajcarski franak) u DIN   *");
		System.out.println("* Opcija 6: Konvertovanje DIN u CHF (Svajcarski franak)   *");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		
		do {
		System.out.println("Unesite opciju: ");
		opcija = scanner.nextInt();
		
		if (opcija == 1) {
			System.out.println("Izabrali ste opciju 1. EUR ---> DIN");
			Euro menjacnica = new Euro();
			menjacnica.kursEvraDanas();
			menjacnica.konvertujUDinare();
		}
		else if (opcija == 2) {
			System.out.println("Izabrali ste opciju 2. DIN ---> EUR");
			Euro menjacnica = new Euro();
			menjacnica.kursEvraDanas();
			menjacnica.konvertujUEvre();
		} 
		else if (opcija == 3) {
			System.out.println("Izabrali ste opciju 3. USD ---> DIN");
			Dolar menjacnica = new Dolar();
			menjacnica.kursDolaraDanas();
			menjacnica.konvertujUDinare();
		}
		else if (opcija == 4) {
			System.out.println("Izabrali ste opciju 4. DIN ---> USD");
			Dolar menjacnica = new Dolar();
			menjacnica.kursDolaraDanas();
			menjacnica.konvertujUDolare();
		}
		else if (opcija == 5) {
			System.out.println("Izabrali ste opciju 5. CHF ---> DIN");
			Swiss menjacnica = new Swiss();
			menjacnica.kursSvajcarcaDanas();
			menjacnica.konvertujUDinare();
		}
		else if (opcija == 6) {
			System.out.println("Izabrali ste opciju 6. DIN ---> CHF");
			Swiss menjacnica = new Swiss();
			menjacnica.kursSvajcarcaDanas();
			menjacnica.konvertujUFranke();
		}
		else {
			System.out.println("Pogresna opcija. Pokusajte ponovo.");   
		}
		
		} while (opcija >= 1 || opcija <= 6);
		
		scanner.close();
	
		
	}

}
