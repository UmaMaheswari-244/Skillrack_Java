/*Shannon Lin lives in Taiwan and wants to write a program to greet visitors by their name N
with the message "Hi N, Welcome to Taiwan!". Help Shannon by completing the given program.
Boundary Conditions: Length of N is less than 100.
Example
Input/Output 1:
     Input: Brian
     Output: Hi Brian, Welcome to Taiwan!
Example Input/Output 2:
     Input: Laveena
     Output: Hi Laveena, Welcome to Taiwan!
*/

import java.util.*;

public class hello{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Hi " + str + ", Welcome to Taiwan!");
    }
}
