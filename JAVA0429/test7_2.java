import java.util.Scanner;

public class test7_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 x : ");
        int x = sc.nextInt();
        System.out.print("정수 y : ");
        int y = sc.nextInt();
        System.out.print("정수 z : ");
        int z = sc.nextInt();

        int s = min(x,y,z);
        System.out.println("최솟값은 : "+s+"입니다.");

    }

    static int min(int a,int b,int c){
        if(a < b && a < c)
            return a;
        else if (b < a && b < c)
            return b;
        else
            return c;
    }
    
}
