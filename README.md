# 算法导论读书笔记

## Chapter 2

插入排序

输入：a={5，2，4，6，1，3}<br>
输出：a={1，2，3，4，5，6}

```
算法描述：
从第二个元素开始 i = 2;
  循环向前比较，找到第一个元素j，使得a[i] > a[j]，说明找到i元素的正确位置
    将a[i]的值赋给a[j+1]
循环结束
```

复杂度分析：元素序列为n，外层循环数为n；内层循环次数取决于，第i元素比较多少次能找到合适的位置<br>
最坏情况是(n-i)，故最坏时间复杂度为n*(n-i)=O(N^2)

---
