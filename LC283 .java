import java.util.Arrays;
public class LC283 {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    nums[j - 1] = nums[j];
                }
                nums[n - 1] = 0;
                i--;
                n--;
            }
        }
    }
    public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};
    moveZeroes(nums);
    for (int num : nums) {
        System.out.println(num);
    }
}
}