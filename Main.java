import java.util.*;


class SortCodes1 implements Comparator {
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
class SortCodes2 implements Comparable {
    String code;
    public SortCodes2 (String code) {
        this.code = code;
    }
    public int compareTo (Object that) {
        SortCodes2 that_string = (SortCodes2)that;
        if (this.code.compareTo(that_string.code) > 0) {
            return 1;
        } else if (this.code.compareTo(that_string.code) < 0){
            return -1;
        } else {
            int value1 = Integer.parseInt(this.code);
            int value2 = Integer.parseInt(that_string.code);
            if (value1 > value2) {
                return 1;
            } else if (value1 < value2) return 1;

        }
        return 0;
    }
}


class Main {
    public static void main(String[] args) {
//        List<String> codes = new ArrayList<>();
//        codes.add("E05");
//        codes.add("A13");
//        codes.add("A12");
//        codes.add("B13");
        List<SortCodes2> codes = new ArrayList<>();
        codes.add(new SortCodes2("E05"));
        codes.add(new SortCodes2("A13"));
        codes.add(new SortCodes2("A12"));
        codes.add(new SortCodes2("B13"));

//        Comparator myComparator  = new SortCodes1();
        System.out.print(" ");
//        codes.sort(myComparator);
//        codes.sort(myComparator);
        for (SortCodes2 code: codes) {
            System.out.printf("%s", code.code);
        }
        System.out.println();
        Collections.sort(codes);
        for (SortCodes2 code: codes) {
            System.out.printf("%s", code.code);
            System.out.print(" ");
        }

    }
}



