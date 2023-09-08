package lab3;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {

	public static void main(String[] args) {
	// Karakter og poengsum
		
		boolean gyldig=true;
		
		
		//Forløkke for å kunne lese inn karakteren fra 10 studenter, eller skrive feilmelding
		
		for (int i=1; i<=10; i++) {
			//Leser inn poengsum fra brukeren.
		String poengTxt= showInputDialog("Skriv inn poengsummen din: ");
		//konverterer poensum til heltall.
		int poengsum =parseInt(poengTxt);
		//Kontroll på innlesingen slik at ugylig poengsum må leses inn på nytt.
		if(poengsum>100 || poengsum<0) {
			gyldig=false;
			showMessageDialog(null,"Ugyldig poengsum, prøv igjen. ");
		}
		
		//Skriver ut karakter ut ifra poengsum på bakgrunn av betingelse. 
		
		if(100>=poengsum && poengsum >=90)
			showMessageDialog(null, "Poengsummen tilsvarer karakter A");
		else if (89>=poengsum && poengsum >=80)
			showMessageDialog(null, "Poengsummen tilsvarer karakter B");
		else if (79>=poengsum && poengsum >=60)
			showMessageDialog(null, "Poengsummen tilsvarer karakter C");
		else if (59>=poengsum && poengsum >=50)
			showMessageDialog(null, "Poengsummen tilsvarer karakter D");
		else if (49>=poengsum && poengsum >=40)
			showMessageDialog(null, "Poengsummen tilsvarer karakter E");
		else if (39>= poengsum && poengsum >=0)
			showMessageDialog(null, "Poengsummen tilsvarer karakter F");
		else 
			showMessageDialog(null,"Feilmelding");
	}

}
}
