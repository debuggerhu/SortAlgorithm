package com.hnbcit.selectionsort;

/**
 * @Description:选择排序算法(优化版)
 * @author: hhx
 * @date:2020/5/23 23:58
 * 优化1:if+赋值--->三元运算符
 * 优化2:外循环条件arr.length--->arr.length-1  边界处理:减少最后一次多余的循环
 * 优化3:遍历数组--->方法提取
 * 优化4:数据交换--->方法提取
 *  >>>再进一步优化
 * 优化5:每一次遍历,将最大的值也找出来,将最大值放到后头,少了1/2的外层循环的遍历
 *
 */

public class SelectionSortOptimizedVersion2 {
    public static void main(String[] args) {
        //准备数据
        int[] arr={5,7,2,8,3,9,1,6,4};

        //执行排序
        for (int i = 0; i <(arr.length/2+1); i++) {
            int minPosition=i;
            int maxPosition=arr.length-(i+1);
            for (int j = i; j < arr.length-i; j++) {
                minPosition = arr[minPosition]>arr[j] ? j : minPosition;
                maxPosition = arr[maxPosition]<arr[j] ? j : maxPosition;
            }

            System.out.println("minPosition="+minPosition);
            System.out.println("maxPosition="+maxPosition);

            swap(arr, i, minPosition);


            if (i == maxPosition){
                maxPosition = minPosition;
            }
            swap(arr, arr.length-(i+1), maxPosition);
            //调用交换方法

            System.out.println("经过第"+(i+1)+"次循环之后,数组的内容:");
            //调用打印方法
            printArray(arr);
        }
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
}
