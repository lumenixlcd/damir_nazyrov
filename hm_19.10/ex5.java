import java.util.Scanner;

public class ex5 {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Введи число: ");
  int ch1 = scan.nextInt();
  chup(ch1);
 }

 private static void chup(int n) {
  if(n <= 0) {
   return;
  }
  chup(n - 1);
  System.out.println(n);
 }
}
