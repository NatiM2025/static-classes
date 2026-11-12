package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        String result = NameFormatter.format("Dr.", "Mel", "B", "Johnson", "PhD");
        String result4 = NameFormatter.format("Mel",  "Johnson");
        String result5 = NameFormatter.format("Mel Johnson");
        System.out.println(result);
        System.out.println(result4);
        System.out.println(result5);

    }
}
