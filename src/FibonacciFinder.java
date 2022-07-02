import javax.swing.plaf.synth.SynthProgressBarUI;

public class FibonacciFinder {
	
	public String checkNumber (int number) {
		int n1 = 0, n2 = 1, n3 = 0;
		boolean isFibonacci = (number == 0 || number == 1) ? true : false;
		StringBuilder result = new StringBuilder();

		while(n3<=number) {
			n3 = n1 + n2;
			if(n3==number) {
				isFibonacci = true;
				break;
			}
			n1=n2;    
			n2=n3;
		}
		
		if(isFibonacci) {
			result.append(number + " está na sequência Fibonacci"); 
		} else {
			result.append(number + " não está na sequência Fibonacci");
		}
		return result.toString();
	}
}
