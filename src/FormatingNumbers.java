import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;


public class FormatingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		String aHex = Integer.toHexString(a);
	String	aBin = String.format("%10s",  Integer.toBinaryString(a)).replace(' ', '0');
	//	String aBin = Integer.toBinaryString(a);
		//String aliginFormat = "| %-10s | %10s | %10s | %-10s |";
		System.out.format("|%-10s|%10s|%10.2f|%-10.3f| %n" , aHex, aBin, b, c);
		System.out.println(aHex +" "+ aBin);
input.close();

	}

}
