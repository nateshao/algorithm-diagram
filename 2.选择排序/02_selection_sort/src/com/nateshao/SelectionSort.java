package com.nateshao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @date Created by 邵桐杰 on 2020/12/3 23:37
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description：选择排序
 * 编写一个用于找出数组中最小元素的函数
 */
public class SelectionSort {

    private static List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>(arr.size());

        int size = arr.size();
        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(arr);
            newArr.add(arr.get(smallest));
            arr.remove(smallest);
        }
        return newArr;
    }

    private static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);  //存储最小的值
        int smallestIndex = 0;      //存储最小元素的索引
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSort(arr)); //[2, 3, 5, 6, 10]
    }
    /**
     * 计算机内存犹如一大堆抽屉。
     * 需要存储多个元素时，可使用数组或链表。
     * 数组的元素都在一起。
     * 链表的元素是分开的，其中每个元素都存储了下一个元素的地址。
     * 数组的读取速度很快。
     * 链表的插入和删除速度很快。
     * 在同一个数组中，所有元素的类型都必须相同（都为int、double等）
     */
}
