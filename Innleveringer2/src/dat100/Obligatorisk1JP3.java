package dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Obligatorisk1JP3 {

	public static void main(String[] args) {
		
		String inntektTxt = showInputDialog("Skriv inn bruttoinntekt");
		int inntekt = parseInt(inntektTxt);
		double skatt = 0;
		int trinnskatt = 0;
		
		if (inntekt >= 934051) {
			skatt = 0.1452;
			trinnskatt = 4;
		}
		else if (inntekt <= 934050 && 580651 <= inntekt) {
			skatt = 0.1152;
			trinnskatt = 3;
		}
		else if (inntekt <= 580650 && 230951 <= inntekt) {
			skatt = 0.0241;
			trinnskatt = 2;
		}
		else if (inntekt <= 230950 && 164101 <= inntekt) {
			skatt = 0.0093;
			trinnskatt = 1;
		}
		double fInn = inntekt*(1-skatt);
		showMessageDialog(null, "Din inntekt etter skatt er: " + fInn + "kr, og du er i skattetrinn " + trinnskatt);
	}

}
