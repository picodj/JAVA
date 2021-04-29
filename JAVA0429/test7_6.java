import java.util.Scanner;

public class test7_6 {
    static String printSeason(int m){
        String[] Season = {"겨울","겨울","봄","봄","봄","여름","여름","여름","가을","가을","가을","겨울"};
        return Season[m-1];
        
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 월 입니까(1~12) : ");
        int a = sc.nextInt();

        System.out.println("해당 월의 계절은 "+printSeason(a)+"입니다.");

    }
}
