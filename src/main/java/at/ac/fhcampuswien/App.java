package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        double erg = 0;
        boolean b = true;
        double number1;

        while(b)
        {
            System.out.print("Number " + count + ": ");
            number1 = sc.nextDouble();
            if (erg < number1)
            {
                erg = number1;
            }
            else if (number1 <= 0)
            {
                b = false;
                if (count == 1)
                {
                    System.out.println("No number entered.");
                }
            }
            count++;
        }
        if (b == false && erg >0)
        {
            System.out.print("The largest number is ");
            System.out.format("%.2f", erg);
            System.out.println();
        }
    }

    //todo Task 2
    public void stairs(){
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int number1 = input.nextInt();
        int count = 0;

        if (number1 > 0)
        {
            for (int i = 0; i < number1; i++)
            {
                for (int j = 0; j <= i; j++)
                {
                    count++;
                    System.out.print(count + " ");
                }
                System.out.println();
            }
        } else if (number1 <= 0)
        {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid(){
        int rows = 6;
        for (int i = 1; i <= 6; i++)
        {
            for(int j = 1; j < rows ; j++)
            {
                System.out.print(" ");
            }
            rows = rows - 1;

            for (int k = 1; k < i * 2; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        double input;
        int count = 1;
        int countFive = 0;
        double countGoodInput = 0;

        while(true)
        {
            System.out.print("Mark " + count + ": ");
            input = sc.nextDouble();

            if(input < 0 || input > 5)
            {
                System.out.println("Invalid mark!");
                count--;
            }
            else if (input != 0)
            {
                sum += input;
                countGoodInput++;
                if(input == 5) countFive++;
            }
            else
            {
                break;
            }
            count++;
        }
        if(countGoodInput == 0) countGoodInput++;
        System.out.println("Average: " + String.format("%.2f",sum/countGoodInput));
        System.out.println("Negative marks: " + countFive);
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int number = sc.nextInt();
        int digit;
        int sum = 0;

        while(number !=1 && number !=4) {
            while (number > 0) {
                digit = number % 10;
                sum = (digit * digit) + sum;
                number = number / 10;
            }
            number = sum;
            sum = 0;
        }

        if (number == 1)
        {
            System.out.println("Happy number!");
        }
        else
        {
            System.out.println("Sad number!");
        }

        //https://sol.cs.hm.edu/dpunkt-java-praktikum/numbers/HappyNumbers.java
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}