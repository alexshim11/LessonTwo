package lesson2;

public class Task3 {

	// 3. «аполнить массив размером из 100 элементов случайными целыми числами
	public static void main(String[] args) {
		int x[] = new int[100];

		for (int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * 100);
			System.out.println(x[i]);
		}

	}
}