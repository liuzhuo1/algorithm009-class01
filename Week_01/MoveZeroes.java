package Week_01;

public class MoveZeroes{
    public void moveZeroes(int[] nums) {
        // 记录非0个数
        int j = 0;
        for (int num : nums){
            if (num != 0){
                nums[j++] = num;
            }
        }

        while (j < nums.length){
            nums[j++] = 0;
        }
    }
}