/*A single character C is passed as the input to the program. Based on the value of C, the output must be as given below. 
The value of C can be one among the following - y Y n N - When the input is y or Y, then the output must be yes - 
When the input is n or N, then the output must be no - 
When the input is any other value, the output must be invalid 
Input Format: 
    The first line denotes the value of C. 
Output Format: 
    The first line contains either yes or no 
Example Input/Output 1: 
    Input: y 
    Output: yes 
Example Input/Output 2: 
    Input: N 
    Output: no 
Example Input/Output 3: 
    Input: h 
    Output: invalid
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch=='y' || ch=='Y') System.out.print("yes");
		else if(ch=='n' || ch=='N') System.out.print("no");
		else System.out.print("invalid");
	}
}