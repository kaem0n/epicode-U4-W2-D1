package ex2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Exercise2 {
    private static final Logger logger = LoggerFactory.getLogger(Exercise2.class);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printKmPerLiter(sc);

        sc.close();
    }

    public static void printKmPerLiter(Scanner sc) {
        try {
            System.out.println();
            System.out.println("INSERT CHILOMETERS:");
            int km = Integer.parseInt(sc.nextLine());
            System.out.println();
            System.out.println("INSERT LITERS CONSUMED:");
            int liters = Integer.parseInt(sc.nextLine());
            System.out.println();
            System.out.println("You consumed: " + (km / liters) + " km/l");
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            printKmPerLiter(sc);
        }
    }
}