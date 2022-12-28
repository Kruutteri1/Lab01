import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my program!");

        boolean flag = true;
        while (flag) {
            System.out.print("\n" +
                    "1.gipotenuza\n" +
                    "2.previousAndNextNumber\n" +
                    "3.splitApplesWithOutRemainder\n" +
                    "4.remainderOfSplitApples\n" +
                    "5.stop/exit\n");
            System.out.println("choice an exercise:");
            int numberEX = sc.nextInt();

            if (numberEX == 1) {
                gipotenuza(sc);
            } else if (numberEX == 2) {
                previousAndNextNumber(sc);
            } else if (numberEX == 3) {
                split_Apples_WithOut_Remainder(sc);
            } else if (numberEX == 4) {
                remainder_Of_Split_Apples(sc);
            } else if (numberEX == 5) {
                flag = false;
            }
        }
    }

    private static void gipotenuza(Scanner sc) {
        System.out.print("Enter first num: ");
        double a = sc.nextInt();

        System.out.print("Enter second num: ");
        double b = sc.nextInt();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Number c = " + c);

    }

    private static void previousAndNextNumber(Scanner sc) {
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.println("The next number for the number " + number + " is " + (number + 1) + ".");
        System.out.println("The previous number for the number " + number + " is " + (number - 1) + ".");


    }

    private static void split_Apples_WithOut_Remainder(Scanner sc) {

        System.out.print("Enter first num: ");
        int n = sc.nextInt();

        System.out.print("Enter second num: ");
        int k = sc.nextInt();

        System.out.println((k - (k % n)) / n);

    }

    private static void remainder_Of_Split_Apples(Scanner sc) {
        System.out.print("Enter first num: ");
        int n = sc.nextInt();

        System.out.print("Enter second num: ");
        int k = sc.nextInt();

        System.out.println(k % n);
    }
}