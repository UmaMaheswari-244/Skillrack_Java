/*The length L, breadth B and height H of a cuboid are passed as input and the program must
print the volume of the cuboid as the output.
Input Format:
	The first line denotes L The second line denotes B The third line denotes H
Output Format:
	The first line denotes the volume of the cuboid.
Example Input/Output:
	Input: 2 4 5
	Output: 40
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		System.out.print(l*b*h);
	}
}
