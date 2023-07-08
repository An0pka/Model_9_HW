import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private static List<Integer> num = new ArrayList<>();
    static {
        num.add(1);
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(3);
        num.add(7);
        num.add(8);
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
    }

    public void longest (List<Integer> num){
        int count = 1;
        int countMax = 0;
        for (int i = 0; i < num.size()-1; i++) {
                if (num.get(i) == num.get(i+1)-1){
                    count++;
                    if (countMax < count){
                        countMax = count;
                    }
                }else {
                    count = 1;
                }

            }


        System.out.println(countMax);

    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.longest(num);

    }

}
//Предположим, у вас есть список целых чисел. Вам нужно найти самую длинную
// подпоследовательность последовательных чисел в этом списке и вывести ее.