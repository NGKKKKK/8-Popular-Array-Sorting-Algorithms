
public class quick_sort {

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = start + 1;
        while (j < end) {
            if (arr[j] < pivot) {
                i ++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            j ++;
        }
        int tmp = arr[start];
        arr[start] = arr[i];
        arr[i] = tmp;
        return i;
    }

    public void sort(int[] arr, int start, int end) {
        if (start >= end - 1) return;
        int indx = partition(arr, start, end);
        sort(arr, start, indx - 1);
        sort(arr, indx + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,5,6,1,10,5};
        new quick_sort().sort(arr, 0, arr.length);
        for (int val : arr) System.out.printf("%d ", val);
    }

}
