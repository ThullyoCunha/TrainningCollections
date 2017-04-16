package curso;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

    public static void main(String[] args) {

        Collection<String> alunos = new HashSet<>();
        alunos.add("Alan araujo");
        alunos.add("Thullyo Cunha");
        alunos.add("Breno Calado");
        alunos.add("Sergio Endrigo"); 
        
        System.out.println(alunos);    
        
        for(String aluno: alunos) {
            System.out.println(aluno);
        }
        
        System.out.println(alunos.size());
    }
}