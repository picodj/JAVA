import java.util.Scanner;
import java.util.Random;

public class test{
    public static void main(String[]args){

        // 4 - 1
//         Scanner sc = new Scanner(System.in);
//         int retry;
//     do{

//         System.out.print("정수값 : ");
//         int n  = sc.nextInt();

//         if (n > 0){
//             System.out.println("이 값은 양수입니다.");
//         }else if(n < 0){
//             System.out.println("이 값은 음수입니다.");
//         }else{
//             System.out.println("이 값은 0 입니다.");
//         }

//         System.out.print("다시 한번? 1-Yes / 0-No : ");
//         retry = sc.nextInt();
//     }while (retry==1);
//     }


        // 4 - 2
            // Scanner sc = new Scanner(System.in);
            // int n;
            
            // do{

            // System.out.print("세 자리의 정숫값 : ");
            // n = sc.nextInt();

            // }while (n < 100 || n > 1000);

            // System.out.println("입력한 값은 "+n+"입니다.");

        // 4 - 3

        // Scanner sc = new Scanner(System.in);
        // int a;
        // int n;

        // System.out.println("숫자 맞추기 게임 시작!");
        // System.out.println("10부터 99사이의 숫자를 맞추세요.");
        // Random rand = new Random();
        // a = 10+rand.nextInt(90);
        // do{
        // System.out.print("어떤 숫자일까? : ");
        // n = sc.nextInt();
        // if(a>n){
        //     System.out.println("더 큰 숫자입니다.");
        // }else if(a<n){
        //     System.out.println("더 작은 숫자입니다.");
        // }else{
        //     System.out.println("정답입니다.");
        // }
        // }while(n!=a);

        // 4 - 4

        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 A : ");
        // int a = sc.nextInt();
        // System.out.print("정수 B : ");
        // int b = sc.nextInt();

        
        // if (a>b){
        //     int t = a;
        //     a = b;
        //     b = t;
        // }

        // do{
        //     System.out.print(a+ " ");
        //     a += 1;
        // }while(a<=b);

        // 4 - 5

        // Scanner sc = new Scanner(System.in);
        // int a;

        // System.out.println("카운트다운 합니다.");
        // do{
        // System.out.print("양의 정숫값 : ");
        // a = sc.nextInt();
        // }while(a<=0);

        // while (a>=0){
        //     System.out.println(a--);
        // }

        // System.out.println("x의 값이 "+ a +"이 됐습니다. ");

        // 4 - 6

        // Scanner sc = new Scanner(System.in);
        // int a;

        // System.out.println("카운트다운 합니다.");
        // do{
        // System.out.print("양의 정숫값 : ");
        // a = sc.nextInt();
        // }while(a<=0);

        // while (a>=0){
        //     System.out.println(--a);
        // }

        // System.out.println("x의 값이 "+ a +"이 됐습니다. ");

        // 4 - 7

        // Scanner sc = new Scanner(System.in);

        // System.out.print("몇개의 *를 표시할까요? : ");
        // int a = sc.nextInt();
        // int i = 0;

        // while (i<a){
        //     System.out.print("*");
        //     i++;
        // }
        // if (a>=1){
        //     System.out.println();
        // }

        // 4 - 8

        // Scanner sc = new Scanner(System.in);

        // System.out.print("몇개의 *를 표시할까요? : ");
        // int a = sc.nextInt();
        // int i = 0;

        // while (i<a){
        //     if (i%2==0)
        //         System.out.print("*");
        //     else
        //         System.out.print("+");
        //     i++;
        // }
        // if (a>=1){
        //     System.out.print("\n");
        // }

        // 4 - 9

        // Scanner sc = new Scanner(System.in);
        // int x;
        // int y=0;

        // System.out.println("양의 정숫값의 자릿수를 표시합니다.");
        // do{
        //     System.out.print("양의 정숫값 : ");
        //     x = sc.nextInt();
        // }while(x<=0);

        // while(x>0){
        //     y++;
        //     x = x / 10;
        // }

        // System.out.println("입력한 숫자는 "+y+"입니다.");

        // 4 - 10
        // Scanner sc = new Scanner(System.in);
        // System.out.print("양의 정숫값:");
        // int x = sc.nextInt();
        // int y = 1;
        // int i = 1;
        // while(i <= x){
        //     y = y*i;
        //     i++;
        // }

        // System.out.println("1부터 "+x+"까지의 곱은 "+y+"입니다.");

        // 4 - 11

        // Scanner sc = new Scanner(System.in);

        // System.out.print("몇 개를 표시할까요? : ");
        // int x = sc.nextInt();

        // for ( int i = 0 ; i < x ; i++){
        //     System.out.print("*");
        // }
        // if (x>=1){
        //     System.out.println();
        // }

        // 4 - 14

        // Scanner sc = new Scanner(System.in);

        // System.out.print("1부터 n까지의 합을 구합니다. n의 값 : ");
        // int n = sc.nextInt();
        // int x=0;

        // for (int i = 1 ; i<=n; i++){
        //     x+=i;
        // }
        // System.out.println("1부터 "+n+"까지의 합은 "+x+"입니다.");

        // 4 - 15

        // Scanner sc = new Scanner(System.in);

        // System.out.println("1부터 n까지의 합을 구합니다.");
        // System.out.print("n의값 : ");
        // int n = sc.nextInt();
        // int sum=0;
        // for (int i=1 ; i<n; i++){
        //     sum+=i;
        //     System.out.print(i+" + ");
            
        // }
        // System.out.println(n+" = "+(sum+n));
        

        // 4 - 16
        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("몇 cm 부터 : ");
        // int a = sc.nextInt();
        // System.out.print("몇 cm 까지 : ");
        // int b = sc.nextInt();
        // System.out.print("몇 cm 단위 : ");
        // int c = sc.nextInt();

        // System.out.println("신장 표준 체중");
        // // 표준 체중 = (신장-100)x0.9
        // for(int i=a; i<=b; i+=c){
        //     System.out.println(i+" "+(i-100)*0.9);
        // }

        // 4 - 18
        // Scanner sc = new Scanner(System.in);
        // int b = 0;

        // System.out.print("정숫값 : ");
        // int a = sc.nextInt();
        // for (int i=1; i<=a; i++){
        //     if (a%i==0){
        //         System.out.print(i+" ");
        //         b++;
        //     }
        // }
        // System.out.println("\n"+a+"의 약수는 "+b+"개입니다.");

        // 4 - 19
        // Scanner sc = new Scanner(System.in);

        // System.out.print("정숫값 : ");
        // int a = sc.nextInt();

        // for (int i = 1; i<=a; i++){
        //     System.out.println(i+"의 제곱은 "+(i*i)+"입니다.");
        // }

        // 4 -20

        // Scanner sc = new Scanner(System.in);
        // int a;
        // int b;

        // System.out.println("계절을 찾습니다.");
        // do{
        //     do{ 
        //         System.out.print("몇 월입니까? : ");
        //             a = sc.nextInt();
        //     }while(a>12 || a<1);
        //     if (a==3||a==4||a==5){
        //         System.out.println("봄입니다.");
        //     }else if (a==6||a==7||a==8){
        //         System.out.println("여름입니다.");
        //     }else if (a==9||a==10||a==11){
        //         System.out.println("가을입니다.");
        //     }else if (a==12||a==1||a==2){
        //         System.out.println("겨울입니다.");
        //     }
        //     System.out.print("다시 하겠습니까? 1 = Yes/ 0 = No :");
        //     b = sc.nextInt();
        // }while(b==1);
        
        // 4 -21
        
        // Scanner sc = new Scanner(System.in);

        // System.out.println("정방향을 표시합니다.");
        // System.out.print("단수는 : ");
        // int a = sc.nextInt();

        // for (int i = 1 ; i<=a ; i++){
        //     if (i>1){
        //         System.out.println();
        //     }
        //     for (int j = 1; j<=a ; j++)
        //     System.out.print("*");
        // }

        // 4 - 22
        // Scanner sc = new Scanner(System.in);

        // System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        // System.out.print("단수는 : ");
        // int a = sc.nextInt();

        // for (int i = 1 ; i<=a ; i++){
        //     if (i>1){
        //         System.out.println();
        //     }
        //     for (int j = 1; j<=i ; j++)
        //     System.out.print("*");
        // }

        // Scanner sc = new Scanner(System.in);

        // System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.");
        // System.out.print("단수는 : ");
        // int a = sc.nextInt();

        //     for (int i = 1 ; i<=a ; i++){
        //     if (i>1){
        //         System.out.println();
        //     }
        //     for (int j = a; j>=i ;j--)
        //     System.out.print("*");
        // }

        // Scanner sc = new Scanner(System.in);

        // System.out.println("오른쪽 위가 직각인 이등변 삼각형을 표시합니다.");
        // System.out.print("단수는 : ");
        // int a = sc.nextInt();

        // for (int k = 1; k <=a ; k++){     // 줄
        //     for (int i = 1 ; i<=k-1 ; i++){   //빈칸
        //     System.out.print(" ");
        //     }
        //     for (int j = 1; j<=a-k+1 ;j++){   // 별
        //     System.out.print("*");
        //    }
        //    System.out.println();
        // }

        // 4 - 23
        // Scanner sc = new Scanner(System.in);
        // System.out.println("피라미드를 표시합니다.");
        // System.out.print("단수는? : ");
        // int a = sc.nextInt();
        // for (int k = 1; k <=a ; k++){     // 줄
        //     for (int i = a-1 ; i>=k ; i--){   //빈칸
        //     System.out.print(" ");
        //     }
        //     for (int j = 1; j<=2*k-1 ;j++){// 별
        //         System.out.print("*");
        //    }
        //    System.out.println();
        // }
        
        // 4 - 24
        // Scanner sc = new Scanner(System.in);
        // System.out.println("숫자 피라미드를 표시합니다.");
        // System.out.print("단수는 : ");
        // int a = sc.nextInt();

        // for (int k = 1; k <=a ; k++){     // 줄
        //     for (int i = a-1 ; i>=k ; i--){   //빈칸
        //     System.out.print(" ");
        //     }
        //     for (int j = 1; j<=2*k-1 ;j++){// 별
        //     System.out.print(k%10);
        //    }
        //    System.out.println();
        // }

        // 4 - 25

        // Scanner sc = new Scanner(System.in);

        // System.out.print("2이상의 정숫값: ");
        // int a = sc.nextInt();
        // int i;
        // for (i = 2 ; i<a ; i++){
        //     if(a%i==0)
        //     break;
        // }

        //     if (i==a)
        //     System.out.print("소수입니다.");
        //     else
        //     System.out.print("소수가 아닙니다.");

        // 4 - 26
        Scanner sc = new Scanner(System.in);
        int n;
        int i;
        int sum=0;

        System.out.println("정수를 더합니다.");
        System.out.print("몇 개를 더할까요? : ");
        n = sc.nextInt();


        for (i=0; i<n; i++){
            System.out.print("정수(0으로 종료): ");
            int t = sc.nextInt();
            if(t==0) break;
            sum = sum + t;
        }

        System.out.println("합계는 "+sum+"입니다.");
        System.out.println("평균은 "+sum/i+"입니다.");
    }
}