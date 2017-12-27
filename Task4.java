package lesson2;

public class Task4 {
	//4. Вывести из массива (задание 3) все чётные элементы на экран

	public static void main(String[] args) {
		int x[] = new int[100];

		for (int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * 100);

		}
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				System.out.println(x[i]);
			}

		}

	}
}