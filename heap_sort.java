
public class heap_sort {

    private void heapify(int[] arr, int size, int i) {
        int root = i;
        int left_child = 2 * i + 1;
        int right_child = 2 * i + 2;
        if (left_child < size && arr[left_child] > arr[root]) {
            root = left_child;
        }
        if (right_child < size && arr[right_child] > arr[root]) {
            root = right_child;
        }
        if (root == i) return;
        int tmp = arr[i];
        arr[i] = arr[root];
        arr[root] = tmp;
        heapify(arr, size, root);
    }

    public void sort(int[] arr) {
        int size = arr.length;
        if (size == 1) return;
        for (int i = size / 2; i >= 0; --i) heapify(arr, size, i);
        for (int i = size - 1; i > 0; --i) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,5,9,10,552,7,23,57,2324,124};
        new heap_sort().sort(arr);
        for (int val : arr) System.out.printf("%d ", val);
    }


}
