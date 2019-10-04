public class Solution {
    private int count = 0;
    public int InversePairs(int [] array) {
        if(array == null || array.length == 0){
            return -1;
        }
        mergeSort(array, 0, array.length - 1);
        return count;
    }
    
    public void mergeSort(int[] a, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    public void merge(int[] a, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int t = right - left;//临时数组下标
        int l = mid;
        int r = right;
        while (l >= left && r >= mid + 1) {
            if (a[l] > a[r]) {
                count += (r - mid);
                tmp[t--] = a[l--];
                if (count >= 1000000007) {
                    count %= 1000000007;
                }
            } else {
                tmp[t--] = a[r--];
            }
        }
        while (l >= left) {
            tmp[t--] = a[l--];
        }
        while (r >= mid + 1) {
            tmp[t--] = a[r--];
        }
        for (int i = 0; i <= right - left; i++) {
            a[left + i] = tmp[i];
        }
    }
}
