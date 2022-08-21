import java.util.Scanner;

public class Task1 {

  //  Напишите метод, который принимает число и возвращает сумму цифр данного числа

    public static int SumFigure(int number){
        int sum=0;
        while(number!=0){
            sum+=number%10;
            number/=10;}
        return sum;};

    public static void main(String[] args) {
        System.out.println ("Введіть число: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(SumFigure(n));

    }
}
