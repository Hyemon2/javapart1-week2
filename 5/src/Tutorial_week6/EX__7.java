package Tutorial_week6;

import java.util.Scanner;

public class EX__7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("m�� �Է��ϼ��� : ");
		int m = sc.nextInt();
		System.out.println("n�� �Է��ϼ��� : ");
		int n= sc.nextInt();
		int sum =0;
		
		for(int i =m; i<=n; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("m�� n���� ��� ����(¦��)�� �� : "+sum);
	}

	}

