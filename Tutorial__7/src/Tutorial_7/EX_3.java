package Tutorial_7;

import java.util.Scanner;


public class EX_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� �л� ���� �Է��ϼ��� : ");
		int student = scan.nextInt();
		int[] sc = new int[student];
		
		System.out.println("������ �Է��ϼ��� : ");
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
		System.out.print("50�� �л��� ");
		for (int i = 0; i < student; i++) {
		    if (sc[i] == 50) {
		        System.out.print(i);
		        if (i != student - 1 &&sc[i+1]==50) { // i�� ������ �ε����� �ƴ� ���� �޸� ���
		            System.out.print(", ");
		        }
		    }
		}
		System.out.print("�� �л� �Դϴ�.");
	}
}

