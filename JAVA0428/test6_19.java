import java.text.DecimalFormat;
import java.util.Scanner;

public class test6_19 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("#.#");


        System.out.println("6명의 국어, 수학 점수를 입력하세요.");

        int[][] point = new int[6][2];
        int[] sumStudent = new int[6];
        int[] sumsubject = new int[2];

        for (int i=0; i<6; i++){
            System.out.print((i+1)+"번 국어 : ");
            point[i][0] = sc.nextInt();
            System.out.print("    수학 : ");
            point[i][1] = sc.nextInt();

            sumStudent[i] = point[i][0]+point[i][1]; // 학생점수

            sumsubject[0] += point[i][0]; // 국어점수합
            sumsubject[1] += point[i][1]; // 수학점수합

        }
        double d1 = (double)sumsubject[0]/6;
        double d2 = (double)sumsubject[1]/6;

        System.out.println("No.\t국어\t수학\t평균");
        for (int i=0; i<6; i++){
            System.out.println((i+1)+"\t"+point[i][0]+"\t"+point[i][1]+"\t"+(double)sumStudent[i]/2);
        }
        System.out.println("평균\t"+form.format(d1)+"\t"+form.format(d2));

    }
}
