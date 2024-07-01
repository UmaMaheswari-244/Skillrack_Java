/*The number of rows N is passed as the input. The program must print the half pyramid using asterisk *. 
Input Format: 
    The first line contains N. 
Output Format: 
    N lines representing the half pyramid pattern using * (A single space is used to separate the *) 
Boundary Conditions: 
    2 <= N <= 100 
Example Input/Output 1: 
    Input: 5 
    Output: 
    * 
    * * 
    * * * 
    * * * * 
    * * * * * 
 Example Input/Output 2: 
    Input: 3 
    Output: 
    * 
    * * 
    * * * 
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
		    for(int j=0;j<=i;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}