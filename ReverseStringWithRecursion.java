import java.util.Scanner;

public class ReverseStringWithRecursion {
	
	public static void main(String[] args) {
		//String str="hello";
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter String to Reverse");
		str=scan.nextLine();
		scan.close();
		String reversedString = reverseString(str);
		System.out.println(str);
		System.out.println(reversedString);
	}

	 static String reverseString(String str) {
		if(str.isEmpty()) {
			return str;
		}
		
		return reverseString(str.substring(1))+str.charAt(0);
	}

}
