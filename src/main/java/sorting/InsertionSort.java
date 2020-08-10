package sorting;

import java.util.Arrays;

/* 如果本身就是有序的，那么没有要找"小"的元素往前放的过程，遍历一次就完了: O(n)
*      tmp: 每次都记录当前的值；
*   如果是selection sort: 每次都记录这次开始遍历的index，就是要插入的index
*  */
public class InsertionSort {

    // 左边都是有序，右边无序: 每次前进一位，这一位找到应该insert的位置
    public static void insertionsort(int[] arr) {
        int tmp = 0;
        for (int i = 1; i < arr.length; i++) {
            tmp = arr[i];
            // 当前的数比较小
            if (arr[i] < arr[i-1]) {
                for (int j = i; j >=0 ; j--) {
                    if (j > 0 && arr[j-1] > tmp) {
                        arr[j] = arr[j-1]; // 每个数，向后移动
                    } else {
                        arr[j] = tmp; // insert here
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 11, 15, 43, 99, 21, 1};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
