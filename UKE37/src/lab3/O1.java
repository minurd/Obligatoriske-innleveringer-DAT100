package lab3;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O1 {

	public static void main(String[] args) {
		// Beregner og skriver ut trinnskatt. 
		
				String bruttoinntekt= showInputDialog("Skriv inn bruttoinntekt: ");
				
				double Bruttoinntekt= parseDouble(bruttoinntekt);
				
				if(Bruttoinntekt<= 190349) {
					
					double trinnskatt0=(Bruttoinntekt*0);
					
					showMessageDialog(null, "Trinnskatten er: "+trinnskatt0);
					}
					
				else if(Bruttoinntekt>=190350 && Bruttoinntekt<=267899) {
					double trinnskatt1=(Bruttoinntekt*0.017);
					showMessageDialog(null, "Trinnskatten trilhører nivå1 og er: "+trinnskatt1);
				}
				else if(Bruttoinntekt>= 267900 && Bruttoinntekt<=643799) {
					
					double trinnskatt2=(Bruttoinntekt*0.04);
					
					showMessageDialog(null, "Trinnskatten tilhører nivå2 og er: "+trinnskatt2);
					}
				else if(Bruttoinntekt>=643800 && Bruttoinntekt<=969199) {
					double trinnskatt3=(Bruttoinntekt*0.134);
					showMessageDialog(null, "Trinnskatten tihører nivå3 og er: "+trinnskatt3);
				}
				else if (Bruttoinntekt>=969200 && Bruttoinntekt<=1999999) {
					double trinnskatt4=(Bruttoinntekt*0.164);
					showMessageDialog(null,"Trinnskatten tilhører nivå4 og er: "+trinnskatt4);
				}
				else if (Bruttoinntekt>=2000000){
					double trinnskatt5=(Bruttoinntekt*0.174);
					showMessageDialog(null,"Trinnskatten tilhører nivå5 og er: "+trinnskatt5 );
				}
			}
		}
