import java.util.Scanner;
import java.util.Random;

public class test {
    public static void main(String[]args){

        // 5-5

        // Scanner sc = new Scanner(System.in);

        // System.out.println("정숫값 x,y,z의 평균을 구합니다.");

        // System.out.print("x값 : ");
        // int x = sc.nextInt();
        // System.out.print("y값 : ");
        // int y = sc.nextInt();
        // System.out.print("z값 : ");
        // int z = sc.nextInt();

        // double a = (x+y+z)/3;

        // System.out.println("x,y,z의 평균은 "+a+"입니다.");


        // Scanner sc = new Scanner(System.in);

        // System.out.println("정숫값 x,y,z의 평균을 구합니다.");

        // System.out.print("x값 : ");
        // int x = sc.nextInt();
        // System.out.print("y값 : ");
        // int y = sc.nextInt();
        // System.out.print("z값 : ");
        // int z = sc.nextInt();

        // double a = (x+y+z)/3.0;

        // System.out.println("x,y,z의 평균은 "+a+"입니다.");

        // 5 - 8

        // System.out.println("float         int");
        // System.out.println("-----------------");

        // float x = 0.0F;
        // for (int i=0; i<=1000; i++, x+=0.001F){
        //     System.out.printf("%10.7f %10.7f%n",x,(float)i/1000);
        // }

        // 6 - 1

        // double[] a = new double[5];

        // for (int i=0; i<a.length; i++)
        // System.out.println("a["+i+"] = "+a[i]);


        // 6 - 2
        // int []a = new int[5];

        // for (int j=0; j<a.length; j++)
        // a[j]=5-j;

        // for (int i=0; i<a.length; i++)
        // System.out.println("a["+i+"] = "+a[i]);

        // 6-6
        // Scanner sc = new Scanner(System.in);

        // System.out.print("요소 수 : ");
        // int n = sc.nextInt();

        // int[] a = new int[n];

        // for (int j=0; j<n; j++){
        //     System.out.print("a["+j+"] = ");
        //     a[j]=sc.nextInt();
        // }

        // System.out.print("a = {");

        // for (int i=0; i<n-1; i++){
        //     System.out.print(a[i]+", ");
        // }
        // System.out.println(a[n-1]+"}");

        // 6-7

        // Scanner sc = new Scanner(System.in);

        // System.out.print("사람 수 : ");
        // int n = sc.nextInt();
        // System.out.println("점수를 입력하세요.");

        // int[] a = new int[n];
        // int sum = 0;
        // int max = 0;
        // int min = 100;;

        // for (int j=0; j<n; j++){
        //     System.out.print((j+1)+"번의 점수 : ");
        //     a[j]=sc.nextInt();
        //     sum += a[j];
        //     if(max<a[j]){
        //         max = a[j];
        //     }
        //     if(min>a[j]){
        //         min = a[j];
        //     }
        // }

        

        // System.out.println("합계는 "+ sum +"점입니다.");
        // System.out.println("평균은 "+ (double)sum/n +"점입니다.");
        // System.out.println("최고점은 "+ max +"점입니다.");
        // System.out.println("최저점은 "+ min +"점입니다.");

        // 6 - 10

        // Random rand = new Random();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("요소 수:");
        // int n = sc.nextInt();
        // int[] a = new int[n];

        // for (int j = 0; j < n ; j++){
        //     a[j]= 1+ rand.nextInt(10);
        // }
        
        // for (int j = 0; j < n ; j++){
        //     System.out.println("a["+j+"] = " + a[j]);
        // }


        // 6 - 12
        // Random rand = new Random();
        // Scanner sc = new Scanner(System.in);

        // int n = 0;
        // do {
        // System.out.print("요소 수:");
        // n = sc.nextInt();
        // }while(n>10);

        // int[] a = new int[n];

        // //a[0]= 1+ rand.nextInt(10);

        // for (int i = 0; i < n ; i++){
        //     int j;
        //     do {
        //         j = 0;
        //         a[i] = 1+ rand.nextInt(10);
        //         for (j = 0 ; j < i ; j++){
        //             if (a[j] == a[i]) break;
        //             }
        //         } while(j < i);
        //     }
        //     for (int j = 0; j < n ; j++){
        //         System.out.println("a["+j+"] = " + a[j]);
        //     }


        // 6 - 13

        // Random rand = new Random();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("요소 수 : ");
        // int n = sc.nextInt();
        // int[] a = new int[n];

        // for (int j = 0; j < n ; j++){
        //     System.out.print("a["+j+"] = ");
        //     a[j]= sc.nextInt();
        // }

        // System.out.println("요소를 섞었습니다.");

        // for (int i = 0 ; i < n ; i++) {
        //     int x = rand.nextInt(n);
        //     int y = rand.nextInt(n);
        //     int t = a[x];
        //     a[x] = a[y];
        //     a[y] = t;
        // }

        // for (int j = 0; j < n ; j++){
        //     System.out.println("a["+j+"] = " + a[j]);
        // }

        // 6 - 15
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] months= {
          "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"
        };
        int re = 0;
        System.out.println("해당월의 영어 단어를 입력하시오.\n세 글자로 잛게 첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
    
        do {
        int month = 1 + rand.nextInt(12);
    
        while(true){
        System.out.print(month + "월 : ");
        String s = sc.next();
        
        if (s.equals(months[month-1])) break;
        System.out.println("틀렸습니다.");
        }
          System.out.print("정답입니다.");
          System.out.print("다시 한번?1...Yes/0...No:0");
          re = sc.nextInt();
        } while (re == 1);
    
    }
    
}
