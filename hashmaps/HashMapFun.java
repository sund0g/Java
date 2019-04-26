import java.util.HashMap;
import java.util.UUID;

public class HashMapFun {

    static HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
    public static void main (String [] args) {

        overwriteDuplicates();
        makeNewKeyForDuplicates();

    }

    private static void overwriteDuplicates() {

        myHashMap.put(1, "Scott");
        myHashMap.put(2, "Angel");
        myHashMap.put(2, "Sara");

        printHashMap ();
    }

    private static void printHashMap () {
        System.out.println(myHashMap.size());

        for (int i = 0; i <= myHashMap.size(); i++) {
            System.out.println(myHashMap.get(i));
        }
    }

    private static void makeNewKeyForDuplicates() {

// TODO: put the key, value pairs into an ArrayList and input them into myHashMap;

        String uniqueID = UUID.randomUUID().toString();

        System.out.println(uniqueID);

        myHashMap.put(1, "Scott");


    }
}