public class LRsearch {
    public static void main(String[] args) {
  
      int[] dataArray = {4,2,3,5,1};
      int search = 5;
  
      int result = Lsearch(dataArray, search);
  
      if (result == -1)
        System.out.println("찾지 못했습니다. ");
      else
        System.out.println((result+1) + "번째의 요소가 일치");
    }
    public static int Lsearch(int[] dataArray, int search) {
      for (int i = 0 ; i < dataArray.length; i++){
        if (dataArray[i] == search)
          return i;
      }
      return -1;
    }
  }
  