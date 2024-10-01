package Tutorial_week5;

import java.util.Scanner;

public class EX_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("m을 입력하세요 : ");
		int m = sc.nextInt();
		System.out.println("n을 입력하세요 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		while(m<=n) {
			sum = sum+m;
			m++;
		}
		System.out.println("m과 n사이 모든 정수의 합 : "+sum);
	}

}
