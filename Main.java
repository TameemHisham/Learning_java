import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Main {
    public static  void  main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        int totalSquared = nums.stream().map(n-> n*n).reduce(0, (total, element) -> total + element);

        System.out.println(totalSquared);
    }
}