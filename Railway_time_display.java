/*Hours HH, Minutes MM and Seconds SS in 24 hour format are passed as input to the program.
The program must print the time in HH:MM:SS format.
Example Input/Output 1:
    Input: 9
           54
           12
    Output: 9:54:12
Example Input/Output 2:
    Input: 23
           21
           59
    Output: 23:21:59
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		System.out.print(h+":"+m+":"+s);

	}
}
