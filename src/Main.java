import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array : ");

        int len = sc.nextInt();
        int[] data = arrayGenerator(len);

        System.out.println();
        System.out.println("==============================================================");
        System.out.println("Sebelum di sortir : ");
        System.out.println("--------------------------------------------------------------");

        for (int d : data) {
            System.out.print(d + " ");
        }

        System.out.println();
        System.out.println("==============================================================");

        System.out.print("\n");

        Selection selection = new Selection();
        Bubble bubble = new Bubble();

        System.out.println("==============================================================");
        System.out.println("Buble sort : ");
        System.out.println("--------------------------------------------------------------");
        bubble.sort(data);
        System.out.println("==============================================================");

        System.out.println();

        System.out.println("==============================================================");
        System.out.println("Selection sort : ");
        System.out.println("--------------------------------------------------------------");
        selection.sort(data);
        System.out.println("==============================================================");
    }

    protected static int[] arrayGenerator(int length) {
        int[] arrBuffer = new int[length];
        for (int i = 0; i < length; i++) {
            arrBuffer[i] = (int) Math.round(Math.random() * 500);
        }
        return arrBuffer;
    }

}
