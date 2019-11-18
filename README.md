# 目录

<!-- MarkdownTOC levels="1,2,3" autolink="true" -->

- [java-algorithm](#java-algorithm)
	- [说明](#%E8%AF%B4%E6%98%8E)
	- [分类](#%E5%88%86%E7%B1%BB)
		- [search](#search)
		- [sort](#sort)
	- [排序](#%E6%8E%92%E5%BA%8F)
- [算法](#%E7%AE%97%E6%B3%95)
	- [冒泡排序](#%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F)
	- [选择排序](#%E9%80%89%E6%8B%A9%E6%8E%92%E5%BA%8F)
	- [插入排序](#%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F)
	- [归并排序](#%E5%BD%92%E5%B9%B6%E6%8E%92%E5%BA%8F)
		- [小和问题](#%E5%B0%8F%E5%92%8C%E9%97%AE%E9%A2%98)
		- [逆序对问题](#%E9%80%86%E5%BA%8F%E5%AF%B9%E9%97%AE%E9%A2%98)
	- [待定](#%E5%BE%85%E5%AE%9A)
		- [问题1](#%E9%97%AE%E9%A2%981)

<!-- /MarkdownTOC -->

# java-algorithm

## 说明

- This repository is stored some Java code to implement the Algorithm.
- 这个项目存放一些以 Java 语言实现的算法，巩固数据结构与算法的知识。

## 分类

### [search](demo/src/search)

- BinarySearch 二分查找

### [sort](demo/src/sort)

- BubbleSort 冒泡排序
- InsertSort 插入排序
- MergeSort  归并排序
- SelectSort 选择排序

## 排序 

| 方式 | 算法            | 时间复杂度 | 空间复杂度 | 稳定性 | 数据排序情况 |
| ---- | --------------- | ---------- | ---------- | ------ | ------------ |
| 交换 | 冒泡排序        | O(n^2)     | O(1)       | 可以   | 无关         |
|      | 快排 - 随机快排 |            |            |        |              |
| 插入 | 直接插入排序    | O(n^2)     | O(1)       | 可以   | 有关         |
| 选择 | 直接选择排序    | O(n^2)     | O(1)       | 不可以 | 无关         |
|      | 堆排序          |            |            |        |              |
| 待定 | 归并排序        | O(N*logN)  | O(N)       |        |              |
|      | 桶排序          |            |            |        |              |
|      | 基数排序        |            |            |        |              |
|      |                 |            |            |        |              |

冒泡排序如何做到稳定？遇到相等的数不交换即可。

插入排序，遇到相等的数即停止比较，插入数组。

# 算法

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

总结：使用归并排序算法的快速之处在于，归并的两个部分对内都是有序的，如 `2 4 5 | 1 3 7` 两个部分。因此在比较大小的时候，可以迅速确定整批的数据大小，而不用重复遍历计算。

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

### 问题二：荷兰国旗问题

给定一个数组 arr，和一个数 num，请把小于 num 的数放在数组的左边，等于 num 的数放在数组的中间，大于 num 的数放在数组的右边。

要求额外空间复杂度O(1)，时间复杂度O(N)。

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
    while (cur != more && cur < arr.length) {
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

由 number = 50 分为三个区域，小于 50，等于 50，大于 50