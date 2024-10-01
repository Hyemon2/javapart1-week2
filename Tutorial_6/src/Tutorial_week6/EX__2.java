package Tutorial_week6;
import java.util.Scanner;
public class EX__2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum;
		double avg;
		
		for(int i =1; i<=3; i++) {
			
		System.out.println("국어 영어 수학 순서로 점수를 입력하세요 : ");
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int math=sc.nextInt();
		
		sum = kor+eng+math;
		avg = (double)sum/3;
		
		System.out.println("평균은 "+avg+"입니다.");	
		}
		System.out.println("프로그램이 종료되었습니다.");
}
}