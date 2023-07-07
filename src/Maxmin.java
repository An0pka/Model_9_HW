import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Maxmin {
    public void numbers (int cont){
        System.out.println("Hey lol put " + cont + " in the table:");
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < cont; i++) {
            userNumber = scanner.nextInt();
            num.add(userNumber);
        }
        int max = Collections.max(num);
        int min = Collections.min(num);
        System.out.println(num);
        System.out.println(min);
        System.out.println(max);
        }




    public static void main(String[] args) {
        Maxmin max = new Maxmin();
        max.numbers(5);

    }
}
//    Напишите программу, которая принимает от пользователя список целых чисел
//    и выводит на экран самое большое и самое маленькое число из этого списка.
