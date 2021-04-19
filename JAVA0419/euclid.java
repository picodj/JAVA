import java.util.Scanner;

public class euclid {
    public static void main(String[]args){
        int x;
        int y;
        int t;

        System.out.print("첫번째 정수 입력 : ");
        x = sc.nextInt();
        System.out.print("두번째 정수 입력 : ");
        y = sc.nextInt();

        do{
           t = x % y;
        }while(t==0)
        System.out.println("최대 공약수는 "+t+"입니다.");

    }
    
}
