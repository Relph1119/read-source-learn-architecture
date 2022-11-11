# 《读源码学架构》阅读笔记{docsify-ignore-all}

&emsp;&emsp;《读源码学架构》这本书主要通过各种场景的问题解决，引入各种设计模式和框架机制作为解决方案，并从中提取了核心的处理方式，以代码示例的方式讲解问题的优化与解决。

## 阅读本书的准备知识（推荐）
1. Java基础
2. Spring基本原理（本书有大量Spring相关知识，包括PostProcessor、Aware、AOP）：可学习《Spring 5核心原理与30个类手写实战》这本书
3. 需要对设计模式有所了解，包括责任链模式、模板方法模式、生产者-消费者模式、
4. Netty框架

## 在线阅读地址
在线阅读地址：https://relph1119.github.io/read-source-learn-architecture/

## 环境安装
Java版本：1.8

### 本地启动docsify
```shell
docsify serve ./docs
```

## 本书的不足

1. 代码错误：代码中的`getPriprity`应改成`getPriority`
2. 项目代码缺失，在Github和Gitlab中均未找到，并没有完整的执行主类
3. 后几章引入的示例，需要有一定的技术功底，不然无法看懂问题优化的内容
4. 没有提供问题最后解决的运行结果，建议配上截图