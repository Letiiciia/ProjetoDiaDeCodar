import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


//import com.sun.tools.javac.code.Attribute.Array;

public class Exe1Collection {
	public static void main(String[] args) {
		System.out.println("Exercicio 01");
		ArrayList<String> cores = new ArrayList<>();

		cores.add("Azul");
		cores.add("Rosa");
		cores.add("Vermelho");
		cores.add("Amarelo");

		System.out.println(cores);
		
		//percorrer uma lista utilizando get
		for(int i = 0; i < cores.size(); i++) {
			System.out.println(cores.get(i));
		}
		System.out.println("Exercicio 02");
		//cores.set(3, "Verde");
		cores.add(0, "Marrom");
		cores.add("Marrom");
	
		
		System.out.println("Exercicio 03");
		cores.remove("Rosa");
		
		System.out.println("Exercicio 04");
		cores.remove(2);
		System.out.println(cores);
		
		System.out.println("Exercicio 05");
		ArrayList<String> copiaCores = new ArrayList<>();
		copiaCores.addAll(0, cores);
		System.out.println(copiaCores);
		
		System.out.println("Exercicio 06");
		Collections.sort(cores);
		System.out.println(cores);
		
		System.out.println("Exercicio 07");
	
		//Esse for ele percorre o arraylist e gera um numero a partir do Math.random então ele pegar aleatoriamente um numero e este numero se converte no index(posição) então retorna a cor que está na posição
		for(int i = 0; i < 1; i++) {
			int index = (int)(Math.random() * cores.size());
			System.out.println(cores.get(index));
		}
		
		System.out.println("Exercicio 08");
		Collections.reverse(cores);
		System.out.println(cores);
		
		System.out.println("Exercicio 09");
		HashMap<String, Integer> timesFut = new HashMap<String, Integer>();
		
		timesFut.put("Brasil", 6);
		timesFut.put("Espanha", 2);
		timesFut.put("Alemanha", 1);
		timesFut.put("França", 4);
		
		System.out.println(timesFut);
		
		System.out.println("Exercicio 10");
		
		timesFut.put("India", 2);
		timesFut.put("Japão", 6);
		timesFut.put("Argentina", 10);
		timesFut.put("Austrália", 5);
		
		System.out.println(timesFut);
		
		System.out.println("Exercicio 11");
		System.out.println(timesFut.keySet());
		
		for(String key : timesFut.keySet()) {
			System.out.println(key + "-" + timesFut.get(key));
		}
		
	}
}
