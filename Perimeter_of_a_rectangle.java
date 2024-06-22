/*The length L and breadth B of a rectange are passed as input.
The program must calculate the perimeter of the rectangle and
print the perimeter as the output. Both L and B are positive integers.
Input Format: The first line denotes the length L.
The second line denotes the breadth B.
Example Input/Output:
    Input: 20 10
    Output: 60
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(2*(l+b));
	}
}
