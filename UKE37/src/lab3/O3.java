package lab3;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class O3 {

	public static void main(String[] args) {
		// Leser inn et heltall n fra brukeren:
		
		String input= showInputDialog("Skriv inn et heltall n >0: ");
		
		//Konverterer input til tall
		int n=parseInt(input);
		
		//Sjekker om n er gyldig 
		 if (n <= 0) {
	            showMessageDialog(null, "Ugyldig, heltallet n må være større enn 0.");
	        } else {
	        	//Beregn n! (n-fakultet)
	        	long fakultet= beregnFakultetet(n);
	        	
	        	//Vis resultatet på skjermen:
	        	showMessageDialog(null,"n! er: "+fakultet);	
	        }
}
	     //Metode for å beregne n-fakultet:
	public static long beregnFakultetet(int n) {
		long fakultet=1;
		for (int i = 2; i <= n; i++) {
            fakultet *= i;
	}
	return fakultet;
}
}