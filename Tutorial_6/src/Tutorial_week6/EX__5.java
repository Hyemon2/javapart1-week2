package Tutorial_week6;

import java.util.Scanner;

public class EX__5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		
		System.out.println("m을 입력하세요 : ");
		int m = sc.nextInt();
		System.out.println("n을 입력하세요 : ");
		int n = sc.nextInt();
		
		int sum=0;
		
		for (int i=m; i<=n; i++) {
			sum+=i;
		}
			System.out.println("m과 n사이 모든 정수의 합 : "+sum);
	}

}
