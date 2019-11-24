# 目录

<!-- MarkdownTOC levels="1,2,3" autolink="true" -->

- [java-algorithm](#java-algorithm)
	- [说明](#%E8%AF%B4%E6%98%8E)
	- [分类](#%E5%88%86%E7%B1%BB)
		- [search](#search)
		- [sort](#sort)
	- [排序](#%E6%8E%92%E5%BA%8F)
- [排序](#%E6%8E%92%E5%BA%8F-1)
	- [冒泡排序](#%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F)
	- [选择排序](#%E9%80%89%E6%8B%A9%E6%8E%92%E5%BA%8F)
	- [插入排序](#%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F)
	- [归并排序](#%E5%BD%92%E5%B9%B6%E6%8E%92%E5%BA%8F)
		- [小和问题](#%E5%B0%8F%E5%92%8C%E9%97%AE%E9%A2%98)
		- [逆序对问题](#%E9%80%86%E5%BA%8F%E5%AF%B9%E9%97%AE%E9%A2%98)
	- [快速排序](#%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F)
		- [问题一](#%E9%97%AE%E9%A2%98%E4%B8%80)
		- [问题二：荷兰国旗问题](#%E9%97%AE%E9%A2%98%E4%BA%8C%EF%BC%9A%E8%8D%B7%E5%85%B0%E5%9B%BD%E6%97%97%E9%97%AE%E9%A2%98)
		- [总结](#%E6%80%BB%E7%BB%93)
		- [经典快排](#%E7%BB%8F%E5%85%B8%E5%BF%AB%E6%8E%92)
		- [随机快排](#%E9%9A%8F%E6%9C%BA%E5%BF%AB%E6%8E%92)
	- [堆排序](#%E5%A0%86%E6%8E%92%E5%BA%8F)
		- [堆](#%E5%A0%86)
		- [heapInsert](#heapinsert)
		- [堆的大小 size](#%E5%A0%86%E7%9A%84%E5%A4%A7%E5%B0%8F-size)
		- [heapify](#heapify)
		- [pop](#pop)
		- [问题一：随时找到数据流的中位数](#%E9%97%AE%E9%A2%98%E4%B8%80%EF%BC%9A%E9%9A%8F%E6%97%B6%E6%89%BE%E5%88%B0%E6%95%B0%E6%8D%AE%E6%B5%81%E7%9A%84%E4%B8%AD%E4%BD%8D%E6%95%B0)
		- [堆排序](#%E5%A0%86%E6%8E%92%E5%BA%8F-1)
	- [排序算法的稳定性](#%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95%E7%9A%84%E7%A8%B3%E5%AE%9A%E6%80%A7)
	- [排序总结](#%E6%8E%92%E5%BA%8F%E6%80%BB%E7%BB%93)
	- [比较器](#%E6%AF%94%E8%BE%83%E5%99%A8)
	- [比较器的一点思考](#%E6%AF%94%E8%BE%83%E5%99%A8%E7%9A%84%E4%B8%80%E7%82%B9%E6%80%9D%E8%80%83)
	- [非基于比较的排序](#%E9%9D%9E%E5%9F%BA%E4%BA%8E%E6%AF%94%E8%BE%83%E7%9A%84%E6%8E%92%E5%BA%8F)
		- [问题一：假设存在一组数据，里面的数据只有 0 ~ 60 ，使用非基于比较的排序](#%E9%97%AE%E9%A2%98%E4%B8%80%EF%BC%9A%E5%81%87%E8%AE%BE%E5%AD%98%E5%9C%A8%E4%B8%80%E7%BB%84%E6%95%B0%E6%8D%AE%EF%BC%8C%E9%87%8C%E9%9D%A2%E7%9A%84%E6%95%B0%E6%8D%AE%E5%8F%AA%E6%9C%89-0-%7E-60-%EF%BC%8C%E4%BD%BF%E7%94%A8%E9%9D%9E%E5%9F%BA%E4%BA%8E%E6%AF%94%E8%BE%83%E7%9A%84%E6%8E%92%E5%BA%8F)
		- [问题二：给定一个数组，求如果排序之后，相邻两数的最大差值，要求时间复杂度 O\(n\)，且要求不能用非基于比较的排序](#%E9%97%AE%E9%A2%98%E4%BA%8C%EF%BC%9A%E7%BB%99%E5%AE%9A%E4%B8%80%E4%B8%AA%E6%95%B0%E7%BB%84%EF%BC%8C%E6%B1%82%E5%A6%82%E6%9E%9C%E6%8E%92%E5%BA%8F%E4%B9%8B%E5%90%8E%EF%BC%8C%E7%9B%B8%E9%82%BB%E4%B8%A4%E6%95%B0%E7%9A%84%E6%9C%80%E5%A4%A7%E5%B7%AE%E5%80%BC%EF%BC%8C%E8%A6%81%E6%B1%82%E6%97%B6%E9%97%B4%E5%A4%8D%E6%9D%82%E5%BA%A6-on%EF%BC%8C%E4%B8%94%E8%A6%81%E6%B1%82%E4%B8%8D%E8%83%BD%E7%94%A8%E9%9D%9E%E5%9F%BA%E4%BA%8E%E6%AF%94%E8%BE%83%E7%9A%84%E6%8E%92%E5%BA%8F)
- [数组 - 栈 - 队列](#%E6%95%B0%E7%BB%84---%E6%A0%88---%E9%98%9F%E5%88%97)
	- [使用数组模拟栈和队列](#%E4%BD%BF%E7%94%A8%E6%95%B0%E7%BB%84%E6%A8%A1%E6%8B%9F%E6%A0%88%E5%92%8C%E9%98%9F%E5%88%97)
	- [设计 getMin\(\) 操作时间复杂度为 O\(1\) 的栈](#%E8%AE%BE%E8%AE%A1-getmin-%E6%93%8D%E4%BD%9C%E6%97%B6%E9%97%B4%E5%A4%8D%E6%9D%82%E5%BA%A6%E4%B8%BA-o1-%E7%9A%84%E6%A0%88)
	- [使用栈实现队列](#%E4%BD%BF%E7%94%A8%E6%A0%88%E5%AE%9E%E7%8E%B0%E9%98%9F%E5%88%97)
	- [使用队列实现栈](#%E4%BD%BF%E7%94%A8%E9%98%9F%E5%88%97%E5%AE%9E%E7%8E%B0%E6%A0%88)
	- [猫狗队列问题](#%E7%8C%AB%E7%8B%97%E9%98%9F%E5%88%97%E9%97%AE%E9%A2%98)
- [待定](#%E5%BE%85%E5%AE%9A)

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

| 方式   | 算法         | 时间复杂度 | 空间复杂度 | 稳定性 | 数据排序情况 |
| ------ | ------------ | ---------- | ---------- | ------ | ------------ |
| 交换   | 冒泡排序     | O(n^2)     | O(1)       | 可以   | 无关         |
|        | 随机快排     | O(N*logN)  | O(logN)    | 不可以 | 无关         |
| 插入   | 直接插入排序 | O(n^2)     | O(1)       | 可以   | 有关         |
| 选择   | 直接选择排序 | O(n^2)     | O(1)       | 不可以 | 无关         |
|        | 堆排序       | O(N*logN)  | O(1)       | 不可以 | 无关         |
| 分治   | 归并排序     | O(N*logN)  | O(N)       | 可以   | 无关         |
| 非比较 | 计数排序     | O(N)       | O(N)       | 不可以 | 有关         |
|        | 基数排序     | O(N)       | O(N)       | 不可以 | 有关         |


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

### 问题二：荷兰国旗问题

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

### 问题一：随时找到数据流的中位数

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

### 问题一：假设存在一组数据，里面的数据只有 0 ~ 60 ，使用非基于比较的排序

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

如果此时数据范围变得较大，如 0 ~ 1,000,000,000 ，则不宜使用计数排序，应该使用基数排序。**基数排序**只准备 10 个桶，将数据的最大值和最小值作为区间，分成 10 等分，将数据按照桶的范围分别装入。 

### 问题二：给定一个数组，求如果排序之后，相邻两数的最大差值，要求时间复杂度 O(n)，且要求不能用非基于比较的排序

思路：

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

## 问题一：转圈打印矩阵

给定一个整型矩阵matrix，请按照转圈的方式打印它。要求：额外空间复杂度为O(1)。

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

### 思路：

定义一个方法，以左上角的点和右下角的点开始，从边界开始打印矩形。打印一圈后循环遍历内圈的矩形，直到整个矩形打印完毕。有一些特殊的情况，比如打印的是一条竖线，或者横线，或者一个点，都没有关系，注意代码的边界即可。

### 实现：

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

### 测试：

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



# 待定

缓存淘汰算法 LRU (Least Recently Used) 哈希链表

Map

使用队列实现图的深度优先搜索 => 使用两个队列实现栈结构，使用自定义的栈结构实现图的深度优先搜索



