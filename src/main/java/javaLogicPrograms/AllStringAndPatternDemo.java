package javaLogicPrograms;

//AllStringAndPatternDemo.java
import java.util.Scanner;

public class AllStringAndPatternDemo {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // 1️⃣ Print star pattern
     System.out.println("1️⃣ Star Pattern:");
     int n = 5; // number of rows
     for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= i; j++) {
             System.out.print("* ");
         }
         System.out.println();
     }
     System.out.println();

     // 2️⃣ Check leap year
     System.out.println("2️⃣ Leap Year Check:");
     int year = 2024;
     if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
         System.out.println(year + " is a leap year");
     } else {
         System.out.println(year + " is not a leap year");
     }
     System.out.println();

     // 3️⃣ Count number of words in a sentence
     System.out.println("3️⃣ Count words in a sentence:");
     String sentence = "Java is fun and easy";
     String[] words = sentence.trim().split("\\s+"); // split by spaces
     System.out.println("Sentence: \"" + sentence + "\"");
     System.out.println("Number of words: " + words.length);
     System.out.println();

     // 4️⃣ Remove spaces from string
     System.out.println("4️⃣ Remove spaces from string:");
     String stringWithSpaces = "  Hello World  ";
     String withoutSpaces = stringWithSpaces.replaceAll("\\s+", "");
     System.out.println("Original: \"" + stringWithSpaces + "\"");
     System.out.println("Without spaces: \"" + withoutSpaces + "\"");
     System.out.println();

     // 5️⃣ Convert string to integer
     System.out.println("5️⃣ Convert String to Integer:");
     String numStr = "12345";
     try {
         int num = Integer.parseInt(numStr);
         System.out.println("String: \"" + numStr + "\", Integer: " + num);
     } catch (NumberFormatException e) {
         System.out.println("Invalid number format: " + e.getMessage());
     }
     System.out.println();

     // 6️⃣ Find ASCII value of a character
     System.out.println("6️⃣ ASCII value of a character:");
     char ch = 'A';
     int ascii = (int) ch;
     System.out.println("Character: '" + ch + "', ASCII: " + ascii);
     System.out.println();

     sc.close();
 }
}
