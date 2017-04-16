package curso;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExecMap {
	
    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Alan", 23);
        nomesParaIdade.put("Thaina", 21);
        nomesParaIdade.put("Breno", 24);
        
        Set<String> chaves = nomesParaIdade.keySet();    
        for (String nome : chaves) {
            System.out.println(nome);
        }
        
        Collection<Integer> valores = nomesParaIdade.values();
        for (Integer idade : valores) {
            System.out.println(idade);
        }
        
        Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
        for (Entry<String, Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
    }

}
