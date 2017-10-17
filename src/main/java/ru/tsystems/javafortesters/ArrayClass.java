package ru.tsystems.javafortesters;

/**
 * Show array declaration.
 */
public class ArrayClass {

    long[] oneDimArray = new long[2];
    boolean oneDimArray2[];
    byte[] byteArray = new byte[] {(byte)128, (byte)128};
    long[][] longArray = new long[2][];
    long[][] longArray2 = new long[][] {
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
    };
    long[][] longArray3 = new long[][] {
            {(long)1.1, (long)2.2},
            {(long)3.3}
    };
    long[] longArray4 = {1, 2, 3, 4, 5, 9990};

    public ArrayClass() {
        oneDimArray2 = new boolean[2];
        longArray[0] = new long[5];
        longArray[1] = new long[10];
    }

    public void test() {
        print(oneDimArray);
        print(oneDimArray2);
        print(byteArray);
        print(longArray);
        print(longArray2);
        print(longArray3);
        print(longArray4);
    }

    private void print(byte[] byteArray) {
        for (int i = 0; i < byteArray.length; i++) {
            System.out.print(byteArray[i] + " ");
        }
        System.out.println();
    }

    private void print(boolean[] booleanArray) {
        for (int i = 0; i < booleanArray.length; i++) {
            System.out.print(booleanArray[i] + " ");
        }
        System.out.println();
    }

    private void print(long[] longArray) {
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i] + " ");
        }
        System.out.println();
    }

    private void print(long[][] longArray) {
        for (int i = 0; i < longArray.length; i++) {
            for (int j = 0; j < longArray[i].length; j++) {
                System.out.print(longArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
