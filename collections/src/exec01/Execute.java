package exec01;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Execute {
		   
	public static void main(String[] args) {
		
		List<CurrentAccount> contas = new ArrayList<>();
		
		contas.add(new CurrentAccount(150.0, "Thullyo", "1.111.111"));
		
		contas.add(new CurrentAccount(200.0, "Breno", "2.222.222"));

		contas.add(new CurrentAccount(500.0, "Alan", "3.333.333"));
	  	    
	    Collections.sort(contas);
	    
	    for (CurrentAccount conta: contas) {
			System.out.println(conta.getNome());
		}
	    
	}
}