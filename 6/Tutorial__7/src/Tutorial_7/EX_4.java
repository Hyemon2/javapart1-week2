package Tutorial_7;

import java.util.Scanner;


public class EX_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� �л� ���� �Է��ϼ��� : ");
		int student = sc.nextInt();
		
		int[] scores = new int[student];
		System.out.println("������ �Է��ϼ��� : ");
		for(int i=0; i<student; i++) {
			scores[i] = sc.nextInt(); 
			if (scores[i]==-1) {
				System.out.print("���� �Է� ����");
			}
		}
		int max= scores[0];
		for(int i =1; i<student; i++) {
			if(scores[i]>scores[max]) {
				max = scores[i];
			}
		}
			System.out.println("���� �� ���� ���� ���� : "+max);
		}
	}

