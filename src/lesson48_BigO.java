public class lesson48_BigO {
    public static int[] intArr = {1, 2, 5, 7, 26, 3, 44, 12};
    /**
     * Big O - понятие по которой оцениевется сложность алгоритма,
     * оценивается наихудший вариант алгоритма
     *
     * O(1) -константная сложность
     * О(N) - линейная сложность
     * O(log N)
     * O(N^2)
     * O(2^N)
     * O(N!)
     */

    /**         O(1) - константное время выполнение           */
    public void complexityO_1() {
        int x = intArr[1];
        /**
         * for x : N
         * for y : N
         */
    }

    /**  O(N) - время выполнения линейно зависит от размера массива  */
    public void complexityO_N() {
        int sum = 0;
        for (int x : intArr) {
            sum += x;
        }

        /** в данном случае сложность все равно будет O(N), а не O(2N)*/
        int min = intArr[0];
        int max = intArr[0];
        for (int x : intArr) {
            if (x < min) {
                min = x;
            }
        }
        for (int x : intArr) {
            if (x > max) {
                max = x;
            }
        }

        /** O(N/2) = O(N)*/
        for (int i = 0; i < intArr.length/2; i++) {
            System.out.println(i);
        }
    }

    /**  O(N^2) - время выполнения линейно зависит от размера массива
     * тк в каждом цикле проходится весь массив, если бы циклы были не вложенные, то сложность была бы
     * O(N + N) = O(2N) = O(N) тк 2 - константа и ей можно принебречь
     */
    public void complexityNsqrt() {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length; j++) {
                System.out.println(intArr[i] + intArr[j]);
            }
        }

        /**  В данном случае все равно O(N^2), тк
         * O(N^2) - для внешнего цикла и
         * O(N + (N - 1) ... + 1) - для вложенного, = O(N^2/2)
         * O(N^2/2) + O(N^2) = O(N^2)
         */
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i; j < intArr.length; j++) {
                System.out.println(intArr[i] + intArr[j]);
            }
        }

    }
    /** в данном случае сложность все равно будет O(log N)
     * в данном случае сложность будет равна 4, тк массив из 16 отсортированных элементо можно пройти за 4 итерации,
     * но если представить это по другому, то будет 2^4 (тк делим на два подмассива), в общем виде, сложность:
     * 2^k = N
     * k = log2 N
     * O(k) = O(log2N), при этом 2 - константа, а константы при определении сложности не играют значения, следовательно:
     * O(k) = O(logN)
     * */
    public static int binarySearch () {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int x = 3;
        int l = 0;
        int r = arr.length - 1;
        while (l <= r){
            int m = l + (r - l) / 2;
            if(arr[m] == x) {
                return m;
            }
            if (arr[m] < x) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return -1;
    }

    /** O(A * B)   тк А и В различны по длине, следовательно и сложность разлина   */
    public void complexityAB(){
        int[] A = {1, 2, 3, 4};
        int[] B = {5, 6, 7, 8, 9};
        for (int x : A) {
            for (int y : B) {
                System.out.println(x + y);
            }
        }
    }

}
