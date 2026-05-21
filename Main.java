import java.util.*;
class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Set<Integer> set = new HashSet<Integer>();
        list.add("TAMEEM");
        list.add("MANAF");
        list.add("SHAHIAH");
        list.add("YASMEEN");
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);
        set.add(3);
        System.out.println(set.contains(4));
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.indexOf("MANAF"));
        System.out.println(list.get(3));
    }
}
