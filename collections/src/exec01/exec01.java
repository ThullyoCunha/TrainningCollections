package exec01;

import java.util.List;
import java.util.ArrayList;

public class exec01 {
	
	public static void main(String[] args) {
		
		//Criando uma lista e determinando que o tipo do objeto que ela vai conter será String;
		List<String> list = new ArrayList<>();
		 
		list.add("Alan");
		list.add("Breno");
		list.add("Thullyo");
		
		//Listando quantos objetos a arraylist possui;
		System.out.println(list.size());
		
		//Listando os objetos da arraylist;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
	    }
		
		//Listando os objetos da arraylist toString;
		System.out.println(list);
		

	}

}