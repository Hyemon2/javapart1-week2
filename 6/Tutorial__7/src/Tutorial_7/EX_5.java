package Tutorial_7;

import java.util.Scanner;


public class EX_5 {

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
		System.out.print("���ĵ� �迭 : ");
		for(int i =0; i<student; i++) {
			System.out.print(scores[i]);
			if(i<student-1) {
				System.out.print(", ");
			}
		}
	}

}
