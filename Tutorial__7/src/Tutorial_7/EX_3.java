package Tutorial_7;

import java.util.Scanner;


public class EX_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("총 학생 수를 입력하세요 : ");
		int student = scan.nextInt();
		int[] sc = new int[student];
		
		System.out.println("점수를 입력하세요 : ");
		int count =0;
		for(int i=0; i<student; i++) {
			int score = scan.nextInt();
			if (score == -1) {
				break;
			}
			 if (score >= 1 && score <= 100) {
	                sc[count] = score;
	                count++;
	                continue;
	            }
			sc[i]=score;
		}
		System.out.print("50인 학생은 ");
		for (int i = 0; i < student; i++) {
		    if (sc[i] == 50) {
		        System.out.print(i);
		        if (i != student - 1 &&sc[i+1]==50) { // i가 마지막 인덱스가 아닐 때만 콤마 출력
		            System.out.print(", ");
		        }
		    }
		}
		System.out.print("번 학생 입니다.");
	}
}

