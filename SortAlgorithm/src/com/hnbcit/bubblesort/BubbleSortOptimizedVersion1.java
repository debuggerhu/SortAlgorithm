package com.hnbcit.bubblesort;

/**
 * @Description:冒泡算法优化版
 * 优化:在非最坏的情况下，冒泡排序过程中，可以检测到整个序列是否已经排序完成，进而可以避免掉后续的循环：
 * @author: hhx
 * @date:2020/5/26 23:38
 */

public class BubbleSortOptimizedVersion1 {
    public static void sort(int[] arr) {
//        int[] arr ={5,4,6,8,7,2,9,1,3};
//        int[] arr ={1,2,3,4,5,6,7,8,9};

        for (int i = arr.length-1; i >0; i--) {
            Boolean IsSwap = false;
        //每两个数据
            for (int j = 0; j <i; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    IsSwap = true;
                }
            }
            //判断是否是已经排好序的
            if (!IsSwap){//不是
                break;
            }
        print(arr);
            System.out.println();
        }
    }

    //交换
    static int[] swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }

    //打印
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
