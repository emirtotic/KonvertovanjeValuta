import java.util.Scanner;

public class Swiss {

	
Scanner unos = new Scanner(System.in);
	
	private double iznos;
	private double kursS;
	
	public Swiss() {
	
	}

	public void setKursS(double kursS) {
		this.kursS = kursS;
	}
	
	public double getKursS() {
		return kursS;
	}
	
	public void kursSvajcarcaDanas() {
		kursS = 106.7234;														
		System.out.println("Kurs franka (CHF) danas je: " + kursS + " dinara.");
	}
	
	public double konvertujUFranke() {
		
		System.out.println("Unesite koliko dinara zelite da konvertujete: ");
		double konvertuj = unos.nextDouble();
		iznos = iznos + (konvertuj / getKursS());
		
		System.out.println("Uneli ste " + konvertuj + " dinara.");
		System.out.println("Iznos u svajcarskim francima je: " + iznos);
		
		return iznos;
	}
	
	public double konvertujUDinare() {
		System.out.println("Koliko franaka zelite da zamenite? ");
		double konvertuj = unos.nextDouble();
		iznos = iznos + (konvertuj * getKursS());
		
		System.out.println("Konvertujem " + konvertuj + " CHF u dinare.");
		System.out.println("Iznos je: " + iznos);
		
		return iznos;
	}
	
	public void restartujKonverter() {
		iznos = 0;
		
	}
}
