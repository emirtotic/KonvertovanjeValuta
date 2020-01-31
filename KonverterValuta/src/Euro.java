import java.util.Scanner;

public class Euro {

	Scanner unos = new Scanner(System.in);
	
	private double iznos;
	private double kursE;
	
	public Euro() {
		kursE = getKursE();								
	}

	public void setKursE(double kursE) {
		this.kursE = 117.30;							
	}
	
	public double getKursE() {
		return kursE;
	}
	
	public double kursEvraDanas() {
		kursE = 117.30;									
		return kursE;
	}
	
	public double konvertujUEvre() {
		
		System.out.println("Unesite koliko dinara zelite da konvertujete: ");
		double konvertuj = unos.nextDouble();
		iznos = konvertuj / kursEvraDanas();    
		
		System.out.println("Uneli ste " + konvertuj + " dinara.");
		System.out.println("Iznos u evrima: " + iznos);
		
		return iznos;
	}
	
	public double konvertujUDinare() {
		System.out.println("Koliko evra zelite da zamenite? ");
		double konvertuj = unos.nextDouble();
		iznos = konvertuj * getKursE();
		
		System.out.println("Konvertujem " + konvertuj + " evra u dinare.");
		System.out.println("Iznos je: " + iznos + " dinara.");
		
		return iznos;
	}
	
	public void restartujKonverter() {
		iznos= 0;
		
	}
	
}
