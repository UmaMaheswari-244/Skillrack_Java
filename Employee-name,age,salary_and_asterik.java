/*In ABC corporation, a program must accept the name of an employee,
his age and his salary and print them as output with a line containing 2 asterisks
separating them (refer Example Input/Output given below).
Example Input/Output 1:
    Input: Ramesh 32 25010.56
    Output:
        Ramesh
        **
        32
        **
        25010.56
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		double salary = sc.nextDouble();
		System.out.println(name);
		System.out.println("**");
		System.out.println(age);
		System.out.println("**");
		System.out.println(salary);

	}
}
