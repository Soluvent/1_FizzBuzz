<sup>📒 Readme ver 2.0 17.09.2025 13:20<sup/>
<p align="center">
<img width="3680" height="1564" alt="FizzBuzz (1)" src="https://github.com/user-attachments/assets/8aca3a0c-2555-41a6-8ed8-15cd9bad8afa" />
</p>

# `Лабораторна робота` `№1` `Знайомство з базовим синтаксисом та операторами Java`

[![ReadMe](https://img.shields.io/badge/ReadMe-018EF5?logo=readme&logoColor=fff)](https://docs.google.com/document/d/1NIo0uQZx1ap_xJ_yjLPC1o3eIsxOCFn3/edit?usp=drive_link&ouid=110536394177911584125&rtpof=true&sd=true)
[![](https://img.shields.io/badge/-@Soluvent-%23181717?style=round-square&logo=github)](https://github.com/Soluvent)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?logo=intellij-idea&logoColor=white)
![Java](https://img.shields.io/badge/Java-C38330?style=flat&logo=openjdk&logoColor=white)
[![Version: 1.0](https://img.shields.io/badge/Version-1.0-blue.svg)](https://github.com/Soluvent/1_FizzBuzz/edit/master/README.md)


## `📝 Завдання 📝`
- [x] **Написати метод, який перевіряє, чи є масив цілих чисел незменшуваним [^1].**

- [x] **Реалізувати відому дитячу гру FizzBuzz, яка виводить числа від 1 до 100. Для чисел, кратних 3, виводимо `Fizz`, для чисел, кратних 5, — `Buzz`, а для чисел, кратних одночасно і 3, і 5 — `FizzBuzz`.**

- [x] **Написати метод, який перевіряє, чи можна розділити масив на дві частини з рівними сумами елементів.**

## `🧠 Mindmap 🧠`
```mermaid
graph LR;
    A[Задание 1: Написати метод для перевірки масиву] --> B[Перевірка, чи кожен елемент більше або дорівнює попередньому]
    B --> C[Повернути true, якщо масив правильний]
    C --> D[Інакше повернути false]
```
```mermaid
graph LR;
    A[Задание 2: Реалізувати гру FizzBuzz] --> B[Вивести числа від 1 до 100]
    B --> C[Замість чисел кратних 3 вивести Fizz]
    C --> D[Замість чисел кратних 5 вивести Buzz]
    D --> E[Якщо число кратне і 3, і 5, вивести FizzBuzz]
```
```mermaid
graph LR;
    A[Задание 3: Перевірка можливості поділу масиву на дві рівні частини] --> B[Перевірити, чи можна поділити масив на дві частини]
    B --> C[Перевірити, чи суми чисел в обох частинах рівні]
    C --> D[Повернути true, якщо суми рівні]
    D --> E[Інакше повернути false]
```
## `🛠 Реалізація коду 🛠`

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

## `🚀 Запуск та приклад виводу 🚀`

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
