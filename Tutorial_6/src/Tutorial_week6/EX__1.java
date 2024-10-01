package Tutorial_week6;
import java.util.Scanner;

public class EX__1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Value = "";
		
		do {
			System.out.println("입력하세요(종료하려면 quit을 입력하세요)");
			Value = sc.nextLine();
			System.out.println("입력하신 값은 "+ Value +"입니다");
		}while(!Value.equals("quit"));
		
		//while문은 조건에 맞지 않으면 반복문을 한번도 실행하지 않지만,
		//do while문은 do문을 적어도 한번은 실행시킨 후 조건에 맞으면 반복한다.
	}

}