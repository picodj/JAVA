import java.util.Scanner;

import java.util.Scanner;

public class test7_1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 x : ");
        int x = sc.nextInt();

        int s = signOf(x);
        System.out.println("signOf(x)는 "+s+"입니다.");
    }
    
    static int signOf(int n){
        if(n > 0)
            return 1;
        else if(n < 0)
            return -1;
        else
            return 0;
    }
}