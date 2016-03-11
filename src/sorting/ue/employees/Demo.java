package sorting.ue.employees;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee [] Array = {new Employee(4, "Fred", 20_000, "IT"), new Employee(2, "Frida", 10_000, "BO"), new Employee(3, "David", 15_000, "B2B")};
		System.out.println("before sort");
		for (Employee employee : Array) {
			System.out.println(employee);
		}
		
		Arrays.sort(Array);
		System.out.println("after sort");
		for (Employee employee : Array) {
			System.out.println(employee);
		}
	
	
	}

}
