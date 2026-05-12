import java.util.Arrays;
class Bruteforce {

    public static int search(int[] nums, int target) {

        int peak = -1;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                peak = i;
            }
        }

        if(target >= nums[0]){
            return binarySearch(nums, target, 0, peak);
        }
        else{
            return binarySearch(nums, target, peak + 1, nums.length - 1);
        }
    }

    static int binarySearch(int[] nums, int target, int start, int end){

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target == nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }
}
class Optimal {
    public static int search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == nums[mid]){
                return mid;
            }else{
                if(nums[start]<=nums[mid]){
                    if(target>=nums[start] && target<nums[mid]){
                        end = mid -1;
                    }else{
                        start = mid+1;
                    }
                }else{
                    if(target>nums[mid] && target<=nums[end]){
                        start = mid+1;
                    }else{
                        end = mid-1;
                    }
                }
            }
        }
        return -1;
    }
}
class SearchInRotatedArray
{
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int ans1 = Bruteforce.search(arr,0);
        int ans2 = Optimal.search(arr,0);
        System.out.println(ans1+"this is brute force with o(n+logn)complexity");
        System.out.println(ans2+"this is optimal with O(logn) complexity");
    }
}
