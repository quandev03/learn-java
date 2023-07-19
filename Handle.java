import java.util.Scanner;

public class Handle extends Thread {
  public final static String input(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Do you want to continue enter contend?(y/n): ");
    String answer = scanner.next();
    while(answer == "n" && answer == "y"){
      System.out.println("Do you want to continue enter contend?(y/n): ");
      answer = scanner.next();
    }
    return answer;
  }

}
