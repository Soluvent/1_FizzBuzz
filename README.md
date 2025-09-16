<p align="wide">
    <img width="1756" height="856" alt="carbon" src="https://github.com/user-attachments/assets/77fc05cd-20c3-4173-bcc5-dcfb965de7d0" />
</p>

<h1 align="center"> Лабораторна робота №1 Знайомство з базовим синтаксисом та операторами Java 

[![ReadMe](https://img.shields.io/badge/ReadMe-018EF5?logo=readme&logoColor=fff)](https://docs.google.com/document/d/1NIo0uQZx1ap_xJ_yjLPC1o3eIsxOCFn3/edit?usp=drive_link&ouid=110536394177911584125&rtpof=true&sd=true)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?logo=intellij-idea&logoColor=white)
[![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?logo=openjdk&logoColor=white)](https://github.com/Soluvent/Task_1-FizzBuzz)

<h3 align="wide"> 📜 Завдання

<h4 align="wide"> № 1: Написати метод, який перевіряє, чи є масив цілих чисел незменшуваним (кожен елемент більший або дорівнює попередньому).

<h4 align="wide"> № 2: Реалізувати відому дитячу гру FizzBuzz, яка виводить числа від 1 до 100. Для чисел, кратних 3, виводимо "Fizz", для чисел, кратних 5, — "Buzz", а для чисел, кратних одночасно і 3, і 5 — "FizzBuzz".

<h4 align="wide"> № 3: Написати метод, який перевіряє, чи можна розділити масив на дві частини з рівними сумами елементів.


<h3 align="wide"> ⚡ Реалізація коду

<h4 align="wide"> Завдання 1: Функція isNonDecreasing
<h4 align="wide">
Ця функція перевіряє, чи є масив незменшуваним (тобто кожен елемент більший або дорівнює попередньому).
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
<h4 align="wide"> Завдання 2: FizzBuzz
<h4 align="wide">
Функція FizzBuzz виводить числа від 1 до 100, замінюючи числа, кратні 3, на "Fizz", кратні 5 — на "Buzz", а кратні і 3, і 5 — на "FizzBuzz".
<h4 align="wide">

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

<h4 align="wide"> Завдання 3: Функція canBalance
<h4 align="wide">
Ця функція перевіряє, чи можна розділити масив так, щоб суми елементів у двох частинах були рівними.
<h4 align="wide">

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

<h3 align="wide"> 🚀 Запуск та демонстрацiя виводу

<h4 align="wide"> 1. Створити проект — створіть Java проект і додайте файл Main.java, запустити
<h4 align="wide"> 2. Приклад виводу:
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

## Authors

- [@Soluvent](https://github.com/Soluvent)

