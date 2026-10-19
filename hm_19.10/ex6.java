import java.util.Scanner;

public class ex6 {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Введи число: ");
  int ch1 = scan.nextInt();
  System.out.println("Ответ: " + fibo(ch1)); 
 }

 private static int fibo(int a) {
  if(a == 0) {
   return 0;
  }
  if(a == 1) {
   return 1;
  }
  return fibo(a - 1) + fibo(a - 2);
 }
}
