import java.util.Scanner;

// https://codeforces.com/contest/1/problem/A
public class TheatreSquare {
    public static void main(String[] args) {
        double n;              // theatre square length
        double m;              // theatre square width
        double a;              // stone blocks size (a x a)
        double length;              // how many blocks you need to fill the length
        double width;          // how many blocks you need to fill the width
        double total;          // how many blocks you need total
        long totalInt;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        m = input.nextInt();
        a = input.nextInt();

        length = Math.ceil(n / a);
        width = Math.ceil (m / a);

        total = length * width;
        totalInt = (long)total;
        System.out.println(totalInt);
    }
}
