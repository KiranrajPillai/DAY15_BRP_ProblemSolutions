package com.classwork;

public class Message {
    public static void main(String[] args) {
        String str = "Hello <<name>>, We have your full name as\n" +
                "<<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know\n" +
                "in case of any clarification Thank you BridgeLabz 01/01/2016.";
        String str2 =str.replaceAll("<<name>>","Kiran");
        String str3 =str.replaceAll("<<full name>>","Kiranraj Pillai");
        String str4 =str.replaceAll("91-xxxxxxxxxx","9167685010");
        String str5 =str.replaceAll("01/01/2016","24/10/21");
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}
