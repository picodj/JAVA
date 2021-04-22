import java.util.random;
import java.util.Scanner;

public class FlowEx7 {
    System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요. : ");

    Scanner sc = new Scanner(System.in);
    int user = sc.nextInt();
    int com = (int)(Math.random()*3) +1;

    System.out.println("당신은"+user+"입니다.");
    System.out.println("컴은 "+com+"입니다.");
    

}
