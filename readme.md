## 基本语法

- 大小写敏感
- 类名：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 MyFirstJavaClass
- 方法名：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
- 源文件名：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记 Java 是大小写敏感的），文件名的后缀为 .java。（如果文件名和类名不相同则会导致编译错误）。
- 主方法入口：所有的 Java 程序由 public static void main(String[] args) 方法开始执行。

### 标识符

- 合法标识符举例：age、$salary、_value、__1_value
- 非法标识符举例：123abc、-salary

### 修饰符

- 访问控制修饰符 : default, public , protected, private
- 非访问控制修饰符 : final, abstract, static, synchronized

### Java 变量

- 局部变量
- 类变量（静态变量）
- 成员变量（非静态变量）

### Java 数组

### Java 枚举

```java
class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
   FreshJuiceSize size;
}
public class FreshJuiceTest {
   public static void main(String[] args){
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice.FreshJuiceSize.MEDIUM  ;
   }
}
```

---

## Java 变量

- 访问控制
- 类、方法和变量修饰符
- 程序控制语句
- 错误处理
- 包相关
- 基本类型
- 变量引用
- 保留关键字
  注意：Java 的 null 不是关键字，类似于 true 和 false，它是一个字面常量，不允许作为标识符使用。

### 空行 和 注释

### 继承 和 接口

## Java 源程序与编译型运行区别

