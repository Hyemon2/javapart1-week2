package Tutorial_week6;

import java.util.Scanner;

public class EX__10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		
		for(int i=0; i<5; i++) {
		System.out.print("���� �Է� : ");
		score[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<5; i++) {
			sum += score[i];
		}
		System.out.println("5�� ������ �� ���� : "+sum+"�Դϴ�.");
	}
	
	}


