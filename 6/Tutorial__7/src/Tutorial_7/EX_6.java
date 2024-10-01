package Tutorial_7;

import java.util.Scanner;

public class EX_6 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			int[] sc = new int[30];
			
			System.out.println("점수를 입력하세요 : ");
			for(int i=0; i<30; i++) {
				sc[i] = scan.nextInt();
			}
			
			int[] count =new int[10];
			for(int i =0; i<30; i++) {
				int n=sc[i]/10;
				count[n]++;
			}
			System.out.println("90~99 : " + count[9] + "명");
			System.out.println("80~89 : " + count[8] + "명");
			System.out.println("70~79 : " + count[7] + "명");
			System.out.println("60~69 : " + count[6] + "명");
			System.out.println("50~59 : " + count[5] + "명");
			System.out.println("40~49 : " + count[4] + "명");
			System.out.println("30~39 : " + count[3] + "명");
			System.out.println("20~29 : " + count[2] + "명");
			System.out.println("10~19 : " + count[1] + "명");
			System.out.println("0~9 : " + count[0] + "명");
				
				
	}

}
