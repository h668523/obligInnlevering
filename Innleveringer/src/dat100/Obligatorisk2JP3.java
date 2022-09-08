package dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Obligatorisk2JP3 {

	public static void main(String[] args) {
		
		String karakter = "ugyldig poengsum";
		for (int i = 0; i < 10; i++) {
			
		String poengTxt = showInputDialog("Hvor mange poeng?");
		int poeng = parseInt(poengTxt);
		
		while(poeng<0||100<poeng) {
			poengTxt =showInputDialog("Oppgi en gyldig poengsum");
			poeng = parseInt(poengTxt);
		}
		
		if (90 <= poeng && poeng <= 100) {
			karakter = "A";
		} 
		else if (80 <= poeng && poeng <= 89) {
			karakter = "B";
		}
		else if (60 <= poeng && poeng <= 79) {
			karakter = "C";
		}
		else if (50 <= poeng && poeng <= 59) {
			karakter = "D";
		}
		else if (40 <= poeng && poeng <= 49) {
			karakter = "E";
		}
		else if (0 <= poeng && poeng <= 39) {
			karakter = "F";
		}
		 System.out.println("Karakter: " + karakter);
		
		}

		

	}

}
