import java.util.Scanner;

public class Problem_7_Ghetto_Numeral_System {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] Ghetto = {"Gee","Bro","Zuz","Ma","Duh","Yo","Dis","Hood","Jam","Mack"};
		String number = scan.nextLine();
		StringBuilder output = new StringBuilder();
		for(int i = 0 ; i < number.length() ; i++)
			output.append(Ghetto[Integer.parseInt(number.substring(i, i+1))]);
		System.out.println(output);
	}

}
