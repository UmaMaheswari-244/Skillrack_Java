/*A string S is passed as the input. The program must print the number of upper case letters in the string S.
Input Format: The first line denotes the value of S.
Output Format: The first line contains the count of upper case letters in S.
Boundary Conditions: Length of S is from 3 to 100.
Example Input/Output 1:
    Input: ViCtorY
    Output: 3
Example Input/Output 2:
    Input: zookeeper
    Output: 0
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++){
		    char ch = s.charAt(i);
		    if(ch>='A' && ch<='Z'){
		        c++;
		    }
		}
		System.out.print(c);
	}
}
