/*Chintoo runs a shop near a school and hence sells a lot of pencils. 
Chintoo wants to write a program to find the number of pencils sold every day. 
The program will accept the number of pencils at N the beginning of the day 
and the number of pencils E at the end of the day (N >= E). 
The program must print the number of pencils sold on that particular day. 
Input Format: The first line denotes N The second line denotes E 
Output Format: The first line denotes the number of pencils sold on that day. 
Example Input/Output: 
    Input: 40 12 
    Output: 28
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		System.out.print(n-p);
	}
}