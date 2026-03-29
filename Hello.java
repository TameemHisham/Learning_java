import java.util.Arrays;

class Hello {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] nums = new int[5];
        // array methods
        System.out.println(Arrays.compare(arr1, arr2)); // compare 2 arrays
        System.out.println(Arrays.equals(arr1, arr2)); // check if the 2 arrays are equal
        Arrays.fill(nums, 5);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
