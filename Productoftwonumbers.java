package Recursion;

public class Productoftwonumbers {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;
        System.out.println(product(x, y));
    }
    static int product(int x, int y){
        if (x < y){
            return product(y, x);
        }
        else if (y != 0){
            return (x + product(x, y-1));
        }
        return 0;
    }
}
