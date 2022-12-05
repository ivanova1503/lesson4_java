import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x:");
        int x= scanner.nextInt();
        System.out.println("Введите число y:");
        int y= scanner.nextInt();
        System.out.println("Введите число z:");
        int z= scanner.nextInt();
        scanner.close();

        // Вариант1: деление без остатка
        int avg = (x+y+z)/3;    // так как справа int, то происходит деление без остатка, даже если avg была бы типа double
        System.out.println("Среднее арифметическое трёх чисел = " + avg);


        // Вариант2:
        double avg2 = (double)(x + y + z) / 3; // так запишется число с дробной частью
        System.out.println("Среднее арифметическое трёх чисел = " + Math.floor(avg2));

        if(avg>3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}