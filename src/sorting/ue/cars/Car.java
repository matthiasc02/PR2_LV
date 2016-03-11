package sorting.ue.cars;

public class Car implements Comparable<Car>{
	
	private double price;
	private int seats;

	public Car(double price, int seats) {
		super();
		this.price = price;
		this.seats = seats;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Car o) {
		if (this.price < o.price)
			return 1;
		if (this.price > o.price)
			return -1;
		return 0;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", seats=" + seats + "]";
	}

	
	

}
