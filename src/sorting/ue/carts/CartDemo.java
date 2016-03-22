package sorting.ue.carts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CartDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cart> carts = new ArrayList<>();
		
		carts.add(new Cart("Seppi", 5, 14, 300));
		carts.add(new Cart("Gerhard", 2, 3, 100));
		carts.add(new Cart("Dredd", 2, 1, 250));
		
		System.out.println("before sorting");
		for (Cart cart : carts) {
			System.out.println(cart);
		}
		
		Collections.sort(carts);
		
		System.out.println("after sorting");
		for (Cart cart : carts) {
			System.out.println(cart);
		}
		
		System.out.println("sort by Username");
		Collections.sort(carts, new CartUsernameComparator());
		for (Cart cart : carts) {
			System.out.println(cart);
		}
		
		System.out.println("sort by Items");
		Collections.sort(carts, new CartTotalItemsComparator());
		for (Cart cart : carts) {
			System.out.println(cart);
		}
		
		// Anonyme Compare Methode!
		//noch nicht fertig gemacht, muss erst gemacht werden
		/*
		Collections.sort(ArrayList<Cart>, new Comparator<Cart>);
		*/

	}
	
}


