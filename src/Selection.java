public class Selection {
    public void sort(int[] a) {

        long startTime = System.currentTimeMillis();

        for (int i = a.length - 1; i >= 1; i--) {
            int largestIndex = i;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[largestIndex])
                    largestIndex = j;
            }
            swap(a, i, largestIndex);
        }

        System.out.print("Hasil : ");
        for (int ans : a) {
            System.out.print(ans + " ");
        }

        long endTime = System.currentTimeMillis();

        System.out.println();
        System.out.println("Lama Eksekusi : " + (endTime - startTime) + " ms");
    }

    public void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
