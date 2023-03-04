import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String func;
    Calculator calc = new Calculator();
    int a, b;
    System.out.println("Calculator here, I do things");
    loop: while((func = in.next()) != "q"){
      switch(func){
        case "add":
          a = in.nextInt();
          b = in.nextInt();
          System.out.println(calc.add(a, b));
          break;
        case "sub":
          a = in.nextInt();
          b = in.nextInt();
          System.out.println(calc.subtract(a,b));
          break;
        case "multiply":
          a = in.nextInt();
          b = in.nextInt();
          System.out.println(calc.multiply(a, b));
          break;
        case "divide":
          a = in.nextInt();
          b = in.nextInt();
          System.out.println(calc.divide(a, b));
          break;
        case "fib":
          a = in.nextInt();
          System.out.println(calc.fibonacciNumberFinder(a));
          break;
        case "binary":
          a = in.nextInt();
          System.out.println(calc.intToBinaryNumber(a));
          break;
        default:
          break loop;
      }
    }
    System.out.println("bye");
    in.close();
  }
}