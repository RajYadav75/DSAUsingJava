import java.util.Scanner;

public class PatternOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt(), i=1;
        while (i<=n){
            System.out.print("*"+" ");
            i++;
        }
    }
}
