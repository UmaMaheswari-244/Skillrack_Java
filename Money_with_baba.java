/*Baba is very kind to beggars and every day Baba donates half of the amount he has when ever a beggar requests him. 
The money M left in Baba's hand is passed as the input and the number of beggars B who received the alms 
are passed as the input. The program must print the money Baba had in the beginning of the day. 
Input Format: 
    The first line denotes the value of M. 
    The second line denotes the value of B. 
Output Format: 
    The first line denotes the value of money with Baba in the beginning of the day. 
Example Input/Output: 
    Input: 100 2 
    Output: 400 
Explanation: 
    Baba donated to two beggars. So when he encountered second beggar he had 100*2 = Rs.200 and when he encountered 1st he had 200*2 = Rs.400.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int b = sc.nextInt();
		int i = m;
		int c=1;
		while(c<=b){
		    i = i*2;
		    c++;
		}
		System.out.print(i);
	}
}