package com.hnbcit.selectionsort;

/**
 * @Description:选择排序算法(基础版)
 * @author: hhx
 * @date:2020/5/23 22:36
 */

public class SelectionSort {
    public static void sort(int [] arr) {
        //准备数据
//        int [] arr={5,7,2,8,3,9,1,6,4};
        //进行排序
        for (int i = 0; i <arr.length ; i++) {
            int minPosition=i;//最小值的索引

            for (int j = i+1; j< arr.length; j++) {
                if (arr[j]<arr[minPosition]){
                    minPosition = j;
                }
            }

            System.out.println("minPosition:"+arr[minPosition]);

            //交换与minPosition的数
            int temp=arr[i];
            arr[i]=arr[minPosition];
            arr[minPosition]=temp;
        }


        //打印输出结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
