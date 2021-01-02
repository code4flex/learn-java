learn-java
内部技术分享-代码示例
注 : 划线的还未更新（不定期更新~）

**目录**

  - [一、设计模式](#一设计模式)
    - [1.01 单例模式](#101-单例模式)
    - [1.02 工厂模式](#102-工厂模式)
    - [1.03 抽象工厂模式](#103-抽象工厂模式)
    - [1.04 建造者模式](#104-建造者模式)
    - [1.05 原型模式](#105-原型模式)
    - [1.06 代理模式](#106-代理模式)
    - [1.07 适配器模式](#107-适配器模式)
    - [1.08 桥接模式](#108-桥接模式)
    - [1.09 组合模式](#109-组合模式)
    - [1.10 装饰模式](#110-装饰模式)
    - [1.11 外观模式](#111-外观模式)
    - [1.12 享元模式](#112-享元模式)
    - [1.13 责任链模式](#113-责任链模式)
    - [1.14 命令模式](#114-命令模式)
    - [1.15 迭代器模式](#115-迭代器模式)
    - [1.16 中介者模式](#116-中介者模式)
    - [1.17 备忘录模式](#117-备忘录模式)
    - [1.18 观察者模式](#118-观察者模式)
    - [1.19 状态模式](#119-状态模式)
    - [1.20 策略模式](#120-策略模式)
    - [1.21 模板方法模式](#121-模板方法模式)
    - [1.22 访问者模式](#122-访问者模式)
    - [1.23 委派模式](#123-委派模式)

  - [二、领域驱动DDD](#二领域驱动DDD)
  - [2.01 应用](#101-应用)
---

## 一、设计模式

设计模式遵循六⼤大原则：单⼀一职责( ⼀一个类和⽅方法只做⼀一件事 )、⾥里里⽒氏替换( 多态，⼦子类可扩展⽗父类 )、依赖倒置( 细节依赖抽象，下层依赖上层 )、接⼝口隔离( 建⽴立单⼀一接⼝口 )、迪⽶米特原则( 最少知道，降低耦合 )、开闭原则( 抽象架构，扩展实现 )。

创建型模式
- **单例** - 多种单例模式实现
- **工厂** - 工厂模式实现
- **抽象工厂** - 抽象工厂模式实现
- **建造者** - ~~建造者模式实现~~
- **原型** - 原型模式实现

结构型模式
- **代理** - 代理模式实现
- **适配器** - ~~适配器模式实现~~
- **桥接** - ~~桥接模式实现~~
- **组合** - ~~组合模式实现~~
- **装饰** - ~~装饰模式实现~~
- **外观** - ~~外观模式实现~~
- **享元** - ~~享元模式实现~~

行为模式
- **责任链** - ~~责任链模式实现~~
- **命令** - ~~命令模式实现~~
- **迭代器** - ~~迭代器模式实现~~
- **中介者** - ~~中介者模式实现~~
- **备忘录** - ~~备忘录模式实现~~
- **观察者** - 观察者模式实现
- **状态** - ~~状态模式实现~~
- **策略** - 策略模式实现
- **模板方法** - 模板方法模式实现
- **访问者** - ~~访问者模式实现~~

其他模式
- **委派** - 委派模式实现

### 1.01 单例模式

参见 design-pattern-01

### 1.02 工厂模式

参见 design-pattern-02

### 1.03 抽象工厂模式

参见 design-pattern-03

### 1.04 建造者模式

~~参见 design-pattern-04~~

### 1.05 原型模式

参见 design-pattern-05

### 1.06 代理模式

参见 design-pattern-06

### 1.07 适配器模式

~~参见 design-pattern-07~~

### 1.08 桥接模式

~~参见 design-pattern-08~~

### 1.09 组合模式

~~参见 design-pattern-09~~

### 1.10 装饰模式

~~参见 design-pattern-10~~

### 1.11 外观模式

~~参见 design-pattern-11~~

### 1.12 享元模式

~~参见 design-pattern-12~~

### 1.13 责任链模式

~~参见 design-pattern-13~~

### 1.14 命令模式

~~参见 design-pattern-14~~

### 1.15 迭代器模式

~~参见 design-pattern-15~~

### 1.16 中介者模式

~~参见 design-pattern-16~~

### 1.17 备忘录模式

~~参见 design-pattern-17~~

### 1.18 观察者模式

参见 design-pattern-18

### 1.19 状态模式

~~参见 design-pattern-19~~

### 1.20 策略模式

参见 design-pattern-20

### 1.21 模板方法模式

参见 design-pattern-21

### 1.22 访问者模式

~~参见 design-pattern-22~~

### 1.23 委派模式

参见 design-pattern-23

---

## 二、领域驱动DDD

领域驱动架构设计实践

### 2.01 架构应用实践

参见 design-ddd-sample

- **调用关系**
Interface —> application | domain | infrastructure
application —>domain | infrastructure
domain —>infrastructure

- **层级关系**
|  层级   | 对应目录  | remark  |
|  ----  | ----  | ----  |
| 表现层  | interface | 表现层负责向用户显示解释用户命令 |
| 应用层  | application | application划分为很薄的一层服务，非核心的逻辑放到此层实现，核心的业务逻辑表现下沉到领域层去实现 |
| 领域层  | domain | 系统的核心，负责表达业务概念，业务状态信息以及业务规则。即包含了该领域（问题域）所有复杂的业务知识抽象和规则定义。该层主要精力要放在领域对象分析上，可以从实体，值对象，聚合（聚合根），领域服务，领域事件，仓储，工厂等方面入手 |
| 基础设施层  | infrastructure | 主要有2方面内容，一是为领域模型提供持久化机制，当软件需要持久化能力时候才需要进行规划；一是对其他层提供通用的技术支持能力，如消息通信，通用工具，配置等的实现 |

- **代码结构描述**
├─com.code4flex.design.module.sample
│    │ 
│    ├─interface   用户表现层
│    │    ├─assembler    装配器，实现模型转换
│    │    └─controller   控制器
│    │    │    ├─vo    控制器实体vo对象
│    │ 
│    ├─application   应用层
│    │    ├─aspect  自定义AOP aspect
│    │    ├─service  应用服务，非核心服务
│    │    ├─task     任务定义，协调领域模型 
│    │    └─XXX      others
│    │ 
│    ├─domain   领域层
│    │    ├─common       公共代码抽取，限于领域层有效 
│    │    ├─events       领域事件
│    │    ├─model        领域模型 
│    │    │    ├─XXX    领域划分的模块，可理解为子域划分
│    │    │    │    ├─XXXVo.java       领域值对象
│    │    │    │    ├─XXXEntity.java   领域实体，充血的领域模型，如本身的CRUD操作在此处
│    │    │    │    ├─XXXAgg.java      领域聚合，通常表现为实体的聚合，需要有聚合根
│    │    │    │    └─XXXService.java  领域服务，不能归与上述模型，如分页条件查询等可写在此处
│    │    ├─service      领域服务类，一些不能归属某个具体领域模型的行为
│    │    │    ├─impl    领域服务实现
│    │    └─factory      工厂类，负责复杂领域对象创建，封装细节 
│    │ 
│    ├─infrastructure  基础设施层
│    │    ├─annotation   自定义注解
│    │    ├─persistent   持久化
│    │    │    └─repository   仓储类，持久化接口&实现
│    │    ├─general      通用技术支持，向其他层输出通用服务
│    │    │    ├─config       配置类
│    │    │    ├─toolkit      工具类
│    │ 
│    └─resources  
│        ├─statics  静态资源
│        └─application.yml   全局配置文件
