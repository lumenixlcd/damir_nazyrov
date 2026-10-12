import java.util.Scanner;
	public class HM3 { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
    //Задача 1
    System.out.println("Задача 1");
    System.out.print("Введите ваш возраст: ");
    int age = scanner.nextInt();
    String result = age >= 18 ? "Доступ разрешен" : "Доступ запрещен";
    System.out.println(result);

    //Задача 2
    System.out.println("\nЗадача 2");
    System.out.print("Введите целое число: ");
    int number = scanner.nextInt();
    result = (number % 2 == 0) ? "Четное" : "Нечетное";
    System.out.println(result);
    scanner.nextLine();


    //Задача 6
    System.out.println("\nЗадача 6");
    String password;
    
    do {
        System.out.print("Введите пароль: ");
        password = scanner.nextLine();
    } while (!password.equals("java123"));
    
    System.out.println("Вход выполнен");



    //Задача 7
    System.out.println("\nЗадача 7");
    System.out.print("Введите балл (от 0 до 100): ");
    int score = scanner.nextInt();
    int grade = score >= 90 ? 5 : 
                score >= 75 ? 4 : 
                score >= 60 ? 3 : 2;
                
    System.out.println("Ваша оценка: " + grade);

    scanner.close();
}
}
