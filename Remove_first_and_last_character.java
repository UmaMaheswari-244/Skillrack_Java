/*The program must accept a String value S and remove the first and last characters.
Input Format: The first line denotes the value of S.
Output Format: The first line contains the string value after removing the first and last characters in the string S.
Boundary Conditions: Length of S is from 3 to 200.
Example Input/Output 1:
    Input: Lion
    Output: io
Example Input/Output 2:
    Input: jug
    Output: u
*/

import java.util.*;

class hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(s.substring(1,s.length()-1));
    }
}
