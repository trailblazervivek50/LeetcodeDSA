class Brute{
    public static int findMin(int[] arr) {
        for(int k=0;k<arr.length-1;k++){
            if(arr[k]>arr[k+1]){
                return arr[k+1];
            }
        }
        return arr[0];
    }
}
class Optimal1 {
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(start<end && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }else if(nums[start]>nums[mid]){
                end = mid;
            }else{
                start= mid+1;
            }
        }
        return nums[0];
    }
}


public class Find_minimmum_in_Rotated_array {
    public static void main(String[] args) {
        int []nums = {3,4,5,1,2};
        System.out.println(Brute.findMin(nums)+" O(n)");
        System.out.println(Optimal1.findMin(nums)+" O(logn)");
    }
}
