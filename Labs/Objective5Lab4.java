import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a whole nuber:"):
    userNum = scanner.nextInt();

    if (userNum % 2 == 0) {
      Systemout.println("The number is even.");
    }
    else {
      System.out.println("The number is odd.");
    }
  }
}
