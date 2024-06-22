/*The program must accept two numbers X and Y and then print their HCF/GCD.
Input Format: The first line denotes the value of X. The second line denotes the value of Y.
Output Format: The first line contains the HCF of X and Y.
Boundary Conditions: 1 <= X <= 999999 1 <= Y <= 999999
Example Input/Output 1:
    Input: 30 40
    Output: 10
Example Input/Output 2:
    Input: 15 10
    Output: 5
*/


import java.util.*;
public class Hello {

    static int gcd(int x, int y){
        while(y!=0){
            int r = x%y;
            x=y;
            y=r;
        }
        return x;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.print(gcd(x,y));
	}
}
