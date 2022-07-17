import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Unique {
    // Class properties
    private int[] Member;
    
    // Constructor
    public Unique(int[] member) {
        Member = member; 
    }

    public Unique() {
    }

    // Method to get 5 values from user and store in array. 
    public void getNumbers() throws Exception {
        // initialize scanner to take input from user
        Scanner input = new Scanner(System.in);
        boolean cont = true; 
        do {
            try{
                int[] member = new int[5];
                int temp = -1;  
                // loop to store items in array
                for(int i = 0; i < 5; i++) {
                System.out.print("Please enter an integer: ");
                temp = input.nextInt();
                
                    // Check to see if the variable is between 0 and 100 
                    if (temp < 0 || temp > 100){
                        throw new Exception("You must enter a value between 0 and 100... Try again");   
                    
                    } 
                    // if input passes checks, store in unique array 
                    else {
                        member[i] = temp;
                        temp = -1; //reset temp
                    }
                }
                Member = member; 
                cont = false;    
            }
            catch (Exception e) {
                // print exception that was caught
                input.nextLine();
                // tell the user what they did wrong
                System.out.println("You must enter a unique number between 0 and 100... Try again"); 
            }
        } while (cont); 
         
    }

    // function to print items in array
    public void print() {
        System.out.println("Unique Values Entered: %n");
        for (int i = 0; i < Member.length; i++) {
            System.out.printf("%d ", Member[i]); 
        }
    }

    // function to get the smallest number in the array
    public void getSmallest() {
        // use Arrays to sort member[] from < to >
        Arrays.sort(Member);

        // print smallest number in array
        System.out.printf("\nMin value entered: %d%n", Member[0]);
    }

    // function to sort and print the largest number in the array
    public void getLargest() {
        int size = Member.length - 1;
        Arrays.sort(Member); 
        
        // print largest number in array
        System.out.printf("Max value entered: %d%n", Member[size]);
    }

    // function to get the sum of all items in the array
    public void sum() {
        int size = Member.length;
        int total = 0;

        for(int i = 0; i < size; i++) {
            total += Member[i];
        }

        // Print the sum
        System.out.printf("Sum of values entered is: %d%n", total);  
    }

    //function to get the average of all items in the array
    public void avg() {
        int size = Member.length;
        int total = 0;

        for(int i = 0; i < size; i++) {
            total += Member[i];
        }

        int avg = total / size;
        
        // print average of array
        System.out.printf("Average of values entered is: %d%n", avg);
    }

    // function to divide the first and last item in array 
    public void firstAndLast() {
        int size = Member.length - 1;
        Arrays.sort(Member); 

        try {
            int total = Member[0] / Member[size];
             // Print first/last
            System.out.printf("Last value divided by first value: %d%n", total);
        }
        catch (ArithmeticException e) {
            // print exception
            System.err.printf("%Exception: %s / by zero%n", e); 
        }
    }

    public int[] getMember() {
        return Member; 
    }


}
