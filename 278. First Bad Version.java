/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 1, j = n, mid = i + (j - i)/2 ;
        while(i <= j) {
            mid = i + (j - i)/2 ;
            if((mid - 1 > 0) && isBadVersion(mid - 1) == false && isBadVersion(mid))
                return mid;
            else if (isBadVersion(mid) == true) {
                j = mid-1;
            } else {
                i = mid +1;
            }
        }
        return 1;
    }
}