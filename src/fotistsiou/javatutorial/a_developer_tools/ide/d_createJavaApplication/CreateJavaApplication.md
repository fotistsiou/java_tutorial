# Creating a Simple Java Application in IntelliJ IDEA

In this tutorial, we'll create a simple Java application in a project named **Demo**. We'll walk through creating a package and a class, writing the `main` method, and using IntelliJ IDEA’s helpful features like **code completion** and **live templates**.

## Step 1: Create a Package and Class

1. In the **Project** tool window, right-click on the `src` directory, select **New**, then choose **Java Class**.
2. In the **Name** field, enter `com.example.demo.Demo` and press **Enter**.
    - This action creates a **package** (`com.example.demo`) and a **class** (`Demo`) inside it.
    - Packages help group classes with similar functionality, making your code organized and easy to navigate.

Upon creation, IntelliJ IDEA automatically generates some initial content for the class, including the package statement and the class declaration.

## Step 2: Write the `main` Method

Now let's add a `main` method to the `Demo` class and call the `println()` method with [Live Templates](https://www.jetbrains.com/help/idea/using-live-templates.html#write-code) – code snippets that you can insert into your code.

1. Place the caret inside the class declaration, just after the opening bracket `{`, and press **Enter** to start a new line.
2. Type `main` and select the template that inserts the `main()` method declaration.

    - This feature is part of **Live Templates** in IntelliJ IDEA, which allows you to quickly add common code snippets.

### Code Completion

As you type, IntelliJ IDEA provides **code completion** suggestions based on the context, helping you write code faster by presenting possible options at each caret position.

To view all live templates, use:
- **⌘J** on macOS
- **Ctrl+J** on Windows/Linux

## Step 3: Call `println()` with Live Templates

1. To call the `println()` method, type `sout` and press **Enter**. This expands into `System.out.println()`.
2. Inside the parentheses, type `"Hello, World!"`.

Your code should now look like this:

```java
package com.example.demo;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
