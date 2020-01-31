import java.util.Scanner;

public class Dolar {

	
Scanner unos = new Scanner(System.in);
	
	private double iznos;
	private double kursD;
	
	public Dolar() {
	
	}

	public void setKursD(double kursD) {
		this.kursD = kursD;
	}
	
	public double getKursD() {
		return kursD;
	}
	
	public void kursDolaraDanas() {
		kursD = 102.02;					
		System.out.println("Kurs Dolara danas je: " + kursD + " dinara.");
	}
	
	public double konvertujUDolare() {
		
		System.out.println("Unesite koliko dinara zelite da konvertujete: ");
		double konvertuj = unos.nextDouble();
		iznos = iznos + (konvertuj / getKursD());
		
		System.out.println("Uneli ste " + konvertuj + " dinara.");
		System.out.println("Iznos u americkim dolarima je: " + iznos);
		
		return iznos;
	}
	
	public double konvertujUDinare() {
		System.out.println("Koliko dolara zelite da zamenite? ");
		double konvertuj = unos.nextDouble();
		iznos = iznos + (konvertuj * getKursD());
		
		System.out.println("Konvertujem " + konvertuj + " americkih dolara u dinare.");
		System.out.println("Iznos je: " + iznos);
		
		return iznos;
	}
	
	public void restartujKonverter() {
		iznos= 0;
		
	}
}
