import java.util.Scanner;

public class Problem_5_Print_a_Character_Triangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		for(int i = 1 ; i <= rows ; i++)
			Print_Line(i);
		for(int i = rows -1 ; i > 0 ; i--)
			Print_Line(i);
	}
	public static void Print_Line(int n){
		for(char c = 'a' ; c < 'a' + n ; c++)
			System.out.print(c + " ");
		System.out.println();
	}

}
