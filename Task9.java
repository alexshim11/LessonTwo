package lesson2;

import java.util.Scanner;

public class Task9 {
	/*
	 * 9. ��������� � ������ ���� char ���� ������� � ��� (������ ������� �� ������
	 * ��������� ���������� �������� � ������� ������ ����� (��������� ������������
	 * ����� toCharArray ������ String, ������ ����� ������������ ����� charAt() -
	 * �.�. ������ char ����� ��������� �����������! )
	 */

	public static void main(String[] args) {

		System.out.println("������� ���");
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