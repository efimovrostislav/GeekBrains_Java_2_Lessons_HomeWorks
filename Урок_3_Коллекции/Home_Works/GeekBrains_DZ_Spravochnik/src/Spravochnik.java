import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Spravochnik {
    HashMap<String, HashSet<String>> pb;

    public Spravochnik() {
        this.pb = new HashMap<>();
    }
    public void addContact(String name, String phone){
        HashSet<String> book = pb.getOrDefault(name, new HashSet<>());
        book.add(phone);
        pb.put(name, book);
    }
    public void findAndPrint(String name){
        if(pb.containsKey(name)){
            System.out.println("Contact " + name + " / Phone number " + pb.getOrDefault(name, new HashSet<>()));
        }else System.out.println("Такой фамилии нет!");
//        System.out.println("Contact " + name + " / Phone number " + pb.getOrDefault(name, new HashSet<>()));

    }



}
