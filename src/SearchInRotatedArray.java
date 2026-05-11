import java.util.Arrays;
class Rev{
    public static void reverse(int[]nums,int i,int j){
        while (i<j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}


public class SearchInRotatedArray {
    public static void main(String[] args) {
        int []nums = {4,5,6,7,0,1,2};

        int k=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                k=i;
            }
        }
        Rev.reverse(nums,0,k);Rev.reverse(nums,k+1,nums.length-1);Rev.reverse(nums,0, nums.length-1);

//        System.out.println(Arrays.toString(nums));
        System.out.println(BinarySearch(nums,0));

//        System.out.println(nums);

    }
    public static int BinarySearch(int[]nums,int target){
        int s = 0;
        int e = nums.length-1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target>nums[mid]){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
}
