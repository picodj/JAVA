import java.util.Random;
import java.util.Scanner;

public class test7_8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("하한값 : ");
        int a = sc.nextInt();
        System.out.print("상한값 : ");
        int b = sc.nextInt();

        System.out.print("생성한 난수는 "+random(a,b)+"입니다.");
    } // main out

    static int random(int a,int b){
        if(b <= a){
            return a;
        }else{
            Random rd = new Random();
            return a + rd.nextInt(b-a+1);
        }
    }
}
