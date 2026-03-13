import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 1; i++) {   // simple loop
            if(num % 5 == 0) {
                System.out.println("Is the number " + num + " divisible by 5? Yes");
            } else {
                System.out.println("Is the number " + num + " divisible by 5? No");
            }
        }

        sc.close();
    }
}