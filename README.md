# Java Performance Optimization

## 📌 Project Overview

This project demonstrates how to identify and optimize a common performance bottleneck in Java. It compares the execution time of two approaches for building strings:

- Using **String Concatenation** (Slow Method)
- Using **StringBuilder** (Optimized Method)

The execution time of both methods is measured using `System.nanoTime()` to show the performance improvement.

---

## 🎯 Objective

- Create a simple Java application.
- Identify a performance bottleneck.
- Optimize the code using `StringBuilder`.
- Compare the execution time before and after optimization.

---

## 🛠 Technologies Used

- Java
- Spring Tool Suite (STS) / Eclipse
- JDK 17 or above

---

## 📂 Project Structure

```
JavaPerformanceOptimization
│
├── src
│   └── com
│       └── skillpilots
│           └── performance
│               └── PerformanceOptimization.java
│
└── README.md
```

---

## 🚀 Features

- Compare two different string-building techniques.
- Measure execution time using `System.nanoTime()`.
- Demonstrate Java performance optimization.
- Simple and easy-to-understand code.

---

## 🔍 Performance Bottleneck

Using **String Concatenation (`+`)** inside a loop creates a new String object during each iteration. Since String objects are immutable, this increases memory usage and execution time.

Example:

```java
String result = "";

for(int i = 1; i <= 10000; i++){
    result = result + i;
}
```

---

## ✅ Optimization

The optimized version uses **StringBuilder**, which modifies the same object instead of creating new String objects.

Example:

```java
StringBuilder result = new StringBuilder();

for(int i = 1; i <= 10000; i++){
    result.append(i);
}
```

---

## ▶️ How to Run

1. Open the project in Spring Tool Suite (STS) or Eclipse.
2. Open `PerformanceOptimization.java`.
3. Right-click the file.
4. Select **Run As → Java Application**.
5. View the output in the Console.

---

## 📊 Sample Output

```
===================================
 JAVA PERFORMANCE OPTIMIZATION
===================================

Slow Method Execution Time
72865400 ns

Optimized Method Execution Time
4123500 ns

Optimization Successful!
StringBuilder performs faster.
```

*Execution times may vary depending on your system.*

---

## 📈 Performance Comparison

| Method | Performance |
|----------|-------------|
| String Concatenation | Slower |
| StringBuilder | Faster |

---

## 💡 Learning Outcomes

- Understanding Java performance optimization.
- Measuring execution time using `System.nanoTime()`.
- Improving application performance using `StringBuilder`.
- Identifying common performance bottlenecks.

---

## 👩‍💻 Author

**Vedika Pawade**

B.Tech Computer Science & Engineering

Jhulelal Institute of Technology, Nagpur

---

## 📜 License

This project is created for educational purposes and SkillPilots project submission.
