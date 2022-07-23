public class Calculator{

    //constructor method
    public Calculator(){
    
    }
  // method to add two numbers
    public int add(int number1, int number2){
      int total = number1 + number2;
      return total; 
    }
  // method to subtract two numbers
    public int subtract(int number1, int number2){
      int total = number1 - number2;
      return total;
    }
  // method to multiply two numbers 
    public int multiply(int number1, int number2){
      int total = number1 * number2;
      return total; 
    }
  // method to divide two numbers
    public int divide(int number1, int number2){
      int total = number1 / number2;
      return total; 
    }
  // method to find the remainder
    public int modulo(int number1, int number2){
      int total = number1 % number2;
      return total;
    }
  
    public static void main(String[] args){
     System.out.println("Hello, World");
  
     Calculator calc = new Calculator();
  
     System.out.println("5 + 7 = " + calc.add(5, 7));
     System.out.println("45 - 11 = " + calc.subtract(45, 11));
     System.out.println("10 / 5 = " + calc.divide(10, 5));
     System.out.println("32 % 5 = " + calc.modulo(32, 5));
    }
  }
  