import java.util.Scanner;

public class Problem_8_Get_Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float sum_of_3_numbers = scan.nextFloat();
		sum_of_3_numbers += scan.nextFloat();
		sum_of_3_numbers += scan.nextFloat();
		System.out.format("Average : %.2f" ,sum_of_3_numbers/3 );
	}

}
