import java.util.ArrayList;
import java.util.HashSet;

public class findpair {

    private static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main (String [] args) {

        final int sum = Integer.parseInt(args[1]);

        list = toArrayList(args[0]);

        findInOrderedList(list, sum);

        findInUnOrderedList(list, sum);

    }

    private static void findInOrderedList (ArrayList<Integer> inputString, int sum) {

        int  head = 0, tail = list.size() - 1;

        System.out.println(list);

        while (head < tail)
        {
            if ((list.get(head) + list.get(tail)) == sum){
                System.out.println(list.get(head) + " + " + list.get(tail) + " = " + sum);
                break;
            } else {
                System.out.println(list.get(head) + " + " + list.get(tail) + " != " + sum);
            }
            head++;
        }
    }

    private static void findInUnOrderedList (ArrayList<Integer> inputString, int sum) {
        HashSet<Integer> complements = new HashSet<Integer>();

        for (int value : inputString) {

// Fugure this out.

        }

    }

    private static ArrayList<Integer> toArrayList(String s) {

        final int sLen = s.length();

        for (int i = 0; i < sLen; i++) {
            // An awful method to get args[0] into an ArrayList.
            list.add(Integer.parseInt(Character.toString(s.charAt(i))));
        }

        return list;
    }
}