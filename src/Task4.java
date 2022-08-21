import java.sql.SQLOutput;
import java.util.Scanner;

public class Task4 {
    // Создайте программу, которая выводит в консоль число даты. Например, на вход 02/11/1995 = 0 +
    //2 + 1 + 1 + 1 + 9 + 9 + 5 = 28 на выход = 28

    public static void main(String[] args) {
        System.out.println("Введіть дату в форматі дд.мм.рррр:");
        Scanner input = new Scanner(System.in);
        String myDate =  input.next();
        String str = myDate.toLowerCase();
        char[] char1 = str.toCharArray();
        char[] char2 =   new char[]{'0','1','2','3','4','5','6','7','8','9'};
        int sumValue = 0; // сумма значений символов
        for (int i = 0; i < char1.length; i++) {
            for (int l = 0; l < char2.length; l++){
                if (char1[i] == char2 [l]) {
                    int indexInt = l;
                    sumValue += indexInt;
                }
            }
        }
        System.out.print("Сума цифр дати " + myDate + " складає " + sumValue);
    }
}
