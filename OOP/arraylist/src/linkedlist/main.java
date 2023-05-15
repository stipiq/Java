package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add("Petar");
		names.add("Josip");
		names.add("Mateo");
		//lista funcionira uz pomoc pointera/referenci, dvostruko referenciranje, na iduci i prethodni element
		
		System.out.println(names.get(0));
		//linked lista ne moze direktrno doci do podatka, vec ide po redu
		
		
		
		names.add(1,"Ivan");
		//linked lista je bolja kad moramo dodati neke elemente, samo ubaci izmedju referenci
		//dok arraylista mora sve kopirati i pomicati, linked samo promijeni reference 
		
		
		//oba implementiraju LIST sucelje, tako da su dosta slicna
		
		
		ArrayList<String> namesAL = new ArrayList<>();
		names.add("Petar");
		names.add("Josip");
		names.add("Mateo");
		//Pozadina: kada stvaram ovu listu, velicina se stavlja na 10, ako predjem tu velicinu 
		//onda se automatski kreira nova lista i prepisuje stara u tu novu s vise mjesta
		
		System.out.println(namesAL.get(0));
		//arrayliste moze doci do bilo kojeg podatka u sekundi
		

	}

}
