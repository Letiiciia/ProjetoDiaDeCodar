import java.util.HashSet;
import java.util.Iterator;

public class Set {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet nomes = new HashSet();
		
		nomes.add("Deia");
		nomes.add("Le");
		nomes.add("Di");
		
		System.out.println(nomes);
		
		HashSet <String> nomes1 = new HashSet<>();
		nomes1.add("Deia");
		nomes1.add("Le");
		nomes1.add("Di");
		
		nomes1.remove("Deia");
		System.out.println(nomes1);
		
		Iterator <String> itr = nomes.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Lambda
		for(Object x: nomes) {
			System.out.println(x);
		}
		
		nomes.clear();
		System.out.println(nomes);
		
		System.out.println(nomes.isEmpty());
		
		System.out.println(nomes.size());
		
		HashSet<String> nomes2 = new HashSet<>();
		
		nomes2 = (HashSet<String>)nomes1.clone();
		
		System.out.println(nomes2);
		
		System.out.println(nomes2.hashCode());
		
		HashSet <Integer> n = new HashSet<>();
		
		n.add(2);
		n.add(3);
		
		System.out.println(n.hashCode());
		
		System.out.println(nomes1.equals(nomes2));
	}
}
