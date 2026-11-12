package com.pluralsight;

import java.util.ArrayList;

public class NameFormatter {

    private NameFormatter(){
    }

    public static String format (String prefix, String firstname, String middleName, String lastName, String suffix) {
    return prefix + " " + lastName + ", " + middleName + " " + firstname + " " + suffix;
    }
    public static String format ( String firstname, String lastName) {
    return  lastName + ", " + firstname;
    }
    public static String format (String fullname){
        String[] name = fullname.trim().split(" ");
        if (name.length == 2){
            String firstName = name[0];
            String middleName = name[1];
            String lastName = name[2];
            return lastName + ", " + middleName + " " + firstName;
        }else if (name.length <= 0)
        return "Empty name";
    }

}
