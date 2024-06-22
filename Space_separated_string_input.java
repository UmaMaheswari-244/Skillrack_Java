/*A sentence S is passed as input with one or more spaces in between the words in it.
The program must accept S and print it as the output.
Boundary Conditions: 1 <= Length of S <= 100
Example Input/Output 1:
    Input:
        Good Morning. Please have a cup of coffee.
    Output:
        Good Morning. Please have a cup of coffee.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    System.out.print(str);
	}
}
