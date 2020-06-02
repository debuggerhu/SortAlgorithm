package com.hnbcit;

import com.hnbcit.bubblesort.BubbleSortOptimizedVersion1;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description:验证算法-对数器
 * @author: hhx
 * @date:2020/5/24 23:17
 */

public class DataChecker {
    public static void main(String[] args) {
        int[] arr = randomArray(10);
        int[] arr2 = new int[arr.length];
        //拷贝一份(拷贝的原是:如果不拷贝,则比较的是原始的数组)
        System.arraycopy(arr,0,arr2,0,arr.length);
        //用自己写的算法排序
//        SelectionSort.sort(arr);//选择排序
//        BubbleSort.sort(arr);//冒泡排序
        BubbleSortOptimizedVersion1.sort(arr);
        //用JDK自带的系统算法进行排序
        Arrays.sort(arr2);
        //比较两个排序后的序列是否相同
        Boolean isSame = true;
        for (int i = 0; i < arr.length; i++) {
            //如果有任意一个值不等,终止循环
            if (arr[i] != arr2[i]){
                isSame = false;
                System.out.println("验证异常,请检查算法代码!");
                break;
            }
        }
        System.out.println("验证结果为:"+isSame);
    }


    //打印
     static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //交换
    static int[] swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }


     //产生随机数组
     static int[] randomArray(int ArrayLength){
        Random random = new Random();
        int[] arr = new int[ArrayLength];
        for (int i = 0; i <ArrayLength; i++) {
            arr[i] = random.nextInt(100);
        }
        //打印一下原始数组
        System.out.println("原始:"+Arrays.toString(arr));
        return arr;
    }
}
