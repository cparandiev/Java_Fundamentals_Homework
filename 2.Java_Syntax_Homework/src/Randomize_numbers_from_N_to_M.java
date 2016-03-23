import java.util.Scanner;
import java.util.Random;

public class Randomize_numbers_from_N_to_M {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		if(N > M)
		{
			int temp = N;
			N = M;
			M = temp;
		}
		
	    for(int j = N ; j <= M ; j++){
	    	Random rand = new Random();
	    	int randomNum = rand.nextInt((M - N) + 1) + N;
	    	System.out.print(randomNum + " ");
	    }

	}

}
