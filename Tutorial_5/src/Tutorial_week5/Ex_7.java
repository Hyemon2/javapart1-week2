package Tutorial_week5;
import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("m�� �Է��ϼ��� : ");
		int m = sc.nextInt();
		System.out.println("n�� �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = m;
		
		while(i<=n) {
			if (i%2==0) {
			sum = sum+i;
			}	
			i++;
		}
		System.out.println("m�� n���� ��� ����(¦��)�� �� : "+sum);
	}

}