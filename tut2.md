# WIX1002  Fundamentals of Programming
# Tutorial 2 Java Fundamental

>##### 1.Display the sentence Faculty of Computer Science and Information Technology.
>   a. In one line using multiple Java statements
>```java
System.out.print("Faculty ");
System.out.print("of ");
System.out.print("Computer ");
System.out.print("Science ");
System.out.print("and ");
System.out.print("Information ");
System.out.print("Technology");
>```
>   b. In multiple lines using one Java statement
>```java
System.out.print("Faculty\nof\nComputer\nScience\nand\nInformation\nTechnology");
>```

>##### 2.Write a Java statement that print "SDN" - Software-defined networking
>```java
System.out.print("\"SDN\" - Software-defined networking");
>```

>##### 3. Correct the error for the following statements.
>a. System.Println("Java Programming");
>```java
System.out.println("Java Programming");
>```
>b. System.in.println("Introduction to Java!")
>```java
System.out.println("Introduction to Java!");
>```
>c. System.out.println("\t is the horizontal tab character");
>```java
System.out.println("\\t is the horizontal tab character");
>```
>d. system.out.println("Java is case sensitive!" );
>```java
System.out.println("Java is case sensitive!" );
>```

>##### 4. Write statements for each of the following
>a. Declare a variable that used to store the value of a matric number.
>```java
>String matricNumber;
>```
>b. Declare a variable that used to store the value of π.
>```java
>double piValue;
>```
>c. Initialize a variable named M with the value set to false.
>```java
>boolean M = false;
>```
>d. Initialize a variable named P with the value set to 8800000000.
>```java
>long P = 8800000000L;
>```
>e. Initialize a variable named letter with the value set to U.
>```java
>char letter = 'U';
>```
> f. Declare a constant variable named PRO. The value of the constant variable is
   Java.
>```java
>final String PRO = "Java";
>```

>##### 5. Correct the error for the following statements.
>a.
 final double AMOUNT = "32.5";
 AMOUNT += 10;
 System.out.println("The amount is " + AMOUNT);
>```java
>double amount = 32.5;
>amount += 10;
>System.out.println("The amount is " + amount);
>```
>b.
 string chapter = 'Summary';
 System.out.println(chapter);
>```java
>String chapter = "Summary";
>System.out.println(chapter);
>```
>c.
 int num;
 ++num++;
 num1 = num;
>```java
>int num = 0;
>++num;
>num++;
>int num1 = num;
>```
 d.
 int num = 3000;
 System.out.printf("%4.2f\n", num);
>```java
>double num = 3000;
>System.out.printf("%4.2f\n", num);
>```
>e.
 String contact;
 Scanner keyboard = new Scanner(System.out);
 contact = keyboard.nextLine();
>```java
>String contact;
>Scanner keyboard = new Scanner(System.in);
>contact = keyboard.nextLine(); 
>```

>##### 6. Write a java program that print the circumference of a circle. The input of the program is diameter. Display the result in three decimal places. (Note π = Math.PI)
>Enter diameter: 11.8
>The circumference of the circle is : 37.071
>
>```java
>import java.util.Scanner;
>public class question6 {
>     public static void main(String[] args) {
>          Scanner input = new Scanner(System.in);
>          System.out.print("Enter diameter: ");
>          double diameter = input.nextDouble();
>          double result = diameter*Math.PI;
>          System.out.printf("The circumference of the circle is : %.3f", result);
>     }
>}
>```

>##### 7. Write a java program that converts inches to meters. (Given 1 inch equals to 2.54 centimeters). Print the output in two decimal places.
>Enter value in inch: 20.17
>20.17 inches = 0.51 meters
>
>```java
>import java.util.Scanner;
>public class question7 {
>      public static void main(String[] args) {
>           Scanner input = new Scanner(System.in);
>           System.out.print("Enter value in inch: ");
>           double inch = input.nextDouble();
>           double result = inch*2.54*0.01;
>           System.out.printf(inch + " inches = %.2f meters", result);
>      }
>}
>```
