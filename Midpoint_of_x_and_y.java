/*The x,y co-ordinates of the end points of a line are provided as the input.
The program must print the co-ordinates of the mid-point of the line.
Input Format: The first line denotes the x co-ordinate of point 1.
The second line denotes the y co-ordinate of point 1.
The third line denotes the x co-ordinate of point 2.
The fourth line denotes the y co-ordinate of point 2.
Output Format: The first line denotes the x co-ordinate of the mid-point rounded upto 1 decimal place.
The second line denotes the y co-ordinate of the mid-point rounded upto 1 decimal place.
Example Input/Output:
    Input: 10 2 20 5
    Output: 15.0 3.5
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double midx = (x1+x2)/2.0;
        double midy = (y1+y2)/2.0;
        System.out.println(String.format("%.1f",midx));
        System.out.print(String.format("%.1f",midy));
	}
}

