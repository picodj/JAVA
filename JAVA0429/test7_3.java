import java.util.Arrays;
import java.util.Scanner;

public class test7_3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 x : ");
        int x = sc.nextInt();
        System.out.print("정수 y : ");
        int y = sc.nextInt();
        System.out.print("정수 z : ");
        int z = sc.nextInt();

        System.out.println("중간값은 : "+mid(x,y,z)+"입니다.");

    }

    static int mid(int a,int b,int c){
        int[] num = {a,b,c};
        Arrays.sort(num);
        return num[1];
        
        
    }
    
}
