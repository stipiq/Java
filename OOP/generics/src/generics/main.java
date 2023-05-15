package generics;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		Printer<Integer> printer = new Printer<>(23);
		printer.print();
		Printer<Double> doublePrinter = new Printer<>(32.45);
		doublePrinter.print();
		
		//genericsi koristimo kako bi napravili klase koje primaju svakakve tipove
		
		//<T extends BlaBla & BlaBlaBla> bounded generics
		//T moze extendad jednu klasu, i beskonacno sucelja, ali prvo moram napisati 
		//da naslijedjuje klasu pa onda sucelja, bitan je poredak
		
		//GENERIC METHOD:
		shout("John", 34);
		shout(57, "ksalf");
		
		
		//OPERATOR ?
		List<Integer> intList = new ArrayList<>();
		intList.add(0);
		printList(intList);
		//NE FUKCIONIRA, java nece prepoznati koji tip treba uzeti,
		//moram onda koristii ?
	
		
		
		
		List<String> stringList = new ArrayList<>();//nemogu inicijalizirati LIST, tj new List jer je to sucelje
		stringList.add("Ivan");
		//printList2(stringList);//neda jer string ne extenda Number class
	
	}
	
	
	
		private static <T, V> T shout(T thingToShout, V ostalo) {
			System.out.println(thingToShout +"!!!");
			System.out.println(ostalo +"!!!");
			return thingToShout;
			//za metodu uzimam argumente nepoznatog referenciranog tipa, moze ih biti vise
			//kako bih rekao javi da je to generics, moram prije return tipa staviti operator i unutra
			//tipove koje koristim, takodjer mogu vratiti tip generics
		}
		
		
		
		//OPERATOR ?
//		private static void printList(List<Object> myList) {
//			System.out.println();
//		}
		
		
		private static void printList(List<?> myList) {
			System.out.println();
		}
		
		
		
		//? mozemo boundati taj operator tako da kazemo da nesto extenda
		private static void printList2(List<? extends Number> myList) {
			System.out.println(myList);
		}
		
		
		
		
		
	
}
