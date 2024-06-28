/*A number N is passed as the input. The program must print the sum of odd digits in the number N. 
Input Format: 
    The first line denotes the value of N. 
Output Format: 
    The sum of odd digits in number N 
Boundary Conditions: 
    1 <= N <= 9999999 
Example Input/Output 1: 
    Input: 4165 
    Output: 6 
Explanation: 
    The odd digits are 1 ,5 and their sum is 6. 
Example Input/Output 2: 
    Input: 224 
    Output: 0
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while(n<0){
		    int r = n%10;
		    if(r%2!=0){
		        sum+=r;
		    }
		    n/=10;
		}
		System.out.print(sum);
	}
}