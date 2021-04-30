import java.util.Scanner;

public class test10_6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("실수 값 : ");
        double x = sc.nextDouble();

        System.out.println("절댓값 : "+Math.abs(x));
        System.out.println("제곱근 : "+Math.sqrt(x));
        System.out.println("면  적 : "+Math.PI*(x*x));
    }
    
}
