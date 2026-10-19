import java.util.Scanner;

public class ex7 {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Введи число: ");
  int ch1 = scan.nextInt();
  int[] numbers = {3, 7, 10};
  System.out.println("Ответ: " + sumArray(numbers, ch1));

 }

 private static int sumArray(int[] a, int b) {
  if(b >= a.length) {
   return 0;
  }
  if(b == a.length - 1) {
   return a[b];
  }
  return a[b] + sumArray(a, b + 1);
 }
}
