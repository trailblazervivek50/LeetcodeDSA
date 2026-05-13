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


public class Find_minimmum_in_Rotated_array {
    public static void main(String[] args) {
        int []nums = {3,4,5,1,2};
        System.out.println(Brute.findMin(nums));
    }
}
