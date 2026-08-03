import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] newarr = new int[m + n];
        int x = 0;

        for (int i = 0; i < m; i++) {
            newarr[x] = nums1[i];
            x++;
        }

        for (int j = 0; j < n; j++) {
            newarr[x] = nums2[j];
            x++;
        }

        Arrays.sort(newarr);
        
        for (int i = 0; i < m + n; i++) {
            nums1[i] = newarr[i];
        }
    }
}