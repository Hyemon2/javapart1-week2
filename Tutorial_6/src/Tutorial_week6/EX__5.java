package Tutorial_week6;

import java.util.Scanner;

public class EX__5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		
		System.out.println("m�� �Է��ϼ��� : ");
		int m = sc.nextInt();
		System.out.println("n�� �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		int sum=0;
		
		for (int i=m; i<=n; i++) {
			sum+=i;
		}
			System.out.println("m�� n���� ��� ������ �� : "+sum);
	}

}
