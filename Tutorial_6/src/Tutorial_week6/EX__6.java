package Tutorial_week6;

import java.util.Scanner;

public class EX__6 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("m을 입력하세요 : ");
				int m = sc.nextInt();
				System.out.println("n을 입력하세요 : ");
				int n= sc.nextInt();
				int sum =0;
				
				for(int i =m; i<=n; i++) {
					if(i%3==0) {
						sum+=i;
					}
				}
				System.out.println("m과 n사이 모든 정수(3의 배수)의 합 : "+sum);
			}
	
}

