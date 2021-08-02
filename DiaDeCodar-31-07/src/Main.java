
public class Main {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Leticia");
		
		Pessoa p2 = new Pessoa("Leticia");
		
		System.out.println(p1.equals(p2));
		
		System.out.println(p2.hashCode());
		
		
	}
}
