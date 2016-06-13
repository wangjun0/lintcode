/**
 * Created by Administrator on 2016/6/13.
 */
public class PartitionArraybyOddandEven {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    //分割一个整数数组，使得奇数在前偶数在后。
    public void partitionArray(int[] nums) {
        // write your code here;
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 == 1) {
                left++;
            }
            while (left < right && nums[right] % 2 == 0) {
                right--;
            }

            swap(nums, left, right);
            left++;//这个忘记！！！
            right--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {2147483644, 2147483645, 2147483646, 2147483647};
        PartitionArraybyOddandEven demo = new PartitionArraybyOddandEven();
        demo.partitionArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
