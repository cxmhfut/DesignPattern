# Design-Pattern

## 设计原则

- 单一职责原则：类的职责要单一，不要将过多的职责放在一个类当中。
- 开闭原则：软件实体对扩展是开放的，对修改是关闭的，即在不修改软件实体的基础上扩展其功能。
- 里氏替换原则：在软件系统中，一个可以接受基类对象的地方必然可以接受一个子类对象。
- 依赖倒转原则：要依赖抽象编程，不要针对具体类编程。要针对接口编程，不要针对实现编程。
- 合成复用原则：在系统中应该尽量多使用组合，聚合关联关系，尽量少甚至不使用继承关系。
- 迪米特法则：一个软件实体对其他实体的引用越少越好，或者说如果两个类不必彼此互相通信，
那么这两个类就不应当发生直接地相互作用，而是通过引入一个第三者发生间接交互。

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

<h4>简单工厂模式</h4>

- 将具体对象的生成，移植到服务器端代码的一个对象生成工厂中
- 当有需求增加新的子类对象时，客户端的代码不需要修改
- 服务器端需要增加修改：增加子类，修改扩充工厂类。

<h4>动态工厂模式</h4>

- 定义一个创建业务对象的工厂接口，将实际创建工作推迟到子类当中。
核心工厂类不再负责产品的创建，这样核心类成为一个抽象工厂角色，
仅负责具体工厂子类必须实现的接口，
这样进一步抽象化的好处是使得工厂方法模式可以使系统在不修改具体工厂角色的情况下引进新的产品
- 工厂模式是简单工厂模式的衍生、扩展、解决了许多简单工厂模式的问题。首先完全符合开闭原则，
实现了可扩展。其次更复杂的层次结构，可以应用于产品结构复杂的场合。


[factory_code](https://github.com/cxmhfut/DesignPattern/tree/master/src/dp/factory)

## 3 Builder模式

生成器模式

- 将一个复杂对象与其表象分离，使得同样的构建过程可以创建不同的对象表示
- 在工厂模式里，我们无需关心产品的各部分是如何被创建的；但在Builder模式里，
会把产品的创建过程抽象为多个部分。也就是说，工厂模式被关注的是整个产品，
而Builder模式被关注的是产品的组成部分的创建过程。

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

- 定义了一系列的算法，并将每个算法封装起来，而且使他们还可以相互替换。策略模式让算法独立于使用它的客户而独立变化。

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

该模式的核心思想是：固定整体框架和流程整体上的稳定性、可重用性，
留出一些子类定制点以保证可扩展性、多样性。模板方法模式需要抽象类和具体子类协调完成：

- 抽象类负责给出一个算法的轮廓和骨架；
- 不同的、具体子类负责给出这个算法的各个逻辑步骤；

将这些基本方法汇总起来的方法叫做模板方法，这个模板方法是在抽象类中以具体方法（非abstract）定义的

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

<h4>意图</h4>

动态地给一个对象一些额外的职责，就增加功能来说，Decorator模式相比生成子类更为灵活

<h4>适用性</h4>

- 在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。
- 当不能采用生成子类的方法进行扩充时。
- 一种情况是，可能有大量独立的扩展，为支持每一种组合将产生大量的子类，
使得子类数目呈爆炸性增长。
- 另一种情况可能是因为类定义被隐藏，或类定义不能用于生成子类。

<h4>效果</h4>

- Decorator比静态继承更灵活；
- Decorator避免在层次结构高层的类中有太多的特征；
- Decorator不等同于它所装饰的对象；
- 可能产生很多小对象

<h4>实现</h4>

- 装饰对象应该与被装饰组件保持一致的接口（互相嵌套装饰），即组件的所有装饰实现类拥有相同的父类；
- 当只有一个装饰实现类是，可以省略装饰抽象类；
- 组件与装饰拥有相同的父类，应保持父类的简单性；
- 装饰可以用于改变组件的外观，而不能改变组件的内核；

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

观察者模式（有时又被成为发布/订阅模式）是软件设计模式的一种。在此种模式中，
一个被观察者（消息主体）管理所有依赖于它的观察者，并且在它本身的状态改变时主动发出通知（其实就是调用观察者的相关方法）。
此种模式通常被用来作事件处理系统。

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

Chain of Responsibility(CoR)职责链模式，CoR模式是用一系列（classes）去处理一个请求request，
这些类之间是一个松散的耦合，唯一共同点是在他们之间传递request，也就是说，来了一个请求，
A类先处理，如果没有处理，就传递到B类处理，如果没有处理，就传递到C类处理，
就这样像一个链条一样传递下去处理一个request。

- 优点：因为无法预知来自外界（客户端）的请求是属于哪种类型，每个类如果碰到它不能处理的请求只要放弃就可以。
- 缺点：效率低，因为一个请求的完成可能要遍历到最后才能完成；扩展性差，因为在CoR中，
一定要有一个统一的接口Handler，局限性就在这里。

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