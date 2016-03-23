import java.util.Scanner;

public class Formatting_Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();

		String hex_value = String.format("%0$-10s", Integer.toHexString(a).toUpperCase());
		String binaryValue = Integer.toString(a,2);
		binaryValue = String.format("%10s", binaryValue).replace(' ', '0');

		System.out.printf("%s|%s|%10.2f|%-10.3f|",hex_value,binaryValue,b,c);


	}

}
