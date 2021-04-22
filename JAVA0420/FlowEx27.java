import java.util.*;
public class FlowEx27 {
    public static void main(String[]args){
        int num;
        int sum = 0;
        boolean flag = true; //while문의 조건식으로 사용될 변수
        Scanner sc = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");

        while(flag){
            System.out.print(">>");

            String tmp = sc.nextLine();
            num = Integer.parseInt(tmp); // 문자를 숫자로 변환

            if(num!=0){
                sum += num;
            }else{
                flag = false;
            }
        }
        System.out.println("합계 : "+sum);
    }
    
}
