import java.util.*;


class SortCodes implements Comparator {
    public int compare (Object i, Object j) {
        String i_string = (String)i;
        String j_string = (String)j;
        if (i_string.compareTo(j_string) > 0) {
            return 1;
        } else if (i_string.compareTo(j_string) < 0){
            return -1;
        } else {
            int value1 = Integer.parseInt(i_string);
            int value2 = Integer.parseInt(j_string);
            if (value1 > value2) {
                return 1;
            } else if (value1 < value2) return 1;

        }
        return 0;
    }
}


class Main {
    public static void main(String[] args) {
        List<String> codes = new ArrayList<String>();
        codes.add("E05");
        codes.add("A13");
        codes.add("A12");
        codes.add("B13");
        System.out.println(codes);
        Comparator my_comparator  = new SortCodes();
        codes.sort(my_comparator);
        System.out.println(codes);

    }
}
