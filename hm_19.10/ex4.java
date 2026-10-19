import java.util.Scanner;

public class ex4 {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
        System.out.println("Введи число: ");
        int ch1 = scan.nextInt();
        dow(ch1);

    }

    private static void dow(int a) {
     if(a <= 0) {
      return;
     }
     System.out.println(a);
     dow(a - 1);
    }
}
