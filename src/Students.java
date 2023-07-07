import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Students {
    public void list (int countStudents){
        Scanner scanner = new Scanner(System.in);
        int bal = 0;
        Map<String, Double> map = new HashMap<>();

        for (int i = 0; i < countStudents; i++) {
            System.out.println("enter " + countStudents + " students");
            String names = new String(scanner.nextLine());
            for (int j = 0; j < 5; j++) {
                System.out.println("enter 5 grades");
                bal += scanner.nextDouble();
                scanner.nextLine();

            }
            map.put(names, bal/5.0);
            bal = 0;
        }
        System.out.println(map);



    }

    public static void main(String[] args) {
        Students students = new Students();
        students.list(3);
    }
}


//Напишите программу, которая принимает от пользователя список имён студентов и
// их оценки по предмету. Выведите на экран средний балл для каждого студента.

// O_o