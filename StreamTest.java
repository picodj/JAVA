import java.util.Scanner;

public class StreamTest {
    public static void main(String[]args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        switch (b){
            case 1: System.out.println("박영선");
                    break;
            case 2: System.out.println("오세훈");
                    break;
            case 3: System.out.println("허경영");
                    break;
        }
    }
}


// 입력을 받아서 1이면 2면 3이면 을 
// 각각 출력하는 프로그램을 만드세요 