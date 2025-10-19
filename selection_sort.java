
public class selection_sort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            int minIndx = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j] < arr[minIndx]) minIndx = j;
            }
            int tmp = arr[minIndx];
            arr[minIndx] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1,-2,5,6,2,0,-99,10,44,13,56,-36,18};
        new selection_sort().sort(arr);
        for (int val : arr) System.out.printf("%d ", val);
    }
}
