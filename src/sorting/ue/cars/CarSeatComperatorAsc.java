package sorting.ue.cars;

import java.util.Comparator;

public class CarSeatComperatorAsc implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		if (o1.getSeats()<o2.getSeats())
			return -1;
		if (o1.getSeats()>o2.getSeats())
			return 1;
		return 0;
	}

}
