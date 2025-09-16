# Лабораторна робота №1  Знайомство з базовим синтаксисом та операторами Java
У цій лабораторній роботі ми знайомимось з основами синтаксису Java, операторами та функціями. Метою є практичне освоєння простих операцій і конструкцій Java.


## Мета

- **Завдання 1: Написати метод, який перевіряє, чи є масив цілих чисел незменшуваним (кожен елемент більший або дорівнює попередньому).**

- **Завдання 2: Реалізувати відому дитячу гру FizzBuzz, яка виводить числа від 1 до 100. Для чисел, кратних 3, виводимо "Fizz", для чисел, кратних 5, — "Buzz", а для чисел, кратних одночасно і 3, і 5 — "FizzBuzz".**

- **Завдання 3: Написати метод, який перевіряє, чи можна розділити масив на дві частини з рівними сумами елементів.**
## Реалізація коду

### Завдання 1: Функція isNonDecreasing

Ця функція перевіряє, чи є масив незменшуваним (тобто кожен елемент більший або дорівнює попередньому).

```
private static boolean isNonDecreasing(int[] arr) { 
    
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < arr[i - 1]) {
            return false;
        }
    }
    return true;
}
```
### Завдання 2: FizzBuzz

Функція FizzBuzz виводить числа від 1 до 100, замінюючи числа, кратні 3, на "Fizz", кратні 5 — на "Buzz", а кратні і 3, і 5 — на "FizzBuzz".

```
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
### Завдання 3: Функція canBalance

Ця функція перевіряє, чи можна розділити масив так, щоб суми елементів у двох частинах були рівними.

```
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
## Demo

<img width="2560" height="1528" alt="488299485-cd75b47c-f0ac-4f60-b02e-fd87fa293124" src="https://github.com/user-attachments/assets/8e140f48-af08-46fd-b2c9-fe0257706a01" />

## Authors

- [@Soluvent](https://github.com/Soluvent)

