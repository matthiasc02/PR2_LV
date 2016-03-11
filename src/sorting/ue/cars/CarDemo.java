package sorting.ue.cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> cars = new ArrayList<>();
		
		cars.add(new Car(20_000, 4));
		cars.add(new Car(10_000, 2));
		
		/*
		Car [] cars = {new Car(200000),new Car(10000)};
		*/
		
		System.out.println("before sorting");
		for (Car car : cars) {
			System.out.println(car);
		}
		Collections.sort(cars, new CarSeatComperatorAsc());
		//Arrays.sort(cars);
		
		System.out.println("after sorting");
		for (Car car : cars) {
			System.out.println(car);
		}

	}

}
