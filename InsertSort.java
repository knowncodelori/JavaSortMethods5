public class InsertSort {
    public static void main(String[] args) {
        //插入排序
        int[] nums = {5, 1, 6, 7, 9, 15, 20, 155, 120};
        for (int i = 1 ; i < nums.length ; i++){
            for (int j = i ; j > 0; j--){
                if (nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
            //加上判断提前结束第二层循环可以提速，但是，摸了
        }
        for (int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
