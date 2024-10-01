package Tutorial_week5;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor, eng, math,sum;
		double avg;
		
		
		while(true) {
			System.out.println("국어 영어 수학 순서로 점수를 입력하세요 : ");
			kor=sc.nextInt();
			eng=sc.nextInt();
			math=sc.nextInt();
			
			sum = kor+eng+math;
			avg = (double)sum/3;
			
			System.out.println("평균은 "+avg+"입니다.");
			System.out.println("프로그램을 종료하시려면 음수를 입력해주세요.");
			int mi = sc.nextInt();
			if (mi==-1) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			} 
		}
		sc.close();
 }
}
