import java.util.Scanner;
public class day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        System.out.println("the minimum number is " + min);
        System.out.println("the maximum number is " + max);
        System.out.println("Enter a number you want to find sqrt of");
        double num = sc.nextDouble();
        double sqrt = Math.sqrt(num);
        System.out.println("the sqrt of " + num + " is " + sqrt);
        System.out.println("enter a number you want floor and ceil of");
        double num2 = sc.nextDouble();
        double floor = Math.floor(num2);
        double ceil = Math.ceil(num2);
        System.out.println("the floor of " + num2 + " is " + floor);
        System.out.println("the ceil of " + num2 + " is " + ceil);
        System.out.println("enter a number you want abs value of");
        double d = sc.nextDouble();
        double abs = Math.abs(d);
        System.out.println("the abs value of " + d + " is " + abs);
sc.close();
    }
}
