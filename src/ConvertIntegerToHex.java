import java.util.Scanner;




public class ConvertIntegerToHex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int InputInt = input.nextInt();
		String n = Integer.toHexString(InputInt);
		System.out.println(n);
		input.close();
	}

}
