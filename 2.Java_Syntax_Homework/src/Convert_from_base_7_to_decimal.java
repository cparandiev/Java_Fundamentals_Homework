import java.util.Scanner;

public class Convert_from_base_7_to_decimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.next();
		int decimalValue = Integer.parseInt(a, 7);
		System.out.print(decimalValue);
	}

}
