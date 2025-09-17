<p align="center">
    <img width="1850" height="780" alt="carbon (4)" src="https://github.com/user-attachments/assets/267f3756-b859-41c4-b2cc-e95d4e168730" />
</p>

# Лабораторна робота №1 Знайомство з базовим синтаксисом та операторами Java

[![ReadMe](https://img.shields.io/badge/ReadMe-018EF5?logo=readme&logoColor=fff)](https://docs.google.com/document/d/1NIo0uQZx1ap_xJ_yjLPC1o3eIsxOCFn3/edit?usp=drive_link&ouid=110536394177911584125&rtpof=true&sd=true)
[![](https://img.shields.io/badge/-@Soluvent-%23181717?style=round-square&logo=github)](https://github.com/Soluvent)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?logo=intellij-idea&logoColor=white)
![Java](https://img.shields.io/badge/Java-C38330?style=flat&logo=openjdk&logoColor=white)
[![Version: 1.0](https://img.shields.io/badge/Version-1.0-blue.svg)](https://github.com/Soluvent/1_FizzBuzz/edit/master/README.md)


## 📝 Завдання 📝

### 1. Написати метод, який перевіряє, чи є масив цілих чисел незменшуваним [^1].

### 2. Реалізувати відому дитячу гру FizzBuzz, яка виводить числа від 1 до 100. Для чисел, кратних 3, виводимо `Fizz`, для чисел, кратних 5, — `Buzz`, а для чисел, кратних одночасно і 3, і 5 — `FizzBuzz`.

### 3. Написати метод, який перевіряє, чи можна розділити масив на дві частини з рівними сумами елементів.

## 🛠 Реалізація коду 🛠

### **Завдання 1: Функція isNonDecreasing**
> [!NOTE]
> Ця функція перевіряє, чи є масив незменшуваним [^1].
> 
> [^1]: Тобто кожен елемент більший або дорівнює попередньому

<h4 align="wide">

```java
private static boolean isNonDecreasing(int[] arr) { 
    
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < arr[i - 1]) {
            return false;
        }
    }
    return true;
}
```
### **Завдання 2: FizzBuzz**
> [!NOTE]
> Функція FizzBuzz виводить числа від 1 до 100, замінюючи числа :
> 
> - Кратні 3 - `Fizz`,
> 
> - Кратні 5 — `Buzz`,
> 
> - Кратні і 3, і 5 — `FizzBuzz`.

```java
private static void fizzBuzz() {
    for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.print("FizzBuzz\n");
        } else if (i % 3 == 0) {
            System.out.print("Fizz\n");
        } else if (i % 5 == 0) {
            System.out.print("Buzz\n");
        } else {
            System.out.print(i + "\n");
        }
    }
}
```

### **Завдання 3: Функція canBalance**
> [!NOTE]
> Ця функція перевіряє, чи можна розділити масив так, щоб суми елементів у двох частинах були рівними :
> - Масив: `{1, 1, 1, 2, 1}`
> 
> - Сума всіх елементів: `1 + 1 + 1 + 2 + 1 = 6`
> 
> - Ліва частина: `{1, 1, 1} (сума = 3)`
> 
> - Права частина: `{2, 1} (сума = 3)`
> 
> - Оскільки суми рівні, функція поверне `true.`

```java
private static boolean canBalance(int[] arr) {
    int totalSum = 0;
    for (int num : arr) {
        totalSum += num;
    }
    int leftSum = 0;
    for (int j : arr) {
        leftSum += j;
        int rightSum = totalSum - leftSum;
        if (leftSum == rightSum) {
            return true;
        }
    }
    return false;
}
```

## 🚀 Запуск та приклад виводу 🚀

<h4 align="wide">

```java
isNonDecreasing: true
Fizz
Buzz
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
...
canBalance: true
```
