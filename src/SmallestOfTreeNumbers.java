import java.util.Scanner;


public class SmallestOfTreeNumbers {
	public static void main (String[] args){
		Scanner sd = new Scanner(System.in);
		
		float[] arr = new float[3];
		arr[0] = sd.nextFloat();
		arr[1] = sd.nextFloat();
		arr[2] = sd.nextFloat();
		 float small = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<small){
				small=arr[i];
			}
		}
		sd.close();
		System.out.println(small);
		
	}
}
