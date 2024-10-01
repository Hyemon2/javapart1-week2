package Tutorial_week5;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력(큰 수, 작은 수) :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		while (num1!=num2) {
			if (num1>num2) {
				num1 = num1-num2;
			} else {
				num2 = num2-num1;
			}
			System.out.println("두 수의 최대 공약수는 "+num1+"입니다.");
		}
	
	
	
	}

}
