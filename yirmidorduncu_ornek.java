package JAVA101;
import java.util.Scanner;
public class yirmidorduncu_ornek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int n = input.nextInt();
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n -1 ; i >= 1; i--) {
            for (int k = 0; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
