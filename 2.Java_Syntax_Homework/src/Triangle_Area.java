import java.util.Scanner;

public class Triangle_Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float x1 = input.nextFloat();
		float y1 = input.nextFloat();
		float x2 = input.nextFloat();
		float y2 = input.nextFloat();
		float x3 = input.nextFloat();
		float y3 = input.nextFloat();
		
		float area = Math.abs(( x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2) ) / 2);
		System.out.println(Math.round(area));
	}

}
