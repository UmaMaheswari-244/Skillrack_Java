/*The program must accept a string value S and print the reverse of S.
Input Format: The first line denotes the value of S.
Output Format: The first line contains reversed value of S.
Boundary Conditions: Length of string S is from 2 to 100.
Example Input/Output 1:
    Input: abcde
    Output: edcba
Example Input/Output 2:
    Input: look
    Output: kool
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder a = new StringBuilder(s);
		System.out.print(a.reverse().toString());
	}
}
