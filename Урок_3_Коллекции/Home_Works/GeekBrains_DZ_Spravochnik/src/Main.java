import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String[] fruit = {"apple", "orange", "melon", "apple", "kiwi", "kiwi", "banana", "kiwi", "pear", "mango", "papaya"};
        HashMap<String, Integer> fetus = new HashMap<>();
        for (String x : fruit) {
            fetus.put(x, fetus.getOrDefault(x,0)+1);
        }
        System.out.println(fetus);

        Spravochnik book = new Spravochnik();
        book.addContact("Roma", "79252546787");
        book.addContact("Rita", "89134567898");
        book.addContact("Kola", "54445612345");
        book.addContact("Roma", "89134565436");
        book.addContact("Sena", "89134567867");
        book.addContact("Sena", "12345679147");

        // ищем по имени
        book.findAndPrint("Roma");
        book.findAndPrint("Sena");
        book.findAndPrint("Kola");
        book.findAndPrint("Rostislav");

    }
}
