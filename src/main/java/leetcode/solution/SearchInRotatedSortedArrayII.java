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

            if(mid < begin) {
                //nums rotated within mid
                if(target > mid && target <= end){
                    return binarySearch(nums, target, m+1, q);
                } else {
                    q = m;
                    continue;
                }
            } else if(mid > end) {
                //nums rotated across mid
                if(target < mid && target >= begin){
                    return binarySearch(nums, target, p, m);
                } else {
                    p = m + 1;
                    continue;
                }
            } else {
                // begin <= mid <= end
                if(end > begin) {
                    //well sorted
                    return binarySearch(nums, target, p, q);
                } else {
                    //other situation
                    return scanSearch(nums, target, p+1, q-1);
                }
            }

        }

        return false;
    }

    private boolean scanSearch(int[] nums, int target, int p, int q) {
        for(int i = p; i < q; i++) {
            if(target == nums[i]) {
                return true;
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
