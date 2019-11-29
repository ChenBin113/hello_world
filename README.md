# 目录

<!-- MarkdownTOC levels="1,2,3" autolink="true" -->

- [java-algorithm](#java-algorithm)
    - [说明](#%E8%AF%B4%E6%98%8E)
    - [分类](#%E5%88%86%E7%B1%BB)
    - [排序](#%E6%8E%92%E5%BA%8F)
- [排序](#%E6%8E%92%E5%BA%8F-1)
    - [冒泡排序](#%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F)
    - [选择排序](#%E9%80%89%E6%8B%A9%E6%8E%92%E5%BA%8F)
    - [插入排序](#%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F)
    - [希尔排序](#%E5%B8%8C%E5%B0%94%E6%8E%92%E5%BA%8F)
    - [归并排序](#%E5%BD%92%E5%B9%B6%E6%8E%92%E5%BA%8F)
        - [小和问题](#%E5%B0%8F%E5%92%8C%E9%97%AE%E9%A2%98)
        - [逆序对问题](#%E9%80%86%E5%BA%8F%E5%AF%B9%E9%97%AE%E9%A2%98)
    - [快速排序](#%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F)
        - [问题一](#%E9%97%AE%E9%A2%98%E4%B8%80)
        - [问题二 荷兰国旗问题](#%E9%97%AE%E9%A2%98%E4%BA%8C-%E8%8D%B7%E5%85%B0%E5%9B%BD%E6%97%97%E9%97%AE%E9%A2%98)
        - [总结](#%E6%80%BB%E7%BB%93)
        - [经典快排](#%E7%BB%8F%E5%85%B8%E5%BF%AB%E6%8E%92)
        - [随机快排](#%E9%9A%8F%E6%9C%BA%E5%BF%AB%E6%8E%92)
    - [堆排序](#%E5%A0%86%E6%8E%92%E5%BA%8F)
        - [堆](#%E5%A0%86)
        - [heapInsert](#heapinsert)
        - [堆的大小 size](#%E5%A0%86%E7%9A%84%E5%A4%A7%E5%B0%8F-size)
        - [heapify](#heapify)
        - [pop](#pop)
        - [问题一 随时找到数据流的中位数](#%E9%97%AE%E9%A2%98%E4%B8%80-%E9%9A%8F%E6%97%B6%E6%89%BE%E5%88%B0%E6%95%B0%E6%8D%AE%E6%B5%81%E7%9A%84%E4%B8%AD%E4%BD%8D%E6%95%B0)
        - [堆排序](#%E5%A0%86%E6%8E%92%E5%BA%8F-1)
    - [排序算法的稳定性](#%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95%E7%9A%84%E7%A8%B3%E5%AE%9A%E6%80%A7)
    - [排序总结](#%E6%8E%92%E5%BA%8F%E6%80%BB%E7%BB%93)
    - [比较器](#%E6%AF%94%E8%BE%83%E5%99%A8)
    - [比较器的一点思考](#%E6%AF%94%E8%BE%83%E5%99%A8%E7%9A%84%E4%B8%80%E7%82%B9%E6%80%9D%E8%80%83)
    - [非基于比较的排序](#%E9%9D%9E%E5%9F%BA%E4%BA%8E%E6%AF%94%E8%BE%83%E7%9A%84%E6%8E%92%E5%BA%8F)
        - [问题一 计数排序和基数排序](#%E9%97%AE%E9%A2%98%E4%B8%80-%E8%AE%A1%E6%95%B0%E6%8E%92%E5%BA%8F%E5%92%8C%E5%9F%BA%E6%95%B0%E6%8E%92%E5%BA%8F)
        - [问题二 使用非基于比较排序](#%E9%97%AE%E9%A2%98%E4%BA%8C-%E4%BD%BF%E7%94%A8%E9%9D%9E%E5%9F%BA%E4%BA%8E%E6%AF%94%E8%BE%83%E6%8E%92%E5%BA%8F)
- [数组 - 栈 - 队列](#%E6%95%B0%E7%BB%84---%E6%A0%88---%E9%98%9F%E5%88%97)
    - [使用数组模拟栈和队列](#%E4%BD%BF%E7%94%A8%E6%95%B0%E7%BB%84%E6%A8%A1%E6%8B%9F%E6%A0%88%E5%92%8C%E9%98%9F%E5%88%97)
    - [设计 getMin\(\) 操作时间复杂度为 O\(1\) 的栈](#%E8%AE%BE%E8%AE%A1-getmin-%E6%93%8D%E4%BD%9C%E6%97%B6%E9%97%B4%E5%A4%8D%E6%9D%82%E5%BA%A6%E4%B8%BA-o1-%E7%9A%84%E6%A0%88)
    - [使用栈实现队列](#%E4%BD%BF%E7%94%A8%E6%A0%88%E5%AE%9E%E7%8E%B0%E9%98%9F%E5%88%97)
    - [使用队列实现栈](#%E4%BD%BF%E7%94%A8%E9%98%9F%E5%88%97%E5%AE%9E%E7%8E%B0%E6%A0%88)
    - [猫狗队列问题](#%E7%8C%AB%E7%8B%97%E9%98%9F%E5%88%97%E9%97%AE%E9%A2%98)
- [矩阵问题](#%E7%9F%A9%E9%98%B5%E9%97%AE%E9%A2%98)
    - [问题一 转圈打印矩阵](#%E9%97%AE%E9%A2%98%E4%B8%80-%E8%BD%AC%E5%9C%88%E6%89%93%E5%8D%B0%E7%9F%A9%E9%98%B5)
        - [思路](#%E6%80%9D%E8%B7%AF)
        - [实现](#%E5%AE%9E%E7%8E%B0)
        - [测试](#%E6%B5%8B%E8%AF%95)
    - [问题二 旋转正方形矩阵](#%E9%97%AE%E9%A2%98%E4%BA%8C-%E6%97%8B%E8%BD%AC%E6%AD%A3%E6%96%B9%E5%BD%A2%E7%9F%A9%E9%98%B5)
        - [思路](#%E6%80%9D%E8%B7%AF-1)
        - [实现](#%E5%AE%9E%E7%8E%B0-1)
        - [测试](#%E6%B5%8B%E8%AF%95-1)
        - [小总结](#%E5%B0%8F%E6%80%BB%E7%BB%93)
    - [问题三 之字形打印矩阵](#%E9%97%AE%E9%A2%98%E4%B8%89-%E4%B9%8B%E5%AD%97%E5%BD%A2%E6%89%93%E5%8D%B0%E7%9F%A9%E9%98%B5)
        - [思路](#%E6%80%9D%E8%B7%AF-2)
        - [实现](#%E5%AE%9E%E7%8E%B0-2)
        - [测试](#%E6%B5%8B%E8%AF%95-2)
        - [小总结](#%E5%B0%8F%E6%80%BB%E7%BB%93-1)
    - [问题四 在行列都排好序的矩阵中找数](#%E9%97%AE%E9%A2%98%E5%9B%9B-%E5%9C%A8%E8%A1%8C%E5%88%97%E9%83%BD%E6%8E%92%E5%A5%BD%E5%BA%8F%E7%9A%84%E7%9F%A9%E9%98%B5%E4%B8%AD%E6%89%BE%E6%95%B0)
        - [思路](#%E6%80%9D%E8%B7%AF-3)
        - [实现](#%E5%AE%9E%E7%8E%B0-3)
        - [测试](#%E6%B5%8B%E8%AF%95-3)
- [链表](#%E9%93%BE%E8%A1%A8)
    - [问题一 反转单向和双向链表](#%E9%97%AE%E9%A2%98%E4%B8%80-%E5%8F%8D%E8%BD%AC%E5%8D%95%E5%90%91%E5%92%8C%E5%8F%8C%E5%90%91%E9%93%BE%E8%A1%A8)
        - [反转单向链表](#%E5%8F%8D%E8%BD%AC%E5%8D%95%E5%90%91%E9%93%BE%E8%A1%A8)
        - [反转双向链表](#%E5%8F%8D%E8%BD%AC%E5%8F%8C%E5%90%91%E9%93%BE%E8%A1%A8)
    - [问题二 打印两个有序链表的公共部分](#%E9%97%AE%E9%A2%98%E4%BA%8C-%E6%89%93%E5%8D%B0%E4%B8%A4%E4%B8%AA%E6%9C%89%E5%BA%8F%E9%93%BE%E8%A1%A8%E7%9A%84%E5%85%AC%E5%85%B1%E9%83%A8%E5%88%86)
    - [问题三 判断一个链表是否为回文结构](#%E9%97%AE%E9%A2%98%E4%B8%89-%E5%88%A4%E6%96%AD%E4%B8%80%E4%B8%AA%E9%93%BE%E8%A1%A8%E6%98%AF%E5%90%A6%E4%B8%BA%E5%9B%9E%E6%96%87%E7%BB%93%E6%9E%84)
        - [思路](#%E6%80%9D%E8%B7%AF-4)
        - [快慢指针举例](#%E5%BF%AB%E6%85%A2%E6%8C%87%E9%92%88%E4%B8%BE%E4%BE%8B)
        - [进阶](#%E8%BF%9B%E9%98%B6)
        - [思路](#%E6%80%9D%E8%B7%AF-5)
        - [实现](#%E5%AE%9E%E7%8E%B0-4)
    - [问题四 单向链表的荷兰国旗问题](#%E9%97%AE%E9%A2%98%E5%9B%9B-%E5%8D%95%E5%90%91%E9%93%BE%E8%A1%A8%E7%9A%84%E8%8D%B7%E5%85%B0%E5%9B%BD%E6%97%97%E9%97%AE%E9%A2%98)
        - [思路](#%E6%80%9D%E8%B7%AF-6)
        - [实现](#%E5%AE%9E%E7%8E%B0-5)
        - [进阶](#%E8%BF%9B%E9%98%B6-1)
        - [思路](#%E6%80%9D%E8%B7%AF-7)
        - [实现](#%E5%AE%9E%E7%8E%B0-6)
- [二叉树](#%E4%BA%8C%E5%8F%89%E6%A0%91)
    - [二叉树按层遍历打印](#%E4%BA%8C%E5%8F%89%E6%A0%91%E6%8C%89%E5%B1%82%E9%81%8D%E5%8E%86%E6%89%93%E5%8D%B0)
    - [二叉树的序列化和反序列化](#%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%BA%8F%E5%88%97%E5%8C%96%E5%92%8C%E5%8F%8D%E5%BA%8F%E5%88%97%E5%8C%96)
- [数组](#%E6%95%B0%E7%BB%84)
    - [问题一](#%E9%97%AE%E9%A2%98%E4%B8%80-1)
    - [问题二](#%E9%97%AE%E9%A2%98%E4%BA%8C)
    - [问题三](#%E9%97%AE%E9%A2%98%E4%B8%89)
    - [问题四](#%E9%97%AE%E9%A2%98%E5%9B%9B)
    - [问题五](#%E9%97%AE%E9%A2%98%E4%BA%94)
- [待定](#%E5%BE%85%E5%AE%9A)

<!-- /MarkdownTOC -->

# java-algorithm

## 说明

- This repository is stored some Java code to implement the Algorithm.
- 这个项目存放一些以 Java 语言实现的算法，巩固数据结构与算法的知识。

## 分类

```
├─algorithm
│  └─src
│      └─chapter1
└─demo
   └─src
       ├─array_stack_queue
       ├─binarysearchtree
       ├─linkedlist
       ├─matrix
       ├─search
       ├─sort
       └─util
```



## 排序 

| 方式   | 算法         | 时间复杂度 | 空间复杂度 | 稳定性 | 数据排序情况 |
| ------ | ------------ | ---------- | ---------- | ------ | ------------ |
| 交换   | 冒泡排序     | O(n^2)     | O(1)       | 稳定   | 无关         |
|        | 随机快排     | O(N*logN)  | O(logN)    | 不稳定 | 无关         |
| 插入   | 直接插入排序 | O(n^2)     | O(1)       | 稳定   | 有关         |
|        | 希尔排序     | O(n^3/2^)  | O(1)       | 不稳定 |              |
| 选择   | 直接选择排序 | O(n^2)     | O(1)       | 不稳定 | 无关         |
|        | 堆排序       | O(N*logN)  | O(1)       | 不稳定 | 无关         |
| 分治   | 归并排序     | O(N*logN)  | O(N)       | 稳定   | 无关         |
| 非比较 | 计数排序     | O(N)       | O(N)       | 不稳定 | 有关         |
|        | 基数排序     | O(N)       | O(N)       | 不稳定 | 有关         |


# 排序

## 冒泡排序

```java
public static void bubbleSort(int[] arr) {
    if (arr == null || arr.length < 2) return;
    for (int i = arr.length - 1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j);
            }
        }
    }
}
```

冒泡排序比较简单，但是容易出现冗余的循环，即使是一个已经排序的数组传入仍然需要遍历 O(n ^ 2)。

## 选择排序

```java
public static void selectSort(int[] arr) {
    if (arr == null || arr.length < 2) return;
    for (int i = 0; i < arr.length - 1; i++) {
        int min = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[min] > arr[j]) {
                min = j;
            }
        }
        if (i != min) {
            swap(arr, i, min);
        }
    }
}
```

选择排序时间复杂度也是 O(n ^ 2)。

## 插入排序

```java
public static void insertSort(int[] arr) {
    if (arr == null || arr.length < 2) return;
    for (int i = 1; i < arr.length; i++) {
        for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
            swap(arr, j, j + 1);
        }
    }
}
```

插入排序，有可能是 O(n) 也有可能是 O(n^2)，和数据是否已经有序有关。

## 希尔排序

```java
public static void shellSort(int[] array) {
    int gap = array.length;
    while (true) {
        if (gap == 1) {
            break;
        }
        gap /= 2;
        for (int i = gap; i < array.length; i++) {
            for (int j = i; j - gap >= 0; j = j - gap) {
                if (array[j] < array[j - gap]) {
                    swap(array, j, j - gap);
                }
            }
        }
    }
}
```

希尔排序的关键是**步长的选择**，时间复杂度为 O(n^3/2^)。

## 归并排序

```java
public static void mergeSort(int[] arr) {
    if (arr == null || arr.length < 2) {
        return;
    }
    mergeSort(arr, 0, arr.length - 1);
}


public static void mergeSort(int[] arr, int l, int r) {
    if (l == r) {
        return;
    }
    int mid = l + ((r - l) >> 2);
    mergeSort(arr, l, mid);
    mergeSort(arr, mid + 1, r);
    merge(arr, l, mid, r);
}

public static void merge(int[] arr, int l, int m, int r) {
    //这个数组是临时生成的，使用过后又马上销毁，最大的长度为排序数组的长度，所以额外空间为 O(n)
    int[] helper = new int[r - l + 1];
    int i = 0;
    int p1 = l;
    int p2 = m + 1;
    while (p1 <= m && p2 <= r) {
        helper[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
    }
    //下面两个循环有且只有一个会执行
    while (p1 <= m) {
        helper[i++] = arr[p1++];
    }
    while (p2 <= r) {
        helper[i++] = arr[p2++];
    }
    //需要注意 l 为归并的左边界，不是定值 0
    for (int j = 0; j < helper.length; j++) {
        arr[l + j] = helper[j];
    }
}
```

归并排序使用了递归的方式，利用 master 公式可以分析分治思路算法的时间复杂度。关于 master 公式可以参看这篇[文章](https://blog.csdn.net/qq_32595453/article/details/79516787)。归并排序使用了额外的存储空间，时间复杂度为 O(n * logn)，空间复杂度为 O(n)。

### 小和问题

在一个数组中，每一个数左边比当前数小的数累加起来，叫做这个数组的小和。求一个数组的小和称为小和问题。

```java
input: [2,4,5,1,7,3]
2 左侧比 2 小的数，没有；
4 左侧比 4 小的数，2；
5 左侧比 5 小的数，2,4；
1 左侧比 1 小的数，没有；
7 左侧比 7 小的数，2,4,5,1；
3 左侧比 3 小的数，2,1。

output: 2+2+4+2+4+5+1+2+1=23
```

此处使用归并排序，在 merge 时，由于左右两部分都已经有序，可以确定一侧的数都大于正在比较的数，例如：

```java
归并 2 4 5 | 1 3 7 两个部分时，2 比 3 小，此时可以确定后面的数都大于 2，此时便可以一次性计算小和 2 * 2(两个数大于 2)，而不用一个个遍历。
```

#### 总结

使用归并排序算法的快速之处在于，归并的两个部分对内都是有序的，如 `2 4 5 | 1 3 7` 两个部分。因此在比较大小的时候，可以迅速确定整批的数据大小，而不用重复遍历计算。

又由于每一次 merge 的数据都是新的，此前没有重复算过，因此不会多次计算或漏算。

### 逆序对问题

在一个数组中，左边的数如果比右边的数大，则这两个数构成一个逆序对。

这个问题也适合使用归并排序的方法进行批量计算，例如

```java
仍然以 2 4 5 | 1 3 7 数据举例，因为
2 4 5 | 1 3 7
↑       ↑
此时 (2,1) 组成逆序对，因此 (4,1) (5,1) 逆序对也可以直接推导出来
```

使用这种计算有效的利用了归并排序 merge 过程中，两部分数据有序的特征，使得大大加快比较的速度。

## 快速排序

### 问题一

给定一个数组 arr，和一个数 num，请把小于等于 num 的数放在数组的左边，大于 num 的数放在数组的右边。

要求额外空间复杂度O(1)，时间复杂度O(N)。

思路：遇到 arr[i] 小于等于 number 的数，交换 index + 1 和 arr[i]，此时 index + 1 位置的数变成小于等于 number，index++；遇到 arr[i] 大于 number 的数，不做任何处理。index 表示的是数组中小于等于 number 的区域。

```java
<= number
	swap(arr, index+1, i)
    index++
>
    donothing
```



```java
public static void main(String[] args) {
    int[] arr = {1, 4, 56, 23, 34, 6, 34, 76, 23};
    int number = 30;
    fun1(arr, number);
    System.out.println(Arrays.toString(arr));
}

public static void fun1(int[] arr, int number) {
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
        //当扫描的数是小于等于 number，小于等于区域 index++
        if (arr[i] <= number) {
            swap(arr, index + 1, i);
            index++;
        }
    }
}

public static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}
```

output: [1, 4, 23, 6, 23, 56, 34, 76, 34]

输出的数组分成两个部分，小于等于 30 和大于 30 的。

### 问题二 荷兰国旗问题

给定一个数组 arr，和一个数 num，请把小于 num 的数放在数组的左边，等于 num 的数放在数组的中间，大于 num 的数放在数组的右边。

要求额外空间复杂度O(1)，时间复杂度O(N)。

思路：cur 为遍历的当前数指针，less 表示数组划分的小于 num 的区域，more 表示数组划分的大于 num 的区域。当 arr[cur] < num 时，交换 less + 1 和 cur 位置的数，此时 less + 1 位置的数小于 num，less + 1；当 arr[cur] = num 时，cur + 1；当 arr[cur] > num 时，交换 cur 和 more - 1 位置的数，more 区域从 [more, end] 扩大到 [more - 1, end]，此时 cur 位置的数交换而来，大小仍需计算，故 cur 不变。

```java
 while (cur != more && cur < arr.length) {
	< number
        swap(arr,less+1, cur)
        less++
        cur++
    = number
        cur++
    > number
        swap(arr, more-1, cur)
        more--
        //此处 cur 不变，仍需要看交换过来的 more-1 位的大小
}
```

```java
public static void main(String[] args) {
    int[] arr = {1, 4, 65, 50, 3, 4, 1, 50, 3, 64, 6, 64, 50, 3};
    fun1(arr, 50);
    //output: [1, 4, 3, 3, 4, 1, 3, 6, 50, 50, 50, 64, 64, 65]
    //由 number = 50 分为三个区域，小于 50，等于 50，大于 50
    System.out.println(Arrays.toString(arr));
}

public static void fun1(int[] arr, int number) {
    if (arr == null || arr.length < 2) return;
    int less = -1;
    int more = arr.length;
    int cur = 0;
    while (cur != more) {
        if (arr[cur] < number) {
            swap(arr, less + 1, cur);
            less++;
            cur++;
        } else if (arr[cur] == number) {
            cur++;
        } else {
            swap(arr, more - 1, cur);
            more--;
        }
    }
}

public static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}
```

output: [1, 4, 3, 3, 4, 1, 3, 6, 50, 50, 50, 64, 64, 65]

由 number = 50 分为三个区域，小于 50，等于 50，大于 50。

### 总结

问题一和问题二的算法思路是层层递进的，与快排中的单边循环法也有前后关系。在单向遍历过程中，利用多个指针将数组内部划分成不同的区域。

### 经典快排

经典快排的思路是选取数组的最后一个数 x，按照[问题一](#问题一)的思路把整个数组划分成 `小于等于 x | 大于 x` 两个部分，将 x 和 大于 x 部分数组的第一个元素交换位置。此时整个数组划分成 `小于等于 x | x | 大于 x` 三个部分，也就是这一次排序将 x 值排好位置。

再分别对 `小于等于 x` 和 `大于 x` 中的数组递归划分，直到划分成一个数，此时所有元素也完成排序。

按照[问题二](#问题二：荷兰国旗问题)的思路可以对经典快排做改进，使得每次划分数组成为`小于 x | 等于 x | 大于 x` 三个部分，通过这种排序方式可以一次划分多个 x 值的位置，排序效率得到提高。

但是，经典快排出现问题与**数据状况**有关。每次选择 x 值都是数组的最后一个数，如果遇到 `[1,2,3,4,5]` 或者 `[5,4,3,2,1]` 这种数组，算法时间复杂度将变成 O(n^2)。

### 随机快排

随机快排是经典快排的一种改进，通过生成随机下标 i，选择 a[i] 和最后一个数 x 进行交换，再使用经典快排。此时的事件就是一个概率事件，需要使用期望来估计算法的时间复杂度。

仍以 `[1,2,3,4,5]` 为例，经过随机快排初始变换，可以形成下列五种情况，数据状况的影响有效降低。在长期期望下，随机快排算法的时间复杂度为 O(N*logN)。由于每次划分数据都需要记录 =x 数组的下标范围，因此额外的空间复杂度为 O(logN)。

```java
5,2,3,4,1;
1,5,3,4,2;
1,2,5,4,3;
1,2,3,5,4;
1,2,3,4,5.
```

#### 思想

随机快排和经典快排的差别就在于添加了一行代码，使比较的数 x 具有随机性。

通过这种随机的方法处理特殊的数据，使得算法具有更好的鲁棒性。

#### 单边循环法和双边循环法

上述快排的实现都是从一个方向上遍历元素，然后分成两个数组，成为单边循环法。还有另一种实现的方法是双边循环，在《大话数据结构》书中可以看到实现。

虽然实现方法多种多样，但是其核心本质仍然是选取数组中的值与数组其他元素比较大小，经过一轮循环之后将数组分成两个部分。单边循环和双边循环本质上是一样的，只是实现方式上不同。

#### 快排代码

思路：使用 quickSort() 函数处理数组，先进行随机处理，使用核心方法 partition() 将数据分成 `小于 x | 等于 x | 大于 x` 三个部分，返回等于区域的左右下标值 [a, b]，递归调用 `小于 x` 区域和 `大于 x` 区域。

```java
quickSort(arr, left, right) {
	if (left < right) 
 		swap(); //随机快排的改动处
	    int[] p = partition(arr, left, right); //通过方法返回的是分组后确定的 = num 区域范围
		quickSort(arr, left, p[0] - 1); //递归 < num 区域
		quickSort(arr, p[1] + 1, right); //递归 > num 区域
}

partition(); //就是荷兰国旗问题的过程
```

```java
public static void quickSort(int[] arr) {
    if (arr == null || arr.length < 2) {
        return;
    }
    quickSort(arr, 0, arr.length - 1);
}


public static void quickSort(int[] arr, int left, int right) {
    //多余判断
    //if (left == right) {
    //    return;
    //}
    if (left < right) {
        //随机快排核心
        //Math.random() 取值范围 [0, 1)
        //(Math.random() * (right - left + 1)) 此处数值 <= (right - left)，因此可以保证参数 first 在区间内
        swap(arr, left + (int) (Math.random() * (right - left + 1)), right);
        int[] p = partition(arr, left, right);
        quickSort(arr, left, p[0] - 1);
        quickSort(arr, p[1] + 1, right);
    }
}


public static int[] partition(int[] arr, int left, int right) {
    int less = left - 1;
    int more = right + 1;
    //int more = right;
    //left 成为数组遍历的 cur 指针，当触碰到 more 边界时终止循环
    while (left < more) {
        if (arr[left] < arr[right]) {
            swap(arr, less + 1, left);
            less++;
            left++;
            //左神代码
            //swap(arr, ++less, left++);
        } else if (arr[left] == arr[right]) {
            left++;
        } else {
            swap(arr, left, more - 1);
            more--;
            //左神代码
            //swap(arr, left, --more);
        }
    }
    return new int[]{less + 1, more - 1};
    //return new int[]{less + 1, more};
}
```

手写代码过程中发现有些判断多余，因此做了注释。在整体代码中，有些语句能够精简成更简洁的代码，但是为了思路的连贯性，仅将简洁的代码做注释保留。从这些精简的代码中也可以看到一些优雅的代码真令人惊叹。

## 堆排序

注意，堆这个结构需要知道什么是满二叉树、完全二叉树。堆就是完全二叉树。

### 堆

使用数组存储数据，用数组模拟二叉堆结构，此时下标的关系有：

- 父结点 i 的左子结点为 2i + 1，右子结点为 2i + 2
- 子结点 i 找父结点公式为：(i - 1) / 2

堆分大根堆和小根堆，每一个结点为子树的最大值称为大根堆，同理可知小根堆。

以大根堆为例学习堆排序算法，小根堆同理做一些转换即可。

### heapInsert

构建堆时，heapInsert 是非常重要的构建方法。

建立 i 个数的堆，算法的时间复杂度为
$$
log(!(i-1)) = log1 + log2 + ··· + log(i-1)
$$
数学证明，最终得到建立过程的时间复杂度为 O(N)。

```java
public static void heapInsert(int[] arr, int i) {
    //每一次插入新结点，与父结点做比较，调整堆结构
    while (arr[i] > arr[(i - 1) / 2]) {
        swap(arr, i, (i - 1) / 2);
        i = (i - 1) / 2;
    }
}
```

### 堆的大小 size

堆在内存中可以使用数组实现，数组有数组的长度 length，堆有堆的大小 size，关系为：size <= length。当堆增加一个数时，使用 heapInsert，size++；当堆大小减少时，直接使用 size--，数组中的元素可以保留。

### heapify

两个字：**下沉**！堆排序的核心。

堆中的数据进行修改的时候 heapify 是非常重要的调整方法。调整的时间复杂度为 O(logN)。

当大根堆构建完成后，堆内第 i 个数变小，此时堆结构需要调整。

思路：确保 i 的子结点仍是堆内数据，比较得到两个子结点中的最大值，与 i 结点比较大小。如果 i 结点数大，则堆结构保持不变；否则，将 i 结点与子结点交换位置。循环上述堆结构调整流程。

```java
public static void heapify(int[] arr, int index, int heapSize) {
    int left = index * 2 + 1;
    while (left < heapSize) {
        //比较得到子结点较大值索引
        int largest = (left + 1) < heapSize && arr[left] < arr[left + 1]
            ? left + 1
            : left;
        //父结点和子结点比较
        largest = arr[index] < arr[largest] 
            ? largest
            : index;
        //数据改变了，但是仍保持大根堆结构
        if (largest == index) {
            break;
        }
        swap(arr, index, largest);
        //准备下一轮循环的条件
        index = largest;
        left = index * 2 + 1;
    }
}
```

### pop

将堆顶的数弹出，可以用 size - 1 位上的数和堆顶的数交换位置，然后 size--，最后进行 heapify 操作。

### 问题一 随时找到数据流的中位数

有一个源源不断地吐出整数的数据流，要求做到可以随时取得之前吐出所有数的中位数。这时可以使用两个堆：一个大根堆和一个小根堆存放数据，大根堆最大值小于小根堆的最小值。

思路：

```java
//处理数据流
假设大根堆堆顶为 big，小根堆堆顶为 small
获取第一个数，先进大根堆，这一步不硬性规定的
获取第二个数，比较
	if (num <= big) 进大根堆
	else 进小根堆
在处理了数据后，根据 Math.abs(big_size - small_size) < 2 的条件决定是否调整堆结构
	if true 不调整
	else
		if big_size 大，则大根堆执行 pop 操作，小根堆执行 heapInsert 操作
		else 小根堆执行 pop 操作，大根堆执行 heapInsert 操作
	
//计算中位数
if big_size = small_size return (big + small) / 2
else
    if big_size > small_size return big
    else return small
```

```java
public class _295_FindMedianfromDataStream {
    PriorityQueue<Integer> small_heap;
    PriorityQueue<Integer> big_heap;

    /** initialize your data structure here. */
    public _295_FindMedianfromDataStream() {
        small_heap = new PriorityQueue<>();
        big_heap = new PriorityQueue<>((a, b) -> b - a);
    }

    // version 1.0
    /*public void addNum(int num) {
        if (big_heap.isEmpty() && small_heap.isEmpty()) {
            big_heap.offer(num);
            return;
        }
        if (big_heap.size() == 1 && small_heap.isEmpty()) {
            if (big_heap.peek() > num) {
                small_heap.offer(big_heap.poll());
                big_heap.offer(num);
            } else {
                small_heap.offer(num);
            }
            return;
        }
        //当堆为空时，num 和 堆内元素比较会出现空指针错误
        if (small_heap.size() == big_heap.size()) {
            if (num < big_heap.peek()) {
                big_heap.offer(num);
            } else {
                small_heap.offer(num);
            }
        } else if (small_heap.size() < big_heap.size()) {
            if (num > big_heap.peek()) {
                small_heap.offer(num);
            } else {
                small_heap.offer(big_heap.peek());
                big_heap.poll();
                big_heap.offer(num);
            }
        } else {
            if (num < small_heap.peek()) {
                big_heap.offer(num);
            } else {
                big_heap.offer(small_heap.peek());
                small_heap.poll();
                small_heap.offer(num);
            }
        }
    }
     */

    // version 2.0
    public void addNum(int num) {
        if (big_heap.isEmpty() && small_heap.isEmpty()) {
            big_heap.offer(num);
            return;
        }
        if (num <= big_heap.peek()) {
            big_heap.offer(num);
        } else {
            small_heap.offer(num);
        }

        if (Math.abs(big_heap.size() - small_heap.size()) > 1) {
            if (big_heap.size() > small_heap.size()) {
                small_heap.offer(big_heap.poll());
            } else {
                big_heap.offer(small_heap.poll());
            }
        }
    }

    public double findMedian() {
        double res;
        if (small_heap.size() == big_heap.size()) {
            res = (small_heap.peek() + big_heap.peek()) / 2.0;
        } else if (small_heap.size() > big_heap.size()) {
            res = small_heap.peek();
        } else {
            res = big_heap.peek();
        }
        return res;
    }
}
```

上面是我做 LeetCode_295 题的代码，原理是相近的。此前做的时候绕了一些弯路，得到 version 1.0 版。

代码中使用了 Java 的优先级队列 ProrityQueue，在创建大根堆过程中使用了比较器。其实优先级队列就是堆的一种实现，不需要自己实现 heapInsert 和 heapify。

注意：PriorityQueue 的一些方法异同点

| 作用 | 抛出异常  | 返回值   |
| ---- | --------- | -------- |
| 插入 | add(e)    | offer(e) |
| 删除 | remove()  | poll()   |
| 查看 | element() | peek()   |



### 堆排序

三步：

- 堆顶和堆尾部交换位置
- 堆的大小减 1
- heapify 调整

大根堆完成从小到大的排序，小根堆完成从大到小的排序。

```java
public static void heapSort(int[] arr) {
    if (arr == null || arr.length < 2) {
        return;
    }
    for (int i = 0; i < arr.length; i++) {
        heapInsert(arr, i);
    }
    int heapSize = arr.length;
    while (heapSize != 0) {
        swap(arr, 0, heapSize - 1);
        heapSize--;
        //此处可以简化成一步
        //swap(arr, 0, --heapSize);
        heapify(arr, 0, heapSize);
    }
}
```

```java
/*和左神代码局部对比*/
//basic
int heapSize = arr.length;
while (heapSize != 0) {
    swap(arr, 0, heapSize - 1);
    heapSize--;
    heapify(arr, 0, heapSize);
}

//advanced
int size = arr.length;
swap(arr, 0, --size);
while (size > 0) {
    heapify(arr, 0, size);
    swap(arr, 0, --size);
}
```

从局部代码中可以看到，左神的代码利用了前面判断的 arr.length > 2 的条件，少使用了一次 while 判断 size 的过程。

## 排序算法的稳定性

排序的稳定性，指原有数据相同值的原始次序不变。

可以：

- 冒泡排序遇到相等的数不交换即可做到稳定。

- 插入排序，遇到相等的数即停止比较，插入数组。

- 归并排序 merge 过程中，遇到相等的值先填入左区域的值就可以做到稳定。

不可以：

- 选择排序不能做到稳定性，选择数值的时候交换数字是会打乱原始的次序。

- 随机快排不具有稳定性，因此荷兰国旗问题也是不能做到稳定性的。
- 堆排序。

稳定性的意义：

- 现实工程中需要**保持上一次排序时遗留的信息**，比如学校的成绩排序，第一次查询以成绩高低排序，第二次查询以班级排序，如果排序算法具有稳定性，就可以保留上一次查询的信息，那么第二次查询得到的结果就是以班级和成绩高低两项指标排序的成绩。

## 排序总结

工程上的排序算法是综合排序：先调用快排或归并排序，再调用插入排序。

在样本量小于 60 的时候使用插入排序，对比冒泡排序和选择排序，插入排序的时间复杂度是受数据状况影响的，范围是 [O(n), O(n^2)] ， 而且其代码简洁，常数项低；

样本量大于 60 的时候，在能使用快排的场景下，如不用区分数据的差异，不追求稳定性，这时选用快排，因为其非常简洁，操作少，常数项低；需要区分数据的差异，要求算法具有稳定性的时候使用归并排序。

工程中需要将快排和归并排序的递归调用部分改写成非递归的调用。

归并排序空间复杂度是 O(N)，可以变成 O(1)，使用的是“内部缓存法”。还有一种叫原地归并排序，也是将空间复杂度变成 O(1)，但是时间复杂度变成 O(n^2)，这时候使用归并排序的意义就不是很重要了。

快排是可以变成具有稳定性的，很难，具体看“01 stable sort”，属于论文级别的算法了。有一类题目，要求将数组的数按照奇偶分排两侧，保持稳定性，说的就是“01 stable sort”。

## 比较器

当排序不是程序的主要内容时，使用自定义比较器能够较快的实现排序目的。需要实现 Comparator 接口。


```java
/**
 * 比较器
 */
public class ComparatorTest01 {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 3, 2, 4, 5, 6, 72, 4, 7, 2, 4};
        Arrays.sort(arr, new MyComparator());
        System.out.println(Arrays.toString(arr));
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
```

在构建 PriorityQueue 、 TreeMap 、 TreeSet 时可以传入一个比较器，这时候加入自定义数据类型就会根据制定的比较器规则进行排序。

举个例子：设计一个比较的类 Person，将会对 Person 类的属性 id 进行比较。

```java
class Person {
    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
```

然后设计一个比较器 IdComparator，将

```java
class IdComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getId() - o1.getId();
    }
}
```

测试一下

```java
public class ComparatorTest02 {
    public static void main(String[] args) {
        Person p1 = new Person(1, "张三");
        Person p2 = new Person(2, "李四");
        Person p3 = new Person(3, "王五");

        TreeSet<Person> set = new TreeSet<>(new IdComparator());
        set.add(p1);
        set.add(p2);
        set.add(p3);

        for (Person p : set) {
            System.out.println(p);
        }
    }
}
```

```java
output:
Person{id=3, name='王五'}
Person{id=2, name='李四'}
Person{id=1, name='张三'}
```

查看以上的输出结果，自定义比较器做到了以 Id 降序比较，TreeSet 构建方法传入了比较器。

## 比较器的一点思考

```java
class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        //return o1 - o2; //语句一
        return o2 - o1; //语句二
    }
}
```

首先要知道，o1 是需要比较的数，o2 是一个标准，比较过程是

```java
o1 - o2 
	结果为负，则 o1 排到 o2 的前面，此时说明 o1 的数值小于 o2
	结果为正，则 o1 排到 o2 的后面，此时说明 o1 的数值大于 o2
	结果为0，则 o1 和 o2 并排，此时说明 o1 的数值等于 o2
这种排序方式是从小到大升序排列

o2 - o1 
	结果为负，则 o1 排到 o2 的前面，此时说明 o1 的数值大于 o2 
	(此处需要停顿思考一下)
    ···
这种排序方式是从大到小降序排列
```

因为单纯记住结论并不能很好的理解，所以通过这种记录的方式能够更好的理解比较器的比较方式。

## 非基于比较的排序

非基于比较的排序与样本的数据状况有很大的关系，由于这个限制使其在工程中并不常用。

非基于比较的排序有桶排序，基数排序，计数排序。这三者都能做到排序的稳定性，时间复杂度为 O(n)，空间复杂度为 O(n)。

### 问题一 计数排序和基数排序

假设存在一组数据，里面的数据只有 0 ~ 60 ，使用非基于比较的排序。

思路：

此时可以使用**计数排序**，准备 61 个桶并编号 0 ~ 60 (具体实现可以是一个长度为 61 的数组，也可以是其他的数据结构，桶只是一个抽象的概念)，然后将数据遍历，按照数值放入对应编号的桶中。

按次序遍历桶，如果 0 号桶存放的数字为5，则打印 5 个 0 ，最终就可以得到一个排序的数列。

```java
public static void bucketSort(int[] arr) {
    if (arr == null || arr.length < 2) return;
    //由于知道数据的范围，桶的大小才能确定
    int[] bucket = new int[61];
    //不知道数据的范围
    //int max = Integer.MIN_VALUE;
    //for (int i = 0; i < arr.length; i++) {
    //    max = Math.max(max, arr[i]);
	//}
    //int[] bucket = new int[max + 1];
    for (int i = 0; i < arr.length; i++) {
        bucket[arr[i]]++;
	}
    int arr_index = 0;
    for (int j = 0; j < bucket.length; j++) {
        while (bucket[j]-- > 0) {
            arr[arr_index++] = j;
        }
	}
}
```

如果此时数据范围变得较大，如 0 ~ 1,000,000,000 ，则不宜使用计数排序，应该使用基数排序。**基数排序**只准备 10 个桶，分别编号 0 ~ 9，从个位开始，按照个位数的值进入桶，按照桶编号从小到大倒出数。循环，依次比较十位、百位、千位··· 

### 问题二 使用非基于比较排序

给定一个数组，求如果排序之后，相邻两数的最大差值，要求时间复杂度 O(n)，且要求不能用非基于比较的排序。

这个问题是要求不能用非基于比较的排序，那如果用非基于比较的排序如何做？

思路如下：

对于 N 个数，准备 N + 1 个桶，目的是预留一个空桶，此后有大作用。

遍历数组，找到数组的最大值 max 和最小值 min，如果 max == min，返回 0；否则，按照桶排序的规则划分成 N + 1 个数据范围。

此时 N + 1 个桶装 N 个数，一定会存在一个空桶，这时候有一个推论，**相邻两个数的最大差值一定不来自同一个桶**。

- 空桶不可能是第一个桶和最后一个桶
- 空桶左右肯定是非空桶
- 空桶左桶的 max 值和右桶的 min 值的差值一定大于空桶的容纳数的范围

桶需要记录三个参数，桶是否存过数 boolean，桶中数字最大值和最小值。

所以在将一个个数填入桶时，及时更新桶中数字最大值和最小值。

最后遍历桶，在遍历过程中记录一个全局变量**最大差值**。遇到非空桶则取出此桶的最小值和上一个非空桶的最大值，此时如果差值比全局变量大，则更新全局变量。

问题：

为什么不求空桶两侧？

空桶两侧的数据不一定是最大差值，因为一个桶的范围如果是 d，则空桶两侧的数值差最小可为 d + 2，而相邻的非空桶最大差值可为 2d - 2。不能保证 d + 2 必定大于 2d - 2。预留一个桶的设计目的是为了推出**最大差值是来自不同桶的结论**，而不能推出来自空桶两侧的结论。

实现：

```java
public static int maxGroup(int[] arr) {
    if (arr == null || arr.length < 2) return 0;

    //查找数组最大值和最小值
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int len = arr.length;
    for (int i = 0; i < len; i++) {
        max = Math.max(max, arr[i]);
        min = Math.min(min, arr[i]);
    }
    if (max == min) return 0;

    //创建桶中三个存储的信息
    boolean[] hasNum = new boolean[len + 1];
    int[] maxNum = new int[len + 1];
    int[] minNum = new int[len + 1];

    //遍历更新桶中的信息
    for (int i = 0; i < len; i++) {
        int index = bucket(arr[i], min, max, len);
        //此处可避免初始化数组的值的影响
        maxNum[index] = hasNum[index] ? Math.max(maxNum[index], arr[i]) : arr[i];
        minNum[index] = hasNum[index] ? Math.min(minNum[index], arr[i]) : arr[i];
        hasNum[index] = true;
    }

    //遍历得到相邻两个数的最大差值
    int res = 0;
    int lastMax = maxNum[0];
    //注意此处的 i 从 1 开始，遍历的是桶，桶长度是 len + 1
    for (int i = 1; i <= len; i++) {
        if (hasNum[i]) {
            res = Math.max(res, minNum[i] - lastMax);
            lastMax = maxNum[i];
        }
    }
    return res;
}

public static int bucket(int number, int min, int max, int length) {
    return (int) (number - min) * length / (max - min);
}
```

# 数组 - 栈 - 队列

## 使用数组模拟栈和队列

使用数组模拟栈，包括栈的 push、pop 和 peek 操作。

```java
public class ArrayStack {
    private Integer[] arr;
    private Integer size;

    public ArrayStack(int initSize) {
        if (initSize < 0) {
            throw new IllegalArgumentException("栈的大小不能小于 0");
        }
        arr = new Integer[initSize];
        size = 0;
    }

    public Integer peek() {
        if (size == 0) {
            return null;
        }
        return arr[size - 1];
    }

    public void push(Integer number) {
        if (size == arr.length) {
            throw new ArrayIndexOutOfBoundsException("栈已满！");
        }
        arr[size++] = number;
    }

    public Integer pop() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("栈已空！");
        }
        return arr[--size];
    }
}
```

使用数组模拟队列，包括队列的 offer、poll 和 peek 操作。

```java
public class ArrayQueue {
    private Integer[] arr;
    private Integer size;
    private Integer first;
    private Integer last;

    public ArrayQueue(int initSize) {
        if (initSize < 0) {
            throw new IllegalArgumentException("队列长度不能小于 0！");
        }
        arr = new Integer[initSize];
        size = 0;
        //first 指向队首的位置
        first = 0;
        //last 指向队尾后空的位置
        last = 0;
    }

    public void offer(int number) {
        if (size == arr.length) {
            throw new ArrayIndexOutOfBoundsException("队列已满！");
        }
        arr[last++] = number;
        last = last < arr.length ? last : 0;
        size++;
    }

    public Integer poll() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("队列已空！");
        }
        int res =  arr[first++];
        first = first < arr.length ? first : 0;
        size--;
        return res;
    }

    public Integer peek() {
        if (size == 0) {
            return null;
        }
        return arr[first];
    }
}
```



## 设计 getMin() 操作时间复杂度为 O(1) 的栈

设计一个栈，获取栈内最小值操作为 O(1)，兼具栈的 push、pop 功能。

```java
public class MyStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int number) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(number);
        } else {
            int temp = this.stackMin.peek();
            if (temp < number) {
                this.stackMin.push(temp);
            } else {
                this.stackMin.push(number);
            }
        }
        this.stackData.push(number);
    }

    public Integer pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("栈已空！");
        }
        this.stackMin.pop();
        return this.stackData.pop();
    }

    public Integer getMin() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("栈已空！");
        }
        return this.stackMin.peek();
    }
}
```



## 使用栈实现队列

stack1 专门用来添加数据 offer()，stack2 专门用来查看和弹出数据 peek() poll()。

addStack2() 有两个前提：

- stack1 非空
- stack1 需要将所有数据转移到 stack2

```java
public class StackToQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public StackToQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void offer(int number) {
        this.stack1.push(number);
        addStack2();
    }

    public Integer peek() {
        if (this.stack2.isEmpty()) {
            return null;
        }
        return this.stack2.peek();
    }

    private void addStack2() {
        while (!this.stack1.isEmpty()) {
            this.stack2.push(this.stack1.pop());
        }
    }

    public Integer poll() {
        if (this.stack2.isEmpty()) {
            throw new RuntimeException("队列已空！");
        }
        return this.stack2.pop();
    }
}
```



## 使用队列实现栈

使用两个队列，一个是存储队列，一个是 help 队列。

helper()

- 将 queue 队列的数据转移到 help 队列中，只留下 queue 队列尾部的一个元素作为返回值

swap()

- 将 queue 队列和 help 队列的引用互换

```java
public class QueueToStack {
    private Queue<Integer> queue;
    private Queue<Integer> help;

    public QueueToStack() {
        this.queue = new LinkedList<>();
        this.help = new LinkedList<>();
    }

    public void push(int number) {
        queue.offer(number);
    }

    public Integer peek() {
        if (queue.isEmpty()) {
            return null;
        }
        int res = helper();
        help.offer(res);
        swap();
        return res;
    }

    //将数据从 queue 转移到 help 中，留下一个数
    private Integer helper() {
        while (queue.size() > 1) {
            help.offer(queue.poll());
        }
        return queue.poll();
    }

    private void swap() {
        Queue<Integer> temp = queue;
        queue = help;
        help = temp;
    }

    public Integer pop() {
        if (queue.isEmpty()) {
            throw new RuntimeException("栈已空");
        }
        int res = helper();
        swap();
        return res;
    }
}
```

## 猫狗队列问题

经典的问题，不赘述。思路是先将 Pet 这个类包装一下，打上时间戳，增加了一个变量 count。

```java
class PetEntry {
    private Pet pet;
    private long count;

    public PetEntry(Pet pet, long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return this.pet;
    }

    public long getCount() {
        return this.count;
    }

    public String getEntryPetType() {
        return this.pet.getPetType();
    }
}
```

然后将获得的一个个 PetEntry 对象添加到队列中，在添加的时候就会对 PetEntry 对象的类型做判断，如果是 Cat 类就进入 catQ，如果是 Dog 类就进入 dogQ。

```java
public class DogCatQueue {
    private Queue<PetEntry> dogQ;
    private Queue<PetEntry> catQ;
    private long count;

    public DogCatQueue() {
        this.dogQ = new LinkedList<>();
        this.catQ = new LinkedList<>();
        this.count = 0;
    }

    public void add(Pet pet) {
        if (pet.getPetType().equals("dog")) {
            this.dogQ.offer(new PetEntry(pet, this.count++));
        } else if (pet.getPetType().equals("cat")) {
            this.catQ.offer(new PetEntry(pet, this.count++));
        } else {
            throw new RuntimeException("宠物需为猫或狗");
        }
    }

    public Pet pollAll() {
        if (!this.dogQ.isEmpty() && !this.catQ.isEmpty()) {
            if (this.dogQ.peek().getCount() < this.catQ.peek().getCount()) {
                return this.dogQ.poll().getPet();
            } else {
                return this.catQ.poll().getPet();
            }
        } else if (this.dogQ.isEmpty()) {
            return this.catQ.poll().getPet();
        } else if (this.catQ.isEmpty()) {
            return this.dogQ.poll().getPet();
        } else {
            throw new RuntimeException("队列已空！");
        }
    }

    public Dog pollDog() {
        if (this.dogQ.isEmpty()) {
            throw new RuntimeException("狗队列为空！");
        }
        return (Dog) this.dogQ.poll().getPet();
    }

    public Cat pollCat() {
        if (this.catQ.isEmpty()) {
            throw new RuntimeException("猫队列为空！");
        }
        return (Cat) this.catQ.poll().getPet();
    }

    public boolean isEmpty() {
        return this.dogQ.isEmpty() && this.catQ.isEmpty();
    }

    public boolean isDogQueueEmpty() {
        return this.dogQ.isEmpty();
    }

    public boolean isCatQueueEmpty() {
        return this.catQ.isEmpty();
    }
}
```

严格来说这不是一个算法题目，而是一个工程类题目，使用了装饰者设计模式，对原有的类进行包装，成为一个 Entry 类。

# 矩阵问题

## 问题一 转圈打印矩阵

给定一个整型矩阵matrix，请按照转圈的方式打印它。

要求：额外空间复杂度为O(1)。

```java
例如：
[ 1  2  3  4 
  5  6  7  8 
  9 10 11 12 
 13 14 15 16 ]
    
打印结果为：
1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
```

本题可以在 [LeetCode 54 螺旋矩阵](https://leetcode-cn.com/problems/spiral-matrix/)测试结果。

### 思路

定义一个方法，以左上角的点和右下角的点开始，从边界开始打印矩形。打印一圈后循环遍历内圈的矩形，直到整个矩形打印完毕。有一些特殊的情况，比如打印的是一条竖线，或者横线，或者一个点，都没有关系，注意代码的边界即可。

### 实现

```java
public static void spiralOrderPrint(int[][] matrix, int tR, int tC, int dR, int dC) {
    //三种情况：横线，竖线，矩形
    if (tR == dR) {
        for (int i = tC; i <= dC; i++) {
            System.out.printf("%3d", matrix[tR][i]);
        }
    } else if (tC == dC) {
        for (int i = tR; i <= dR; i++) {
            System.out.printf("%3d", matrix[i][tC]);
        }
    } else {
        int tmpC = tC;
        int tmpR = tR;
        while (tmpC < dC) {
            System.out.printf("%3d", matrix[tR][tmpC++]);
        }
        while (tmpR < dR) {
            System.out.printf("%3d", matrix[tmpR++][dC]);
        }
        while (tC < tmpC) {
            System.out.printf("%3d", matrix[dR][tmpC--]);
        }
        while (tR < tmpR) {
            System.out.printf("%3d", matrix[tmpR--][tC]);
        }
    }
}

public static void printMatrix(int[][] matrix) {
    System.out.println("-----------PrintMatrixInSpiralOrder.printMatrix-----------");
    int tR = 0;
    int tC = 0;
    int dR = matrix.length - 1;
    int dC = matrix[0].length - 1;
    //横线，竖线等特殊形式都囊括在内
    while (tR <= dR && tC <= dC) {
        spiralOrderPrint(matrix, tR++, tC++, dR--, dC--);
    }
}
```

### 测试

```java
public static void main(String[] args) {
    int[][] matrix = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };

    for (int[] arr : matrix) {
        for (int n : arr) {
            System.out.printf("%3d", n);
        }
        System.out.println();
    }

    printMatrix(matrix);
}
```

```java
output:
  1  2  3  4
  5  6  7  8
  9 10 11 12
 13 14 15 16
-----------PrintMatrixInSpiralOrder.printMatrix-----------
  1  2  3  4  8 12 16 15 14 13  9  5  6  7 11 10
```

## 问题二 旋转正方形矩阵

给定一个整型正方形矩阵 matrix，请把该矩阵调整成**逆时针旋转 90 度**的样子。

要求：额外空间复杂度为O(1)。

```java
例如：
[ 1  2  3
  4  5  6
  7  8  9 ]
旋转：
[ 3  6  9
  2  5  8
  1  4  7 ]
```

### 思路

先从外圈开始旋转，然后依次对内一圈一圈转，直到转完为止。

### 实现

```java
public static void rotateMatrix(int[][] matrix) {
    int tR = 0;
    int tC = 0;
    int dR = matrix.length - 1;
    int dC = matrix[0].length - 1;
    //当两个点重合时，旋转就结束了
    while (tR < dR) {
        rotate(matrix, tR++, tC++, dR--, dC--);
    }
}

public static void rotate(int[][] matrix, int tR, int tC, int dR, int dC) {
    int times = dR - tR;
    for (int i = 0; i < times; i++) {
        //四个点变换位置
        int tmp = matrix[tR + i][tC];
        matrix[tR + i][tC] = matrix[tR][dC - i];
        matrix[tR][dC - i] = matrix[dR - i][dC];
        matrix[dR - i][dC] = matrix[dR][tC + i];
        matrix[dR][tC + i] = tmp;
    }
}
```



### 测试

```java
public static void main(String[] args) {
    //int[][] matrix = {
    //        {1, 2, 3},
    //        {4, 5, 6},
    //        {7, 8, 9},
    //};

    int[][] matrix = {
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25}
    };

    printMatrix(matrix);
    rotateMatrix(matrix);
    printMatrix(matrix);

}

public static void printMatrix(int[][] matrix) {
    System.out.println("------------RotateMatrix.printMatrix------------");
    for (int[] arr : matrix) {
        for (int n : arr) {
            System.out.printf("%3d", n);
        }
        System.out.println();
    }
    System.out.println();
}
```

使用了两组数做测试，结果完成旋转，输出如下：

```java
------------RotateMatrix.printMatrix------------
  1  2  3  4  5
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25

------------RotateMatrix.printMatrix------------
  5 10 15 20 25
  4  9 14 19 24
  3  8 13 18 23
  2  7 12 17 22
  1  6 11 16 21
```

### 小总结

问题一和问题二都是矩阵的调整打印问题，采用的思路都很相似，从外围出发，一圈一圈向中心进攻。不要一直着眼在细节处，从宏观的角度浓缩出规律，再在细节处下功夫，如坐标的变换也是重点。这是一种比较通用的方法，把复杂的坐标变换浓缩成规律的活动，多训练这种思考方式，才能更便捷的解决问题。

## 问题三 之字形打印矩阵

给定一个矩阵matrix，按照“之”字形的方式打印这个矩阵，例如：

```java
[ 1  2  3  4 
  5  6  7  8 
  9 10 11 12 ]
```

“之”字形打印的结果为：1  2  5  9  6  3  4  7 10 11  8 12

要求：额外空间复杂度为O(1)。

### 思路

从左上角 `matrix[0][0]` 位置引出两点 A、B，点 A 运动规则是向右走，遇到边界向下走，点 B 运动规则是向下走，遇到边界向右走。每走一步，两点形成的路径就是“之”字的某一条路径。再设定一个 flag 变量，来表示从 A -> B 的路径和从 B -> A 的路径。

### 实现

```java
public static void zigPrint(int[][] matrix) {
    int row = matrix.length - 1;
    int col = matrix[0].length - 1;
    // A
    int tR = 0;
    int tC = 0;
    // B
    int dR = 0;
    int dC = 0;
    boolean flag = false; //true A -> B false B -> A
    while (tR != row + 1) {
        print(matrix, tR, tC, dR, dC, flag);
        //点 A 判断条件是 tC，所以 tC 放在 tR 后，防止 tC 值的改变对 tR 值的判断造成影响
        tR = tC == col ? tR + 1 : tR;
        tC = tC == col ? tC : tC + 1;
        //点 B 判断条件是 dR，所以 dR 放在 dC 后，防止 dR 值的改变对 dC 值的判断造成影响
        dC = dR == row ? dC + 1 : dC;
        dR = dR == row ? dR : dR + 1;
        flag = !flag;
    }
}

private static void print(int[][] matrix, int tR, int tC, int dR, int dC, boolean flag) {
    if (flag) {
        // true A -> B
        while (tR != dR + 1) {
            System.out.printf("%3d", matrix[tR++][tC--]);
        }
    } else {
        // false B -> A
        while (dR != tR - 1) {
            System.out.printf("%3d", matrix[dR--][dC++]);
        }
    }
}
```

### 测试

```java
public static void main(String[] args) {
    int[][] matrix = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
    };
    zigPrint(matrix);
}
```

```java
output:
1  2  5  9  6  3  4  7 10 11  8 12
```


### 小总结

在解题过程中，能使用基础数据类型一定要使用，因为其传值的特性有助于限制变量的作用域。当其作用域可控，算法就更容易理解。

在运算过程中，这个部分需要注意，前后顺序不同结果会受到影响，注意运算的逻辑：

```java
//点 A 判断条件是 tC，所以 tC 放在 tR 后，防止 tC 值的改变对 tR 值的判断造成影响
tR = tC == col ? tR + 1 : tR;
tC = tC == col ? tC : tC + 1;
//点 B 判断条件是 dR，所以 dR 放在 dC 后，防止 dR 值的改变对 dC 值的判断造成影响
dC = dR == row ? dC + 1 : dC;
dR = dR == row ? dR : dR + 1;
```

## 问题四 在行列都排好序的矩阵中找数

给定一个有 N * M 的整型矩阵 matrix 和一个整数 K，matrix 的每一行和每一 列都是排好序的。实现一个函数，判断 K 是否在 matrix 中。

例如：

```java
[ 0 1 2 5
  2 3 4 7
  4 5 7 9 ]
```

如果 K 为7，返回 true；如果 K 为6，返回 false。
要求：时间复杂度为 O(N + M)，额外空间复杂度为 O(1)。

### 思路

```java
选择右上角的数 a 比较
	> a 排除 a 左侧的数，往下寻找
	< a 排除 a 下方的数，往左寻找
按照这个策略比较，最多只需要遍历 N + M 个数就可以知道是否找到数
```

### 实现

```java
public static boolean findNumber(int[][] matrix, int number) {
    int dR = matrix.length - 1;
    int dC = 0;
    int tR = 0;
    int tC = matrix[0].length - 1;
    while (tR <= dR && tC >= dC) {
        if (matrix[tR][tC] == number) {
            return true;
        }
        if (matrix[tR][tC] < number) {
            tR++;
        } else {
            tC--;
        }
    }
    return false;
}
```

### 测试

```java
public static void main(String[] args) {
    int[][] matrix = {
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25}
    };

    for (int i = 0; i < 10000; i++) {
        int number = (int) (Math.random() * 100);
        System.out.println("number = " + number);
        System.out.println(findNumber(matrix, number));
    }
}
```

# 链表

## 问题一 反转单向和双向链表

分别实现反转单向链表和反转双向链表的函数。

要求：如果链表长度为 N，时间复杂度要求为 O(N)，额外空间复杂度要求为 O(1)。

### 反转单向链表

```java
public static Node reverseOne(Node head) {
    if (head == null || head.next == null) {
        return head;
    }
    Node new_head = null;
    while (head != null) {
        Node tmp = head.next;
        head.next = new_head;
        new_head = head;
        head = tmp;
    }
    return new_head;
}

public static Node reverseTwo(Node head) {
    if (head == null || head.next == null) {
        return head;
    }
    Node pre = null;
    Node next = null;
    while (head != null) {
        next = head.next;
        head.next = pre;
        pre = head;
        head = next;
    }
    return pre;
}
```

### 反转双向链表

```java
public static DoubleNode reverse(DoubleNode head) {
    if (head == null || head.next == null) {
        return head;
    }
    DoubleNode pre = null;
    DoubleNode next = null;
    while (head != null) {
        next = head.next;
        head.next = pre;
        head.last = next;
        pre = head;
        head = next;
    }
    return pre;
}
```



## 问题二 打印两个有序链表的公共部分

给定两个有序链表的头指针 head1 和 head2，打印两个链表的公共部分。

思路：类似于比较两个有序数组共同具有的有序部分。

```java
public static void printCommonPart(Node head1, Node head2) {
    if (head1 == null || head2 == null) return;
    while (head1 != null && head2 != null) {
    	if (head1.val == head2.val) {
            System.out.print(head1.val + " ");
            head1 = head1.next;
            head2 = head2.next;
        } else if (head1.val < head2.val) {
            head1 = head1.next;
        } else {
            head2 = head2.next;
        }
    }
}
```



## 问题三 判断一个链表是否为回文结构

给定一个链表的头节点 head，请判断该链表是否为回文结构。

```
1->2->1，返回 true。
1->2->2->1，返回 true。
15->6->15，返回 true。
1->2->3，返回 false。
```

### 思路

第一次遍历，使用一个栈结构存储节点，第二次遍历，与弹出栈存储的值比较，相同为 true 不同为 false。

可以使用快慢指针得到链表的对称轴的下一个节点，然后将值压栈，然后重头开始遍历，省下一半的栈空间，但是在计算空间复杂度时还是会忽略不计系数。

```java
// need n extra space
public static boolean isPalindromeOne(Node head) {
    if (head == null || head.next == null) return true;
    Stack<Node> stack = new Stack<>();
    Node cur = head;
    while (cur != null) {
        stack.push(cur);
        cur = cur.next;
    }
    while (head != null) {
        if (head.val != stack.pop().val) {
            return false;
        }
        head = head.next;
    }
    return true;    
}

// need n/2 extra space
public static boolean isPalindromeTwo(Node head) {
    if (head == null || head.next == null) return true;
    // These steps ensure the rigth point can be the exactly position. 
    Node right = head.next;
    Node cur = head;
    while (cur.next != null && cur.next.next != null) {
        right = right.next;
        cur = cur.next.next;
    }
    
    Stack<Node> stack = new Stack<>();
    while (right != null) {
        stack.push(right);
        right = right.next;
    }
    
    while (!stack.isEmpty()) {
        if (stack.pop().val != head.val) {
            return false;
        }
        head = head.next;
    }
    return true;
}
```

### 快慢指针举例

通过代码是可以适应链表长度为奇数和偶数的情况，right 指针都会指到右半部分的链表的初始位置。

```java
c: point cur
r: point right

1->2->3->2->1
    
1.
1->2->3->2->1
↑  ↑
c  r

2.
1->2->3->2->1
      ↑
     c r
     
3.
1->2->3->2->1
         ↑  ↑
         r  c
         
1->2->3->3->2->1
        
1.
1->2->3->3->2->1
↑  ↑
c  r

2.
1->2->3->3->2->1
      ↑
     c r

3.
1->2->3->3->2->1
         ↑  ↑
         r  c
```

### 进阶

如果链表长度为N，时间复杂度达到O(N)，额外空间复杂度达到O(1)。

### 思路

```java
1.快慢指针，得到链表的中点，将中点后的节点逆序。
1->2->3->2->1
1->2->3<-2<-1
↑           ↑
2.两端开始遍历，当两根指针相遇说明是回文结构，当值不相等的时候说明不是回文结构
3.最后，将中点的后的节点再逆序
1->2->3->2->1
```

### 实现

```java
public static boolean isPalindromeThree(Node head) {
    if (head == null || head.next == null) return true;
    Node n1 = head;
    Node n2 = head;
    // n1 will be the end of left part or center
    while (n2.next != null && n2.next.next != null) {
        n1 = n1.next;
        n2 = n2.next.next;
    }
    // n2 will be the begin of right part
    n2 = n1.next;
    n1.next = null;
    
    // convert the right part
    Node n3 = null;
    while (n2 != null) {
        n1 = n2.next; // save next node
        n2.next = n3;
        n3 = n2;
        n2 = n1;
    }
    // n3 point the end of list; n2 & n1 is null
    // n3 | n2 | n1
    n1 = head;
    n2 = n3;
    
    boolean res = true;
    // compare n1 n3; n2 save the end of list
    while (n1 != null && n3 != null) {
        if (n1.val != n3.val) {
            res = false;
            break;
        }
        n1 = n1.next;
        n3 = n3.next;
    }
    
    // reconvert the right part
    // reconvert the end of list
    n3 = n2.next;
    n2.next = null;
    
    // n1 | n3 | n2
    while (n3 != null) {
        n1 = n3.next; // save the node
        n3.next = n2;
        n2 = n3;
        n3 = n1;
    }
    
    return res;
}
```

在遍历的过程中，修改了链表的结构，无论结果如何，最终还是要将改变的结构再逆转回来。

## 问题四 单向链表的荷兰国旗问题

将单向链表按某值划分成左边小、中间相等、右边大的形式。

给定一个单向链表的头节点 head，节点的值类型是整型，再给定一个整数 pivot。实现一个调整链表的函数，将链表调整为左部分都是值小于 pivot 的节点，中间部分都是值等于 pivot 的节点，右部分都是值大于 pivot 的节点。
除这个要求外，对调整后的节点顺序没有更多的要求。 

例如：链表 9->0->4->5->1，pivot=3。 调整后链表可以是 1->0->4->9->5，也可以是 0->1->9->5->4。总之，满足左部分都是小于 3 的节点，中间部分都是等于 3 的节点（本例中这个部分为空），右部分都是大于 3 的节点即可。对某部分内部的节点顺序不做要求。

### 思路

用 Node 数组存储节点，按照数组的荷兰国旗问题求解，然后按照数组的顺序将链表连接。

### 实现

```java
public static Node listPartition1(Node head, int pivot) {
    if (head == null || head.next == null) return head;
    Node cur = head;
    int count = 0;
    while (cur != null) {
        count++;
        cur = cur.next;
    }
    Node[] arr = new Node[count];
    cur = head;
    for (int i = 0; i < arr.length; i++) {
        arr[i] = cur;
        cur = cur.next;
    }

    // sort part of linkedlist
    partition(arr, pivot);

    int i;
    for (i = 0; i < arr.length - 1; i++) {
        arr[i].next = arr[i + 1];
    }
    arr[i].next = null;
    return arr[0];
}

public static void partition(Node[] arr, int pivot) {
    int less = -1;
    int more = arr.length;
    int cur = 0;
    while (cur < more) {
        if (arr[cur].value < pivot) {
            swap(arr, cur, less + 1);
            less++;
            cur++;
        } else if (arr[cur].value == pivot) {
            cur++;
        } else {
            swap(arr, cur, more - 1);
            more--;
        }
    }
}

private static void swap(Node[] arr, int cur, int position) {
    Node tmp = arr[cur];
    arr[cur] = arr[position];
    arr[position] = tmp;
}
```



### 进阶

在原问题的要求之上再增加如下两个要求。在左、中、右三个部分的内部也做**顺序**要求，要求每部分里的节点从左到右的
顺序与原链表中节点的先后次序一致。 

例如：链表 9->0->4->5->1，pivot=3。调整后的链表是 0->1->9->4->5。 在满足原问题要求的同时，左部分节点从左到
右为 0、1。在原链表中也是先出现 0，后出现 1；中间部分在本例中为空，不再讨论；右部分节点从左到右为9、4、5。在原链表中也是先出现9，然后出现4，最后出现5。

如果链表长度为N，时间复杂度请达到O(N)，额外空间复杂度请达到O(1)。

### 思路

这个时候不能再使用荷兰国旗问题的做法解答，原因是

- 题目的要求是做到划分的稳定性
- 荷兰国旗问题的做法无法实现要求的稳定性
- 原来的做法空间复杂度为 O(N)

可以使用三对变量将链表划分成 Small Equal Big 三个区域，先遍历第一遍，找出链表第一个小于 pivot 的节点，使用 less 变量指向它，依次找 equal more 变量指向的节点，注意链表中可能不存在三个区域，即变量可以为 null。

第二次遍历，使用 less_end equal_end more_end 三个变量将后面的节点依次遍历，最终将一个链表划分成三段链表。

最后将 less_end 和 equal 相连，将 equal_end 和 more 相连，注意此时 6 个变量中的空值。如果为空，需要与下一个变量连接。

```java
less -> less_end -> equal -> equal_end -> more -> more_end
```

### 实现

```java
public static Node listPartition2(Node head) {
    
}
```

## 问题五 复制含有随机指针节点的链表

一种特殊的链表节点类描述如下：

```java
public class Node { 
    public int value; 
    public Node next; 
    public Node rand;
    public Node(int data) { 
        this.value = data; 
    }
}
```

Node 类中的 value 是节点值，next 指针和正常单链表中 next 指针的意义一样，都指向下一个节点，rand 指针是 Node 类中新增的指针，这个指针可能指向链表中的任意一个节点，也可能指向 null。给定一个由 Node 节点类型组成的无环单链表的头节点 head，请实现一个函数完成这个链表中所有结构的复制，并返回复制的新链表的头节点。

### 实现

### 进阶

不使用额外的数据结构，只用有限几个变量，且在时间复杂度为 O(N) 内完成原问题要实现的函数。

### 思路

### 实现

## 问题六 两个单链表相交的一系列问题

在本题中，单链表可能有环，也可能无环。给定两个单链表的头节点 head1 和 head2，这两个链表可能相交，也可能
不相交。请实现一个函数， 如果两个链表相交，请返回相交的第一个节点；如果不相交，返回 null 即可。

要求：如果链表 1 的长度为 N，链表 2 的长度为 M，时间复杂度请达到 O(N+M)，额外空间复杂度请达到 O(1)。






# 二叉树

## 二叉树按层遍历打印

宽度优先遍历，通常使用队列结构。常常有**按照层数换行**的问题。

```java
		    1
         /     \
        2		3
       /       / \
      4       5   6
             / \
            7   8    
output:
1
2 3
4 5 6
7 8
```

思路：

这时可以使用两个变量记录，一个是用变量 last 记录当前的 last 结点，另一个是用变量 nlast 记录下一层的 last 结点。

pop() 时添加子树，如果 pop 值等于 last 指向的变量，打印换行符号，last 变量指向 nlast。

nlast 跟踪的是最新加入 queue 的数。

实现：

```java
public void printTree(TreeNode root) {
    TreeNode last = null;
    TreeNode nlast = null;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    last = root;
    nlast = root;
    while (!queue.isEmpty()) {
        TreeNode tmp = queue.poll();
        System.out.print(tmp.val + " ");
        if (tmp.left != null) {
            queue.offer(tmp.left);
            nlast = tmp.left;
        }
        if (tmp.right != null) {
            queue.offer(tmp.right);
            nlast = tmp.right;
        }
        if (tmp == last) {
            last = nlast;
            System.out.println();
        }
    }
}
```

测试：

```java
public static void main(String[] args) {
    // 构建二叉树
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(6);
    root.right.left.left = new TreeNode(7);
    root.right.left.right = new TreeNode(8);
    PrintBinaryTree test = new PrintBinaryTree();
    test.printTree(root);
}
```



## 二叉树的序列化和反序列化

方式：先序遍历，中序遍历，后序遍历，层序遍历。

给定一个二叉树的头节点 head，节点值的类型是 32 位整型。设计序列化和反序列化方案。

使用树的前序遍历实现序列化：

```java
public static String serializedBinaryTree(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    preOrderTraversal(root, sb);
    return sb.toString();
}

private static void preOrderTraversal(TreeNode node, StringBuilder sb) {
    if (node == null) {
        sb.append("#!");
        return;
    }
    sb.append(node.val).append("!");
    preOrderTraversal(node.left, sb);
    preOrderTraversal(node.right, sb);
}
```

测试：

```java
public static void main(String[] args) {
    // 构建二叉树
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(6);
    root.right.left.left = new TreeNode(7);
    root.right.left.right = new TreeNode(8);
    System.out.println(serializedBinaryTree(root));
}
```

输出结果：

```java
output:
1!2!4!#!#!#!3!5!7!#!#!8!#!#!6!#!#!
```

其中 # 表示节点为空，! 是分隔符。

实现反序列化：

```java
public static TreeNode deSerializedBinaryTree(String tree) {
    String[] s = tree.split("!");
    Queue<TreeNode> queue = new LinkedList<>();
    for (int i = 0; i < s.length; i++) {
        TreeNode node = null;
        if (s[i].equals("#")) {
            node = new TreeNode(Integer.MIN_VALUE);
        } else {
            node = new TreeNode(Integer.parseInt(s[i]));
        }
        queue.offer(node);
    }
    TreeNode root = queue.poll();
    makeTree(root, queue);
    return root;
}

private static void makeTree(TreeNode root, Queue<TreeNode> queue) {
    if (root == null || root.val == Integer.MIN_VALUE) {
        return;
    }
    root.left = queue.poll();
    makeTree(root.left, queue);
    root.right = queue.poll();
    makeTree(root.right, queue);
}
```

测试，借用了此前实现序列化的树反序列化：

```java
public static void main(String[] args) {
    // 构建二叉树
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(6);
    root.right.left.left = new TreeNode(7);
    root.right.left.right = new TreeNode(8);
    System.out.println(serializedBinaryTree(root));

    String s = serializedBinaryTree(root);
    TreeNode tree = deSerializedBinaryTree(s);
    printTree(tree);
}
```

输出，借用了此前二叉树按层遍历打印的方法，其中空节点用整型的最小值代替：

```java
		    1
         /     \
        2		3
       /       / \
      4       5   6
             / \
            7   8  

output:
1 
2 3 
4 -2147483648 5 6 
-2147483648 -2147483648 7 8 -2147483648 -2147483648 
-2147483648 -2147483648 -2147483648 -2147483648 
```

# 数组

## 问题一

已知一个几乎有序的数组，几乎有序是指，如果把数组排好顺序的话，每个元素移动的距离不超过 k，并且 k 相对于数组长度来说很小。请问选择什么方法对其排序比较好。

改进的堆排序，每次构建 K 个数的小根堆，一共循环 N 次，时间复杂度为 O(N*logK)。

## 问题二

判断数组中是否有重复值。必须保证额外空间复杂度为 O(1)。

如果没有空间复杂度限制，可以使用哈希表实现。时间复杂度和空间复杂度都为 O(N)。

先排序，再判断。可以选择堆排序，改写非递归的实现。

## 问题三

把两个有序数组合并为一个数组。第一个数组空间正好可以容纳两个数组的元素。

使用双指针，从数组尾部开始比较，将数字依次拷贝到长数组中。

## 问题四

求需要排序的最短子数组长度。

例如 `[1, 5, 4, 3, 2, 6, 7]` 则返回的长度是 `4` ，因为只有 `[5, 4, 3, 2]` 需要排序。

最优解可以做到时间复杂度 O(N) 空间复杂度 O(1)。

思路：

```java
从左往右遍历，用变量 MAX 记录遍历时顺序排列的最大值，而后将遍历的数与 MAX 比较，记录下比 MAX 值小的最右值的下标，index = 4
0  1  2  3  4  5  6
1, 5, 4, 3, 2, 6, 7
  MAX       ↑
  
从右往左遍历，用变量 MIN 记录遍历时顺序排列的最小值，而后将遍历的数与 MIN 比较，记录下比 MIN 值大的最左值的下标，index = 1
0  1  2  3  4  5  6
1, 5, 4, 3, 2, 6, 7
   ↑       MIN
   
此时计算从索引 1 到索引 4 的长度为 4
```

## 问题五

给定一个整型数组 arr，返回排序的数组相邻两数的最大差值。

使用桶排序的思想，可以做到时间复杂度为 O(N)，空间复杂度为 O(N)。[可参考](#%E9%97%AE%E9%A2%98%E4%BA%8C-%E4%BD%BF%E7%94%A8%E9%9D%9E%E5%9F%BA%E4%BA%8E%E6%AF%94%E8%BE%83%E6%8E%92%E5%BA%8F)。

# 待定

- [ ] 缓存淘汰算法 LRU (Least Recently Used) 哈希链表

- [ ] Map

- [ ] 使用队列实现图的深度优先搜索 => 使用两个队列实现栈结构，使用自定义的栈结构实现图的深度优先搜索


