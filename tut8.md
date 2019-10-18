# WIX1002 Fundamentals of Programming
# Tutorial 8 Class

>##### 1. Write statements for each of the following
>a. Define a class Student.
>
>```java
>     public class Student{  
>     }
>```
>
>
>
>b. Declare the instance variable that used to store contact number.
>
>```java
>     public String contactNum;
>```
>
>
>
>c. Create the constructor that initializes the contact number to null.
>
>```java
>    public Student() {
>        contactNum = null;
>    }
>```
>
>
>
>d. Create another constructor that assign the parameter value to the contact
>number.
>
>```java
>    public Student(String contact) {
>        contactNum = contact;
>    }
>```
>
>
>
>e. Create an accessor and mutator method for the contact number.
>
>```java
>    public String getContact() {
>        return contact;
>    }
>
>    public void setContact(String s1) {
>        contact = s1;
>    }
>```
>
>
>
>f. Create a method that used to display the contact number.
>
>```java
>    public void printNum(String contactNum){
>        System.out.println(getContact());
>    }
>```
>
>
>
> g. Create an object of the class Student.
>
>```java
>      Student st = new Student();
>```
>
>
>
>h. Change the contact number using the mutator method.
>
>```java
>      setContact("0123456789");
>```
>
>
>
>i. Create an object of the class Animal.
>
>```java
>      Animal Ani = new Animal(); 
>```
>
>
>
>j. Create an object of the class Animal that used to represent a cat.
>
>```java
>      Animal cat = new Animal(); 
>```
>
>
>
>k. Create an object of the class Number with the value 20 and 40.
>
>```java
>       Number num = new Number(20,40); 
>```

>2. ##### Write statements for each of the following
>  a. Define a class Digit.
>
>  ```java
>  public class Digit {
>  }
>  ```
>
>  
>
>  b. Declare the instance variable that used to store a number.
>
>  ```java
>       public int Digit;
>  ```
>
>  
>
>  c. Create a constructor that assign the parameter value to the number.
>
>  ```java
>      public Digit(int num) {
>          digit = num;
>      }
>  ```
>
>  
>
>  d. Create a digitMultiplication method that returns the multiplication of the
>  number. If the number is 1345, the method will return 60.
>
>  ```java
>      public static int multiNum(int digit) {
>          int aDigit = 1;
>          while (digit > 0) {
>              int bDigit = digit % 10;
>              aDigit *= bDigit;
>              digit /= 10;
>          }
>          return aDigit;
>  ```
>
>  
>
>  e. Create a method that used to display the digit multiplication of the number.
>
>  ```java
>      public static void printMultiNum(int x){  
>          System.out.println(x);
>      }
>  ```
>
>  
>
>  f. Create a tester class that displays the digit multiplication of 4567.
>
>  ```java
>  public class Test {
>  
>      public static void main(String[] args) {
>          Digit a = new Digit(4567);
>          printMultiNum(multiNum(4567));
>      }
>  }
>  ```
>

>##### 3. Create a class that used to represent the 2 dimension coordinate system. The class consists of constructors, instance variables, accessor and mutator method and an output method that display the x-coordinate and y-coordinate.
>
>```java
>package Week01;
>public class Coordinates {
>    
>        public int x;
>        public int y;
>        
>        public Coordinates(int a, int b) {
>             this.x = a;
>             this.y = b;
>        }
>
>       public int getXCoor() {
>             return this.x;
>       }
>       public int getYCoor() {
>             return this.y;
>       }
>
>       public void setCoor(int a, int b) {
>             x = a;
>             y = b;
>       }
>        public void printCoor(){
>             System.out.println(x + "," + y);
>        }
>
>}
>
>```


>##### 4. Create a class Payment that accept different type of payment methods such as cash payment, cheque payment and credit card payment. For cash payment, the class accepts the amount in cash; for cheque payment, the class accepts the amount and the cheque number; for credit card payment, the class accepts the amount, card holder name, cardType, expiration date and validation code. Use the same method name for the payment.
>
>```java
>public class Payment {
>     public double amount;
>     public String chequeNum;
>     public String cardHolderName;
>     public String cardType;
>     public String expirationDate;
>     public String validCode;
>
>     public  Payment (double a) {
>           this.amount = a;
>     }
>     public  Payment (double a, String c) {
>           this.amount = a;
>           this.chequeNum = c;
>     }
>     public  Payment (double a, String chn, String ct, String expd, String vc) {
>           this.amount = a;
>           this.cardHolderName = chn;
>           this.cardType = ct;
>           this.expirationDate = expd;
>           this.validCode = vc;
>        }
>}
>```
>

>##### 5. Create a class Connection. The Connection class keeps track of the number of connections to the server. Whenever an object is created, a connection is established. The class has a disconnect method and a display method that display the number of connections to the server.
>```java
>public class Connection { 
>         static int counter = 0;
>
>         public Connection() {
>             counter++;
>         }
>         public void disconnect(){
>             counter--;
>         }
>         public static void display(){
>             System.out.println("Number of connections to the server: " + counter);
>         }
>}
>
>```
