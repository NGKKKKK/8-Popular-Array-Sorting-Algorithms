
public class insertion_sort {

    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int j = i - 1;
            int val = arr[i];
            while (j >= 0) {
                if (arr[j] > val) {
                    arr[j + 1] = arr[j];
                }
                else break;
                j --;
            }
            arr[j + 1] = val;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,6,2,-12,7,-10,-9,120,57,24,745,-20};
        new insertion_sort().sort(arr);
        for (int val : arr) System.out.printf("%d ", val);
    }
}
