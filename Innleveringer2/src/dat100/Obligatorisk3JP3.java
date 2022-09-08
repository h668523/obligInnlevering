package dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Obligatorisk3JP3{

	public static void main(String[] args) {
		
		String n1 = showInputDialog("Gi et tall");
		int n = parseInt(n1);
		
		for (int i = n; i > 1; i--) {
				n = n*(i-1);
		}
		showMessageDialog(null, n);
		
	}

}
