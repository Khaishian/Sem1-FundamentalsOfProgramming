# WIX1002 Fundamentals of Programming
# Tutorial 5 Arrays
>##### 1. Write statements for each of the following
>a. Declare an array that used to store 12 floating point numbers.
>```java
>float [] numbers = new float[12];
>```
>b. Initialize an array that used to store the value of A to E.
>```java
>char [] alphabets = {'A','B','C','D','E'};
>```
>c. Declare an array that used to store 100 students name.
>```java
>String [] names = new String[100];
>```
>d. Declare an array for a table with 6 rows 2 columns that used to store integer
value.
>```java
>int [][] table = new int [6][2];
>```
>e. Initialize an array with the following value:
>```java
>int [][] matrix = {{6,9},{2,5},{4,6}}
>```
>f. After initialize the array, modify the value of the above array to
>```java
>int [][] matrix = {{6,9},{2,5},{4,6}}
>matrix [1][1] = 4
>matrix [2][0] = 3
>matrix [2][1] = 7
>```
>g. Display all the values of an array name contact in separate lines.
>```java
>for(int i = 0, i<nameContact.length; i++)
>    System.out.println(nameContact[i]);
>```

>##### 2. Correct the error for the following statements.
>a.
>String[] code = {'AAA', 'AAB', 'AAC', 'AAD'};
>```java
>String[] code = {"AAA", "AAB", "AAC", "AAD"};
>```
>b.
>int[] num = new num[10];
>for(int k=0; k<=num.length(); k++)
>sum+=num;
>```java
>int[] num = new num[10];
>for(int k=0; k<num.length(); k++)
>sum+=num[k];
>```
>c.
>int [][]t = new int[3][];
>t[1][2] = 5;
>```java
>int [][]t = new int[3][3];
>t[1][2] = 5;
>```
>d.
>int i=4;
>int []score = new int[5];
>score [1] = 78;
>score[++i] = 100;
>```java
>int i=4;
>int []score = new int[6];
>score [1] = 78;
>score[++i] = 100;
>```

>##### 3. Determine the values of each element of array marks. Assume the array was declared as:
>int[] marks = new int[5];
>int i = 0, j = 1;
>marks[i] = 12;
>marks[j] = marks[i] + 19;
>marks[j-1] = marks[j] * marks [j];
>marks[j*3] = marks[i+1];
>marks[++j] = marks[i]%5;
>marks[2*j] = marks[j-1];
>
>```java
>marks [0] = 961 ;
>marks [1] = 31;
>marks [2] = 1;
>marks [3] = 31;
>marks [4] = 31;
>```

>##### 4. Write the statements that display the number of occurrence of the word "the" (case sensitive) in a string array name sentence.
>```java
>String s1 = "the";
>int num = 0;
>for (int i = 0; i<sentence.length; i++){
>    if (sentence[i].equals(s1))
>        num++;
>}
>System.out.print(num);
>```

>##### 5. Write the statements that display the string array name sentence in reverse order. Each string element must be displayed in reverse order as well.
>```java
>for(int i =sentence.length-1; i>= 0 ;i--){
>    for(int j = sentence[i].length()-1; j>=0; j--)          
>        System.out.print(sentence[i].charAt(j));
>    System.out.print(" ");   
>}
>```

>##### 6. Write the statements that generate 1 random integer within 0 – 255. Convert the number to binary and store the bit into an 8 bit array. Then, display the binary number
>```java
>Random a = new Random();
>int[] array8bit = {0, 0, 0, 0, 0, 0, 0, 0};
>int ran = a.nextInt(256);
>int i = 7; 
>System.out.println(ran);
>while (ran > 0) {
>    array8bit[i] = ran % 2;
>    i--;
>    ran = ran / 2;
>}
>for (int j = 0; j < 8; j++) {
>    System.out.print(array8bit[j]);
>}
>```
