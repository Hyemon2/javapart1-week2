package Tutorial_7;

import java.util.Scanner;


public class EX_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총 학생 수를 입력하세요 : ");
		int student = sc.nextInt();
		
		int[] scores = new int[student];
		System.out.println("점수를 입력하세요 : ");
		for(int i=0; i<student; i++) {
			scores[i] = sc.nextInt(); 
			if (scores[i]==-1) {
				System.out.print("점수 입력 종료");
			}
		}
		for (int i = 0; i<student-1; i++) {			
			int max=i;
			
			for(int j =i+1; j<student; j++) {
				if(scores[j]>scores[max]) {
					max =j;
				}
			}
				int temp = scores[max];
				scores[max] = scores[i];
				scores[i] = temp;
			}
		System.out.print("정렬된 배열 : ");
		for(int i =0; i<student; i++) {
			System.out.print(scores[i]);
			if(i<student-1) {
				System.out.print(", ");
			}
		}
	}

}
