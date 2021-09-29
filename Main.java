package com.company;

/* import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the number of names ");
         String [] names = new String[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < String.length ; i++)
        {
            String [i] = sc.nextLine();
        }
        System.out.println("You have entered : " +str);
    }
}
public class JavaExample
{
    int add(int num1, int num2)
    {
        return num1+num2;
    }
    int add(int num1, int num2, int num3)
    {
        return num1+num2+num3;
    }
    int add(int num1, int num2, int num3, int num4)
    {
        return num1+num2+num3+num4;
    }
    public static void main(String[] args)
    {
        JavaExample obj = new JavaExample();
        //This will call the first add method
        System.out.println("Sum of two numbers: "+obj.add(10, 20));
        //This will call second add method
        System.out.println("Sum of three numbers: "+obj.add(10, 20, 30));
        //This will call third add method
        System.out.println("Sum of four numbers: "+obj.add(1,  2, 3, 4));
    }
} */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, number3, number4,number5, result1, result2, result3, result4;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);



        switch (operator) {

            // performs addition between numbers
            case '+':
                // ask users to enter numbers
                System.out.println("Enter first number");
                number1 = input.nextDouble();

                System.out.println("Enter second number");
                number2 = input.nextDouble();

                System.out.println("Enter third number");
                number3 = input.nextDouble();

                System.out.println("Enter fourth number");
                number4 = input.nextDouble();

                System.out.println("Enter fifth number");
                number5 = input.nextDouble();

                result1 = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result1);
                result2 = number1 + number2 + number3;
                System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + result2);
                result3 = number1 + number2 + number3 + number4;
                System.out.println(number1 + " + " + number2 + " + " + number3 + " + "  + number4 + " = " + result3);
                result4 = number1 + number2 + number3 + number4 + number5 ;
                System.out.println("Exit");
                break;

            // performs subtraction between numbers
            case '-':
                // ask users to enter numbers
                System.out.println("Enter first number");
                number1 = input.nextDouble();

                System.out.println("Enter second number");
                number2 = input.nextDouble();

                System.out.println("Enter third number");
                number3 = input.nextDouble();

                System.out.println("Enter fourth number");
                number4 = input.nextDouble();

                System.out.println("Enter fifth number");
                number5 = input.nextDouble();

                result1 = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result1);
                result2 = number1 - number2 - number3;
                System.out.println(number1 + " - " + number2 + " - " + number3 + " = " + result2);
                result3 = number1 - number2 - number3 - number4;
                System.out.println(number1 + " - " + number2 + " - " + number3 + " - "  + number4 + " = " + result3);
                result4 = number1 - number2 - number3 - number4 - number5 ;
                System.out.println("Exit");
                break;

            // performs multiplication between numbers
            case '*':
                // ask users to enter numbers
                System.out.println("Enter first number");
                number1 = input.nextDouble();

                System.out.println("Enter second number");
                number2 = input.nextDouble();

                System.out.println("Enter third number");
                number3 = input.nextDouble();

                System.out.println("Enter fourth number");
                number4 = input.nextDouble();

                System.out.println("Enter fifth number");
                number5 = input.nextDouble();

                result1 = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result1);
                result2 = number1 * number2 * number3;
                System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + result2);
                result3 = number1 * number2 * number3 * number4;
                System.out.println(number1 + " * " + number2 + " * " + number3 + " * "  + number4 + " = " + result3);
                result4 = number1 * number2 * number3 * number4 * number5 ;
                System.out.println("Exit");
                break;

            // performs division between numbers
            case '/':
                System.out.println("Enter first number");
                number1 = input.nextDouble();

                System.out.println("Enter second number");
                number2 = input.nextDouble();

                result1 = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result1);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}