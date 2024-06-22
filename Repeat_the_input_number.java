/*Nitish is studying in fifth standard and he wants to write a program
which will accept an input number N and then print the number with the message "You entered N".
Help Nitish by completing the program. Please note that the output is case sensitive
and hence Y in You must be in upper case.
Boundary Conditions: 0 <= N <= 100
Example
Input/Output 1:
    Input: 50
    Output: You entered 50
Example
Input/Output 2:
    Input: 4
    Output: You entered 4
*/

import java.util.*;

public class hello{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print("You entered " + N);
    }
}
