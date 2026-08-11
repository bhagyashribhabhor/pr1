# Kotlin Programming Practicals

## Develop a Kotlin Program for Demonstrating Various Programming Concepts

This repository contains the implementation of various **Kotlin programming practicals** demonstrating fundamental programming concepts such as variables, type conversion, user input, control flow, functions, recursion, arrays, collections, classes, constructors, operator overloading, and matrix operations.

## Repository

**GitHub Repository:** `bhagyashribhabhor/pr1`

---

## Table of Contents

* [1.1 Store & Display Values in Different Variables](#11-store--display-values-in-different-variables)
* [1.2 Type Conversion](#12-type-conversion)
* [1.3 Scan Student's Information](#13-scan-students-information-and-display-all-the-data)
* [1.4 Check Odd or Even Numbers](#14-check-odd-or-even-numbers)
* [1.5 Display Month Name](#15-display-month-name)
* [1.6 User-Defined Function](#16-user-defined-function)
* [1.7 Factorial Calculation with Recursion](#17-factorial-calculation-with-recursion)
* [1.8 Working with Arrays](#18-working-with-arrays)
* [1.9 Find Maximum Number from ArrayList](#19-find-maximum-number-from-arraylist)
* [1.10 Class and Constructor Creation](#110-class-and-constructor-creation)
* [1.11 Operator Overloading and Matrix Operations](#111-operator-overloading-and-matrix-operations)
* [Technologies Used](#technologies-used)
* [How to Run](#how-to-run)
* [Conclusion](#conclusion)

---

# Practical 1.1: Store & Display Values in Different Variables

### Aim

To create and display variables of different data types available in Kotlin.

### Concepts Covered

The program demonstrates the following Kotlin data types:

* `Int`
* `Double`
* `Float`
* `Long`
* `Short`
* `Byte`
* `Char`
* `Boolean`
* `String`

### Description

The program declares variables using different data types and displays their values using `println()`.

---

# Practical 1.2: Type Conversion

### Aim

To demonstrate type conversion in Kotlin.

### Concepts Covered

The program performs conversions such as:

* Integer to Double
* String to Integer
* String to Double

### Description

Kotlin provides functions such as:

```kotlin
toDouble()
toInt()
toFloat()
toLong()
```

These functions can be used to convert values from one data type to another.

---

# Practical 1.3: Scan Student's Information and Display All the Data

### Aim

To accept student information from the user and display all the entered details.

### Information Collected

The program accepts details such as:

* Student Name
* Enrollment Number
* Branch
* Semester
* Age
* Other required information

### Concepts Covered

* User input
* `readLine()`
* String handling
* Variable declaration
* Output using `println()`

### Description

The program takes student details as input from the user and displays the complete information.

---

# Practical 1.4: Check Odd or Even Numbers

### Aim

To determine whether a given number is odd or even.

### Concepts Covered

* `if-else`
* Modulus operator `%`
* Conditional expression
* `println()`

### Description

The program checks the remainder obtained after dividing a number by `2`.

```text
number % 2 == 0 → Even
number % 2 != 0 → Odd
```

The result is displayed directly using a control-flow expression inside `println()`.

---

# Practical 1.5: Display Month Name

### Aim

To display the name of a month based on the month number entered by the user.

### Concepts Covered

* `when` expression
* User input
* Conditional branching

### Description

The user enters a number from `1` to `12`. The program uses Kotlin's `when` expression to display the corresponding month.

Example:

```text
1  → January
2  → February
3  → March
...
12 → December
```

An appropriate message is displayed for invalid month numbers.

---

# Practical 1.6: User-Defined Function

### Aim

To create and use a user-defined function for performing arithmetic operations on two numbers.

### Operations

The program demonstrates:

* Addition
* Subtraction
* Multiplication
* Division

### Concepts Covered

* Functions
* Function parameters
* Return values
* Arithmetic operators

### Description

A user-defined function is created to perform arithmetic operations on two numbers and return/display the calculated results.

---

# Practical 1.7: Factorial Calculation with Recursion

### Aim

To calculate the factorial of a number using recursion.

### Concepts Covered

* Recursive function
* Function calls
* Base condition
* Multiplication

### Formula

The factorial of a number `n` is:

```text
n! = n × (n-1) × (n-2) × ... × 1
```

For example:

```text
5! = 5 × 4 × 3 × 2 × 1
5! = 120
```

The program uses a recursive function that repeatedly calls itself until the base condition is reached.

---

# Practical 1.8: Working with Arrays

### Aim

To demonstrate different array operations, loops, and sorting techniques in Kotlin.

### Concepts Covered

* Arrays
* Nested arrays
* `Arrays.deepToString()`
* `contentDeepToString()`
* `IntArray.joinToString()`
* `for` loop
* Ranges
* `downTo`
* `until`
* Array sorting
* Manual sorting

### Array Printing

The program demonstrates different methods of displaying arrays, including:

```kotlin
Arrays.deepToString()
```

```kotlin
contentDeepToString()
```

```kotlin
joinToString()
```

### Loop Operations

Different Kotlin range expressions are demonstrated:

```kotlin
1..10
10 downTo 1
0 until 10
```

### Sorting

The program demonstrates two approaches:

1. **Sorting without built-in functions**
   The array is sorted manually using comparison and swapping logic.

2. **Sorting using built-in functions**
   Kotlin's built-in sorting functionality is used to sort the array.

---

# Practical 1.9: Find Maximum Number from ArrayList

### Aim

To find the maximum number from an `ArrayList` of integers.

### Concepts Covered

* `ArrayList`
* Collections
* Iteration
* Comparison
* Finding maximum value

### Description

The program stores multiple integer values in an `ArrayList` and determines the largest value.

Example:

```text
ArrayList: [10, 45, 23, 89, 12]

Maximum = 89
```

---

# Practical 1.10: Class and Constructor Creation

### Aim

To demonstrate classes, constructors, properties, and member functions in Kotlin.

### Car Class

A `Car` class is created with properties such as:

* Type
* Model
* Price
* Owner
* Miles Driven

### Functions

The class implements functions to:

* Get car information
* Get original car price
* Calculate/get current car price
* Display car information

### Concepts Covered

* Classes
* Primary constructors
* Properties
* Member functions
* Objects
* Encapsulation

### Description

An object of the `Car` class is created using the constructor. The object's properties and functions are then used to display and manipulate car-related information.

---

# Practical 1.11: Operator Overloading and Matrix Operations

### Aim

To demonstrate operator overloading and perform matrix addition, subtraction, and multiplication using a custom `Matrix` class.

### Concepts Covered

* Classes
* Operator overloading
* `operator` functions
* Matrix addition
* Matrix subtraction
* Matrix multiplication
* `toString()` overriding

### Matrix Operations

The `Matrix` class supports:

#### Matrix Addition

Two matrices of the same dimensions are added element by element.

```text
A + B
```

#### Matrix Subtraction

Two matrices of the same dimensions are subtracted element by element.

```text
A - B
```

#### Matrix Multiplication

Matrix multiplication is performed according to the standard matrix multiplication rule.

```text
A * B
```

### Operator Overloading

Kotlin allows operators such as `+`, `-`, and `*` to be overloaded for user-defined classes.

For example:

```kotlin
operator fun plus(other: Matrix): Matrix
```

allows the `+` operator to be used with `Matrix` objects.

Similarly, subtraction and multiplication can be implemented using overloaded operators.

### Customized `toString()`

The `Matrix` class also overrides `toString()` to provide a customized and readable representation of matrix elements.

---

# Technologies Used

* **Programming Language:** Kotlin
* **JVM:** Kotlin/JVM
* **IDE:** IntelliJ IDEA / Android Studio / VS Code
* **Version Control:** Git
* **Repository Hosting:** GitHub

---

# How to Run

## 1. Clone the Repository

```bash
git clone https://github.com/bhagyashribhabhor/pr1.git
```

## 2. Open the Project

Open the cloned project in an IDE that supports Kotlin, such as:

* IntelliJ IDEA
* Android Studio
* Visual Studio Code with Kotlin support

## 3. Navigate to the Source Files

Open the `src` directory and select the required practical/program.

## 4. Run the Program

Run the Kotlin file containing the `main()` function.

For command-line Kotlin compilation, Kotlin files can also be compiled and executed using the Kotlin compiler.

---

# Learning Outcomes

After completing these practicals, the following Kotlin programming concepts are demonstrated:

* Declaring and using different data types
* Performing type conversion
* Taking input from users
* Using conditional statements
* Using `when` expressions
* Creating user-defined functions
* Understanding recursion
* Working with arrays
* Using different types of loops and ranges
* Sorting arrays
* Working with `ArrayList`
* Finding maximum values
* Creating classes and constructors
* Creating and using objects
* Understanding operator overloading
* Performing matrix operations
* Overriding `toString()`

---

# Conclusion

This project demonstrates the fundamental concepts of **Kotlin programming** through a collection of practical programs. The practicals progress from basic variable declaration and type conversion to more advanced concepts such as recursion, arrays, object-oriented programming, operator overloading, and matrix operations.

These programs provide a practical foundation for understanding Kotlin syntax, programming logic, functions, collections, and object-oriented programming concepts.

---

## Author

**Bhagyashri Bhabhor**

GitHub: `bhagyashribhabhor`

---

⭐ If this repository helped you understand Kotlin programming concepts, consider giving it a **star** on GitHub.
