import java.util.Scanner;

public class ex1 {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Введи факториал: ");
  int fac = scan.nextInt();
  System.out.println("Ответ: " + factorial(fac));
 }

 private static int factorial(int n) {
  if(n == 0 || n == 1) {
   return 1;
  }
  return n * factorial(n - 1);
 }
}
