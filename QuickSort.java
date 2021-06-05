import java.util.ArrayList;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1,45,56,78,665,78,11,114,514,114514,19,19,1919,810};
        ArrayList<Integer> tempNums = new ArrayList<>();
        for (int num : nums) {
            tempNums.add(num);
        }

        System.out.println(quickSort(tempNums));
    }
    public static ArrayList<Integer> quickSort(ArrayList<Integer> nums){
        if (nums.size() <= 1){
            return nums;
        }
        int flagNum = nums.get(0);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < flagNum){
                left.add(nums.get(i));
            }else{
                right.add(nums.get(i));
            }
        }
        ArrayList<Integer> tempAns = new ArrayList<>();
        ArrayList<Integer> tempLeft = new ArrayList<>();
        if ( !left.isEmpty()){
            tempLeft = quickSort(left);
            tempAns.addAll(tempLeft);}
        tempAns.add(flagNum);
        ArrayList<Integer> tempRight = new ArrayList<>();
        if (!right.isEmpty()){
            tempRight = quickSort(right);
            tempAns.addAll(tempRight);}
        return tempAns;
    }
}
