package com.pluralsight;

import com.pluralsight.finance.*;

import java.util.Scanner;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", 1000.00);
        Valuable account2 = new BankAccount(456, "Gary", 1000.00);

        // try to deposit money into both accounts
        account1.deposit(100);
        ((BankAccount) account2).deposit(100);

        account1.withdraw(100);
        account1.withdraw(25);

        ((BankAccount) account2).deposit(10);

        //Print out Bank accounts
        System.out.println(account1);
        System.out.println(account2 + "\n");

        House house1 = new House("Penthouse Mansion", 1000000.00,2018,2000,10);
        Jewelry jewelry = new Jewelry("Johnny Deng Chain",250000,25);
        Gold gold = new Gold("Gold", 250000,25);

        System.out.println(house1);
        System.out.println(jewelry);
        System.out.println(gold);


        //Bonus exercise for adding new assets
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of your house");
        String name = input.nextLine();
        System.out.println("Please enter the market value of your house");
        double marketValue2 = input.nextDouble();
        System.out.println("Please enter the year your house was built");
        int builtYear = input.nextInt();
        System.out.println("Please enter the square footage of your house");
        int squareFootage = input.nextInt();
        System.out.println("Please enter the number of bedrooms");
        int bedrooms = input.nextInt();


        House house2 = new House(name,marketValue2,builtYear,squareFootage,bedrooms);
        System.out.println(house2);
    }


}
