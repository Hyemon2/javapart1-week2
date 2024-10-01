package Tutorial_7;

import java.util.Scanner;


public class EX_4 {

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
		int max= scores[0];
		for(int i =1; i<student; i++) {
			if(scores[i]>scores[max]) {
				max = scores[i];
			}
		}
			System.out.println("점수 중 가장 높은 점수 : "+max);
		}
	}

