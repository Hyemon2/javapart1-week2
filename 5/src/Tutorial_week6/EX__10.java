package Tutorial_week6;

import java.util.Scanner;

public class EX__10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		
		for(int i=0; i<5; i++) {
		System.out.print("성적 입력 : ");
		score[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<5; i++) {
			sum += score[i];
		}
		System.out.println("5명 점수의 총 합은 : "+sum+"입니다.");
	}
	
	}


