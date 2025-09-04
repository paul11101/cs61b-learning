# 作业01 - 算术运算

## 项目描述
这是一个简单的Java项目，实现了基本的算术运算功能。

## 功能
- `product(int a, int b)`: 计算两个整数的乘积
- `sum(int a, int b)`: 计算两个整数的和

## 文件结构
```
hw01/
├── src/
│   └── Arithmetic.java      # 主要的算术运算类
├── tests/
│   └── ArithmeticTest.java  # 单元测试
└── README.md               # 项目说明
```

## 运行方法
1. 编译源代码：
   ```bash
   javac src/Arithmetic.java
   ```

2. 运行程序：
   ```bash
   java -cp src Arithmetic
   ```

3. 运行测试：
   ```bash
   javac -cp ".:junit-jupiter-api-5.8.2.jar:junit-jupiter-engine-5.8.2.jar:junit-platform-engine-1.8.2.jar:opentest4j-1.2.0.jar:truth-1.1.3.jar" tests/ArithmeticTest.java src/Arithmetic.java
   java -cp ".:junit-jupiter-api-5.8.2.jar:junit-jupiter-engine-5.8.2.jar:junit-platform-engine-1.8.2.jar:opentest4j-1.2.0.jar:truth-1.1.3.jar:src:tests" org.junit.platform.console.ConsoleLauncher --class-path src:tests --scan-class-path
   ```

## 作者
Josh Hug
