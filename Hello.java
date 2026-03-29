import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Tameem Hisham");
        System.out.println(sb.capacity()); // length + 16
        System.out.println(sb.length()); // length
        sb.append(" Alkhliefat");
        sb.delete(13, sb.length() - 1);
        System.out.println(sb);
    }

}
