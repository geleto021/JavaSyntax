import java.util.Scanner;


public class PointsInsideFigure {
public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);
	float a = input.nextFloat();
	float b = input.nextFloat();
	
	if(a<12.5 || a>22.5 || b<6 || b>13.5 ||(a>17.5&&a<20&&b>8.5)){
	System.out.println("Outside");
			
	} else {
		System.out.println("Inside");
	
	}
	input.close();
	
}
}
