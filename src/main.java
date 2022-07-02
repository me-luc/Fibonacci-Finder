import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		FibonacciFinder f = new FibonacciFinder();
		int number;
		
		while(true) {
			number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número e descubra se \nele está na sequência Fibonacci:"));
			JOptionPane.showMessageDialog(null, f.checkNumber(number)); 
		}

	}

}
