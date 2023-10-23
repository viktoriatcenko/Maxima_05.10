package lesson_4;

public class HW4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 24;
        arr[1] = 15;
        arr[2] = 21;
        arr[3] = 7;
        arr[4] = 11;

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            int remember = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    remember = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = remember;
                }
            }
        }

        System.out.println();

    }
}
