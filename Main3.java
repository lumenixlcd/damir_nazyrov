public class Main3 { 
	public static void main(String[] args) { 
	int[] numbers = new int[args.length];
    for (int i = 0; i < args.length; i++) {
        numbers[i] = Integer.parseInt(args[i]);
    }

    //Задача 1
    for (int num : numbers) {
        System.out.println(num);
    }

    //Задача 2
    int sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    System.out.println(sum);

    //Задача 3
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }
    System.out.println(max);

    //Задача 4
    int evenCount = 0;
    for (int num : numbers) {
        if (num % 2 == 0) {
            evenCount++;
        }
    }
    System.out.println(evenCount);
}
}
