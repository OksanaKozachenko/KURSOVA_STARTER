import java.util.Scanner;

public class Task3 {
    // Создайте программу, которая выводит в консоль число имени, например, на вход Roman = R(18) +
    //О(15) + M(13) + A(1) + N(14) = 61 на выход 61.
    public static void main(String[] args) {

        System.out.print("Введіть ваше ім'я:");
        Scanner input = new Scanner(System.in);
        String myWord =  input.next();
        String str = myWord.toLowerCase();
        char[] chars = str.toCharArray();
        // массив символов для сравнения
        char[] charAlf =   new char[]{'0','а','б','в','г','д','є','е','ж','з','и','і','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','щ','ш','ї','ю','я'};

        int sumValue = 0; // сумма значений символов

        for (int i = 0; i < chars.length; i++) {

            for (int l = 0; l < charAlf.length; l++){

                if (chars[i] == charAlf [l]) {
                    int indexInt = l;
                    sumValue += indexInt;

                    System.out.println(chars[i] +  "="+ indexInt );
                }
            }
        }
        System.out.print("Число імені " + myWord + " = " + sumValue);
    }

}
