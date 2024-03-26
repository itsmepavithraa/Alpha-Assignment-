/* Question 2: In a program, input the side of the square you have to output the area of the square (Hint: Area of the square (side*side)) */

import java.util.Scanner;

public class sqrarea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter the side of the square: "));
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of the square is: " + area);
    }
}
