/*Question 1:  In a program, input 3 numbers: A, B, C. You have to output the average these numbers(Hint: Average of N numbers is sum of those number divided by N) */

import java .util.*;
public class average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of C:");
        int c = sc.nextInt();
        
        int avg = (a+b+c)/3;
        System.out.println("The Average of the given 3 Numbers is: " + avg);

    }
}
