/*A number N is passed as input. Another number X is also passed as input. The program must print first X multiples of the number N. 
Input Format: 
    The first line denotes the value of N 
    The second line denotes the value of X 
Output Format: 
    The first X multiples of N, each separated by a space. 
Boundary Conditions: 
    1 <= N <= 999999 1 <= X <= 1000 
Example Input/Output 1: 
    Input: 4 6 
    Output: 4 8 12 16 20 24 
Example Input/Output 2: 
    Input: 22 3 
    Output: 22 44 66
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		for(int i=1;i<=x;i++){
		    System.out.print(i*n +" ");
		}
	}
}