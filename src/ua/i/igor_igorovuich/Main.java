package ua.i.igor_igorovuich;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int buf = num / 2;

        System.out.println(num);
        for (int i = buf; i > 0; i--) {
            if (num % i == 0)
                System.out.println(i);
        }
    }

}
