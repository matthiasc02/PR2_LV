package sorting.ue.carts;

import java.util.Comparator;

public class CartUsernameComparator implements Comparator<Cart>{

	@Override
	public int compare(Cart o1, Cart o2) {
		// TODO Auto-generated method stub
		return o1.getUsername().compareTo(o2.getUsername());

	}

}
