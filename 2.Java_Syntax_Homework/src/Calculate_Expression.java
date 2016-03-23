import java.util.Scanner;

public class Calculate_Expression {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double grade = (a + b + c) / Math.sqrt(c);
		double formula_1 = Math.pow(( a*a + b*b) / (a*a - b*b), grade);
		double formula_2 = Math.pow((a*a + b*b - c*c*c), a - b);
		double diff = Math.abs((a + b + c)/3 - (formula_1 + formula_2)/2);
		
		System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",formula_1, formula_2, diff);

	}

}
