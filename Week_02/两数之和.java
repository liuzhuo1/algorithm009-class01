class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0,len = nums.length; i < len; i++){
            int num = nums[i];
            Integer val = map.get(num);
            if(i > 0 && val != null){
                return new int[]{val,i};
            }
            int mid = target - num;
            map.put(mid,i);
        }
        return null;
    }
}