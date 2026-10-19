import java.util.Scanner;

public class ex3 {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
        System.out.println("Введи первое число: ");
        int ch1 = scan.nextInt();
        System.out.println("Введи второе число: ");
        int ch2 = scan.nextInt();
        System.out.println("Ответ: " + gcd(ch1, ch2));
 }

 private static int gcd(int a, int b) {
  if (b == 0) {
   return a;
  }
  return gcd(b, a % b);
 }
}
