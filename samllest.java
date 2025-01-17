import java.util.Scanner;

public class samllest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num < num2 && num < num3) {
            System.out.println(num);
        }
        else if(num2 < num && num2 < num3){
            System.out.println(num2);
        }
        else{
            System.out.println(num3);
        }
    }
}
