package Tutorial_week6;
import java.util.Scanner;

public class EX__1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Value = "";
		
		do {
			System.out.println("�Է��ϼ���(�����Ϸ��� quit�� �Է��ϼ���)");
			Value = sc.nextLine();
			System.out.println("�Է��Ͻ� ���� "+ Value +"�Դϴ�");
		}while(!Value.equals("quit"));
		
		//while���� ���ǿ� ���� ������ �ݺ����� �ѹ��� �������� ������,
		//do while���� do���� ��� �ѹ��� �����Ų �� ���ǿ� ������ �ݺ��Ѵ�.
	}

}