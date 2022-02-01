/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1, u=n, mid;
        while(l<=u)
        {
            mid = l+(u-l)/2;
            if(isBadVersion(mid)==true && isBadVersion(mid-1)==false)
                return mid;
            else if(isBadVersion(mid)==true && isBadVersion(mid-1)==true)
                u = mid;
            else
                l = mid+1;
        }
        if(l!=n && isBadVersion(l)==true)
            return l;
        return -1;
    }
}