public class ChooseSort {
    public static void main(String[] args){
        //选择排序
        int[] nums = {5,1,6,7,9,15,20,155,120};
        for (int i = 0; i < nums.length - 1 ; i++) {
            int max = 0;
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }
            int temp = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = nums[max];
            nums[max] = temp;
        }
        for (int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
