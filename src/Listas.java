import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Paulo");
		list.add("José");
		list.add("Pâmela");
		list.add(2, "Patric");
		
		System.out.println("Número de elementos tem na lista: " + list.size());
		
	
		System.out.println("--------------------------------------------------");
		for (String x : list) {
			System.out.println(x);	
		}
		
		System.out.println("--------------------------------------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);	
	}
		System.out.println("--------------------------------------------------");
		System.out.println("Incerir o Bob: " + list.indexOf("Bob"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);					
	}
		
		String nome = list.parallelStream().filter(x -> x.charAt(0) == 'I').findFirst().orElse(null);
		System.out.println("--------------------------------------------------");
		System.out.println(nome);

	}
}
