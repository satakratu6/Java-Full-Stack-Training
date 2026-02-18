import java.util.*;

class Source {

    public ArrayList<String> changeOccurrence(ArrayList<String> a, String m, String n) {
        ArrayList<String> result = new ArrayList<>();

        for (String str : a) {
            if (str.equals(m)) {
                result.add(n);
            } else {
                result.add(str);
            }
        }
        return result;
    }

    public String listIndex(ArrayList<String> list) {
        return list.get(0);
    }

    public ArrayList<String> listAfter(ArrayList<String> a, String m, String n) {
        ArrayList<String> result = new ArrayList<>();

        for (String str : a) {
            result.add(str);
            if (str.equals(m)) {
                result.add(n);
            }
        }
        return result;
    }
}

public class Collections2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Source obj = new Source();

        // int size = sc.nextInt();
    
        ArrayList<String> list = new ArrayList<>();

        // for (int i = 0; i < size; i++) {
        //     list.add(sc.nextLine());
        // }
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        // String m = sc.nextLine();
        // String n = sc.nextLine();

        ArrayList<String> changed = obj.changeOccurrence(list, "c","s");
        System.out.println(changed);

        System.out.println(obj.listIndex(list));

        ArrayList<String> after = obj.listAfter(list, "d","f");
        System.out.println(after);
    }
}
