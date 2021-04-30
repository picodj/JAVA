public class test14_1 {
    public static void main(String[]args){

    }
    
}

interface Wearble{
    void putOn();
    void putOff();
}

class Headphone implements Wearble{
    public void putOn(){
        System.out.println("헤드폰을 착용했습니다.");
    }
    public void putOff(){
        System.out.println("헤드폰을 벗었습니다.");
    }
    public void setVolume(int volume){
        System.out.println("볼륨을 조정했습니다.");
    }
}

class WearableComputer implements Wearble{
    public void putOn(){
        System.out.println("컴퓨터를 실행했습니다.");
    }
    public void putOff(){
        System.out.println("컴퓨터를 껐습니다.");
    }
    public void reboot(){
        System.out.println("컴퓨터를 재시작 합니다.");
    }
}

