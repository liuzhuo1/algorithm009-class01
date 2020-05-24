package Week_01;

public class ContainerWithMostWater{
    public int maxArea(int[] height) {
        // 双指针，左右夹逼
        int left = 0;
        int len = height.length;
        int rigth = len-1;
        int area = 0;
        while (left < rigth){
            int hLeft = height[left];
            int hRight = height[rigth];
            int h = Math.min(hLeft,hRight);
            area = Math.max(area,h*(rigth-left));
            if (hLeft < hRight){
                left++;
                continue;
            }
            rigth--;
        }
        return area;
    }
}