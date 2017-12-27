package lesson2;

public class Task1_2 {

	// 1. Заполнить массив и вывести массив
	// 2. Заполнить массив и вывести массив наоюорот

	
	public static void main(String[] args) {
		// 1.

		int[] x = new int[5];
		for (int i = 0; i < x.length; i++) {

			x[i] = i + 1;

			System.out.print(x[i]);
			
		}
		System.out.println("");
		// 2/
		int[] y = new int[6];
		for (int t = 5; t < y.length && t > 0; t--) {
			y[t] = t - 1;
			System.out.print(y[t]);
		}

	}
}
