package whilelooppractice;

/**
 *
 * @author Admin
 */
public class WhileLoopPractice {

    public static void main(String[] args) {
        System.out.println("While Loop Practice \n");

        System.out.println("First Five");
        System.out.println("#1: " + firstFive("Hello, how are you doing today? I am fine, how about you?"));
        System.out.println();
        System.out.println("#2: " + firstFive("What's up dog?"));
        System.out.println();
        System.out.println("#3: " + firstFive("I...I...I don't know what to do?"));
        System.out.println();

        System.out.println("Number of Generations");
        System.out.println("Start Value  |  Generations");
        System.out.println("-------------|---------------");
        System.out.println("    10       |       " + numberOfGenerations(10));
        System.out.println("    20       |       " + numberOfGenerations(20));
        System.out.println("     2       |       " + numberOfGenerations(2));
    }

    public static String firstFive(String sentnece) {
        int spaces = 0;
        char temp;
        String retur = "";
        int number = 0;
        while (spaces < 6 && number < sentnece.length()) {
            temp = sentnece.charAt(number);
            if (temp == ' ') {
                spaces += 1;
            }
            number += 1;
            retur += temp;
        }
        return retur;
    }

    public static int numberOfGenerations(int start) {
        int number = 0;
        int bunnies = start;
        while (bunnies < 20000) {
            bunnies += (bunnies/2)*3;
            number+=1;
        }
        return number;
    }
}
