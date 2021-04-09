public class Lsearch {
    public static void main(String[]args){
        int[] numbers = {4,2,3,5,1};
        int search = 5;
        for(int i=0; i<numbers.length; i++){
            if (numbers[i]==search){
                System.out.println((i+1)+"번째의 요소가 일치");
                return;
            }
        }System.out.println("찾지 못했습니다.");
        return;
    }
    
}
