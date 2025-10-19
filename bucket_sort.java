import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bucket_sort {

    public void sort(int[] arr) {
        int size = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int val : arr) {
            if (val > max) max = val;
            if (val < min) min = val;
        }
        if (max == min) return;
        int buckets_size = size / 2;
        List<List<Integer>> buckets = new ArrayList<>(buckets_size);
        for (int i = 0; i < buckets_size; ++i) buckets.add(new ArrayList<>());
        double range = (double) (max - min);
        for (int val : arr) {
            int indx = (int)(((val - min) / range) * buckets_size);
            if (indx >= buckets_size) indx = buckets_size - 1;
            buckets.get(indx).add(val);
        }
        int indx = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int val : bucket) arr[indx++] = val;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2,5,6,-10,17,18,-9,-5,12,19,20};
        new bucket_sort().sort(arr);
        for (int val : arr) System.out.printf("%d ", val);
    }

}
