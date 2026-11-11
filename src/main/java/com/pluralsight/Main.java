package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        String result = NameFormatter.format("Dr.", "Mel", "B", "Johnson", "PhD");
        String result2 = NameFormatter.format( "Mel", "B", "Johnson", "PhD");
        String result3 = NameFormatter.format( "Mel", "B", "Johnson");
        String result4 = NameFormatter.format("Mel",  "Johnson");
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
