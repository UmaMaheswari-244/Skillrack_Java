/*Two numbers M and N are passed as the input. The program must print the sum of even numbers from M to N (inclusive of M and N). 
Input Format: 
    The first line denotes the value of M 
    The second line denotes the value of N 
Output Format: 
    Sum of even numbers from M to N (inclusive of M and N). 
Boundary Conditions: 
    1 <= M <= 9999999 M < N <= 9999999 
Example Input/Output 1: 
    Input: 2 11 
    Output: 30 
Explanation: 
    The even numbers from 2 to 11 are 2 4 6 8 10 Their sum is 30. 
Example Input/Output 2: 
    Input: 189 200
    Output: 1170
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		for(int i=m;i<=n;i++){
		    if(i%2==0){
		        sum+=i;
		    }
		}
		System.out.print(sum);
		
	}
}