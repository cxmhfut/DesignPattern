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

[factory_code](https://github.com/cxmhfut/DesignPattern/tree/master/src/dp/factory)

## 3 Builder模式

生成器模式

![dp_builder](https://github.com/cxmhfut/DesignPattern/blob/master/images/dp_builder.png)

[builder_code](https://github.com/cxmhfut/DesignPattern/tree/master/src/dp/builder)

- 运行结果
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

## 4 Strategy模式

策略模式

[strategy_code](https://github.com/cxmhfut/DesignPattern/tree/master/src/dp/strategy)

- 运行结果
```
春季促销活动
夏季促销活动
秋季促销活动
冬季促销活动
```

## 5 Template模式

模板模式

[template_code](https://github.com/cxmhfut/DesignPattern/tree/master/src/dp/template)

- 运行结果
```
Basketball Game:initialize...
Basketball Game:start...
Basketball Game:end...
Football Game:initialize...
Football Game:start...
Football Game:end...
```

## 6 Decorator模式

装饰模式

![dp_decorator](https://github.com/cxmhfut/DesignPattern/blob/master/images/dp_decorator.png)

[decorator_code](https://github.com/cxmhfut/DesignPattern/tree/master/src/dp/decorator)

- 运行结果
```
Draw:TextView
Scroll to:0
Border width:100
```

## 7 Observer模式

观察者模式

![dp_observer](https://github.com/cxmhfut/DesignPattern/blob/master/images/dp_observer.png)

[observer_code](https://github.com/cxmhfut/DesignPattern/tree/master/src/dp/observer)

- 运行结果
```
Student A received paper:体育周刊
Student B received paper:体育周刊
Student C received paper:体育周刊
Student A received paper:学术人生
Student B received paper:学术人生
```

## 8 Response Chain模式

职责链模式

![dp_responsechain](https://github.com/cxmhfut/DesignPattern/blob/master/images/dp_responsechain.png)

[responsechain_code](https://github.com/cxmhfut/DesignPattern/tree/master/src/dp/responsechain)

- 运行结果
```
HR Manager:Request{day=5, reason='病假'}
Project Manager:Request{day=2, reason='事假'}
General Manager:Request{day=15, reason='出差'}
```

## 9 Adapter模式

适配器模式

![dp_adapter](https://github.com/cxmhfut/DesignPattern/blob/master/images/dp_adapter.png)

[adapter_code](https://github.com/cxmhfut/DesignPattern/tree/master/src/dp/adapter)

- 运行结果
```
Playing MP4 file. Name:alone.mp4
Playing Vlc file. Name:far far away.vlc
Invalid audio type.
```

## 10 Bridge模式

桥接模式

[bridge_code](https://github.com/cxmhfut/DesignPattern/tree/master/src/dp/bridge)

- 运行结果
```
Drawing Circle[color:red, radius:5, x:0, y:0]
Drawing Circle[color:green, radius:3, x:0, y:0]
```

## 11 Proxy模式

代理模式

[proxy_code](https://github.com/cxmhfut/DesignPattern/tree/master/src/dp/proxy)