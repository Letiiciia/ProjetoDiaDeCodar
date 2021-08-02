import java.util.ArrayList;
import java.util.Iterator;

public class List {
 public static void main(String[] args) {
	 ArrayList<String> nomes = new ArrayList<>();
	 
	 nomes.add("Le");
	 nomes.add("Deia");
	 nomes.add("Di");
	 
	 System.out.println(nomes);
	 
	 Iterator<String> it = nomes.iterator();
	 
	 System.out.println(it.next());
	 System.out.println(it.next());
	 System.out.println(it.next());
	 
	 //nomes.clear();
	 System.out.println(nomes.isEmpty()); 
	 
 }
}
