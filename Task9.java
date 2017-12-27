package lesson2;

import java.util.Scanner;

public class Task9 {
	/*
	 * 9. Сохранить в массив типа char свою фамилию и имя (размер массива не должен
	 * превышать количество символов в фамилии пробел имени (запрещено использовать
	 * метод toCharArray класса String, однако можно использовать метод charAt() -
	 * т.е. массив char нужно заполнить посимвольно! )
	 */

	public static void main(String[] args) {

		System.out.println("Введите ФИО");
		Scanner scan = new Scanner(System.in);
		String fio = scan.nextLine();

		char fullName[] = new char[fio.length()];
		for (int i = 0; i < fullName.length; i++) {
			fullName[i] = fio.charAt(i);
		}
		scan.close();
		System.out.println(fullName);
	}

}