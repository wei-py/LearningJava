## 字符串
CompareTo CompareToIgnoreCase
lastIndexOf
removeCharAt
replace replaceFirst replaceAll
new StringBuffer(string).reverse().toString();
indexOf
split -> 当limit为-1时,字符串会被尽可能地被多拆分
StringTokenizer
toUpperCase
regionMatches "Welcome to Microsoft".regionMatches(11, "I work with microsoft", 12, 9)
System.out.format(Locale.CHINA  , "%-10.4f%n%n", e);

## 数组
- 查找
Arrays.binarySearch
- 数组添加元素
```java
private static int[] insertElement(int original[], int element, int index) {
  int length = original.length;
  int destination[] = new int[length + 1];
  System.arraycopy(original, 0, destination, 0, index);
  destination[index] = element;
  System.arraycopy(original, index, destination, index + 1, length - index);
  return destination;
}
```
- 数组获取最大和最小值
Collections.min(Arrays.asList(numbers));
- 数组合并
List list = new ArrayList(Arrays.asList(a));
list.addAll(Arrays.asList(b));
- 数组填充
Arrays.fill(array, 3, 6, 50);
- 数组差集
objArray.removeAll(objArray2);
- 数组交集
objArray.retainAll(objArray2);
- 数组中查找指定元素
objArray.contains("common2")
- 判断数组是否相等
Arrays.equals(ary, ary2)


## 时间
- 格式化时间
```java
(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format((new Date()))
```
- 获取年份、月份等
Calendar cal = Calendar.getInstance();
int month = cal.get(Calendar.MONTH) + 1;


## 方法
- instanceof
- 标签(Label)
- Varargs 可变参数使用