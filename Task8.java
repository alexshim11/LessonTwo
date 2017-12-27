package lesson2;

public class Task8 {
	//8. Найти максимальный и минимальный элемент среди чётных/нечётных элементов массива задания 3

	public static void main(String[] args) {
		int x[] = new int[100];

		for (int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * 100);

		}
		int maxEvenNumber = x[0];
		int minEvenNumber = x[0];
		int maxOddNumber = x[0];
		int minOddNumber = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				if (x[i] > maxEvenNumber)
					maxEvenNumber = x[i];
				if (x[i] < minEvenNumber)
					minEvenNumber = x[i];
			}
			else {
				if (x[i] > maxOddNumber)
					maxOddNumber = x[i];
				if (x[i] < minOddNumber)
					minOddNumber = x[i];
			}
		}
		System.out.println(maxEvenNumber);
		System.out.println(minEvenNumber);
		System.out.println(maxOddNumber);
		System.out.println(minOddNumber);
	}

}
