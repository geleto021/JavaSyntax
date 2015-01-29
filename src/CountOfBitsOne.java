import java.util.Scanner;


public class CountOfBitsOne {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	int count = Integer.bitCount(a);
	System.out.println(count);
	}

}
