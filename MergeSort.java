public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {2,5,1,5,3,5,7,89,1,5,10,36,7,49,52,123,45,79,132,456,114,514,114514,19,19,810,1919810};
        int[] ans = MergeSort(nums);
        for (int i : ans) {
            System.out.print(i + ",");
        }

    }
    public static int[] MergeSort(int[] nums){
        if (nums.length <= 1){
            return nums;
        }
        int[] nums1 = new int[nums.length / 2];
        int[] nums2 = new int[nums.length - nums.length / 2];
        for (int i = 0; i < nums.length; i++) {
            if (i < nums1.length) {
                nums1[i] = nums[i];
            }else{
                nums2[i - nums1.length] = nums[i];
            }
        }
        return Merge(MergeSort(nums1), MergeSort(nums2));
    }
    public static int[] Merge(int[] nums1, int[] nums2){
        int i = 0;
        int j = 0;
        int[] temp = new int[nums1.length + nums2.length];
        while(i < nums1.length && j < nums2.length){

            if ( nums1[i] < nums2[j]){
                temp[i + j] = nums1[i++];
            }else{
                temp[i + j] = nums2[j++];
            }
        }
        while (i == nums1.length && j < nums2.length){
            temp[i + j] = nums2[j++];
        }
        while (j == nums2.length && i < nums1.length){
            temp[i + j] = nums1[i++];
        }
        return temp;
    }
}
