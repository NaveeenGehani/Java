
# 📘 Chapter 02 – Operators and Expressions in Java

## 🔹 What is an Operator?

An **operator** is a special symbol in Java that performs operations on variables and values (known as operands).

## 🔹 Expression

An **expression** is a combination of variables, values, and operators that produces a result.
Example:
```java
int sum = 10 + 5;
```

Here:
- `10` and `5` are **operands**
- `+` is the **operator**
- `sum` will hold the **result** of the expression `10 + 5`

---

## 🔸 Types of Operators in Java

1. **Arithmetic Operators**
2. **Assignment Operators**
3. **Comparison (Relational) Operators**
4. **Logical Operators**
5. **Bitwise Operators**
6. **Increment and Decrement Operators**

---

## 1️⃣ Arithmetic Operators

Used to perform basic mathematical operations.

| Operator | Description     | Example        | Output |
|----------|------------------|----------------|--------|
| `+`      | Addition         | `5 + 3`        | `8`    |
| `-`      | Subtraction      | `5 - 3`        | `2`    |
| `*`      | Multiplication   | `5 * 3`        | `15`   |
| `/`      | Division         | `5 / 2`        | `2`    |
| `%`      | Modulus (remainder) | `5 % 2`    | `1`    |

---

## 2️⃣ Assignment Operators

Used to assign values to variables.

| Operator | Description                 | Example     | Meaning         |
|----------|-----------------------------|-------------|-----------------|
| `=`      | Assign                      | `a = 5`     | `a` becomes 5   |
| `+=`     | Add and assign              | `a += 3`    | `a = a + 3`     |
| `-=`     | Subtract and assign         | `a -= 3`    | `a = a - 3`     |
| `*=`     | Multiply and assign         | `a *= 3`    | `a = a * 3`     |
| `/=`     | Divide and assign           | `a /= 3`    | `a = a / 3`     |
| `%=`     | Modulus and assign          | `a %= 3`    | `a = a % 3`     |

---

## 3️⃣ Comparison (Relational) Operators

Used to compare two values and return a boolean result.

| Operator | Description        | Example     | Output  |
|----------|--------------------|-------------|---------|
| `==`     | Equal to           | `5 == 5`    | `true`  |
| `!=`     | Not equal to       | `5 != 3`    | `true`  |
| `>`      | Greater than       | `5 > 3`     | `true`  |
| `<`      | Less than          | `5 < 3`     | `false` |
| `>=`     | Greater or equal   | `5 >= 5`    | `true`  |
| `<=`     | Less or equal      | `5 <= 3`    | `false` |

---

## 4️⃣ Logical Operators

Used to combine multiple boolean expressions.

| Operator | Description       | Example           | Output  |
|----------|-------------------|-------------------|---------|
| `&&`     | Logical AND       | `true && false`   | `false` |
| `\|\|`   | Logical OR        | `true \|\| false` | `true`  |
| `!`      | Logical NOT       | `!true`           | `false` |

---

## 5️⃣ Bitwise Operators

Used to perform bit-level operations.

| Operator | Description       | Example     | Output (binary) |
|----------|-------------------|-------------|-----------------|
| `&`      | AND               | `5 & 3`     | `0001`          |
| `\|`     | OR                | `5 | 3`     | `0111`           |
| `^`      | XOR               | `5 ^ 3`     | `0110`          |
| `~`      | NOT (1's complement) | `~5`    | `...11111010`   |
| `<<`     | Left shift        | `5 << 1`    | `1010`          |
| `>>`     | Right shift       | `5 >> 1`    | `0010`          |

---

## 6️⃣ Increment and Decrement Operators

| Operator | Type             | Example    | Meaning       |
|----------|------------------|------------|---------------|
| `++`     | Increment         | `a++`      | `a = a + 1`   |
| `--`     | Decrement         | `a--`      | `a = a - 1`   |
| `++a`    | Pre-increment     | Increments before using value |
| `a++`    | Post-increment    | Uses value, then increments   |

---

## 🔸 Operator Precedence

Determines which operator is evaluated first.

| Precedence Level | Operators                            | Associativity     |
|------------------|---------------------------------------|-------------------|
| Highest          | `()`, `[]`, `.`                      | Left to Right     |
| High             | `++`, `--`, `+ (unary)`, `- (unary)` | Right to Left     |
| Medium           | `*`, `/`, `%`                         | Left to Right     |
| Medium           | `+`, `-`                              | Left to Right     |
| Low              | `=`, `+=`, `-=` etc.                  | Right to Left     |

📝 **Note**: Parentheses `()` can be used to override default precedence.

---

## 🔸 Associativity Rules

When operators have the same precedence, **associativity** decides the direction of execution.

- **Left to Right**: `+`, `-`, `*`, `/`
- **Right to Left**: `=`, `+=`, `++`, `--`

---

## 🔸 Resulting Data Type After Arithmetic Operation

| Operand 1 | Operand 2 | Result Type |
|-----------|-----------|-------------|
| `int`     | `int`     | `int`       |
| `int`     | `double`  | `double`    |
| `float`   | `int`     | `float`     |
| `byte`    | `short`   | `int`       |
| `long`    | `float`   | `float`     |

📝 **Note**: In mixed-type expressions, Java automatically promotes smaller data types to larger ones before performing the operation.

---

✅ That’s a wrap for **Chapter 2: Operators and Expressions**!  
Make sure to experiment with all these operators in your own Java code to get hands-on experience.