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
	- [快速排序](#%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F)
		- [问题一](#%E9%97%AE%E9%A2%98%E4%B8%80)
		- [问题二：荷兰国旗问题](#%E9%97%AE%E9%A2%98%E4%BA%8C%EF%BC%9A%E8%8D%B7%E5%85%B0%E5%9B%BD%E6%97%97%E9%97%AE%E9%A2%98)
		- [总结](#%E6%80%BB%E7%BB%93)
		- [经典快排](#%E7%BB%8F%E5%85%B8%E5%BF%AB%E6%8E%92)
		- [随机快排](#%E9%9A%8F%E6%9C%BA%E5%BF%AB%E6%8E%92)
	- [堆排序](#%E5%A0%86%E6%8E%92%E5%BA%8F)
		- [堆的构建](#%E5%A0%86%E7%9A%84%E6%9E%84%E5%BB%BA)
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

| 方式 | 算法            | 时间复杂度 | 空间复杂度 | 稳定性 | 数据排序情况 |
| ---- | --------------- | ---------- | ---------- | ------ | ------------ |
| 交换 | 冒泡排序        | O(n^2)     | O(1)       | 可以   | 无关         |
|      | 快排 - 随机快排 | O(N*logN)  | O(logN)    | 不可以 | 有关/无关    |
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

### 堆的构建

以构建大根堆为例，heapInsert 将

# 待定

堆排序，二叉堆

缓存淘汰算法 LRU (Least Recently Used) 哈希链表



