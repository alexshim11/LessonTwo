package lesson2;

public class Task6 {
	/*6. Подсчитать количество чётных и нечётных элементов в массиве из задания 3
	Количество чётных и количество нечётных вывести на экран*/
	
	public static void main(String[] args) {
		int x[] = new int[100];

		for (int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * 100);

		}
		int j = 0;
		int k = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				j++;

			} else {
				k++;
			}

		}
		System.out.println(j);
		System.out.println(k);
	}
}