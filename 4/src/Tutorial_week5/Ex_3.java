package Tutorial_week5;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor, eng, math,sum;
		double avg;
		
		
		while(true) {
			System.out.println("���� ���� ���� ������ ������ �Է��ϼ��� : ");
			kor=sc.nextInt();
			eng=sc.nextInt();
			math=sc.nextInt();
			
			sum = kor+eng+math;
			avg = (double)sum/3;
			
			System.out.println("����� "+avg+"�Դϴ�.");
			System.out.println("���α׷��� �����Ͻ÷��� ������ �Է����ּ���.");
			int mi = sc.nextInt();
			if (mi==-1) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			} 
		}
		sc.close();
 }
}
