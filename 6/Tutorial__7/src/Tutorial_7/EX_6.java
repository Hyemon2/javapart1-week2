package Tutorial_7;

import java.util.Scanner;

public class EX_6 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			int[] sc = new int[30];
			
			System.out.println("������ �Է��ϼ��� : ");
			for(int i=0; i<30; i++) {
				sc[i] = scan.nextInt();
			}
			
			int[] count =new int[10];
			for(int i =0; i<30; i++) {
				int n=sc[i]/10;
				count[n]++;
			}
			System.out.println("90~99 : " + count[9] + "��");
			System.out.println("80~89 : " + count[8] + "��");
			System.out.println("70~79 : " + count[7] + "��");
			System.out.println("60~69 : " + count[6] + "��");
			System.out.println("50~59 : " + count[5] + "��");
			System.out.println("40~49 : " + count[4] + "��");
			System.out.println("30~39 : " + count[3] + "��");
			System.out.println("20~29 : " + count[2] + "��");
			System.out.println("10~19 : " + count[1] + "��");
			System.out.println("0~9 : " + count[0] + "��");
				
				
	}

}
