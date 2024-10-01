package Tutorial_week5;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("성적 입력 : ");
	int score = sc.nextInt();
	int number = score/10;
	String grade = "";
	
	
	switch(number) {
	case 10:
		grade ="A";
		break;
	case 9:
		grade ="A";
		break;
	case 8:
		grade ="B";
		break;
	case 7:
		grade ="C";
		break;
	case 6:
		grade="D";
		break;
	default :
		grade="F";
		break;	
	}
	System.out.println("당신의 학점은 "+grade+"입니다.");
	}

}
