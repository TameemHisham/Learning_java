import java.util.*;
class Main {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        Scanner my_scanner = new Scanner(System.in);
        System.out.print(">>> ");
        String name = my_scanner.nextLine();
        System.out.println();
        grades.put("Tameem", 87);
        grades.put("Hisham", 97);
        grades.put("Yasmeen", 80);
        System.out.println(grades.get(name));
    }
}
