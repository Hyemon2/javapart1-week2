package Tutorial_week5;
import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("m을 입력하세요 : ");
		int m = sc.nextInt();
		System.out.println("n을 입력하세요 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = m;
		
		while(i<=n) {
			if (i%3==0) {
			sum = sum+i;
			}	
			i++;
		}
		System.out.println("m과 n사이 모든 정수(3의 배수)의 합 : "+sum);
	}

}