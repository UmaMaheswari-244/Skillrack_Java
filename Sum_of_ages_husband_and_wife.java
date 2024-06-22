/*Honeymoon hotel in Simla awards a prize to the youngest couple staying in their hotel.
For this they wish to write a program to calculate the sum of the ages of husband and wife.
Help the hotel by filling in the program code below.
Input Format: The first line denotes the age of the husband.
The second line denotes the age of the wife
Example Input/Output:
    Input: 25 21
    Output: 46
*/

import java.util.*;

class hello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        System.out.print(h+w);
    }
}
