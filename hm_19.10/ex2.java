import java.util.Scanner;

public class ex2 {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Введи число: ");
  int ch1 = scan.nextInt();
  System.out.println("Ответ: " + suma(ch1));
 }

 private static int suma(int n) {
  if(n < 1) {
   return 0;
  }
  return n + suma(n - 1);
 }
}
