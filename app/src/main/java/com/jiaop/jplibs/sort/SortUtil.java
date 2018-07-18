package com.jiaop.jplibs.sort;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/17
 *     desc   : 排序算法
 *     version: 1.0.0
 * </pre>
 */
public class SortUtil {

    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void BubbleSort1(int[] arr) {
        int temp;
        boolean flag;
        for (int i = 0; i < arr.length - 1; i++) {
            flag = false;
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void select_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            if (k != i) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
    }

    /**
     * 插入排序
     *
     * @param a
     */
    private void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = temp;
        }
    }

    /**
     * 希尔排序
     *
     * @param array
     */
    public static void shell_sort(int[] array) {
        int temp = 0;
        int incre = array.length;
        while (true) {
            incre = incre / 2;
            for (int k = 0; k < incre; k++) {
                for (int i = k + incre; i < array.length; i += incre) {
                    for (int j = i; j > k; j -= incre) {
                        if (array[j] < array[j - incre]) {
                            temp = array[j - incre];
                            array[j - incre] = array[j];
                            array[j] = temp;
                        } else {
                            break;
                        }
                    }
                }
            }
            if (incre == 1) {
                break;
            }
        }
    }

    /**
     * 快速排序
     *
     * @param a
     * @param l
     * @param r
     */
    public static void quickSort(int a[], int l, int r) {
        if (l >= r)
            return;
        int i = l;
        int j = r;
        int key = a[l];
        while (i < j) {
            while (i < j && a[j] >= key)
                j--;
            if (i < j) {
                a[i] = a[j];
                i++;
            }
            while (i < j && a[i] < key)
                i++;
            if (i < j) {
                a[j] = a[i];
                j--;
            }
        }
        a[i] = key;
        quickSort(a, l, i - 1);
        quickSort(a, i + 1, r);
    }

    /**
     * 归并排序
     *
     * @param a
     * @param first
     * @param last
     * @param temp
     */
    public static void merge_sort(int a[], int first, int last, int temp[]) {
        if (first < last) {
            int middle = (first + last) / 2;
            merge_sort(a, first, middle, temp);
            merge_sort(a, middle + 1, last, temp);
            mergeArray(a, first, middle, last, temp);
        }
    }

    public static void mergeArray(int a[], int first, int middle, int end, int temp[]) {
        int i = first;
        int m = middle;
        int j = middle + 1;
        int n = end;
        int k = 0;
        while (i <= m && j <= n) {
            if (a[i] <= a[j]) {
                temp[k] = a[i];
                k++;
                i++;
            } else {
                temp[k] = a[j];
                k++;
                j++;
            }
        }
        while (i <= m) {
            temp[k] = a[i];
            k++;
            i++;
        }
        while (j <= n) {
            temp[k] = a[j];
            k++;
            j++;
        }
        for (int ii = 0; ii < k; ii++) {
            a[first + ii] = temp[ii];
        }
    }

    /**
     * 基数排序
     *
     * @param a    原数组
     * @param temp 历史数组
     * @param k    最大的位数2
     * @param r    基数10
     * @param cnt  存储bin[i]的个数
     */
    public static void RadixSort(int a[], int temp[], int k, int r, int cnt[]) {
        for (int i = 0, rtok = 1; i < k; i++, rtok = rtok * r) {
            for (int j = 0; j < r; j++) {
                cnt[j] = 0;
            }
            for (int j = 0; j < a.length; j++) {
                cnt[(a[j] / rtok) % r]++;
            }
            for (int j = 1; j < r; j++) {
                cnt[j] = cnt[j - 1] + cnt[j];
            }
            for (int j = a.length - 1; j >= 0; j--) {
                cnt[(a[j] / rtok) % r]--;
                temp[cnt[(a[j] / rtok) % r]] = a[j];
            }
            for (int j = 0; j < a.length; j++) {
                a[j] = temp[j];
            }
        }
    }

}
