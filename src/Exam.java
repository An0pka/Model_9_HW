import java.util.HashMap;
import java.util.Map;

public class Exam {
    static Map<String, Integer> map = new HashMap<>();
    static {
        map.put("Lyashko", 3);
        map.put("Mishenko", 2);
        map.put("Zelenskiy", 5);
        map.put("Kolomoiskiy", 4);
        map.put("Dobkin", 4);
    }
    public void list (Map<String, Integer> map){
        int max = Integer.MIN_VALUE;
        String lider = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()){
                max = entry.getValue();
                lider = entry.getKey();
            }

        }
        System.out.println(lider);

    }

    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.list(new HashMap<>(map));
    }
    
}
//Представьте, что у вас есть список студентов и их оценки за экзамен по математике.
// Вам нужно найти студента с самой высокой оценкой и вывести его имя.