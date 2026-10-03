public class Main2 {
	public static void main (String[] args) {	

    //Задача 1
    String text1 = args[0];
    int length1 = text1.length();
    System.out.println(length1);


    //Задача 2
    if (args.length > 1) {
        String word2 = args[1];
        boolean startsWithA = word2.length() > 0 && word2.charAt(0) == 'A';
        System.out.println(startsWithA);
    }


    //Задача 3
    if (args.length > 2) {
        String password = args[2];
        boolean isPasswordCorrect = password.equals("qwerty123");
        System.out.println(isPasswordCorrect);
    }


    //Задача 4
    if (args.length > 3) {
        String text4 = args[3];
        int countA = 0;
        for (int i = 0; i < text4.length(); i++) {
            if (text4.charAt(i) == 'a') {
                countA++;
            }
        }
        System.out.println(countA);
    }


    //Задача 5
    if (args.length > 4) {
        String text5 = args[4];
        String trimmedText = text5.trim();
        int newLength = trimmedText.length();
        System.out.println(trimmedText);
        System.out.println(newLength);
    }


    //Задача 6
    if (args.length > 5) {
        String word6 = args[5];
        boolean isPalindrome = true;
        int length6 = word6.length();

        for (int i = 0; i < length6 / 2; i++) {
            if (word6.charAt(i) != word6.charAt(length6 - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Палиндром: " + isPalindrome);
    }
}
}
