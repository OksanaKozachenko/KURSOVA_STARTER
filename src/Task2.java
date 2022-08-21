import java.util.Scanner;

public class Task2 {
    // Напишите метод, который принимает число, которое не содержит нулей и возвращает цифры в
    //обратном порядке.
    // Например, на вход: 789 на выход: 987

    public static void reversFigure(long number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reversFigure(number / 10);
        }
    }
    public static void main (String[] args){
        System.out.println("Введіть число: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        reversFigure(n);
    }
}


