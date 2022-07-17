/******************************************************************
 * Name: Dominic DiModugno
 * Date: May 7th, 2022
 * Assignment CIS218 - Week 5  - Final
 * 
 * This program will take 5 numbers from the user in a range of 0-100
 * and determine the largest number, smallest number, the sum
 * of all the numbers, and the average. It also divides the last number
 * by the first number entered. 
 */


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dominic - Final Practical Exam");
         
        Unique arr = new Unique();
        
        arr.getNumbers();

        //Print values in array
        arr.print();

        // Print minimum value
        arr.getSmallest();

        //Print maximum value
        arr.getLargest();

        // Print sum
        arr.sum();

        // Print average
        arr.avg();

        // Print first/last
        arr.firstAndLast();
    
    }
}
