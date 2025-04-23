# Java
# 📘 Java Notes – Chapter 01: Basics

Welcome to **Chapter 01** of my Java learning journey. This chapter covers the core building blocks of Java:

- [Variables](#1-variables)
  - [Naming Conventions](#naming-conventions)
- [Data Types](#2-data-types)
  - [Primitive Data Types](#21-primitive-data-types)
  - [Non-Primitive Data Types](#22-non-primitive-data-types)
- [Literals](#3-literals)
- [Keywords](#4-keywords)
- [Taking Input using Scanner](#5-taking-input-using-scanner-class)

---

## 1. Variables

A **variable** in Java is a container that holds data that can be changed during the execution of the program. It has a name (identifier), a type, and a value.

### 🔸 Real-World Analogy:
Think of a variable like a labeled jar. If you label a jar "sugar", you can always know it contains sugar and can replace it with something else later.

### 🔹 Example:

```java
dataType variableName = value;
int age = 25; // Holds integer
String name = "Alice"; // Holds characters
```
> ⚠️ **Note:** must use `;` at the end of the variable


### ✅ Rules for Naming Variables:

- Must start with:
  - a letter (`A-Z`, `a-z`)
  - an underscore (`_`)
  - or a dollar sign (`$`)
- Cannot start with a digit
- Java is case-sensitive:
  - `age` and `Age` are different variables
- Variables names must follow `camelCase` convention
  - Every second word must have its first letter capitalized instead of white-space to separate the word
    - `cricketBat` 
- Cannot use Java **keywords** as variable names
  - `int`, `String`, `float` are reserved keywords of Java
- Cannot have white-spaces
  - `noha albert` ❌
  - `nohaAlbert`  ✅

## 2. Data Types
  Data Types in java are divided into two categories :
  1. Primitive Data Types
  2. Non-Primitive Data Types

  Let's talk about primitive data types for now.
 
### 🔹 Primitive Data Types in Java

| Data Type | Size     | Range                          | Value Type        | Default Value | Example Code                     |
|-----------|----------|--------------------------------|-------------------|---------------|----------------------------------|
| `byte`    | 1 byte   | -2⁷ to 2⁷ - 1                  | Whole numbers     | `0`           | `byte a = 100;`                  |
| `short`   | 2 bytes  | -2¹⁵ to 2¹⁵ - 1                | Whole numbers     | `0`           | `short b = 30000;`               |
| `int`     | 4 bytes  | -2³¹ to 2³¹ - 1                | Whole numbers     | `0`           | `int c = 100000;`                |
| `long`    | 8 bytes  | -2⁶³ to 2⁶³ - 1                | Large numbers     | `0L`          | `long d = 10000000000L;`         |
| `float`   | 4 bytes  | ±3.4 × 10³⁸ (7 digits)         | Decimal numbers   | `0.0f`        | `float e = 5.75f;`               |
| `double`  | 8 bytes  | ±1.7 × 10³⁰⁸ (15–16 digits)    | Decimal numbers   | `0.0d`        | `double f = 19.99;`              |
| `char`    | 2 bytes  | 0 to 2¹⁶ - 1 (Unicode)         | Single character  | `'\u0000'`    | `char g = 'A';`                  |
| `boolean` | ~1 bit   | `true` or `false`              | Logical values    | `false`       | `boolean h = true;`             |

### 🔹 Non-Primitive Data Types in Java
We will discuss the `Non-primitive data types` in upcoming chapters.

## 3. Literals in Java

Literals are fixed values that are assigned to variables in Java. They represent constant values used directly in code.


### 📌 Types of Literals:

1. **Integer Literals**
   - Whole numbers without a decimal point.
   - Example: `int x = 100;`

2. **Floating-point Literals**
   - Decimal numbers (with fractional parts).
   - Example: `float pi = 3.14f;`, `double g = 9.81;`

3. **Character Literals**
   - A single character enclosed in single quotes.
   - Example: `char letter = 'A';`

4. **String Literals**
   - A sequence of characters enclosed in double quotes.
   - Example: `String name = "Java";`

5. **Boolean Literals**
   - Can only be `true` or `false`.
   - Example: `boolean isJavaFun = true;`

6. **Null Literal**
   - Represents no value.
   - Can be assigned to reference types (like objects).
   - Example: `String str = null;`

---

> 💡 **Note:** Literal values are automatically detected by the compiler based on their format.

---

## 4.  Keywords in Java

**Keywords** are reserved words in Java that have a predefined meaning in the language.  
They cannot be used as variable names, method names, class names, or identifiers.

---

### 📌 List of Java Keywords:

Java has **50 reserved keywords** (plus 2 reserved but not used: `goto` and `const`):

| Keyword     | Keyword     | Keyword     | Keyword       | Keyword        |
|-------------|-------------|-------------|---------------|----------------|
| `abstract`  | `continue`  | `for`       | `new`         | `switch`       |
| `assert`    | `default`   | `goto`*     | `package`     | `synchronized` |
| `boolean`   | `do`        | `if`        | `private`     | `this`         |
| `break`     | `double`    | `implements`| `protected`   | `throw`        |
| `byte`      | `else`      | `import`    | `public`      | `throws`       |
| `case`      | `enum`      | `instanceof`| `return`      | `transient`    |
| `catch`     | `extends`   | `int`       | `short`       | `try`          |
| `char`      | `final`     | `interface` | `static`      | `void`         |
| `class`     | `finally`   | `long`      | `strictfp`    | `volatile`     |
| `const`*    | `float`     | `native`    | `super`       | `while`        |

> 📝 *`goto` and `const` are reserved keywords but are **not used** in Java.*

---

> ⚠️ **Note:** Keywords are case-sensitive. For example, `int` is valid but `Int` is not.
---

##  5. Taking User Input in Java

In Java, user input is typically taken using the **`Scanner`** class from the `java.util` package.

---

## 🔹 Steps to Take Input

1. **Import the Scanner class**

   ```java
   import java.util.Scanner;
   ```
2. **Create a Scanner object**
   ``` java
   Scanner input = new Scanner(System.in);
   ```
3. **Use Scanner methods to get input**
   
   ##### 🔹 Scanner Methods to Take Input

    | No. | Method         | Description            | Example Usage                   |
    |-----|----------------|------------------------|----------------------------------|
    | 1.  | `nextInt()`    | Reads an integer       | `int age = input.nextInt();`    |
    | 2.  | `nextFloat()`  | Reads a float value    | `float price = input.nextFloat();` |
    | 3.  | `nextDouble()` | Reads a double value   | `double pi = input.nextDouble();`  |
    | 4.  | `next()`       | Reads a single word    | `String name = input.next();`      |
    | 5.  | `nextLine()`   | Reads a full line      | `String sentence = input.nextLine();` |
    | 6.  | `nextBoolean()`| Reads boolean value    | `boolean flag = input.nextBoolean();` |
    | 7.  | `nextLong()`   | Reads a long integer   | `long number = input.nextLong();`    |
    | 8.  | `nextShort()`  | Reads a short integer  | `short s = input.nextShort();`      |
    | 9.  | `nextByte()`   | Reads a byte value     | `byte b = input.nextByte();`        |

    > 💡 Tip: Use nextLine() carefully after other input methods like nextInt() — it may read leftover newline characters.
---
### 🔹 Example: Basic Input
  ```java
  import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        input.close(); // Always close Scanner
    }
}
  ```
  > ⚠️ Note: Always close the Scanner object after you're done to avoid resource leaks.
  