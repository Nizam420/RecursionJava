package Recursion;

public class FirstUppercaseInString {
    public static void main(String[] args) {
        String str = "Nizamuddin";
        char ans = first(str, 0);
        if (ans == 0){
            System.out.println("Not Found");
        }
        else{
            System.out.println(ans);
        }
    }
    static char first(String str, int i) {
        if (str.charAt(i) == '\0') {
            return 0;
        }
        if (Character.isUpperCase(str.charAt(i))) {
            return str.charAt(i);
        }
        return first(str, i + 1);
    }
}
