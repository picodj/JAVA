import java.util.Scanner;

public class test {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("두 자리 정수를 하나 입력해 주세요.>");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 :"+ input);
        System.out.printf("num=%d%n", num);
        
    }
    
}