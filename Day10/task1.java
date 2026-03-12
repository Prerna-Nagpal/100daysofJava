import java.util.Scanner;
public class task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum1 = 0;
        for (int i = 1; i <= num; i++) {
            sum1 += i;
        }
        int sum2=0,sum3=0;
        int i=1;
        while(i<=num){
            sum2+=i;
            i++;
        }
        int j=1;
        do{
            sum3+=j;
            j++;
        }while(j<=num);
        System.out.println("Sum using for loop: " + sum1);
        System.out.println("Sum using while loop: " + sum2);    
        System.out.println("Sum using do-while loop: " + sum3);
        sc.close();
        
    }
}