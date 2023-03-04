import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String func = in.next();
    StringBuilder builder = new StringBuilder();
    Calculator calc = new Calculator();
    int a, b;
    switch(func){
      case "add":
        a = in.nextInt();
        b = in.nextInt();
        builder.append("Output: ").append(calc.add(a,b));
        break;
      case "sub":
        a = in.nextInt();
        b = in.nextInt();
        builder.append("Output: ").append(calc.subtract(a,b));
        break;
      case "multiply":
        a = in.nextInt();
        b = in.nextInt();
        builder.append("Output: ").append(calc.multiply(a,b));
        break;
      case "divide":
        a = in.nextInt();
        b = in.nextInt();
        builder.append("Output: ").append(calc.divide(a,b));
        break;
      case "fib":
        a = in.nextInt();
        builder.append("Output: ").append(calc.fibonacciNumberFinder(a));
        break;
      case "binary":
        a = in.nextInt();
        builder.append("Output: ").append(calc.intToBinaryNumber(a));
        break;
    }
    System.out.println(builder.toString());
    in.close();
  }
}