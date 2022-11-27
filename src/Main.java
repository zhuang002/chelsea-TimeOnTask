import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int c = sc.nextInt();
		
		int[] chores = new int[c];
		for (int i=0;i<c;i++) {
			chores[i] = sc.nextInt();
		}
		
		Arrays.sort(chores);
		
		for (int i=0;i<c;i++) {
			t -= chores[i];
			if (t<0) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(c);
	}

}
