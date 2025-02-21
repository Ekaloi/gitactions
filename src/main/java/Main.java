import java.util.Scanner;


public class Main {
  public static void main(String[] args){
    Calculator calc = new Calculator();
    boolean bool = true;
    Scanner scanner = new Scanner(System.in);
    while( bool == true) {
      String input = scanner.nextLine();
      String[] parts = input.split(" ");


      String command = parts[0];
      System.out.println(parts[0]);


      if(command.equals("add")){
        int num1 = Integer.parseInt(parts[1]);
        int num2 = Integer.parseInt(parts[2]);
        System.out.println(calc.add(num1,num2));
      }else if(command.equals("subtract")){
        int num1 = Integer.parseInt(parts[1]);
        int num2 = Integer.parseInt(parts[2]);
        System.out.println(calc.subtract(num1,num2));
      }else if(command.equals("mult")){
        int num1 = Integer.parseInt(parts[1]);
        int num2 = Integer.parseInt(parts[2]);
        System.out.println(calc.multiply(num1,num2));
      }else if(command.equals("div")){
        int num1 = Integer.parseInt(parts[1]);
        int num2 = Integer.parseInt(parts[2]);
        System.out.println(calc.divide(num1,num2));
      }else if(command.equals("binary")){
        int num1 = Integer.parseInt(parts[1]);
        System.out.println(calc.intToBinaryNumber(num1));
      }else if(command.equals("fib")){
        int num1 = Integer.parseInt(parts[1]);
        System.out.println(calc.fibonacciNumberFinder(num1));
      }else if(command.equals("exit")){
        bool = false;
      } else{
        System.out.println("Not a valid command");
      }
    }

  }
}
