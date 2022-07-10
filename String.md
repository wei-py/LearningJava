> https://blog.csdn.net/m0_63174529/article/details/121438215

## Java中的String为什么是不可变的？
**str1+=str2实际上是执行了str1=(new StringBuilder()).append(str2).toString();**

![alt](https://img-blog.csdnimg.cn/20191105112248831.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1FpblRhbzk5NjEyMjA=,size_16,color_FFFFFF,t_70)

### String对象真的不可变吗？
虽然value是final修饰的，只是说明value不能再重新指向其他的引用。但是value指向的数组可以改变，一般情况下我们是没有办法访问到这个value指向的数组的元素。但是可以使用反射，可以反射出String对象中的value属性， 进而改变通过获得的value引用改变数组的结构。
```java
String str = “Hello World”;

System.out.println(“修改前的str:” + str);

System.out.println(“修改前的str的内存地址” + System.identityHashCode(str));

// 获取String类中的value字段

Field valueField = String.class.getDeclaredField(“value”);

// 改变value属性的访问权限

valueField.setAccessible(true);

// 获取str对象上value属性的值

char[] value = (char[]) valueField.get(str);

// 改变value所引用的数组中的字符

value[3] = ‘?’;

System.out.println(“修改后的str:” + str);

System.out.println(“修改前的str的内存地址” + System.identityHashCode(str));
```

```java
import java.lang.reflect.Field;

public class index {
    public static void main(String args[]) throws NoSuchFieldException, IllegalAccessException {
        String str = "Hello World";
        Field valueField = String.class.getDeclaredField("value");
        valueField.setAccessible(true);
        char[] value = (char[]) valueField.get(str);
        value[3] = '?';
    }
}
```