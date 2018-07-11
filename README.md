# Design-Pattern

## 0 Class Init

类的初始化顺序

```
Super Class static variable init.
Super Class static block init.
Sub Class static variable init.
Sub Class static block init.
Super Class variable init.
Super Class block init.
Super Class Constructor init.
Sub Class variable init.
Sub Class block init.
Sub Class Constructor init.
```

- 1 父类的静态变量和静态块
- 2 子类的静态变量和静态块
- 3 父类的变量和块
- 4 父类构造器
- 5 子类的变量和块
- 6 子类构造器

## 1 Singleton模式

单例模式

- 1 饿汉式单例模式

```java
/**
 * 饿汉式单例模式创建
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance(){
        return instance;
    }
}
```
- 2 懒汉式单例模式创建

```java
/**
 * 懒汉式单例模式创建
 */
public class Singleton2 {
    private static Singleton2 instance;

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }

        return instance;
    }
}
```

## 2 Factory模式

工厂模式

## 3 Builder模式

生成器模式

![dp_builder](https://github.com/cxmhfut/DesignPattern/blob/master/images/dp_builder.png)



```
Building Engine...
Building Steer...
Building Wheel...
Building Engine...
Building Steer...
Building Wheel...
Car{engine='2WheelCarEngine', steer='2WheelCarSteer', wheel=2}
Car{engine='4WheelCarEngine', steer='4WheelCarSteer', wheel=4}
```

- Car2WheelBuilder.java

```java
public class Car2WheelBuilder extends CarBuilder {

    @Override
    public void buildEngine() {
        System.out.println("Building Engine...");
        getResult().setEngine("2WheelCarEngine");
    }

    @Override
    public void buildSteer() {
        System.out.println("Building Steer...");
        getResult().setSteer("2WheelCarSteer");
    }

    @Override
    public void buildWheel() {
        System.out.println("Building Wheel...");
        getResult().setWheel(2);
    }
}
```

## 4 Strategy模式

策略模式

[code](https://github.com/cxmhfut/DesignPattern/tree/master/src/dp/strategy)

```
春季促销活动
夏季促销活动
秋季促销活动
冬季促销活动
```

## 5 Template模式

## 6 Decorator模式

## 7 Observer模式

## 8 Response Chain模式

## 9 Adapter模式

## 10 Bridge模式

## 11 Proxy模式