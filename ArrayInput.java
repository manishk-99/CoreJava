import java.util.*;
public class ArrayInput {
    public static void main(String args[]) {
      System.out.println("Enter array element");
      Scanner sc = new Scanner(System.in);
      int arr[] = new int[5];
      int sum=0;
      for(int i=0;i<5;i++)
      {
          arr[i] = sc.nextInt();
          sum+=arr[i];
      }
      System.out.println("Sum is: "+ sum);
    }
}