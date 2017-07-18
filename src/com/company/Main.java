package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Please enter first number?");
            Double firstNum = Double.parseDouble(scanner.nextLine());
            System.out.print(firstNum);

            System.out.print("Please enter second number?");

            Double secondNum = Double.parseDouble(scanner.nextLine());
            System.out.print(secondNum);
            Double sumOfNumbers = firstNum + secondNum;
            System.out.println("Sum of " +firstNum+ " and " +secondNum+ " is " +sumOfNumbers);

            showResults(firstNum, secondNum){
                int sumOfNumbers = firstNum + secondNum;
                int differenceOfNumbers = firstNum - secondNum;
                int numbersDivided = firstNum / secondNum;
                int numbersMultiplied = firstNum * secondNum;
                int remainder = firstNum % secondNum;
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");

        }
    }



//    }
//


}





