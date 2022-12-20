import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println(" ");
        task2();
        System.out.println(" ");
        task3();
        System.out.println(" ");
        task4();
    }


    private static void task1() {
        System.out.println("Задача 1");

        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double[] array2 = {1.57, 7.654, 9.986};

        String[] array3 = new String[3];
        array3[0] = "Элемент 1";
        array3[1] = "Элемент 2";
        array3[2] = "Элемент 3";

    }


    private static void task2() {
        System.out.println("Задача 2");

        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");


        double[] array2 = {1.57, 7.654, 9.986};

        for (int d = 0; d < array2.length; d++) {
            System.out.print(array2[d]);
            if (d != array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");


        String[] array3 = new String[3];
        array3[0] = "Элемент 1";
        array3[1] = "Элемент 2";
        array3[2] = "Элемент 3";

        for (int s = 0; s < array3.length; s++) {
            System.out.print(array3[s]);
            if (s != array3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

    }


    private static void task3() {
        System.out.println("Задача 3");

        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");


        double[] array2 = {1.57, 7.654, 9.986};

        for (int d = array2.length - 1; d >= 0; d--) {
            System.out.print(array2[d]);
            if (d != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");


        String[] array3 = new String[3];
        array3[0] = "Элемент 1";
        array3[1] = "Элемент 2";
        array3[2] = "Элемент 3";

        for (int s = array3.length - 1; s >= 0; s--) {
            System.out.print(array3[s]);
            if (s != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

    }


    private static void task4() {
        System.out.println("Задача 4");

        int [] array1 = new int [3];
        array1 [0] = 1;
        array1 [1] = 2;
        array1 [2] = 3;

        for (int i = 0; i < array1.length; i++) {
            if (array1 [i] % 2 != 0) {
                array1[i] += 1;
            }
        }
        System.out.println(Arrays.toString (array1));

    }

}