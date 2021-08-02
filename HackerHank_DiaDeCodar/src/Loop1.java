import java.util.Scanner;

public class Loop1 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o numero N");
		n = scan.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			
			int resultado = n * i;
			
			System.out.println(n + " x " + i + " = " + resultado);
		}		
}}
