//import java.io.FileOutputStream; // 파일생성
//import java.io.IOException;  // 예외 처리
//import java.io.FileWriter;
//import java.io.PrintWriter;
import java.io.*; //정답은 아니다 모두를 불러오는것


public class FileWrite {
    public static void main(String[]args) throws IOException{
        // FileOutputStream output = new FileOutputStream("out.txt");
        FileWriter fw = new FileWriter("out.txt");
        // PrintWriter pw = new PrintWriter("out.txt");
        for(int i = 1 ; i <11; i++){
            String data = i+"번째 줄입니다. \r\n";
            fw.write(data);
        }
        fw.close();

        FileWriter fw2 = new FileWriter("out.txt", true);
        for(int i=11; i<21; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            fw2.write(data);
        }
        fw2.close();

        FileWriter odd = new FileWriter("odd.txt");
        for(int i = 1; i<100; i++){
            if (i%2==1){
                String data = i+"\r\n";
                odd.write(data);
            }

        }odd.close();
    }
    
}
