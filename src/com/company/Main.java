package com.company;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number?");
        Double firstNum = Double.parseDouble(scanner.nextLine());
        System.out.print(firstNum);

        System.out.print("Please enter second number?");

        Double secondNum = Double.parseDouble(scanner.nextLine());
        System.out.print(secondNum);
        Double sumOfNumbers = firstNum + secondNum;

        showResults(firstNum, secondNum);
    }

    public static void showResults (double firstNum, double secondNum) {

        double sumOfNumbers = firstNum + secondNum;
        System.out.println("The sum of your numbers is " + sumOfNumbers);
        double differenceOfNumbers = firstNum - secondNum;
        System.out.println("The difference is " + differenceOfNumbers);
        double numbersDivided = firstNum / secondNum;
        System.out.println("The quotient is " + numbersDivided);
        double numbersMultiplied = firstNum * secondNum;
        System.out.println("The product is " + numbersMultiplied);
        double remainder = firstNum % secondNum;
        System.out.println("The remainder is " + remainder);
    }
}

















