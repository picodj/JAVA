// import java.util.Calendar;
public class TernaryExam {
    public static void main(String[]args){
        // int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        // String ampm;
        // ampm = (hour<12) ? "오전" : "오후";
        // System.out.println("지금 시간은 "+hour+"시이고, "+ampm+"입니다.");

        int a = 5;
        String num;

        num = (a == 1) ? "1st" :
              (a == 2) ? "2nd" :
              (a == 3) ? "3rd" : "4th";

        System.out.println(num);


        

        
    }
    
}
