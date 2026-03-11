import java.util.Scanner;
public class day9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage:");
        int percentage = sc.nextInt();
        int grade = percentage/10;
        switch(grade){
            case 10:
                System.out.println("Grade: A");
                break;
            case 9:
                System.out.println("Grade: B");
                break;
            case 8:
                System.out.println("Grade: C");
                break;
            case 7:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }
        sc.close();

    }
    
}
