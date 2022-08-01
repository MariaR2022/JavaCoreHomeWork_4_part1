package JavaCoreHomeWork_4_part1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Andrey", "Stanislav", "Mihail", "Polina", "Olga",
                "Aleksandr", "Valentina", "Anton", "Sergey", "Olga",
                "Stanislav", "Mihail", "Sergey", "Valentina", "Polina",
                "Anna", "Sergey", "Valentin", "Natalia", "Sergey"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());

        System.out.println("Уникальные слова");
        Set<String> uniques = new LinkedHashSet<>();
        Set<String> dups = new HashSet<>();
        for (String word : words) {
            if (!uniques.add(word)) {
                dups.add(word);
            }
        }
        uniques.removeAll(dups);
        System.out.println(uniques);

        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
