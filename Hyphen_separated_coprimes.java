/*Two numbers A and B which are co-prime to each other are passed as input.
The program must print the numbers with a hyphen between A and B
Example Input/Output 1:
    Input: 5
           7
    Output: 5-7
Example Input/Output 2:
    Input: 25
           36
    Output: 25-36
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(a+"-"+b);
	}
}
