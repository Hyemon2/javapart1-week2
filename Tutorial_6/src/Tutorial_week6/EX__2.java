package Tutorial_week6;
import java.util.Scanner;
public class EX__2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum;
		double avg;
		
		for(int i =1; i<=3; i++) {
			
		System.out.println("���� ���� ���� ������ ������ �Է��ϼ��� : ");
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int math=sc.nextInt();
		
		sum = kor+eng+math;
		avg = (double)sum/3;
		
		System.out.println("����� "+avg+"�Դϴ�.");	
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
}
}