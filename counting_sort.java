
public class counting_sort {

    public void sort(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int val : arr) {
            if (val > max) max = val;
            if (val < min) min = val;
        }
        if (max == min) return;
        try {
            int[] freq = new int[max - min + 1];
            for (int val : arr) freq[val - min] ++;
            int indx = 0;
            for (int i = 0; i < max - min + 1; ++i) {
                if (freq[i] == 0) continue;
                while (freq[i] > 0) {
                    freq[i] --;
                    arr[indx++] = (i + min);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1000,1000,2034,3131,100,13,-2,35,31,-10,-3,394};
        new counting_sort().sort(arr);
        for (int val : arr) System.out.printf("%d ", val);
    }
}
