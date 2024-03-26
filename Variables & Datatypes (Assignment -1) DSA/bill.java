/* Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser you have to output the total cose of the items back to the user as their bill. (Add on: You can also try adding 18% GST tas to the items in the bill as an advanced problem) */

import java.util.Scanner;

public class bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of the pen: ");
        float pen = sc.nextInt();
        System.out.print("Enter the cost of the pencil: ");
        float pencil = sc.nextInt();
        System.out.print("Enter the cost of an eraser: ");
        float eraser = sc.nextInt();
        // Calculate total cost
         
        float totalCost = pen+pencil+eraser;
        System.out.println("The total cost is: " + totalCost);

        //Add on with 18% tax

        float newTotal = totalCost +  (totalCost * .18f);
        System.out.println("The total cost after adding 18% of tax " + newTotal);
        
    }
}
