/*Two numbers M and N are passed as input. The program must print the numbers from N to M (inclusive of N and M) 
Input Format: 
    The first line denotes the value of M The second line denotes the value of N
Output Format: 
    Numbers from N to M, with each number separated by a space. 
Boundary Conditions: 
    1 < M <= 1000 M < N <= 2000 
Example Input/Output 1: 
    Input: 5 15 
    Output: 15 14 13 12 11 10 9 8 7 6 5 
Example Input/Output 2: 
    Input: 760 777 
    Output: 777 776 775 774 773 772 771 770 769 768 767 766 765 764 763 762 761 760
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for(int i=n;i>=m;i--){
		    System.out.print(i+" ");
		}
	}
}