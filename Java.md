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

### Java 变量

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

## java 修饰符

- 访问修饰符
    - default
    - private
    - public
    - protected
- 非访问修饰符
    - static
    - final 常量
    - abstract 抽象
    - synchronized synchronized 关键字声明的方法同一时间只能被一个线程访问。synchronized 修饰符可以应用于四个访问修饰符。
    - transient 



    




































