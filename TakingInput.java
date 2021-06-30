import java.util.*;
public class TakingInput {
    public static void main(String args[]) {
      System.out.println("Enter your name and age?");
      Scanner sc = new Scanner(System.in);
      String Name = sc.nextLine();
      int age = sc.nextInt();
      System.out.println("Name is "+ Name + " and age is "+ age);
    }
}
