
public class merge_sort {

    private int[] merge(int[] a, int [] b) {
        int[] res = new int [a.length + b.length];
        int indx = 0;
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) res[indx++] = a[i++];
            else res[indx++] = b[j++];
        }

        while (i < a.length) res[indx++] = a[i++];
        while (j < b.length) res[indx++] = b[j++];

        return res;
    }

    public int[] sort(int[] arr) {
        if (arr.length == 1) return arr;

        int mid = arr.length/2;

        int[] left = new int [mid];
        int[] right = new int [arr.length - mid];

        for (int i = 0; i < mid; ++i) left[i] = arr[i];
        for (int i = mid; i < arr.length; ++i) right[i - mid] = arr[i];

        int[] sorted_left = sort(left);
        int[] sorted_right = sort(right);
        return merge(sorted_left, sorted_right);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,54,1,2,4,10,2,-10,-2,-15, -6};
        int[] res = new merge_sort().sort(arr);
        for (int re : res) System.out.printf("%d ", re);
    }
}
