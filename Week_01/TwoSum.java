package Week_01;

import java.util.HashMap;

/**
 * 两数之和
 */
public class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0,len = nums.length; i < len; i++){
            int num = nums[i];
            int mid = target - num;
            if (map.get(mid) != null){
                return new int[]{map.get(mid),i};
            }
            map.put(num,i);
        }
        return null;
    }
}