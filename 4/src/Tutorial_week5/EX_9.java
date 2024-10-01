package Tutorial_week5;

public class EX_9 {

	public static void main(String[] args) {
		int i =5;
		
		while (i>=1) {
			int j = 5;
			while(j>=i) {
			System.out.print(" ");
			j--;
		}
			int k=1;
			while(k<=2*i-1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i--;
			
		}
	}

}
