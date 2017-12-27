package lesson2;

public class Task13 {
	
	//метод пузырька

	public static void main(String[] args) {
		int[] rnd = new int[10];
		for (int i = 0; i < rnd.length; i++) {
			rnd[i] = (int) (Math.random() * 100);
			System.out.print(rnd[i] + " ");
		}
		System.out.println(" ");

		for (int i = rnd.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (rnd[j] > rnd[j + 1]) {
					int t = rnd[j];
					rnd[j] = rnd[j + 1];
					rnd[j + 1] = t;

				}
			}
		}
		for (int i = 0; i < rnd.length; i++) {
			System.out.print(rnd[i] + " ");
		}
		for (int i = rnd.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (rnd[j] < rnd[j + 1]) {
					int t = rnd[j];
					rnd[j] = rnd[j + 1];
					rnd[j + 1] = t;
				}
			}
			
					}
		System.out.println();
		for (int i = 0; i < rnd.length; i++) {
			System.out.print(rnd[i] + " ");
		}
	}
}