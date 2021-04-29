import java.util.Scanner;

public class test7_4 {

    static int sumUp(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1부터 n까지의 합을 구하시오");

        System.out.print("x의 값 : ");
        int a = sc.nextInt();

        System.out.println("1부터 "+a+"까지의 합은 "+sumUp(a)+"입니다." );
        
    }
}
