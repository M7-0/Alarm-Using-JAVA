# ☕ The Ultimate Java Reference Bible: Bro Code Course Guide

A comprehensive, production-grade guide detailing every concept, API, and project pattern implemented during my journey through the **Bro Code Java Full Course**.

---

## 📂 Table of Contents
1. [Chapter 1: Java Fundamentals & Variables](#chapter-1-java-fundamentals--variables)
2. [Chapter 2: Control Flow & Logical Operators](#chapter-2-control-flow--logical-operators)
3. [Chapter 3: Arrays, ArrayLists & Data Structures](#chapter-3-arrays-arraylists--data-structures)
4. [Chapter 4: Methods, Overloading & Printf](#chapter-4-methods-overloading--printf)
5. [Chapter 5: Object-Oriented Programming (OOP) Fundamentals](#chapter-5-object-oriented-programming-oop-fundamentals)
6. [Chapter 6: Advanced OOP (Inheritance, Polymorphism & Abstraction)](#chapter-6-advanced-oop-inheritance-polymorphism--abstraction)
7. [Chapter 7: Encapsulation & Memory Relations (Aggregation & Copying)](#chapter-7-encapsulation--memory-relations-aggregation--copying)
8. [Chapter 8: Exception Handling & File I/O](#chapter-8-exception-handling--file-io)
9. [Chapter 9: Java Audio & Helpers (Enums, Dates, Timers)](#chapter-9-java-audio--helpers-enums-dates-timers)
10. [Chapter 10: Multithreading & Concurrency](#chapter-10-multithreading--concurrency)

---

## Chapter 1: Java Fundamentals & Variables
All variables and basic console input/output implementations are tested in [Main.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/src/Main.java).

### 1. Variables & Primitive Data Types
Java is a strongly-typed language, meaning every variable must be declared with a data type.
* **Primitive Types**: Store simple data directly in memory (stack).
  * `int`: Holds whole numbers (e.g., `int age = 22;`).
  * `double`: Holds fractional/decimal numbers (e.g., `double price = 5.5;`).
  * `char`: Holds a single character in single quotes (e.g., `char symbol = '$';`).
  * `boolean`: Holds `true` or `false` values (e.g., `boolean isEnrolled = true;`).
* **Reference Types**: Store addresses to complex objects in heap memory.
  * `String`: Sequence of characters in double quotes (e.g., `String name = "mohd";`).

### 2. User Input (`Scanner`)
The `Scanner` class from the `java.util` package reads user input from the console (`System.in`).
* **Syntax**:
  ```java
  Scanner kb = new Scanner(System.in);
  System.out.print("Enter your name: ");
  String name = kb.nextLine(); // Reads a string line
  System.out.print("Enter age: ");
  int age = kb.nextInt(); // Reads an integer
  kb.nextLine(); // CRITICAL: Consumes the remaining "\n" (newline) character
  kb.close(); // Frees resource stream
  ```

### 3. Math & Random Classes
* **Math Class**: Provides static methods for mathematical calculations (exponents, square roots, rounding).
  ```java
  double d = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); // Pythagorean theorem
  ```
* **Random Class**: Generates pseudo-random numbers.
  ```java
  Random rn = new Random();
  int num = rn.nextInt(0, 11); // Generates a random integer from 0 to 10
  ```

---

## Chapter 2: Control Flow & Logical Operators
Control flow dictates which blocks of code execute based on conditions. Practiced in [Main.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/src/Main.java).

### 1. Conditional Logic (`if-else` & `switch`)
* **If-Else Blocks**: Evaluates boolean statements sequentially.
  ```java
  if (currency.equals("BHD")) {
      amount = amount * 2.65;
  } else if (currency.equals("doller")) {
      amount = amount * 0.376;
  } else {
      System.out.println("Invalid currency");
  }
  ```
* **Switch Statements**: Compares a single variable against multiple matching cases. (Enhanced switches syntax used in the project):
  ```java
  switch (action) {
      case 1 -> showBalance();
      case 2 -> deposit();
      case 3 -> withdraw();
      default -> System.out.println("Invalid choice!");
  }
  ```

### 2. Logical Operators
* `&&` (AND): Both conditions must be true.
* `||` (OR): At least one condition must be true.
* `!` (NOT): Reverses the boolean state of a condition.

### 3. Loops (`while`, `for`, `nested`)
* **While Loop**: Repeatedly executes a block of code as long as a condition is true. Used in the ATM menu and user prompt loops.
  ```java
  while (alarmTime == null) {
      // Loop repeats until user inputs a valid parseable time format
  }
  ```
* **For Loop**: Executes a block a set number of times. Excellent for array iteration.
  ```java
  for (int i = 0; i <= 10; i++) {
      if (i % 2 == 1) continue; // "continue" skips the rest of current loop iteration
      System.out.println(i);
  }
  ```
* **Nested Loops**: Loops inside loops (e.g. printing a grid of columns and rows):
  ```java
  for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= columns; j++) {
          System.out.print(c + " ");
      }
      System.out.println();
  }
  ```

---

## Chapter 3: Arrays, ArrayLists & Data Structures
Tested in [Main.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/src/Main.java), [Fifty_Seven.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/Start3/untitled/src/Fifty_Seven.java), and [main.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/Start3/src/main.java).

### 1. 1D & 2D Arrays (Fixed Size)
* **1D Arrays**: Fixed-size sequences of elements of the same data type.
  ```java
  String[] foods = new String[5];
  foods[0] = "pizza";
  Arrays.sort(foods); // Sorts alphabetically or numerically
  ```
* **2D Arrays**: Arrays of arrays (matrix layout).
  ```java
  int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
  for (int[] row : numbers) {
      for (int cell : row) {
          System.out.print(cell + "\t");
      }
      System.out.println();
  }
  ```

### 2. String Methods & Wrapper Classes
* **Wrapper Classes**: Convert primitive types into reference objects (`int` -> `Integer`, `double` -> `Double`). Allows primitives to be added to Collections.
* **String Methods**: Useful functions to manipulate string data:
  * `.split(" ")`: Splits strings into string arrays based on a delimiter.
  * `.equals()`: Compares values of two strings (never use `==` for reference comparisons).

### 3. ArrayList & 2D ArrayList (Dynamic Size)
* **ArrayList**: A resizable array. Grows and shrinks in size automatically.
  ```java
  ArrayList<String> names = new ArrayList<>();
  names.add("Mohamed");
  names.remove(0);
  ```
* **2D ArrayList**: A dynamic 2D grid (list of lists).
  ```java
  ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
  ```

### 4. HashMap (Key-Value Pairs)
* Stores items in "Key/Value" pairs. Accessible by keys rather than index indexes.
  ```java
  HashMap<String, Double> map = new HashMap<>();
  map.put("apple", 23.5);
  System.out.println(map.get("apple")); // Outputs 23.5
  System.out.println(map.containsKey("Banana")); // Returns false
  ```

---

## Chapter 4: Methods, Overloading & Printf
Tested in [Main.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/src/Main.java).

### 1. Methods & Scope
* A method is a block of code that runs only when called. Parameters can be passed to pass data.
* **Scope**: Variables declared inside a method are local to that method. Variables declared at the class level (`static` fields) are accessible across methods.

### 2. Overloaded Methods
* Multiple methods inside the same class sharing the same name but possessing different parameter lists (different types, sequence, or count).
  ```java
  static int add(int a, int b) { return a + b; }
  static double add(double a, double b) { return a + b; } // Overloaded version
  ```

### 3. Format Specifiers (`printf`)
* Format output displays. Syntactically formatted as `%[flags][width][.precision][conversion-character]`.
  * `%f`: Decimals (e.g., `%.2f` rounds to 2 decimal places).
  * `%d`: Integers.
  * `%s`: Strings.
  * `\r`: Carriage return. Overwrites current terminal line (crucial for [AlarmClock.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/Alarm/src/AlarmClock.java)).

---

## Chapter 5: Object-Oriented Programming (OOP) Fundamentals
Practiced in [SecondTrain.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/src/SecondTrain.java).

### 1. Objects, Classes & Constructors
* **Class**: A blueprint/template to construct objects (defines attributes and behaviors).
* **Object**: An instance of a class.
* **Constructor**: A special method called automatically when an object is instantiated.
  ```java
  public class car {
      String model;
      String color;

      car (String model, String color) {
          this.model = model; // "this" keyword references current object instance
          this.color = color;
      }
  }
  ```

### 2. Overloaded Constructors & `toString()`
* **Overloaded Constructors**: Allows instantiating objects in different ways (e.g., creating a user with username/password, or only username).
* **toString() Method**: All objects possess a default `toString()` representing their memory location. Overriding it returns a custom, human-readable string representation of the object.

### 3. Static Keyword
* Indicates that a field or method belongs to the class itself, rather than individual instances. Shared among all objects.
  ```java
  public class friend {
      String name;
      static int numofFriends; // Increments every time a friend is instantiated

      friend(String name) {
          this.name = name;
          numofFriends++;
      }
  }
  ```

---

## Chapter 6: Advanced OOP (Inheritance, Polymorphism & Abstraction)
Tested across feature classes: [student.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/src/student.java), [employee.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/src/employee.java), and [SecondTrain.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/src/SecondTrain.java).

### 1. Inheritance & The `super` Keyword
* **Inheritance**: Subclasses inherit attributes and methods of a parent class using the `extends` keyword.
* **Super Keyword**: Refers to the parent class. Invokes parent constructors or methods.
  ```java
  public class student extends person {
      double gpa;
      student(String first, String last, double gpa) {
          super(first, last); // Sends arguments to parent 'person' constructor
          this.gpa = gpa;
      }
  }
  ```

### 2. Method Overriding
* A subclass provides a specific implementation for a method already present in the superclass, marked with `@Override`.
  * `dog.java` overrides the base `animal` class `speak()` method to bark.

### 3. Abstraction (`abstract`)
* Abstract classes cannot be instantiated. They declare abstract methods without bodies, forcing subclasses to implement them.
  ```java
  public abstract class organism {
      abstract void photo(); // Forces inheriting classes to write photo() logic
  }
  ```

### 4. Interfaces (`implements`)
* A template that declares what a class must do, but not how. A class can implement multiple interfaces (achieving multiple inheritance capabilities).
  * `AlarmClock` and `MyRun` implement the standard `Runnable` interface to operate inside a Thread.

### 5. Polymorphism & Dynamic Polymorphism
* **Polymorphism**: An object's capability to take on multiple forms (e.g., storing a subclass object inside a superclass reference type).
* **Dynamic Polymorphism**: Resolving method calls at runtime (e.g., prompt user for choice of animal, dynamically assign correct class reference, and invoke overridden speak method).

---

## Chapter 7: Encapsulation & Memory Relations (Aggregation & Copying)

### 1. Encapsulation (Getters & Setters)
* Private variables inside a class are hidden. Exposed only via public getters and setters, maintaining state validation safety.
  ```java
  public class employee extends person {
      private int salary; // Restricts direct access

      public int getSalary() { return this.salary; }
      public void setSalary(int salary) {
          if(salary > 0) this.salary = salary;
      }
  }
  ```

### 2. Copying Objects
* Simply setting `car2 = car1` copies the memory reference (both point to the same object). To duplicate object states cleanly, a copy constructor or manual copy method must be implemented:
  ```java
  car(car otherCar) {
      this.model = otherCar.model;
      this.color = otherCar.color; // Deep copy constructor
  }
  ```

### 3. Aggregation ("Has-A" Relationship)
* Association where one class references another independent class as a field.
  ```java
  public class person {
      String name;
      Address address; // Person HAS-A reference to Address class
  }
  ```

---

## Chapter 8: Exception Handling & File I/O
Practiced in [Fifty_Seven.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/Start3/untitled/src/Fifty_Seven.java).

### 1. Exception Handling (`try-catch-finally`)
* **Try**: Wraps risky code that could throw runtime exceptions.
* **Catch**: Catches and handles specific exception instances.
* **Finally**: Executed always, regardless of exceptions (ideal for closing streams/scanners).
  ```java
  try {
      int num = kb.nextInt();
  } catch (InputMismatchException e) {
      System.out.println("Invalid number!");
  } finally {
      System.out.println("Execution completed.");
  }
  ```

### 2. File Class & Read/Write File Operations
* **File Object**: Represents directory and file path references.
* **FileWriter**: Writes character files. Handles paths cleanly within try-with-resources.
  ```java
  try (FileWriter writer = new FileWriter("text.txt")) {
      writer.write("i like pizza");
  } catch (IOException e) {
      System.out.println("Write error");
  }
  ```
* **FileReader & BufferedReader**: Reads text from character files line-by-line efficiently.
  ```java
  try (BufferedReader reader = new BufferedReader(new FileReader("word.txt"))) {
      String line;
      while ((line = reader.readLine()) != null) {
          System.out.println(line);
      }
  } catch (IOException e) {
      System.out.println("Read error");
  }
  ```

---

## Chapter 9: Java Audio & Helpers (Enums, Dates, Timers)

### 1. Java Audio API (`javax.sound.sampled`)
* Loads sound files into memory using `AudioInputStream` and plays them through a hardware audio line with `Clip`. Implemented in [AlarmClock.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/Alarm/src/AlarmClock.java).
  ```java
  File file = new File("music.wav");
  try (AudioInputStream stream = AudioSystem.getAudioInputStream(file)) {
      Clip clip = AudioSystem.getClip();
      clip.open(stream);
      clip.start();
  }
  ```

### 2. Date & Time API
* Uses `LocalTime`, `LocalDate`, and `LocalDateTime` alongside `DateTimeFormatter` for reading, parsing, and printing dates:
  ```java
  LocalDateTime now = LocalDateTime.now();
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
  String formatted = now.format(formatter);
  ```

### 3. Timers (`Timer` & `TimerTask`)
* Schedules tasks for future execution in a background thread.
  ```java
  Timer timer = new Timer();
  TimerTask task = new TimerTask() {
      int count = 10;
      @Override
      public void run() {
          System.out.println(count--);
          if (count < 0) timer.cancel();
      }
  };
  timer.scheduleAtFixedRate(task, 0, 1000); // Ticks every 1 second
  ```

### 4. Java Enums
* Groups constants representing fixed choices. Tested in [day.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/Start3/untitled/src/day.java).
  ```java
  public enum day {
      SUNDAY(1), MONDAY(2);
      private final int num;
      day(int num) { this.num = num; }
      public int getNumber() { return num; }
  }
  ```

---

## Chapter 10: Concurrency & Multithreading
Implemented in [MyRun.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/Start3/untitled/src/MyRun.java), [myrun2.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/Start3/untitled/src/myrun2.java), and [AlarmClock.java](file:///C:/Users/mohdk/IdeaProjects/NormalJava/Alarm/src/AlarmClock.java).

### 1. Threads vs. Runnables
* **Thread Class**: Represents an independent path of execution. Can be created by extending `Thread`.
* **Runnable Interface**: A functional interface representing a task that runs on a thread. Implementing `Runnable` is preferred because it avoids Java's single inheritance constraint.
  ```java
  AlarmClock alarmClock = new AlarmClock(alarmTime, path, kb);
  Thread alarmThread = new Thread(alarmClock); // Pass Runnable to Thread constructor
  alarmThread.start(); // Spawns new thread execution
  ```

### 2. Concurrency Control (`join` & Daemon Threads)
* **Thread Joining (`join()`)**: Instructs the calling thread to wait until the joined threads complete execution.
  ```java
  thread1.start();
  thread2.start();
  thread1.join(); // Blocks calling thread (main) until thread1 dies
  ```
* **Daemon Threads**: Background threads that don't prevent JVM termination. If only daemon threads remain running, the JVM shuts down automatically.
  ```java
  Thread t = new Thread(runnable);
  t.setDaemon(true); // Must be set BEFORE calling start()
  t.start();
  ```
