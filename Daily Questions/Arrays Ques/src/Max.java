public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 5, 54, 87, 33};

        System.out.println(max(arr));

        System.out.println(maxRange(arr, 0, 2));
    }

    // imagine array is not empty
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // Between the range

    static int maxRange(int[] arr, int start, int end) {

        // Work on edge cases when the array is null

        if (end > start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }


        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
