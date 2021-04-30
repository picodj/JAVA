import java.util.Scanner;

public class test10_7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("x값 : ");
        int x = sc.nextInt();
        System.out.print("y값 : ");
        int y = sc.nextInt();
        System.out.print("z값 : ");
        int z = sc.nextInt();

        System.out.print("배열 a의 요소 수 : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("a["+i+"] : ");
            a[i] = sc.nextInt();
        }

        System.out.println(x+","+y+"의 최솟값은 "+min(x,y)+"입니다.");
        System.out.println(x+","+y+"의 최댓값은 "+max(x,y)+"입니다.");
        System.out.println(x+","+y+","+z+"의 최솟값은 "+min(x,y,z)+"입니다.");
        System.out.println(x+","+y+","+z+"의 최댓값은 "+max(x,y,z)+"입니다.");
        

        int xmin[] = minIndexArr(a);
        int xmax[] = maxIndexArr(a);

        System.out.println("배열 a의 최솟값은 "+min(a)+"입니다.");
        System.out.print("인덱스는 {");
        for(int i=0; i<xmin.length; i++){
            System.out.print(" "+xmin[i]+" ");
        }
        System.out.println("}입니다.");
        System.out.println("배열 a의 최댓값은 "+max(a)+"입니다.");
        System.out.print("인덱스는 {");
        for(int i=0; i<xmax.length; i++){
            System.out.print(" "+xmax[i]+" ");
        }
        System.out.println("}입니다.");

    }
    public static int min(int a, int b){
        return a<b ? a : b;
    }
    public static int min(int a,int b,int c){
        int min = a;
        if(b<a) min=b;
        if(c<min) min=c;
        return min;
    }
    public static int min(int[] a){
        int min = a[0];
        for (int i=1; i<a.length; i++){
            if (a[i]<min){
                min = a[i];
            }
        }
        return min;
    }

    // 배열에서 최소값을 가지는 모든 요소의 인덱스를 저장한 배열 구하기

    public static int[] minIndexArr(int[] a){
        int min = min(a);
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]==min){
                count++;
            }
        }
        int[] c = new int[count--];
        for(int i=a.length-1; count>=0; i--){
            if(a[i]==min){
                c[count--]=i;
            }
        }
        return c;
    }

    public static int max(int a, int b){
        return a>b ? a: b;
    }
    public static int max(int a,int b,int c){
        int max = a;
        if(b>max) max=b;
        if(c>max) max=c;
        return max;
    }
    public static int max(int[] a){
        int max = a[0];
        for (int i=1; i<a.length; i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    public static int[] maxIndexArr(int[] a){
        int max = max(a);
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]==max){
                count++;
            }
        }
        int[] c = new int[count--];
        for(int i=a.length-1; count>=0; i--){
            if(a[i]==max){
                c[count--]=i;
            }
        }
        return c;
    }
}
