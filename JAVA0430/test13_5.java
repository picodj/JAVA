import java.util.Random;
import java.util.Scanner;

public class test13_5 {
    public static void main(String[] args) { 
        int n;
        do{
            Scanner sc = new Scanner(System.in);
            Human hm = new Human();
            Computer cp = new Computer();
            String[] hands = {"바위","가위","보"};

            int humanHand = hm.humanHand();
            int computerHand = cp.ComputerHand();

            System.out.println("나는 "+hands[humanHand]+"이고, 당신은 "+hands[computerHand]+"입니다.");

            if (humanHand==computerHand){
                System.out.println("비겼습니다.");
            }else if(humanHand-computerHand==0||humanHand-computerHand==-1){
                System.out.println("당신이 졌습니다.");
            }else{
                System.out.println("당신이 이겼습니다.");
            }
            do{
                System.out.print("다시 한번 ? (0) 아니오 (1) 네 : ");
                n =sc.nextInt();
                if(n!=0&&n!=1){
                    System.out.println("잘못입력했습니다.");
                }
            }while(n!=1&&n!=0);
        }while(n!=0);
    }
}
abstract class Player{
    int hand; // 손 (가위 바위 보)
}

class Human extends Player{
    Scanner sc = new Scanner(System.in);

    public int humanHand(){

    do{
        System.out.print("가위바위보!!! 0...바위/1...가위/2...보 : ");
        hand = sc.nextInt();
    }while(hand<0 || hand>2);
    return hand;
    }
}

class Computer extends Player{
    Random rand = new Random();

    public int ComputerHand(){
        return rand.nextInt(3);
    }

}