package com.hnbcit.selectionsort;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description:选择排序算法(优化版)
 * @author: hhx
 * @date:2020/5/23 23:08
 * 优化1:if+赋值--->三元运算符
 * 优化2:外循环条件arr.length--->arr.length-1  边界处理:减少最后一次多余的循环
 * 优化3:遍历数组--->方法提取
 * 优化4:数据交换--->方法提取
 */

public class SelectionSortOptimizedVersion1 {
    public static void main(String[] args) {
        //准备数据
//        int[] arr={5,7,2,8,3,9,1,6,4};
        int[] arr = randomArray(15);
        //执行排序
        long star = System.currentTimeMillis();

            for (int i = 0; i < arr.length-1; i++) {
                int minPosition=i;
                for (int j = i+1; j < arr.length; j++) {
                    minPosition = arr[minPosition]>arr[j] ? j : minPosition;
                }
            System.out.println("minPosition="+minPosition);
                //调用交换方法
                swap(arr, i, minPosition);
            System.out.println("经过第"+(i+1)+"次循环之后,数组的内容:");
                //调用打印方法
            printArray(arr);
            }
        long end = System.currentTimeMillis();

        System.out.println("选择排序普通版耗时:"+(end-star)+"毫秒");
    }

    /**
     * 交换数据
     * @param arr:数组
     * @param i :下标1
     * @param j :下标2
     */
    public static void swap(int[] arr, int i, int j) {
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 打印数据
     * @param arr :数组
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] randomArray(int length) {
        int [] arr=new int[length];
        Random random =new Random();
        for (int i = 0; i <length ; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
