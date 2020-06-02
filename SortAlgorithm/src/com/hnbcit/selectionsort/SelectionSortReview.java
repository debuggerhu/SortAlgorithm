package com.hnbcit.selectionsort;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description:选择排序回顾
 * @author: hhx
 * @date:2020/5/24 7:47
 */

public class SelectionSortReview {

    public static void main(String[] args) {
        int[] arr = randomArray(10);
        //排序处理

        long star = System.currentTimeMillis();
        for (int i = 0; i <(arr.length/2+1) ; i++) {
            int minIndex = i;
            int maxIndex = arr.length-i-1;
            for (int j = i; j <arr.length-i ; j++) {
                minIndex = arr[minIndex]>arr[j] ? j : minIndex;
                maxIndex = arr[maxIndex]<arr[j] ? j : maxIndex;
            }
            System.out.println("minIndex:"+minIndex);
            System.out.println("maxIndex:"+maxIndex);
            swap(arr, i, minIndex);

            //交换小的数到最前面的位置后,需要做一个判断
            //如果最大值刚好在最前面的位置,由于先把最小值交换到最前面,此时最大值得位置就改变了,那么响应的,最大值得下标应该修改一下
            if (i == maxIndex){
                //此处需要特别注意,网上很多例子的错误原因就在这儿没有做交换的动作
                maxIndex = minIndex;
            }

            swap(arr, arr.length-i-1, maxIndex);

            System.out.println("经过第"+(i+1)+"次循环后的数组:");
            print(arr);
        }
        long end = System.currentTimeMillis();

        System.out.println("选择排序优化版耗时:"+(end-star)+"毫秒");
    }

    public static void print(int[] arr) {
        //打印输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void swap(int[] arr, int i, int minIndex) {
        //交换位置
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static int[] randomArray(int length) {
        int [] arr=new int[length];
        Random random =new Random();
        for (int i = 0; i <length ; i++) {
            arr[i] = random.nextInt(100);
        }
        //先进行一次原始数组的打印
        System.out.println(Arrays.toString(arr));
        return arr;
    }


}
