package curso;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteFuncionario {
	
	public static void main(String args[]) {

		Funcionario f1 = new Funcionario("Carlos Ferraz", 50);
	    Funcionario f2 = new Funcionario("Nelson Rosa", 51);
	    Funcionario f3 = new Funcionario("Vinicius Garcia", 35);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
	    funcionarios.add(f1);
	    funcionarios.add(f2);
	    funcionarios.add(f3);

	    Iterator<Funcionario> iterador = funcionarios.iterator();
	    
	    while (iterador.hasNext()) {
	    	System.out.println(iterador.next().getNome());
	    } 
	}
}
