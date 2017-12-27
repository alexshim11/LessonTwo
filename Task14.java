package lesson2;

public class Task14 {

	public static void main(String[] args) {
		problems(20, 23);
		
		}
		public static void problems(int min, int max) {
			int[] numbers = new int[30];

			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = (int) (Math.random() * 100);

			}
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] >= min && numbers[i] <= max) {
					System.out.println(numbers[i]);
				}

			}
		}
}
