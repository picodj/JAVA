import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.And;

import java.util.Random;

public class test {
    public static void main(String[]args){
        // Scanner sc = new Scanner(System.in); // 입력받는거 외우기
        
        // System.out.print("정수값 : ");
        // int x = sc.nextInt();
        // System.out.println("10을 더한 값은 "+(x+10)+"입니다.");
        // System.out.println("10을 뺀 값은 "+(x-10)+"입니다.");

        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수값 : ");
        // String x = sc.next();
        // System.out.println("마지막 자릿수를 제외한 값은"+x.substring(0,x.length()-1)+ "입니다.");
        // System.out.println("마지막 자릿수는 "+x.substring(x.length()-1)+"입니다.");

        // Scanner sc = new Scanner(System.in);
        // System.out.print("정수값 :");
        // int x = sc.nextInt();
        // System.out.println("마지막 자릿수를 제외한 값은"+(x/10)+"입니다.");
        // System.out.println("마지막 자릿수는 "+1x%10+"입니다.");

        // Scanner sc = new Scanner(System.in);
        // System.out.println("구의 겉넓이와 부피를 구합니다.");
        // System.out.print("반지름 :");
        // double a = sc.nextDouble();
        // final double PI = 3.1416; // 변하지않는 상수를 설정 
        // System.out.println("겉넓이는 "+(4*PI)*(a*a) +"입니다.");
        // System.out.println("부피는 "+(4*PI)*(a*a*a)/3+"입니다.");

        // Random rand = new Random();
        // int x = 1+rand.nextInt(9); // 9미만
        // int y = -1-rand.nextInt(9); // -1~-9
        // int z = 10+rand.nextInt(90); // 10이상 99 이하

        // System.out.println("3개의 난수를 생성했습니다.");
        // System.out.println("한 자리 양의 정수 :"+x);
        // System.out.println("한 자리 음의 정수 :"+y);
        // System.out.println("두 자리 양의 정수 :"+z);

        // 3-11

    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("정수값 : ");
    //     int n = sc.nextInt();

    //     if (n>100){
    //         System.out.println("잘못된 점수입니다.");
    //     }else if(n>90){
    //         System.out.println("수");
    //     }else if(n>80){
    //         System.out.println("우");
    //     }else if(n>70){
    //         System.out.println("미");
    //     }else if(n>60){
    //         System.out.println("양");
    //     }else{
    //         System.out.println("가");
    //     }
    //     }



            // Scanner sc = new Scanner(System.in);

            // System.out.print("정수 a : ");
            // int a = sc.nextInt();
            // System.out.print("정수 b : ");
            // int b = sc.nextInt();

            // System.out.println((a>b) ? "두 값의 차는 "+(a-b)+"입니다." : 
            // (b>a) ? "두 값의 차는 "+(b-a)+"입니다." : "a와 b 는 같다.");


            // Scanner sc = new Scanner(System.in);

            // int mid = 0;

            // System.out.print("정수 a : ");
            // int a = sc.nextInt();
            // System.out.print("정수 b : ");
            // int b = sc.nextInt();
            // System.out.print("정수 c : ");
            // int c = sc.nextInt();

            // if((b >= a && c <= a) || (b<= a && c>=a))
            //     mid = a;
            // else if((a>b && c < b) || (a <b && c>b))
            //     mid = b;
            // else
            //     mid = c;


            // System.out.println("중앙값은 "+mid+"입니다.");

            Scanner sc = new Scanner(System.in);

            System.out.print("정수 a : ");
            int a = sc.nextInt();
            System.out.print("정수 b : ");
            int b = sc.nextInt();
            System.out.print("정수 c : ");
            int c = sc.nextInt();
            int temp = 0;

            System.out.println("a<=b<=c가 되도록 정렬했습니다.");
            if (a>b){
                temp = a;
                a = b;
                b = temp;    
            }
            if (b>c){
                temp = b;
                b = c;
                c = temp;
            }
            if (a>b){
                temp = a;
                a = b;
                b = temp;
            } 
            System.out.println("변수 a는 "+a+"입니다.");
            System.out.println("변수 b는 "+b+"입니다.");
            System.out.println("변수 c는 "+c+"입니다.");

            


        }


    }

