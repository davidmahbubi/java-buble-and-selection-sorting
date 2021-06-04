public class Bubble {
    public void sort(int[] data, int sortType) {
        long startTime = System.currentTimeMillis();

        for(int i = (data.length-1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortType == 1) {
                    if (data[j] > data[(j + 1)]) {
                        int tempo = data[(j + 1)];
                        data[(j + 1)] = data[j];
                        data[j] = tempo;
                    }
                } else {
                    if (data[j] < data[(j + 1)]) {
                        int tempo = data[(j + 1)];
                        data[(j + 1)] = data[j];
                        data[j] = tempo;
                    }
                }
            }
        }

        System.out.print("Hasil : ");
        for (int datum : data) {
            System.out.print(datum + " ");
        }

        System.out.println();
        long endTime = System.currentTimeMillis();

        System.out.println("Lama Eksekusi : " + (endTime - startTime) + " ms");
    }
}