package com.hnbcit.bubblesort;

/**
 * @Description:冒泡算法,思路分部法
 * @author: hhx
 * @date:2020/5/26 23:12
 */

public class BubbleSortSimple {
    public static void main(String[] args) {
        int[] arr ={5,4,6,8,7,2,9,1,3};
        sort(arr);
        print(arr);
    }

    //冒泡排序算法
     static void sort(int[] arr) {
        //剩下的再继续排序排,除去排列好的一个,即长度需要递减
        for (int i = arr.length-1; i >0; i--) {
            findMax(arr,i);
            print(arr);
        }
    }

    //从左端开始,每两个找出最大的值,做数据交换,保证最大值在最右边
    static void findMax(int[] arr ,int n){
        for (int j = 0; j <n; j++) {
            if(arr[j]>arr[j+1]){
                swap(arr,j,j+1);
            }
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
