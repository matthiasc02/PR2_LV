package sorting.ue.carts;

import java.util.ArrayList;
import java.util.Collections;

public class CartDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cart> list1 = new ArrayList<>();
		
		list1.add(new Cart("Seppi", 5, 14, 300));
		list1.add(new Cart("Gerhard", 2, 3, 100));
		list1.add(new Cart("Dredd", 2, 1, 250));
		
		System.out.println("before sorting");
		for (Cart cart : list1) {
			System.out.println(cart);
		}
		
		Collections.sort(list1);
		
		System.out.println("after sorting");
		for (Cart cart : list1) {
			System.out.println(cart);
		}
		
		System.out.println("sort by Username");
		Collections.sort(list1, new CartUsernameComparator());
		for (Cart cart : list1) {
			System.out.println(cart);
		}
		
		System.out.println("sort by Items");
		Collections.sort(list1, new CartTotalItemsComparator());
		for (Cart cart : list1) {
			System.out.println(cart);
		}
			

	}

}
