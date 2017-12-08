import java.util.Scanner;

public class Reverse {
	public static  Scanner sc;

	public static void main(String[] args) {

		/*
		 * replace the space for space author : surya
		 */
		String str = "surya pratap singh ";
		String strWithoutSpace = str.replaceAll("\\s", "");

		System.out.println(strWithoutSpace);
		/*
		 * 
		 * reverse of a string author : surya
		 */

		char[] strArray = str.toCharArray();

		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i]);
		}

		/*
		 * count the number of words in a string
		 * 
		 * author : surya
		 */
		{
			System.out.println("Enter the string");

			sc = new Scanner(System.in);

			String s = sc.nextLine();

			String[] words = s.trim().split(" ");

			System.out.println("Number of words in the string = " + words.length);
		}

		
	}
}
