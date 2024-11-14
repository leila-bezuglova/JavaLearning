package lv.acodemy;

public class Variables {
    public static void main(String[] args) {

      // This is my comment

      /*
      This is first line
      This is second line
       */

        // Int (integer) - whole number / natural number
        int age = 31;
        int currentYear = 2024;
        int inventoryItemAccount = 100;

        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryItemAccount);

       // double (fractional numbers)
        double temperature = 36.6;
        double price = 19.99;

        System.out.println(temperature);
        System.out.println(price);

        // char (symbols)

        char grade = 'B';
        char myInitial = 'L';
        char currencySymbol = 'R';

        // Print them all;

        // System.out.println(grade);
        // System.out.println(myInitial);
        // System.out.println(currencySymbol);

        // boolean (logical type, can keep only two values: true or false)
        // How to name? has or is
        // Example: isSummer / if(isSummer) {}; / isLoggedIn;
        // Example: hasAccess / if(hasAccess) {};

        boolean hasAccess = true;
        System.out.println("isSummer"); // \n

        System.out.print("Hello World\n");
        System.out.print("Hello World");

        // long
        long phoneNumber = 29192912;

        // float
        float interestRate = 4.5f;

        // Arihmetic operators

        int a = 10;
        int b = 5;
        int sum = a + b; // add
        System.out.print(sum);

        int c = 20;
        int d = 8;
        int difference = c - d; // add
        System.out.print(difference);

        int m = 7;
        int n = 3;
        int result = m * n; // add
        System.out.print(result);

        // Divide

        double num3 = 10.0;
        double num4 = 3.0;
        double divResult = num3 / num4;
        System.out.print(divResult);

        // % (remainder of division)

        int f = 12;
        int g = 5;
        int remainder = f % g;
        System.out.print(remainder);

        int number = 8;
        boolean isEven = (number % 2 == 0); // == comparison operator
        System.out.print(isEven);

        // Increment ++
        // ++preIncrement
        // Decrement --
        // ++decrement

        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        int counter = 10;
        counter++;
        int postIncrement = counter++; // postIncrement = 11; counter = 12;








    }
}
