import java.util.Scanner;

public class Problem_6_Sum_numbers_from_1_to_N {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Long sum = 0L;
		while(n > 0)
			sum+=n--;
		System.out.println(sum);
	}
}
