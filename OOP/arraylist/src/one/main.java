package one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		String[] friendsArray = new String[4];//velicina je fiksirana
		String[] friendsArray2 = {"John", "Filip"};
		
		
		ArrayList<String> friendsArrayList = new ArrayList<>();//ctr shift o, ubaci importe
		//liste nemaju fiksiranu velicinu
		ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Filip"));
		
		//Arrays.asList("John", "Filip");//ovo funkcionira ali nemogu onda mijenjati nista
		//liste mogu samo referencirane tipove korisiti,wrappere koristim
		
		System.out.println(friendsArray2[1]);
		System.out.println(friendsArrayList2.get(1));//koristim metode 
		
		System.out.println(friendsArray2.length);//field
		System.out.println(friendsArrayList2.size());//metoda
		
		
		friendsArrayList2.add("Mithch");
		System.out.println(friendsArrayList2.size());//dodali smo na kraj
		
		
		//set element
		friendsArray2[0] = "Carl";
		friendsArrayList2.set(0, "Carls");
	
		//nemogu micati elemente u obicnim poljima dok to mogu u listama
		
		//arraylista koristi toString
		System.out.println(friendsArray2);
		System.out.println(friendsArrayList2);
		
		//liste su superiornije i puno lakse za raditi
		
		
		//add(index, "Bla"), pomice sve kada ubacimo taj Bla
		
		
		List<Integer> list = List.of(1, 2, 3);
		//list.add(4); //throws an Exception
		//list.set(0, 5); //throws an Exception
		System.out.println(list);
		//nemozemo ni mijenjati velicinu ni elemente
		
		
		
		
		list = Arrays.asList(1, 2, 3);
		//list.add(4); //throws an Exception
		list.set(0, 5);//radi
		System.out.println(list);
		//nemozemo mijenjati velicinu ali mozemo elemente
	}
}
