package lesson2;

public class Task11 {

	public static void main(String[] args) {
		int count = 0;
		int[] x = new int[5];
		for (int i = 0; i < x.length; i++) {
			x[i] = i + 1;
			if (x[i] % 3 == 0) {
				count++;
			}
		}
		int[] y = new int[x.length - count];
		for (int i = 0, j = 0; i < x.length; i++) {

			if (x[i] % 3 != 0) {
				y[j] = x[i];
				j++;
			}

		}
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}
	}

}
