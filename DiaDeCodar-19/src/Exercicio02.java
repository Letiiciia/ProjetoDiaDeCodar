import javax.swing.JOptionPane;

public class Exercicio02 {
	public static void main(String[] args) {
		double valorConta = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da conta"));
		
		double valorGarcom = valorConta * 0.10;
		double valorFinal = valorConta + valorGarcom;
		
		String text = "Iae beleza";
		
		
		JOptionPane.showMessageDialog(null, args, text, 0, null);
		
	}
}
