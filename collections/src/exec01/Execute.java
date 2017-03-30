package exec01;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Execute {
		   
	public static void main(String[] args) {
		
		List<CurrentAccount> contas = new ArrayList<>();
		
		
		
		CurrentAccount c1 = new CurrentAccount(150.0, "Thullyo", "1.111.111");
		
		CurrentAccount c2 = new CurrentAccount(200.0, "Breno", "2.222.222");

		CurrentAccount c3 = new CurrentAccount(500.0, "Alan", "3.333.333");
	    
	    contas.add(c1);
	    contas.add(c3);
	    contas.add(c2);
	    
	    Collections.sort(contas);
	    
	    for (CurrentAccount conta: contas) {
			System.out.println(conta.getNome());
		}
	    
	}
}