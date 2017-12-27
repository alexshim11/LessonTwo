package lesson2;

public class Task7 {
	//7. Найти и вывести на экран максимальный / минимальный элемент из задания 3

	public static void main(String[] args) {
		int x[] = new int[100];

		for (int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * 100);

		}
		int min = x[0];
		int max = x[0];

		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
			if (x[i] < min) {
				min = x[i];

			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}