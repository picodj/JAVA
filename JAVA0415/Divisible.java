import java.util.Arrays;

public class Divisible{
    public int[] divisible(int[]array, int divisor){
        int num = 0;

        for (int i = 0 ; i < array.length; i++){
            if (array[i] % divisor == 0)
                num++;
        }
    }
    int [] narray = new int[num];
    int index = 0;

    for (int j = 0; j<narray.length; j++){
        if (array[j] % divisor == 0){
            narray=array[j];
        }
        return narray;
    }

    public static void main(String[]args){
        Divisible div = new Divisible();
        int [] array = {5,9,7,10};
        System.out.println(Arrays.toString(div.divisible(array,5)))
    }
}