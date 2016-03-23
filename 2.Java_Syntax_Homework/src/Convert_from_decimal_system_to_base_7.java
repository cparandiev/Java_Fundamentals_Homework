import java.util.Scanner;

public class Convert_from_decimal_system_to_base_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		String base_7 = Integer.toString(a,7);
		System.out.print(base_7);
	}

}
