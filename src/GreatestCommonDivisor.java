import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a : ");
        a = input.nextInt();
        System.out.println("Input b : ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("Khong co uoc chung lon nhat ");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Uoc chung lon nhat la : " + a);
    }
}
