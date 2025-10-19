
public class bubble_sort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            boolean swapped = false;
            for (int j = arr.length - 2; j >= i; --j) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2,4,0,5,-12,7,99,-101,23,44,-20};
        new bubble_sort().sort(arr);
        for (int val : arr) System.out.printf("%d ", val);

    }
}
