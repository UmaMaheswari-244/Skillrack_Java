/*If the name N of the athlete and the number of medals M won by the athlete
in a games tournament (like Olympics) are passed as the input,
the program must print the message as "N won M medals"
Example Input/Output 1:
    Input: Phelps 5
    Output: Phelps won 5 medals
*/

import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        System.out.print(str + " won " + n + " medals ");
        }
}
