import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		FibonacciFinder f = new FibonacciFinder();
		int number;
		
		while(true) {
			number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número e descubra se \nele está na sequência Fibonacci:"));
			System.out.println(f.checkNumber(number));
			JOptionPane.showMessageDialog(null, f.checkNumber(number));
		}

	}

}
