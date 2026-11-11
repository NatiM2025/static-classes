package com.pluralsight;

public class NameFormatter {

    private NameFormatter(){
    }

    public static String format (String prefix, String firstname, String middleName, String lastName, String suffix) {
    return prefix + " " + lastName + " " + middleName + " " + firstname + " " + suffix;
    }
    public static String format ( String firstname, String middleName, String lastName, String suffix) {
    return  lastName + " " + middleName + " " + firstname + " " + suffix;
    }
    public static String format ( String firstname, String lastName, String suffix) {
    return  lastName + " " +  firstname + " " + suffix;
    }
    public static String format ( String firstname, String lastName) {
    return  lastName + " " + firstname;
    }

}
