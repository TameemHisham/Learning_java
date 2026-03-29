import java.util.Scanner;
import java.util.Arrays;
class Hello {
    public static void main(String[] args) {
        // while loops e.g. binary search
        int[] array = {20,12,43,2,5,9};
        Arrays.sort(array);
        Scanner obj = new Scanner(System.in);
        int find = obj.nextInt();
        boolean found = false;
        int start = 0, end = array.length-1;
        while (start <= end) {
            int mid  = Math.floorDiv(end+start,2);
            if (array[mid] == find) {
                System.out.println("Value found at index: " + mid);
                found = true;
                break;
            }
            if (array[mid] < find) {
                start = mid+1;
            } else {
                end = mid - 1;
            }
        }
        if (!found) {
            System.out.println("No such value exists in this array");
        }
    }
}
