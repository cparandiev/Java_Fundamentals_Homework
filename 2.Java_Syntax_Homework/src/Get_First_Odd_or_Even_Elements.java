import java.util.Scanner;

public class Get_First_Odd_or_Even_Elements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] array = input.nextLine().split(" ");
		String[] commands = input.nextLine().split(" ");
		
		int n = Integer.parseInt(commands[1]);
		
		Boolean isEven = false;
		if(commands[2].contains("even"))
			isEven = true;
		
		int[] Integers = new int[array.length];
		for(int i = 0 ; i < array.length ; i++)
			Integers[i] = Integer.parseInt(array[i]);
		
		int[] result = FirstOddOrEven(n, Integers, isEven);
		for(int i = 0 ; i < result[result.length - 1] ; i++)
			System.out.print(result[i] + " ");

	}
	
	private static int[] FirstOddOrEven(int n , int a[], Boolean isEven)
	{
		int[] output = new int[n + 1];
		
		if(isEven)
		{
			int j = 0;
			for(int i = 0 ; i < a.length && j < n; i++)
				if(a[i] % 2 == 0)
					output[j++] = a[i];
			output[n] = j;
		}
		else
		{
			int j = 0;
			for(int i = 0 ; i < a.length && j < n; i++)
				if(a[i] % 2 == 1)
					output[j++] = a[i];
			output[n] = j;
		}
		
		return output;
	}

}
