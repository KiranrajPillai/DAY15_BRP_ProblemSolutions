package com.classwork;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sp = " ";
        System.out.println("Enter your Firstname:");
        String Firstname = sc.next();
        if ((Firstname.contains(sp)) || Firstname.length() < 4) {
            System.out.println("Invalid First Name");
            return;
        }

        System.out.println("Enter your Lastname:");
        String Lastname = sc.next();
        if ((Lastname.contains(sp)) || Lastname.length() < 4) {
            System.out.println("Invalid Last Name");
            return;
        }

        System.out.println("Enter your EmailID:");
        String EmailAddress = sc.next();
        if ((EmailAddress.contains(sp)) || sp.contains("^(.+)@(.+)$")) {
            System.out.println("Invalid Last Name");
            return;
        }


        System.out.println("Enter your PhoneNumber:");
        String PhoneNumber = sc.next();
        if ((PhoneNumber.contains("(0/91)?[7-9][0-9]{9}")) || PhoneNumber.length() == 12) {
            System.out.println("Invalid Phone Number");
            return;
        }

        System.out.println("Enter your Company Name:");
        String CompanyName = sc.next();
        if ((CompanyName.contains(sp)) || CompanyName.length() < 4) {
            System.out.println("Invalid Company Name");
            return;
        }
    }
}