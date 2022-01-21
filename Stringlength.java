package Recursion;

public class Stringlength {
    public static void main(String[] args) {
        String str = "Nizamuddin Mondal";
        System.out.println(strlen(str));
    }
    static int strlen(String str) {
        if (str.length() == '\0'){
            return 0;
        }
        else {
            return 1 + strlen(str.substring(1));
        }
    }
}
