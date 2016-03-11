package sorting.ue.carts;

public class Cart implements Comparable<Cart>{
	
	private String username;
	private int numArticles;
	private int totalltems;
	private double totalAmount;
	
	public Cart(String username, int numArticles, int totalltems, double totalAmount) {
		super();
		this.username = username;
		this.numArticles = numArticles;
		this.totalltems = totalltems;
		this.totalAmount = totalAmount;
	}

	public String getUsername() {
		return username;
	}

	public int getNumArticles() {
		return numArticles;
	}

	public int getTotalltems() {
		return totalltems;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setNumArticles(int numArticles) {
		this.numArticles = numArticles;
	}

	public void setTotalltems(int totalltems) {
		this.totalltems = totalltems;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Cart [username=" + username + ", numArticles=" + numArticles + ", totalltems=" + totalltems
				+ ", totalAmount=" + totalAmount + "]";
	}

	@Override
	public int compareTo(Cart o) {
		if (this.totalAmount<o.totalAmount)
			return -1;
		if (this.totalAmount>o.totalAmount)
			return 1;
		return 0;
	}
	
	

}
