package Tutorial_7;

public class EX_1 {

	public static void main(String[] args) {
		int[] scores = {10,20,30,40,50};
		
		System.out.print("점수들은 ");
		for(int i =0; i<scores.length; i++ ) {
			System.out.print(scores[i]);
			if (i<scores.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print(" 입니다.");
	}

}
