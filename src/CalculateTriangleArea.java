import java.util.Scanner;




public class CalculateTriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer a1=input.nextInt();
		Integer a2=input.nextInt();
		Integer b1=input.nextInt();
		Integer b2=input.nextInt();
		Integer c1=input.nextInt();
		Integer c2=input.nextInt();
		
		if (a1 == b1 && b1 == c1 ){
			int area = 0;
			System.out.println(area);		
		}else if (a2== b2 && b2 == c2){
			int area = 0;
			System.out.println(area);	
		}else {
			int area = Math.abs((a1*(b2-c2)+(b1*(c2-a2))+(c1*(a2-b2)))/2);
			System.out.printf("%.3f",(float)area);
		}
	}

}
