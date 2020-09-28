package InterviewQuestions;

import java.util.Scanner;

public class FactorialCaching {

  public static long[] factorial = new long[1000];
  public static int fact = 0;
  static {
    factorial[0] = 1;
  }

  public static long factorial(int x) {
    while(fact < x) {

      factorial[fact + 1] = factorial[fact] * (fact + 1);
      fact++;
    }

    return factorial[x];
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number for which you " +
        "want to calculate factorial -  ");

    System.out.println("Note : \"The number should range " +
        "from 0 to 20\"");

    int number = scanner.nextInt();

    long result = FactorialCaching.factorial(number);

    System.out.println("The factorial of "+ number +" : " + result);

    System.out.println();
    System.out.println("Enter the another number for which you " +
        "want to calculate factorial -  ");

    System.out.println("Note : \"The number should range " +
        "from 0 to "+number+"\"");

    number = scanner.nextInt();

    System.out.println("The factorial after caching is done : "
        + FactorialCaching.factorial[number]);

  }
}
