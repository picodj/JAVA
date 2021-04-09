class Updater {
    public void update(Counter counter) { //객체 자체를 전달 받음
        counter.count++;
    }
}

public class Counter {
    int count = 0;
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }    // 0출력 -> 1출력
}     // 변수로 전달 -> 객체로 전달  (값을 유지할 수 있다.)