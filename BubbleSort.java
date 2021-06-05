public class BubbleSort {
    public static void main(String[] args){
        //冒泡排序
        int[] nums = {5,1,6,7,9,15,20,155,120};
        for (int i = 1 ; i < nums.length ; i++){
            for (int j = 1 ; j < nums.length - i + 1; j++){
                if (nums[j - 1] > nums[j] ){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
