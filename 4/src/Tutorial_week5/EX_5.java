package Tutorial_week5;

import java.util.Scanner;

public class EX_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("m�� �Է��ϼ��� : ");
		int m = sc.nextInt();
		System.out.println("n�� �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		while(m<=n) {
			sum = sum+m;
			m++;
		}
		System.out.println("m�� n���� ��� ������ �� : "+sum);
	}

}
