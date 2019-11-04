# WIX1002 Fundamentals of Programming
# Tutorial 9 Inheritance

>##### 1. Write statements for each of the following
>a. Write a static method compare that return true if two objects parameter
>(Student s, Teacher t) are belongs to the same class. Otherwise return false.
>
>```java
>public static boolean sameClass(Object a, Object b){
>        return a.getClass().equals(b.getClass());
>}
>```
>
>
>
>b. Write a static method isClass that return true if the object parameter (Student
>s) is belong to any descendent class of Person. Otherwise return false.
>
>```java
>public static boolean isClass(Object a){
>        return a instanceof Person;
>}
>```
>

>2. Define a class Organism. The class contains the initial size of the organism and the
>growth rate. Create a constructor to initialize the instance variables. Then, define a
>class Animal. Animal is an organism that has extra instance variable which is the
>amount of eating need. Create a constructor to initialize the instance variable and a
>method to display the Animal instance variables.
>
>```java
>public class Organism {
>    public double iniSize;
>    public double growthR;
>    public Organism(double size, double growth){
>        this.iniSize = size;
>        this.growthR = growth;
>    }
>}
>```
>
>```java
>public class Animal extends Organism{
>    public double eatingA;
>    public Animal(double a, double b, double c){
>        super(a,b);
>        this.eatingA = c;
>    }
>    public void printIns(){
>        System.out.println("Initial size: " + this.iniSize);
>        System.out.println("Growth rate: " + this.growthR);
>        System.out.println("Amount of eating need: " + this.eatingA);
>    }
>}
>```
>


>3. Define a class PaySystem. The class consists of the payrate per hour and the number
>of hours. The class also contains a method to return the total pay for a given amount
>of hours and a method to display the total payment. Derive a class RegularPay from
>PaySystem that has a constructor and did not override any base methods. Derived a
>class SpecialPay from PaySystem that override the base method and return the total
>pay plus 30% commission.
>
>```java  
>public class PaySystem {
>        public double payRate;
>        public int hourNum;
>        public PaySystem(double rate, int hour){
>             this.payRate = rate;
>             this.hourNum = hour;
>        }
>        public double totalPayment (){
>             double res = this.payRate*this.hourNum;
>             return res;
>        }
>        public void printTotal (){
>             System.out.println(totalPayment());
>        }
>}
>```
>
>```java
>public class RegularPay extends PaySystem {
>        public RegularPay(double a, int b){
>             super(a,b);
>         }
>    }
>    ```
>     
>    ```java
>    public class SpecialPay extends PaySystem {
>     
>        public SpecialPay(double a, int b) {
>        super(a, b);
>    }
>
>    public double totalPayment() {
>        double res = this.payRate * this.hourNum*1.3;
>        return res;
>        }
>     }
>    ```
>

>4. Define a class PurchaseSystem. The class consists of product code, unit price,
>quantity and total price. Besides the class consists of a method to compute the total
>price and a display method. Derived a class SugarPurchase from PurchaseSystem.
>This new class add a sugar weight attributed and override the method to compute the
>total price as unit (price x quantity x sugar) weight. 
>
>```java
>public class PurchaseSystem {
>    public String productCode;
>    public double unitPrice;
>    public int quantity;
>    public double totalPrice;
>    public PurchaseSystem(String s, double price, int quan){
>        this.productCode = s;
>        this.unitPrice = price;
>        this.quantity = quan;
>        this.totalPrice = totalAmo();
>    }
>    public double totalAmo (){
>        double res = this.unitPrice*this.quantity;
>        return res;
>    }
>    public void printTotal (){
>        System.out.println(this.totalPrice);
>    }
>}
>
>```
>
>```java
>public class SugarPurchase extends PurchaseSystem{
>    public double sugarWeight;
>    public SugarPurchase(String s, double price, int quan, double weight){
>        super(s, price, quan);
>        this.sugarWeight = weight;
>        this.totalPrice = totalAmo();
>    }
>    public double totalAmo (){
>        double res = this.unitPrice*this.quantity*this.sugarWeight;
>        return res;
>    }
>}
>```
>
>