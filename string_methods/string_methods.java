package string_methods;

public class string_methods {
    public static void main(String[] args) {
        String test = "kekw123456";

        test.equals("Kok");
        int length = test.length();
        char letter = test.charAt(3);
        test = test.toLowerCase();
        test = test.toUpperCase();
        test.isEmpty();
        test.replace("K", "W");
        test.contains("W");
        //first occurence of a char
        int index = test.indexOf("k"); // evaluates as 0

        //last occurence of a char
        int last_index = test.lastIndexOf("k"); //evaluates as 2

        //removing whitespace 
        test = test.trim();

        //substrings
        test = test.substring(3, 6); //von bis -> upper bound exclusive
        test = test.substring(2);
    }
    
}
