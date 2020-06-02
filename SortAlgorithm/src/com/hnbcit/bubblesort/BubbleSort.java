package com.hnbcit.bubblesort;

/**
 * @Description:冒泡算法
 * @author: hhx
 * @date:2020/5/26 22:47
 */

public class BubbleSort {
    public static void sort(int[] arr) {
//        int[] arr ={5,4,6,8,7,2,9,1,3};

        for (int i = arr.length-1; i >0; i--) {
        //每两个数据
            for (int j = 0; j <i; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
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
