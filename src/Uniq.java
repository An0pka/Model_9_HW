import java.util.*;

public class Uniq {
    public void words (String user, int countWords){
        System.out.println("Hey " + user + ", Enter " + countWords + " words:");
        Scanner scanner = new Scanner(System.in);
        String word = "";
        Set<String> set = new HashSet<>();
        for (int i = 0; i < countWords; i++) {
            word = scanner.nextLine();
            set.add(word);
        }
        List<String> sortedSet = new ArrayList<>(set);
        Collections.sort(sortedSet);
        System.out.println(sortedSet);


    }

    public static void main(String[] args) {
        Uniq uniq = new Uniq();
        uniq.words("Jack", 5);
    }

}
//    Напишите программу, которая запрашивает у пользователя список слов и выводит на экран
//    все уникальные слова, которые были введены, в алфавитном порядке.