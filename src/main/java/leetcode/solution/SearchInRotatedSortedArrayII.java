package leetcode.solution;

public class SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int p = 0, q = nums.length;

        while(p != q){

            int m = (p + q) / 2;
            int mid = nums[m];

            if(target == mid) {
                return true;
            }

            int end = nums[q - 1];
            int begin = nums[p];

            if(mid < nums[p]) {
                if(target > mid && target <= end){
                    return binarySearch(nums, target, m+1, q);
                } else {
                    q = m;
                    continue;
                }
            } else if(mid > end) {
                if(target < mid && target >= begin){
                    return binarySearch(nums, target, p, m);
                } else {
                    p = m + 1;
                    continue;
                }
            } else {
                //still wrong
                if(binarySearch(nums, target, p, m)) {
                    return true;
                } else {
                    p = m + 1;
                    continue;
                }
            }

        }

        return false;
    }

    private boolean binarySearch(int[]nums, int target, int p, int q){

        while(p != q) {
            int m = (p + q) / 2;
            int mid = nums[m];
            if(target == mid){
                return true;
            } else if(target > mid) {
                p = m + 1;
            } else {
                q = m;
            }
        }

        return false;
    }
}
