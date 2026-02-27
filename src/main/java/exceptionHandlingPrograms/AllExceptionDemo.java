package exceptionHandlingPrograms;

//AllExceptionDemo.java
class CustomException extends Exception {
 public CustomException(String message) {
     super(message);
 }
}

public class AllExceptionDemo {

 // Method demonstrating 'throws'
 static void checkAge(int age) throws CustomException {
     if (age < 18) {
         throw new CustomException("Age must be at least 18!");
     } else {
         System.out.println("Age is valid: " + age);
     }
 }

 public static void main(String[] args) {

     // 1️⃣ Basic try-catch
     System.out.println("1️⃣ Try-Catch Example:");
     try {
         int result = 10 / 0; // ArithmeticException
     } catch (ArithmeticException e) {
         System.out.println("Caught exception: " + e);
     }
     System.out.println();

     // 2️⃣ Custom Exception
     System.out.println("2️⃣ Custom Exception:");
     try {
         checkAge(16); // will throw CustomException
     } catch (CustomException e) {
         System.out.println("Caught custom exception: " + e.getMessage());
     }
     System.out.println();

     // 3️⃣ Multiple Catch Blocks
     System.out.println("3️⃣ Multiple Catch Blocks:");
     try {
         String s = null;
         System.out.println(s.length()); // NullPointerException
         int[] arr = new int[2];
         arr[5] = 10; // ArrayIndexOutOfBoundsException
     } catch (NullPointerException e) {
         System.out.println("Caught NullPointerException");
     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Caught ArrayIndexOutOfBoundsException");
     } catch (Exception e) {
         System.out.println("Caught generic exception: " + e);
     }
     System.out.println();

     // 4️⃣ Finally block example
     System.out.println("4️⃣ Finally Block Example:");
     try {
         int data = 25 / 5;
         System.out.println("Result: " + data);
     } catch (ArithmeticException e) {
         System.out.println("Arithmetic exception occurred");
     } finally {
         System.out.println("Finally block executed regardless of exception");
     }
     System.out.println();

     // 5️⃣ Throw vs Throws
     System.out.println("5️⃣ Throw vs Throws:");
     try {
         testThrow(); // uses 'throw'
     } catch (Exception e) {
         System.out.println("Caught exception using throw: " + e.getMessage());
     }

     try {
         testThrows(-5); // uses 'throws'
     } catch (Exception e) {
         System.out.println("Caught exception using throws: " + e.getMessage());
     }
 }

 // Example of 'throw' (used inside method to throw a single exception)
 static void testThrow() {
     throw new RuntimeException("Exception thrown using 'throw'");
 }

 // Example of 'throws' (declares method may throw exception)
 static void testThrows(int num) throws Exception {
     if (num < 0) {
         throw new Exception("Negative number not allowed");
     } else {
         System.out.println("Number is valid: " + num);
     }
 }
}