![alt](https://www.runoob.com/wp-content/uploads/2013/12/ZSSDMld.png)

---

## Java 对象和类

### 基本概念

- 多态
- 继承
- 封装
- 抽象
- 类
- 对象
- 实例
- 方法
- 重载

```java
public class Dog {
    String breed;
    int size;
    String colour;
    int age;
 
    void eat() {
    }
 
    void run() {
    }
 
    void sleep(){
    }
 
    void name(){
    }
}
```

- 创建对象
    - 声明：声明一个对象，包括对象名称和对象类型。
    - 实例化：使用关键字 new 来创建一个对象。
    - 初始化：使用 new 创建对象时，会调用构造方法初始化对象。

```java
public class Puppy{
   public Puppy(String name){
      //这个构造器仅有一个参数：name
      System.out.println("小狗的名字是 : " + name ); 
   }
   public static void main(String[] args){
      // 下面的语句将创建一个Puppy对象
      Puppy myPuppy = new Puppy( "tommy" );
   }
}
```

- 实例

```java
public class Puppy{
   int puppyAge;
   public Puppy(String name){
      // 这个构造器仅有一个参数：name
      System.out.println("小狗的名字是 : " + name ); 
   }
 
   public void setAge( int age ){
       puppyAge = age;
   }
 
   public int getAge( ){
       System.out.println("小狗的年龄为 : " + puppyAge ); 
       return puppyAge;
   }
 
   public static void main(String[] args){
      /* 创建对象 */
      Puppy myPuppy = new Puppy( "tommy" );
      /* 通过方法来设定age */
      myPuppy.setAge( 2 );
      /* 调用另一个方法获取age */
      myPuppy.getAge( );
      /*你也可以像下面这样访问成员变量 */
      System.out.println("变量值 : " + myPuppy.puppyAge ); 
   }
}
```

- 源文件声明规则
    - 一个源文件中只能有一个 public 类
    - 一个源文件可以有多个非 public 类
    - 源文件的名称应该和 public 类的类名保持一致。例如：源文件中 public 类的类名是 Employee，那么源文件应该命名为Employee.java。
    - 源文件的名称应该和 public 类的类名保持一致。例如：源文件中 public 类的类名是 Employee，那么源文件应该命名为Employee.java。
    - 如果一个类定义在某个包中，那么 package 语句应该在源文件的首行。
    - 如果源文件包含 import 语句，那么应该放在 package 语句和类定义之间。如果没有 package 语句，那么 import 语句应该在源文件中最前面。
    - import 语句和 package 语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。
      -- 类有若干种访问级别，并且类也分不同的类型：抽象类和 final 类等。这些将在访问控制章节介绍。除了上面提到的几种类型，Java 还有一些特殊的类，如：内部类、匿名类。

- import 语句
    - 在 Java 中，如果给出一个完整的限定名，包括包名、类名，那么 Java 编译器就可以很容易地定位到源代码或者类。import 语句就是用来提供一个合理的路径，使得编译器可以找到某个类。
      // import java.io.*;

---

## Java 基本数据类型

- 内置数据类型
    - Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。
    - byte 最小值是 -128（-2^7）； 最大值是 127（2^7-1）；
    - short 最小值是 -32768（-2^15）； 最大值是 32767（2^15 - 1）；
    - int 最小值是 -2,147,483,648（-2^31）；最大值是 2,147,483,647（2^31 - 1）；
    - long 最小值是 -9,223,372,036,854,775,808（-2^63）； 最大值是 9,223,372,036,854,775,807（2^63 -1） 例子： long a = 100000L，long b =
      -200000L。
    - float float 数据类型是单精度、32位、符合IEEE 754标准的浮点数； 例子：float f1 = 234.5f。
    - double double 数据类型是双精度、64 位、符合 IEEE 754 标准的浮点数； 7 是一个 int 字面量，而 7D，7. 和 8.0 是 double 字面量。
    - boolean
    - char char 类型是一个单一的 16 位 Unicode 字符； 最小值是 \u0000（十进制等效值为 0）；最大值是 \uffff（即为 65535）； char 数据类型可以储存任何字符；
- Java 常量
    - final double PI = 3.1415927;
- 隐含强制类型转换
    -
        2. 小数默认是 double 类型浮点型，在定义 float 类型时必须在数字后面跟上 F 或者 f。

---

## java 变量类型

- 类变量：独立于方法之外的变量，用 static 修饰。
- 实例变量：独立于方法之外的变量，不过没有 static 修饰。
- 局部变量：类的方法中的变量。

```java
public class Variable{
    static int allClicks=0;    // 类变量
    String str="hello world";  // 实例变量
    public void method(){ 
        int i =0;  // 局部变量
    }
}
```

---

## java 修饰符

- 访问控制修饰符
    - default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
    - private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
    - public : 对所有类可见。使用对象：类、接口、变量、方法
    - protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
- 非访问修饰符
    - static
    - final 常量
    - abstract 抽象
    - synchronized synchronized 关键字声明的方法同一时间只能被一个线程访问。synchronized 修饰符可以应用于四个访问修饰符。
    - transient 该修饰符包含在定义变量的语句中，用来预处理类和变量的数据类型。
    - volatile 修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。

## java string 类

char charactor String StringBuffer

- substring subSequence
  返回类型不一样，subString返回的是String，subSequence返回的是实现了CharSequence接口的类，也就是说使用subSequence得到的结果，只能使用CharSequence接口中的方法。不过在String类中已经重写了subSequence，调用subSequence方法，可以直接下转为String对象。
- valueOf

```java
public class Test {
    public static void main(String args[]) {
        double d = 1100.00;
        boolean b = true;
        long l = 1234567890;
        char[] arr = {'r', 'u', 'n', 'o', 'o', 'b' };
        System.out.println("返回值 : " + String.valueOf(d) );
        System.out.println("返回值 : " + String.valueOf(b) );
        System.out.println("返回值 : " + String.valueOf(l) );
        System.out.println("返回值 : " + String.valueOf(arr) );
    }
}
```

- intern

```java
String str1 = "a";
String str2 = "b";
String str3 = "ab";
String str4 = str1 + str2;
String str5 = new String("ab");

System.out.println(str5.equals(str3)); // true
System.out.println(str5 == str3);   // false
System.out.println(str5.intern() == str3);   // true
System.out.println(str5.intern() == str4);   // false
```

- regionMatches

```java
public class Test {
    public static void main(String args[]) {
        String Str1 = new String("www.runoob.com");
        String Str2 = new String("runoob");
        String Str3 = new String("RUNOOB");
        System.out.println(Str1.regionMatches(4, Str2, 0, 5)); // 返回值 :true
        System.out.println(Str1.regionMatches(4, Str3, 0, 5)); // 返回值 :false
        System.out.println(Str1.regionMatches(true, 4, Str3, 0, 5)); // 返回值 :true
    }
}
```

- getChars // getBytes

```java
public class Test {
    public static void main(String args[]) {
        String Str1 = new String("www.runoob.com");
        char[] Str2 = new char[6];
        try {
            Str1.getChars(4, 10, Str2, 0);
            System.out.print("拷贝的字符串为：" );
            System.out.println(Str2 );
        } catch( Exception ex) {
            System.out.println("触发异常...");
        }
    }
}
// 拷贝的字符串为：runoob
```

- copyValueOf

```java
public class Test {
    public static void main(String args[]) {
        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'r', 'u', 'n', 'o', 'o', 'b'};
        String Str2 = "";
 
        Str2 = Str2.copyValueOf( Str1 );
        System.out.println("返回结果：" + Str2); //返回结果：hello runoob
 
        Str2 = Str2.copyValueOf( Str1, 2, 6 );
        System.out.println("返回结果：" + Str2); // 返回结果：llo ru
    }
}
```

- contentEquals contentEquals() 方法用于将此字符串与指定的 StringBuffer 比较。

```java
public class Test {
    public static void main(String args[]) {
        String str1 = "String1";
        String str2 = "String2";
        StringBuffer str3 = new StringBuffer( "String1");

        boolean  result = str1.contentEquals( str3 );
        System.out.println(result); // true
          
        result = str2.contentEquals( str3 );
        System.out.println(result); // false
    }
}
```

- compareTo

```java
public class Test {
    public static void main(String args[]) {
        String str1 = "Strings";
        String str2 = "Strings";
        String str3 = "Strings123";
        int result = str1.compareTo( str2 );
        System.out.println(result); // 0
        result = str2.compareTo( str3 );
        System.out.println(result); // -3
        result = str3.compareTo( str1 );
        System.out.println(result); // 3
    }
}
```

- skip
    - trim
    - contains
    - isEmpty
    - toUpperCase
    - toLowerCase
    - toString
    - toCharArray
    - startsWith
    - endsWith
    - split
    - replace
    - replaceAll
    - replaceFirst
    - length
    - lastIndexOf
    - indexOf
    - hashCode
    - concat
    - equalsIgnoreCase
    - equals
    - compareToIgnoreCase
    - charAt

---

## StringBuffer

<img src="https://www.runoob.com/wp-content/uploads/2013/12/2021-03-01-java-stringbuffer.svg" style="width: 50vw" /></img>

- 区别
    - 和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
    - StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
    - 由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。

- 方法
    - append
    - reverse
    - delete
    - insert
    - replace
    - capacity // 返回当前容量。
    - charAt
    - ensureCapacity
    - ...

---

## java 数组

java.util.Arrays 类能方便地操作数组，它提供的所有方法都是静态的。
具有以下功能：
给数组赋值：通过 fill 方法。
对数组排序：通过 sort 方法,按升序。
比较数组：通过 equals 方法比较数组中元素值是否相等。
查找数组元素：通过 binarySearch 方法能对排序好的数组进行二分查找法操作。
---

## java 日期

- 方法
    - after
    - before
    - clone
    - compareTo
    - equals
    - getTime
    - hashCode
    - setTime
    - toString
- 日期和时间的格式化编码

| 字母 | 描述                     | 示例                    |
| :--- | :----------------------- | :---------------------- |
| G    | 纪元标记                 | AD                      |
| y    | 四位年份                 | 2001                    |
| M    | 月份                     | July or 07              |
| d    | 一个月的日期             | 10                      |
| h    | A.M./P.M. (1~12)格式小时 | 12                      |
| H    | 一天中的小时 (0~23)      | 22                      |
| m    | 分钟数                   | 30                      |
| s    | 秒数                     | 55                      |
| S    | 毫秒数                   | 234                     |
| E    | 星期几                   | Tuesday                 |
| D    | 一年中的日子             | 360                     |
| F    | 一个月中第几周的周几     | 2 (second Wed. in July) |
| w    | 一年中第几周             | 40                      |
| W    | 一个月中第几周           | 1                       |
| a    | A.M./P.M. 标记           | PM                      |
| k    | 一天中的小时(1~24)       | 24                      |
| K    | A.M./P.M. (0~11)格式小时 | 10                      |
| z    | 时区                     | Eastern Standard Time   |
| '    | 文字定界符               | Delimiter               |
| "    | 单引号                   | `                       |

- 使用printf格式化日期

| c | 包括全部日期和时间信息 | 星期六 十月 27 14:21:20 CST 2007 |
| :-- | :-------------------------- | :------------------------------- |
| F | "年-月-日"格式 | 2007-10-27 |
| D | "月/日/年"格式 | 10/27/07 |
| r | "HH:MM:SS PM"格式（12时制） | 02:25:51 下午 |
| T | "HH:MM:SS"格式（24时制） | 14:28:16 |
| R | "HH:MM"格式（24时制） | 14:28 |

- Calendar

```java
Calendar c1 = Calendar.getInstance(); // 获得年份
int year = c1.get(Calendar.YEAR); // 获得月份
int month = c1.get(Calendar.MONTH) + 1; // 获得日期
int date = c1.get(Calendar.DATE); // 获得小时
int hour = c1.get(Calendar.HOUR_OF_DAY); // 获得分钟
int minute = c1.get(Calendar.MINUTE); // 获得秒
int second = c1.get(Calendar.SECOND); // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
int day = c1.get(Calendar.DAY_OF_WEEK);
```

## 正则表达式

- 简单实例

```java
String a = "hello world!!!";
boolean flag = Pattern.matches("hello.*", a);
System.out.println(flag);
```

- 捕获组
  Pattern.compile("pattern")  ->  .matcher -> Matcher

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class RegexMatches
{
    public static void main( String[] args ){
 
      // 按指定模式在字符串查找
      String line = "This order was placed for QT3000! OK?";
      String pattern = "(\\D*)(\\d+)(.*)";
 
      // 创建 Pattern 对象
      Pattern r = Pattern.compile(pattern);
 
      // 现在创建 matcher 对象
      Matcher m = r.matcher(line);
      if (m.find( )) {
         System.out.println("Found value: " + m.group(0) );
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(2) );
         System.out.println("Found value: " + m.group(3) ); 
      } else {
         System.out.println("NO MATCH");
      }
   }
}
// 擦杆子（Pattern.compile） 打桌球 （r.matcher） 进的球 （m.group）
```

- 正则表达式语法

| \           | 将下一字符标记为特殊字符、文本、反向引用或八进制转义符。例如， n匹配字符 n。\n 匹配换行符。序列 \\\\ 匹配 \\ ，\\( 匹配 (。                                                                                                                                                                                                                           |
| :---------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ^           | 匹配输入字符串开始的位置。如果设置了 RegExp 对象的 Multiline 属性，^ 还会与"\n"或"\r"之后的位置匹配。                                                                                                                                                                                                                                                 |
| $           | 匹配输入字符串结尾的位置。如果设置了 RegExp 对象的 Multiline 属性，$ 还会与"\n"或"\r"之前的位置匹配。                                                                                                                                                                                                                                                 |
| *           | 零次或多次匹配前面的字符或子表达式。例如，zo* 匹配"z"和"zoo"。* 等效于 {0,}。                                                                                                                                                                                                                                                                         |
| +           | 一次或多次匹配前面的字符或子表达式。例如，"zo+"与"zo"和"zoo"匹配，但与"z"不匹配。+ 等效于 {1,}。                                                                                                                                                                                                                                                      |
| ?           | 零次或一次匹配前面的字符或子表达式。例如，"do(es)?"匹配"do"或"does"中的"do"。? 等效于 {0,1}。                                                                                                                                                                                                                                                         |
| {n}         | n 是非负整数。正好匹配 n 次。例如，"o{2}"与"Bob"中的"o"不匹配，但与"food"中的两个"o"匹配。                                                                                                                                                                                                                                                            |
| {n,}        | n 是非负整数。至少匹配 n 次。例如，"o{2,}"不匹配"Bob"中的"o"，而匹配"foooood"中的所有 o。"o{1,}"等效于"o+"。"o{0,}"等效于"o*"。                                                                                                                                                                                                                       |
| {n,m}       | m 和 n 是非负整数，其中 n <= m。匹配至少 n 次，至多 m 次。例如，"o{1,3}"匹配"fooooood"中的头三个 o。'o{0,1}' 等效于 'o?'。注意：您不能将空格插入逗号和数字之间。                                                                                                                                                                                      |
| ?           | 当此字符紧随任何其他限定符（*、+、?、{n}、{n,}、{n,m}）之后时，匹配模式是"非贪心的"。"非贪心的"模式匹配搜索到的、尽可能短的字符串，而默认的"贪心的"模式匹配搜索到的、尽可能长的字符串。例如，在字符串"oooo"中，"o+?"只匹配单个"o"，而"o+"匹配所有"o"。                                                                                                |
| .           | 匹配除"\r\n"之外的任何单个字符。若要匹配包括"\r\n"在内的任意字符，请使用诸如"[\s\S]"之类的模式。                                                                                                                                                                                                                                                      |
| (pattern)   | 匹配 pattern 并捕获该匹配的子表达式。可以使用 $0…$9 属性从结果"匹配"集合中检索捕获的匹配。若要匹配括号字符 ( )，请使用"\("或者"\)"。                                                                                                                                                                                                                  |
| (?:pattern) | 匹配 pattern 但不捕获该匹配的子表达式，即它是一个非捕获匹配，不存储供以后使用的匹配。这对于用"or"字符 (|) 组合模式部件的情况很有用。例如，'industr(?:y|ies) 是比 'industry|industries' 更经济的表达式。                                                                                                                                               |
| (?=pattern) | 执行正向预测先行搜索的子表达式，该表达式匹配处于匹配 pattern 的字符串的起始点的字符串。它是一个非捕获匹配，即不能捕获供以后使用的匹配。例如，'Windows (?=95|98|NT|2000)' 匹配"Windows 2000"中的"Windows"，但不匹配"Windows 3.1"中的"Windows"。预测先行不占用字符，即发生匹配后，下一匹配的搜索紧随上一匹配之后，而不是在组成预测先行的字符后。        |
| (?!pattern) | 执行反向预测先行搜索的子表达式，该表达式匹配不处于匹配 pattern 的字符串的起始点的搜索字符串。它是一个非捕获匹配，即不能捕获供以后使用的匹配。例如，'Windows (?!95|98|NT|2000)' 匹配"Windows 3.1"中的 "Windows"，但不匹配"Windows 2000"中的"Windows"。预测先行不占用字符，即发生匹配后，下一匹配的搜索紧随上一匹配之后，而不是在组成预测先行的字符后。 |
| x|y         | 匹配 x 或 y。例如，'z|food' 匹配"z"或"food"。'(z|f)ood' 匹配"zood"或"food"。                                                                                                                                                                                                                                                                          |
| [xyz]       | 字符集。匹配包含的任一字符。例如，"[abc]"匹配"plain"中的"a"。                                                                                                                                                                                                                                                                                         |
| [^xyz]      | 反向字符集。匹配未包含的任何字符。例如，"[^abc]"匹配"plain"中"p"，"l"，"i"，"n"。                                                                                                                                                                                                                                                                     |
| [a-z]       | 字符范围。匹配指定范围内的任何字符。例如，"[a-z]"匹配"a"到"z"范围内的任何小写字母。                                                                                                                                                                                                                                                                   |
| [^a-z]      | 反向范围字符。匹配不在指定的范围内的任何字符。例如，"[^a-z]"匹配任何不在"a"到"z"范围内的任何字符。                                                                                                                                                                                                                                                    |
| \b          | 匹配一个字边界，即字与空格间的位置。例如，"er\b"匹配"never"中的"er"，但不匹配"verb"中的"er"。                                                                                                                                                                                                                                                         |
| \B          | 非字边界匹配。"er\B"匹配"verb"中的"er"，但不匹配"never"中的"er"。                                                                                                                                                                                                                                                                                     |
| \cx         | 匹配 x 指示的控制字符。例如，\cM 匹配 Control-M 或回车符。x 的值必须在 A-Z 或 a-z 之间。如果不是这样，则假定 c 就是"c"字符本身。                                                                                                                                                                                                                      |
| \d          | 数字字符匹配。等效于 [0-9]。                                                                                                                                                                                                                                                                                                                          |
| \D          | 非数字字符匹配。等效于 [^0-9]。                                                                                                                                                                                                                                                                                                                       |
| \f          | 换页符匹配。等效于 \x0c 和 \cL。                                                                                                                                                                                                                                                                                                                      |
| \n          | 换行符匹配。等效于 \x0a 和 \cJ。                                                                                                                                                                                                                                                                                                                      |
| \r          | 匹配一个回车符。等效于 \x0d 和 \cM。                                                                                                                                                                                                                                                                                                                  |
| \s          | 匹配任何空白字符，包括空格、制表符、换页符等。与 [ \f\n\r\t\v] 等效。                                                                                                                                                                                                                                                                                 |
| \S          | 匹配任何非空白字符。与 [^ \f\n\r\t\v] 等效。                                                                                                                                                                                                                                                                                                          |
| \t          | 制表符匹配。与 \x09 和 \cI 等效。                                                                                                                                                                                                                                                                                                                     |
| \v          | 垂直制表符匹配。与 \x0b 和 \cK 等效。                                                                                                                                                                                                                                                                                                                 |
| \w          | 匹配任何字类字符，包括下划线。与"[A-Za-z0-9_]"等效。                                                                                                                                                                                                                                                                                                  |
| \W          | 与任何非单词字符匹配。与"[^A-Za-z0-9_]"等效。                                                                                                                                                                                                                                                                                                         |
| \xn         | 匹配 n，此处的 n 是一个十六进制转义码。十六进制转义码必须正好是两位数长。例如，"\x41"匹配"A"。"\x041"与"\x04"&"1"等效。允许在正则表达式中使用 ASCII 代码。                                                                                                                                                                                            |
| \num        | 匹配 num，此处的 num 是一个正整数。到捕获匹配的反向引用。例如，"(.)\1"匹配两个连续的相同字符。                                                                                                                                                                                                                                                        |
| \n          | 标识一个八进制转义码或反向引用。如果 \n 前面至少有 n 个捕获子表达式，那么 n 是反向引用。否则，如果 n 是八进制数 (0-7)，那么 n 是八进制转义码。                                                                                                                                                                                                        |
| \nm         | 标识一个八进制转义码或反向引用。如果 \nm 前面至少有 nm 个捕获子表达式，那么 nm 是反向引用。如果 \nm 前面至少有 n 个捕获，则 n 是反向引用，后面跟有字符 m。如果两种前面的情况都不存在，则 \nm 匹配八进制值 nm，其中 n 和 m 是八进制数字 (0-7)。                                                                                                        |
| \nml        | 当 n 是八进制数 (0-3)，m 和 l 是八进制数 (0-7) 时，匹配八进制转义码 nml。                                                                                                                                                                                                                                                                             |
| \un         | 匹配 n，其中 n 是以四位十六进制数表示的 Unicode 字符。例如，\u00A9 匹配版权符号 (©)。                                                                                                                                                                                                                                                                 |

## java 方法

- 方法的命名规则
    - 1.方法的名字的第一个单词应以小写字母作为开头，后面的单词则用大写字母开头写，不使用连接符。例如：addPerson。
    - 2.下划线可能出现在 JUnit 测试方法名称中用以分隔名称的逻辑组件。一个典型的模式是：test<MethodUnderTest>_<state>，例如 testPop_emptyStack。
- 命令行参数的使用

```java
public class CommandLine {
   public static void main(String[] args){ 
      for(int i=0; i<args.length; i++){
         System.out.println("args[" + i + "]: " + args[i]);
      }
   }
}
// $ javac CommandLine.java 
// $ java CommandLine this is a command line 200 -100
// args[0]: this
// args[1]: is
// args[2]: a
// args[3]: command
// args[4]: line
// args[5]: 200
// args[6]: -100
```

- 可变参数

```java
public class VarargsDemo {
    public static void main(String[] args) {
        // 调用可变参数的方法
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }
 
    public static void printMax( double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
 
        double result = numbers[0];
 
        for (int i = 1; i <  numbers.length; i++){
            if (numbers[i] >  result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}
// The max value is 56.5
// The max value is 3.0
```

- finalize() 方法
  Java 允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做 finalize( )，它用来清除回收对象。
  例如，你可以使用 finalize() 来确保一个对象打开的文件被关闭了。
  在 finalize() 方法里，你必须指定在对象销毁时候要执行的操作。

```java
public class FinalizationDemo {  
  public static void main(String[] args) {  
    Cake c1 = new Cake(1);  
    Cake c2 = new Cake(2);  
    Cake c3 = new Cake(3);  
      
    c2 = c3 = null;  
    System.gc(); //调用Java垃圾收集器
  }  
}  
 
class Cake extends Object {  
  private int id;  
  public Cake(int id) {  
    this.id = id;  
    System.out.println("Cake Object " + id + "is created");  
  }  
    
  protected void finalize() throws java.lang.Throwable {  
    super.finalize();  
    System.out.println("Cake Object " + id + "is disposed");  
  }  
}
```