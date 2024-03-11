package ex1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    private static final Logger logger = LoggerFactory.getLogger(Exercise1.class);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rnd1 = new Random().nextInt(1, 11);
        int rnd2 = new Random().nextInt(1, 11);
        int rnd3 = new Random().nextInt(1, 11);
        int rnd4 = new Random().nextInt(1, 11);
        int rnd5 = new Random().nextInt(1, 11);
        int[] numbers = {rnd1, rnd2, rnd3, rnd4, rnd5};
        logger.info(Arrays.toString(numbers));
        System.out.println();

        replaceNum(sc, numbers);
    }

    public static void replaceNum(Scanner sc, int[] arr) {
        System.out.println("SELECT AN OPTION:");
        System.out.println("1 - Replace a number in the array");
        System.out.println("0 - Exit");
        String input = sc.nextLine();
        switch (input) {
            case "0" -> sc.close();
            case "1" -> {
                System.out.println();
                System.out.println("CHOOSE A POSITION (from 0 to " + (arr.length - 1) + "):");
                try {
                    int index = Integer.parseInt(sc.nextLine());
                    if (index >= arr.length || index < 0) throw new Exception("ERROR: index not found.");
                    else {
                        System.out.println();
                        System.out.println("WRITE A NUMBER (from 0 to 10):");
                        int num = Integer.parseInt(sc.nextLine());
                        if (num < 0 || num > 10) throw new Exception("ERROR: number has to be between 0 and 10");
                        else {
                            arr[index] = num;
                            logger.info(Arrays.toString(arr));
                            System.out.println();
                            replaceNum(sc, arr);
                        }
                    }
                } catch (Exception ex) {
                    System.err.println(ex.getMessage());
                    System.out.println();
                    replaceNum(sc, arr);
                }
            }
            default -> {
                System.err.println("Invalid input. Try again.");
                System.out.println();
                replaceNum(sc, arr);
            }
        }
    }
}
