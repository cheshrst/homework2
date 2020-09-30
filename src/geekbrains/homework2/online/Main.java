package geekbrains.homework2.online;

public class Main {

    public static void main(String[] args) {
        changeMass();
        makeSpace();
        fillMass();
        makeSpace();
        changeMass2();
        makeSpace();
        fillSquareMass();
        makeSpace();
        findMinMax();
    }

    static void makeSpace() {  // Сделал для разделения заданий в командной строке
        System.out.println(" ");
    }

    static void changeMass() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
            System.out.println(a[i]);
        }
    }

    static void fillMass() {
        int[] a = new int[7];
        for (int i = 1, j = 0; i < a.length; i++) {
            a[i] = j += 3;
            System.out.println(a[i]);
        }
    }

    static void changeMass2() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
            System.out.println(a[i]);
        }
    }

    static void fillSquareMass() {
        int[][] a = new int[6][6];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0, j2 = a[i].length; j < a[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)){
                    a[i][j] = 1;
                }
                System.out.print(a[i][j]);
            }
            System.out.print("\r\n");
        }
    }
    static void findMinMax(){
        int[] a = {0, 2, 6, 4, 3, 1, 10, 7};
        int min = a[0];
        int max = a[0];
        int minRes = 0;
        int maxRes = 0;
        for (int i = 1; i < a.length; i++){
            if(a[i-1] < min){
                a[i] = min;
                minRes = i + 1;  //Почему тут не происходит сложение?
            }
            if(a[i-1] > max){
                a[i] = max;
                maxRes = i + 1;
            }
        }
        System.out.print(maxRes + " " + minRes);
    }
}
