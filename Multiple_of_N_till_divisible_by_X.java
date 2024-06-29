/*Two numbers N and X are passed as input. The program must print the multiples of N (starting from 1) 
and must stop when the multiple is divisible by X. 
Input Format: 
    The first line denotes the value of N. 
    The second line denotes the value of X. 
Output Format: 
    The multiples of N, each separated by a space. 
Boundary Conditions: 
    1 <= N <= 9999 1 <= X <= 999999 
Example Input/Output 1: 
    Input: 5 8 
    Output: 5 10 15 20 25 30 35 40 
Explanation: 
    When 40 is reached, as 40 is divisible by 8, we stop the program execution. 
Example Input/Output 2: 
    Input: 12 22 
    Output: 12 24 36 48 60 72 84 96 108 120 132
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
        int m = n;
        boolean f = true;
        while(f){
            System.out.print(m + " ");
            if(m%x==0){
                f = false;
            }
            m+=n;
        }
    }
